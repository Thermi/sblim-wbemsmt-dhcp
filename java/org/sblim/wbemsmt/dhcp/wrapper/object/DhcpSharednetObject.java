/** 
 * DhcpSharednetObject.java
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
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednerOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetsContainer;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptions;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptionsForEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParams;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParamsForEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSharednet;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSharednetsForEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSharednetsForEntityHelper;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpOptionsList;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpParamsList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.schema.cim29.CIM_SettingData;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class DhcpSharednetObject extends DhcpEntityObject {

	private DhcpOptionsList Sharednetoptionslist = null;
	private DhcpParamsList Sharednetparamslist = null;

	
	public DhcpSharednetObject ( Linux_DHCPEntity fco, DhcpCimAdapter adapter ) throws WbemsmtException {
		super ( fco, adapter );
		
		setSharednetoptionslist ( new DhcpOptionsList());
		setSharednetparamslist ( new DhcpParamsList());
		
		List SharednetopArrayList = ((Linux_DHCPSharednet)fco).getAssociated_Linux_DHCPOptions_Linux_DHCPOptionsForEntitys (
						adapter.getCimClient ());

		for (Iterator iter = SharednetopArrayList.iterator (); iter.hasNext ();) {
			Linux_DHCPOptions opsfco = (Linux_DHCPOptions) iter.next ();
			getSharednetoptionslist ().addDhcpOptionsObject ( new DhcpOptionsObject ( opsfco, adapter));
		}
		
		List SharednetparamArrayList = ((Linux_DHCPSharednet) fco).getAssociated_Linux_DHCPParams_Linux_DHCPParamsForEntitys (
				adapter.getCimClient () );

		for (Iterator iter = SharednetparamArrayList.iterator (); iter.hasNext ();) {
			Linux_DHCPParams paramsfco = (Linux_DHCPParams) iter.next ();
			getSharednetparamslist ().addDhcpParamsObject ( new DhcpParamsObject ( paramsfco, adapter ) );
		}
	}

	public DhcpSharednetObject ( Linux_DHCPSharednet fco, DhcpCimAdapter adapter, Linux_DHCPEntity entity ) {
		super(fco,adapter,entity);
	}

	public MessageList saveSharedNet ( DHCPSharednetsContainer container ) throws WbemsmtException {
		
		Linux_DHCPSharednet fco = (Linux_DHCPSharednet) this.fco;

		fco.set_Name ( (String) container.get_Name ().getConvertedControlValue () );
		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );

		adapter.setMarkedForReload();
		adapter.setPathOfTreeNode(fco.getCimObjectPath());

		return null;
		
//		return super.saveSharedNet ( container );
	}

	public MessageList save(DHCPSharednerOptionsContainer container) throws WbemsmtException{
		
		DhcpOptionsObject obj = null;
		boolean objFound = false;

			// if the option does not exist then create and add to the objects list
			List fields = container.getFields();
			for (Iterator iter2 = fields.iterator (); iter2.hasNext ();){
				LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter2.next();
				objFound = false;
				for (Iterator iter1 = getSharednetoptionslist ().iterator (); iter1.hasNext ();){
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
					opFco.set_key_InstanceID ( "WBEM_SMT:Linux_DHCPOptions::dhcp::" + adapter.getDhcpSharednetObj ().getFco ().get_Name () + "::" + fld.getLabelText () );
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

					Linux_DHCPOptionsForEntity Sharednetopfco = new Linux_DHCPOptionsForEntity (adapter.getCimClient (),adapter.getNamespace ());
					Sharednetopfco.set_GroupComponent_Linux_DHCPEntity ( adapter.getSelectedEntity () );
					Sharednetopfco.set_PartComponent_Linux_DHCPOptions ( opFco );
					try{
					Sharednetopfco = (Linux_DHCPOptionsForEntity)adapter.getFcoHelper ().create ( Sharednetopfco, adapter.getCimClient () );
					} catch (WbemsmtException e) {
						e.printStackTrace();
					}
//					obj = new DhcpOptionsObject ( opFco, adapter );
				}
				obj = new DhcpOptionsObject ( opFco, adapter );
				getSharednetoptionslist ().addDhcpOptionsObject ( obj );
			}
				
			}
		return null;
	}

	public MessageList save(DHCPSharednetParamsContainer container) throws WbemsmtException{
		
		DhcpParamsObject obj = null;
		boolean objFound = false;

			// if the Param does not exist then create and add to the objects list
			List fields = container.getFields();
			for (Iterator iter2 = fields.iterator (); iter2.hasNext ();){
				LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter2.next();
				objFound = false;
				for (Iterator iter1 = getSharednetparamslist ().iterator (); iter1.hasNext ();){
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
					opFco.set_key_InstanceID ( "WBEM_SMT:Linux_DHCPParams::dhcp::" + adapter.getDhcpSharednetObj ().getFco ().get_Name () + "::" + fld.getLabelText () );
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

					Linux_DHCPParamsForEntity Sharednetopfco = new Linux_DHCPParamsForEntity (adapter.getCimClient (),adapter.getNamespace ());
					Sharednetopfco.set_GroupComponent_Linux_DHCPEntity ( adapter.getSelectedEntity () );
					Sharednetopfco.set_PartComponent_Linux_DHCPParams ( opFco );
					try{
					Sharednetopfco = (Linux_DHCPParamsForEntity)adapter.getFcoHelper ().create ( Sharednetopfco, adapter.getCimClient () );
					} catch (WbemsmtException e) {
						e.printStackTrace();
					}
//					obj = new DhcpParamsObject ( opFco, adapter );
				}
				obj = new DhcpParamsObject ( opFco, adapter );
				getSharednetparamslist ().addDhcpParamsObject ( obj );
			}
				
			}
		return null;
	}
	
	public void updateControls(DHCPSharednetParamsContainer container){
		
		DhcpParamsObject obj = null;
		
		for (Iterator iter = getSharednetparamslist ().iterator (); iter.hasNext ();){ 
			obj  = (DhcpParamsObject)iter.next();
			obj.updateControls(container);
			}
		
	}
	
	public void updateControls(DHCPSharednerOptionsContainer container){
		
		DhcpOptionsObject obj = null;
		
		for (Iterator iter = getSharednetoptionslist ().iterator (); iter.hasNext ();){ 
			obj  = (DhcpOptionsObject)iter.next();
			obj.updateControls(container);
			}
		
	}
	
	public void updateControls ( DHCPSharednetsContainer container ) {
		
		Linux_DHCPSharednet fco = (Linux_DHCPSharednet) this.fco;
		
		container.get_Name ().setControlValue ( fco.get_Name () );
		
//		super.updateControls ( container );
	}

	public void deleteSharednet () throws WbemsmtException {
		
		Linux_DHCPSharednet fco = (Linux_DHCPSharednet) this.fco;
		List list = Linux_DHCPSharednetsForEntityHelper.enumerateInstanceNames ( adapter.getCimClient (), adapter.getNamespace (),true );
		
		if(DhcpCimAdapter.isDummyMode ()){
		for (int i = 0; i < list.size (); i++) {
			Linux_DHCPSharednetsForEntity p = new Linux_DHCPSharednetsForEntity (adapter.getCimClient (),adapter.getNamespace ());
			Linux_DHCPSharednetsForEntity Sharednetforentity = new Linux_DHCPSharednetsForEntity (p.getCimInstance ());
			String InstanceinAssoc = (String) Sharednetforentity.get_PartComponent_Linux_DHCPSharednet (adapter.getCimClient ()).get_key_InstanceID ();
			String Instanceinfco = fco.get_key_InstanceID();
			if (InstanceinAssoc.equals ( Instanceinfco ))
				adapter.getFcoHelper ().delete ( Sharednetforentity, adapter.getCimClient (), true );
		}
		}
		adapter.getFcoHelper ().delete ( fco, adapter.getCimClient (), true );
		
//		super.deleteSharednet ();
		adapter.setMarkedForReload ();
	}

	public DhcpOptionsList getSharednetoptionslist () {
		return Sharednetoptionslist;
	}

	public void setSharednetoptionslist ( DhcpOptionsList sharednetoptionslist ) {
		Sharednetoptionslist = sharednetoptionslist;
	}

	public DhcpParamsList getSharednetparamslist () {
		return Sharednetparamslist;
	}

	public void setSharednetparamslist ( DhcpParamsList sharednetparamslist ) {
		Sharednetparamslist = sharednetparamslist;
	}
}
