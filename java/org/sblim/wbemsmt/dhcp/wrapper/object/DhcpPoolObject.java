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

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.bl.messages.MessageList;
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
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.schema.cim29.CIM_SettingData;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class DhcpPoolObject extends DhcpEntityObject {

	DhcpOptionsList pooloptionslist = null;
	DhcpParamsList poolparamslist = null;
	
	public DhcpPoolObject ( Linux_DHCPEntity fco, DhcpCimAdapter adapter ) throws WbemsmtException {
		super ( fco, adapter );
		
		setPooloptionslist ( new DhcpOptionsList());
		setPoolparamslist ( new DhcpParamsList());
		
		List PoolopArrayList = ((Linux_DHCPPool)fco).getAssociated_Linux_DHCPOptions_Linux_DHCPOptionsForEntitys (
						adapter.getCimClient ());

		for (Iterator iter = PoolopArrayList.iterator (); iter.hasNext ();) {
			Linux_DHCPOptions opsfco = (Linux_DHCPOptions) iter.next ();
			getPooloptionslist ().addDhcpOptionsObject ( new DhcpOptionsObject ( opsfco, adapter));
		}
		
		List PoolparamArrayList = ((Linux_DHCPPool) fco).getAssociated_Linux_DHCPParams_Linux_DHCPParamsForEntitys (
				adapter.getCimClient () );

		for (Iterator iter = PoolparamArrayList.iterator (); iter.hasNext ();) {
			Linux_DHCPParams paramsfco = (Linux_DHCPParams) iter.next ();
			getPoolparamslist ().addDhcpParamsObject ( new DhcpParamsObject ( paramsfco, adapter ) );
		}

	}

	public DhcpPoolObject ( Linux_DHCPPool fco, DhcpCimAdapter adapter, Linux_DHCPEntity entity ) {
		super(fco,adapter,entity);
	}

	public MessageList savePool ( DHCPPoolsContainer container ) throws WbemsmtException {
		
		Linux_DHCPPool fco = (Linux_DHCPPool) this.fco;
		
//		fco.set_IPAddrEnd ( (String) container.get_IPAddrEnd ().getConvertedControlValue () );
//		fco.set_Name ( (String) container.get_Name ().getConvertedControlValue () );
		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );

		adapter.setMarkedForReload();
		adapter.setPathOfTreeNode(fco.getCimObjectPath());

		return null;
		
//		return super.savePool ( container );
	}
	
	public MessageList save(DHCPPoolOptionsContainer container) throws WbemsmtException{
		
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
						} catch (WbemsmtException e) {
							e.printStackTrace();
						}
						objFound = true;
						break;
					}
				}
			if(objFound==false && fld.getConvertedControlValue ().toString ().equals("") == false){

				Linux_DHCPOptions opFco = new Linux_DHCPOptions(adapter.getCimClient (),adapter.getNamespace ());
				if (DhcpCimAdapter.isDummyMode ())
					opFco.set_key_InstanceID ( "WBEM_SMT:Linux_DHCPOptions::dhcp::" + adapter.getDhcpPoolObj ().getFco ().get_Name () + "::" + fld.getLabelText () );
				else
					opFco.set_key_InstanceID ("");
				opFco.set_Name ( fld.getLabelText () );
				opFco.set_ParentID ( getFco().get_key_InstanceID() );
				opFco.set_values ( fld.getConvertedControlValue ().toString () );
				try{
				opFco = (Linux_DHCPOptions)adapter.getFcoHelper ().create ( opFco, adapter.getCimClient () );
				} catch (WbemsmtException e) {
					e.printStackTrace();
				}
				if (DhcpCimAdapter.isDummyMode ()) {

					Linux_DHCPOptionsForEntity Poolopfco = new Linux_DHCPOptionsForEntity (adapter.getCimClient (),adapter.getNamespace ());
					Poolopfco.set_GroupComponent_Linux_DHCPEntity ( adapter.getSelectedEntity () );
					Poolopfco.set_PartComponent_Linux_DHCPOptions ( opFco );
					try{
					Poolopfco = (Linux_DHCPOptionsForEntity)adapter.getFcoHelper ().create ( Poolopfco, adapter.getCimClient () );
					} catch (WbemsmtException e) {
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
	
	public MessageList save(DHCPPoolParamsContainer container) throws WbemsmtException{
		
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
						} catch (WbemsmtException e) {
							e.printStackTrace();
						}
						objFound = true;
						break;
					}
				}
			if(objFound==false && fld.getConvertedControlValue ().toString ().equals("") == false){

				Linux_DHCPParams opFco = new Linux_DHCPParams(adapter.getCimClient (),adapter.getNamespace ());
				if (DhcpCimAdapter.isDummyMode ())
					opFco.set_key_InstanceID ( "WBEM_SMT:Linux_DHCPParams::dhcp::" + adapter.getDhcpPoolObj ().getFco ().get_Name ()+ "::" + fld.getLabelText () );
				else
					opFco.set_key_InstanceID ("");
				opFco.set_Name ( fld.getLabelText () );
				opFco.set_ParentID ( getFco().get_key_InstanceID() );
				opFco.set_values ( fld.getConvertedControlValue ().toString () );
				try{
				opFco = (Linux_DHCPParams)adapter.getFcoHelper ().create ( opFco, adapter.getCimClient () );
				} catch (WbemsmtException e) {
					e.printStackTrace();
				}
				if (DhcpCimAdapter.isDummyMode ()) {

					Linux_DHCPParamsForEntity Poolopfco = new Linux_DHCPParamsForEntity (adapter.getCimClient (),adapter.getNamespace ());
					Poolopfco.set_GroupComponent_Linux_DHCPEntity ( adapter.getSelectedEntity () );
					Poolopfco.set_PartComponent_Linux_DHCPParams ( opFco );
					try{
					Poolopfco = (Linux_DHCPParamsForEntity)adapter.getFcoHelper ().create ( Poolopfco, adapter.getCimClient () );
					} catch (WbemsmtException e) {
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

	public void deletePool () throws WbemsmtException {
		
		Linux_DHCPPool fco = (Linux_DHCPPool) this.fco;
		List list = Linux_DHCPPoolsForEntityHelper.enumerateInstanceNames ( adapter.getCimClient (), adapter.getNamespace (),true );

		if(DhcpCimAdapter.isDummyMode ()){
		for (int i = 0; i < list.size (); i++) {
			Linux_DHCPPoolsForEntity p = new Linux_DHCPPoolsForEntity (adapter.getCimClient (),adapter.getNamespace ());
			Linux_DHCPPoolsForEntity poolforentity = new Linux_DHCPPoolsForEntity (p.getCimInstance ());			
			String InstanceinAssoc = (String) poolforentity.get_PartComponent_Linux_DHCPPool (adapter.getCimClient ()).get_key_InstanceID ();
			String Instanceinfco = fco.get_key_InstanceID();
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
