/** 
 * DhcpPoolObject.java
 *
 * © Copyright IBM Corp. 2007
 *
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author: Prashanth Karnam <prkarnam@in.ibm.com>
 *
 * Contributors: 
 * 
 * Description: 
 * 
 */


package org.sblim.wbemsmt.dhcp.wrapper.object;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolsContainer;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptions;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptionsForEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParams;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParamsForEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPPool;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPPoolsForEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPPoolsForEntityHelper;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpOptionsList;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpParamsList;
import org.sblim.wbemsmt.exception.ObjectCreationException;
import org.sblim.wbemsmt.exception.ObjectDeletionException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.schema.cim29.CIM_SettingData;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class DhcpPoolObject extends DhcpEntityObject {

	DhcpOptionsList pooloptionslist = null;
	DhcpParamsList poolparamslist = null;
	
	public DhcpPoolObject ( Linux_DHCPEntity fco, DhcpCimAdapter adapter ) {
		super ( fco, adapter );
		
		setPooloptionslist ( new DhcpOptionsList());
		setPoolparamslist ( new DhcpParamsList());
		
		ArrayList PoolopArrayList = ((Linux_DHCPPool)fco).getAssociated_Linux_DHCPOptions_Linux_DHCPOptionsForEntitys (
						adapter.getCimClient (), false, false, null );

		for (Iterator iter = PoolopArrayList.iterator (); iter.hasNext ();) {
			Linux_DHCPOptions opsfco = (Linux_DHCPOptions) iter.next ();
			getPooloptionslist ().addDhcpOptionsObject ( new DhcpOptionsObject ( opsfco, adapter));
		}
		
		ArrayList PoolparamArrayList = ((Linux_DHCPPool) fco).getAssociated_Linux_DHCPParams_Linux_DHCPParamsForEntitys (
				adapter.getCimClient (), false, false, null );

		for (Iterator iter = PoolparamArrayList.iterator (); iter.hasNext ();) {
			Linux_DHCPParams paramsfco = (Linux_DHCPParams) iter.next ();
			getPoolparamslist ().addDhcpParamsObject ( new DhcpParamsObject ( paramsfco, adapter ) );
		}

	}

	public DhcpPoolObject ( Linux_DHCPPool fco, DhcpCimAdapter adapter, Linux_DHCPEntity entity ) {
		super(fco,adapter,entity);
	}

	public MessageList savePool ( DHCPPoolsContainer container ) throws ObjectSaveException {
		
		Linux_DHCPPool fco = (Linux_DHCPPool) this.fco;
		
//		fco.set_IPAddrEnd ( (String) container.get_IPAddrEnd ().getConvertedControlValue () );
//		fco.set_Name ( (String) container.get_Name ().getConvertedControlValue () );
		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );

		adapter.setMarkedForReload();
		adapter.setPathOfTreeNode(fco.getCimObjectPath());

		return null;
		
//		return super.savePool ( container );
	}
	
	public MessageList save(DHCPPoolOptionsContainer container){
		
		DhcpOptionsObject obj = null;
		boolean objFound = false;

			// if the option does not exist then create and add to the objects list
			List fields = container.getFields();
			for (Iterator iter2 = fields.iterator (); iter2.hasNext ();){
				LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter2.next();
				objFound = false;
				for (Iterator iter1 = getPooloptionslist ().iterator (); iter1.hasNext ();){
					obj  = (DhcpOptionsObject)iter1.next();
					if(obj.getFco ().get_Name ().equals(fld.getLabelText ())){
						try {
						obj.save(container , fld.getConvertedControlValue ());
						} catch (ObjectSaveException e) {
							e.printStackTrace();
						}
						objFound = true;
						break;
					}
				}
			if(objFound==false && fld.getConvertedControlValue ().toString ().equals("") == false){

				Linux_DHCPOptions opFco = new Linux_DHCPOptions();
				if (DhcpCimAdapter.isDummyMode ())
					opFco.set_InstanceID ( "WBEM_SMT:Linux_DHCPOptions::dhcp::" + adapter.getDhcpPoolObj ().getFco ().get_Name () + "::" + fld.getLabelText () );
				else
					opFco.set_InstanceID ("");
				opFco.set_Name ( fld.getLabelText () );
				opFco.set_ParentID ( getFco().get_InstanceID () );
				opFco.set_Values ( fld.getConvertedControlValue ().toString () );
				try{
				opFco = (Linux_DHCPOptions)adapter.getFcoHelper ().create ( opFco, adapter.getCimClient () );
				} catch (ObjectCreationException e) {
					e.printStackTrace();
				}
				if (DhcpCimAdapter.isDummyMode ()) {

					Linux_DHCPOptionsForEntity Poolopfco = new Linux_DHCPOptionsForEntity ();
					Poolopfco.set_Linux_DHCPEntity ( adapter.getSelectedEntity () );
					Poolopfco.set_Linux_DHCPOptions ( opFco );
					try{
					Poolopfco = (Linux_DHCPOptionsForEntity)adapter.getFcoHelper ().create ( Poolopfco, adapter.getCimClient () );
					} catch (ObjectCreationException e) {
						e.printStackTrace();
					}
//					obj = new DhcpOptionsObject ( opFco, adapter );
				}
				obj = new DhcpOptionsObject ( opFco, adapter );
				getPooloptionslist ().addDhcpOptionsObject ( obj );
			}
				
			}
		return null;
	}
	
	public MessageList save(DHCPPoolParamsContainer container){
		
		DhcpParamsObject obj = null;
		boolean objFound = false;

			// if the Param does not exist then create and add to the objects list
			List fields = container.getFields();
			for (Iterator iter2 = fields.iterator (); iter2.hasNext ();){
				LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter2.next();
				objFound = false;
				for (Iterator iter1 = getPoolparamslist ().iterator (); iter1.hasNext ();){
					obj  = (DhcpParamsObject)iter1.next();
					if(obj.getFco ().get_Name ().equals(fld.getLabelText ())){
						try {
						obj.save(container , fld.getConvertedControlValue ());
						} catch (ObjectSaveException e) {
							e.printStackTrace();
						}
						objFound = true;
						break;
					}
				}
			if(objFound==false && fld.getConvertedControlValue ().toString ().equals("") == false){

				Linux_DHCPParams opFco = new Linux_DHCPParams();
				if (DhcpCimAdapter.isDummyMode ())
					opFco.set_InstanceID ( "WBEM_SMT:Linux_DHCPParams::dhcp::" + adapter.getDhcpPoolObj ().getFco ().get_Name ()+ "::" + fld.getLabelText () );
				else
					opFco.set_InstanceID ("");
				opFco.set_Name ( fld.getLabelText () );
				opFco.set_ParentID ( getFco().get_InstanceID () );
				opFco.set_Values ( fld.getConvertedControlValue ().toString () );
				try{
				opFco = (Linux_DHCPParams)adapter.getFcoHelper ().create ( opFco, adapter.getCimClient () );
				} catch (ObjectCreationException e) {
					e.printStackTrace();
				}
				if (DhcpCimAdapter.isDummyMode ()) {

					Linux_DHCPParamsForEntity Poolopfco = new Linux_DHCPParamsForEntity ();
					Poolopfco.set_Linux_DHCPEntity ( adapter.getSelectedEntity () );
					Poolopfco.set_Linux_DHCPParams ( opFco );
					try{
					Poolopfco = (Linux_DHCPParamsForEntity)adapter.getFcoHelper ().create ( Poolopfco, adapter.getCimClient () );
					} catch (ObjectCreationException e) {
						e.printStackTrace();
					}
//					obj = new DhcpParamsObject ( opFco, adapter );
				}
				obj = new DhcpParamsObject ( opFco, adapter );
				getPoolparamslist ().addDhcpParamsObject ( obj );
			}
				
			}
		return null;
	}
	
	public void updateControls(DHCPPoolParamsContainer container){
		
		DhcpParamsObject obj = null;
		
		for (Iterator iter = getPoolparamslist ().iterator (); iter.hasNext ();){ 
			obj  = (DhcpParamsObject)iter.next();
			obj.updateControls(container);
			}
		
	}

	public void updateControls(DHCPPoolOptionsContainer container){
		
		DhcpOptionsObject obj = null;
		
		for (Iterator iter = getPooloptionslist ().iterator (); iter.hasNext ();){ 
			obj  = (DhcpOptionsObject)iter.next();
			obj.updateControls(container);
			}
		
	}
	
	public void updateControls ( DHCPPoolsContainer container ) {
		
		Linux_DHCPPool fco = (Linux_DHCPPool) this.fco;
		
		container.get_Name ().setControlValue ( fco.get_Name () );
//		container.get_IPAddrEnd ().setControlValue ( fco.get_IPAddrEnd () );
		
//		super.updateControls ( container );
	}

	public void deletePool () throws ObjectDeletionException {
		
		Linux_DHCPPool fco = (Linux_DHCPPool) this.fco;
		ArrayList list = Linux_DHCPPoolsForEntityHelper.enumerateInstanceNames ( adapter.getCimClient (), true );

		if(DhcpCimAdapter.isDummyMode ()){
		for (int i = 0; i < list.size (); i++) {
			Linux_DHCPPoolsForEntity p = new Linux_DHCPPoolsForEntity (((CIMObjectPath) list.get ( i )).getKeys ());
			Linux_DHCPPoolsForEntity poolforentity = new Linux_DHCPPoolsForEntity (((CIMObjectPath) list.get ( i )),p.getCimInstance ());
			String InstanceinAssoc = (String) poolforentity.get_Linux_DHCPPool ().getKey (
					CIM_SettingData.CIM_PROPERTY_INSTANCEID ).getValue ().getValue ();
			String Instanceinfco = fco.get_InstanceID ();
			if (InstanceinAssoc.equals ( Instanceinfco ))
				adapter.getFcoHelper ().delete ( poolforentity, adapter.getCimClient (), true );
		}
		}
		adapter.getFcoHelper ().delete ( fco, adapter.getCimClient (), true );
		
//		super.deletePool ();
		adapter.setMarkedForReload ();
	}
	
	public DhcpOptionsList getPooloptionslist () {
		return pooloptionslist;
	}

	public void setPooloptionslist ( DhcpOptionsList pooloptionslist ) {
		this.pooloptionslist = pooloptionslist;
	}

	public DhcpParamsList getPoolparamslist () {
		return poolparamslist;
	}

	public void setPoolparamslist ( DhcpParamsList poolparamslist ) {
		this.poolparamslist = poolparamslist;
	}


}
