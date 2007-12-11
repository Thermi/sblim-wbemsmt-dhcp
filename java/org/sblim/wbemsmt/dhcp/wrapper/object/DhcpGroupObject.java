/** 
 * DhcpGroupObject.java
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
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupsContainer;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGroup;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGroupsForEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGroupsForEntityHelper;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptions;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptionsForEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParams;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParamsForEntity;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpOptionsList;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpParamsList;
import org.sblim.wbemsmt.exception.ObjectCreationException;
import org.sblim.wbemsmt.exception.ObjectDeletionException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.schema.cim29.CIM_SettingData;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class DhcpGroupObject extends DhcpEntityObject {

	private DhcpOptionsList Groupoptionslist = null;
	private DhcpParamsList Groupparamslist = null;

	
	public DhcpGroupObject ( Linux_DHCPEntity fco, DhcpCimAdapter adapter ) {
		super ( fco, adapter );
		
		setGroupoptionslist ( new DhcpOptionsList());
		setGroupparamslist ( new DhcpParamsList());
		
		ArrayList GroupopArrayList = ((Linux_DHCPGroup)fco).getAssociated_Linux_DHCPOptions_Linux_DHCPOptionsForEntitys (
						adapter.getCimClient (), false, false, null );

		for (Iterator iter = GroupopArrayList.iterator (); iter.hasNext ();) {
			Linux_DHCPOptions opsfco = (Linux_DHCPOptions) iter.next ();
			getGroupoptionslist ().addDhcpOptionsObject ( new DhcpOptionsObject ( opsfco, adapter));
		}
		
		ArrayList GroupparamArrayList = ((Linux_DHCPGroup) fco).getAssociated_Linux_DHCPParams_Linux_DHCPParamsForEntitys (
				adapter.getCimClient (), false, false, null );

		for (Iterator iter = GroupparamArrayList.iterator (); iter.hasNext ();) {
			Linux_DHCPParams paramsfco = (Linux_DHCPParams) iter.next ();
			getGroupparamslist ().addDhcpParamsObject ( new DhcpParamsObject ( paramsfco, adapter ) );
		}
	}
	
	public DhcpGroupObject ( Linux_DHCPGroup fco, DhcpCimAdapter adapter, Linux_DHCPEntity entity ) {
		super(fco,adapter,entity);
	}

	public MessageList saveGroup ( DHCPGroupsContainer container ) throws ObjectSaveException {
		
		Linux_DHCPGroup fco = (Linux_DHCPGroup) this.fco;
		
		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );

		adapter.setMarkedForReload();
		adapter.setPathOfTreeNode(fco.getCimObjectPath());

		return null;
		
//		return super.saveGroup ( container );
	}

	public MessageList save(DHCPGroupOptionsContainer container){
		
		DhcpOptionsObject obj = null;
		boolean objFound = false;

			// if the option does not exist then create and add to the objects list
			List fields = container.getFields();
			for (Iterator iter2 = fields.iterator (); iter2.hasNext ();){
				LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter2.next();
				objFound = false;
				for (Iterator iter1 = getGroupoptionslist ().iterator (); iter1.hasNext ();){
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
					opFco.set_InstanceID ( "WBEM_SMT:Linux_DHCPOptions::dhcp::" + adapter.getDhcpGroupObj ().getFco ().get_Name () + "::" + fld.getLabelText () );
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

					Linux_DHCPOptionsForEntity Groupopfco = new Linux_DHCPOptionsForEntity ();
					Groupopfco.set_Linux_DHCPEntity ( adapter.getSelectedEntity () );
					Groupopfco.set_Linux_DHCPOptions ( opFco );
					try{
					Groupopfco = (Linux_DHCPOptionsForEntity)adapter.getFcoHelper ().create ( Groupopfco, adapter.getCimClient () );
					} catch (ObjectCreationException e) {
						e.printStackTrace();
					}
//					obj = new DhcpOptionsObject ( opFco, adapter );
				}
				obj = new DhcpOptionsObject ( opFco, adapter );
				getGroupoptionslist ().addDhcpOptionsObject ( obj );
			}
				
			}
		return null;
	}
	
	public MessageList save(DHCPGroupParamsContainer container){
		
		DhcpParamsObject obj = null;
		boolean objFound = false;

			// if the Param does not exist then create and add to the objects list
			List fields = container.getFields();
			for (Iterator iter2 = fields.iterator (); iter2.hasNext ();){
				LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter2.next();
				objFound = false;
				for (Iterator iter1 = getGroupparamslist ().iterator (); iter1.hasNext ();){
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
					opFco.set_InstanceID ( "WBEM_SMT:Linux_DHCPParams::dhcp::" + adapter.getDhcpGroupObj ().getFco ().get_Name () + "::" + fld.getLabelText () );
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

					Linux_DHCPParamsForEntity Groupopfco = new Linux_DHCPParamsForEntity ();
					Groupopfco.set_Linux_DHCPEntity ( adapter.getSelectedEntity () );
					Groupopfco.set_Linux_DHCPParams ( opFco );
					try{
					Groupopfco = (Linux_DHCPParamsForEntity)adapter.getFcoHelper ().create ( Groupopfco, adapter.getCimClient () );
					} catch (ObjectCreationException e) {
						e.printStackTrace();
					}
					obj = new DhcpParamsObject ( opFco, adapter );
				}
				
				getGroupparamslist ().addDhcpParamsObject ( obj );
			}
				
			}
		return null;
	}
	
	public void updateControls(DHCPGroupParamsContainer container){
		
		DhcpParamsObject obj = null;
		
		for (Iterator iter = getGroupparamslist ().iterator (); iter.hasNext ();){ 
			obj  = (DhcpParamsObject)iter.next();
			obj.updateControls(container);
			}
		
	}
	
	public void updateControls(DHCPGroupOptionsContainer container){
		
		DhcpOptionsObject obj = null;
		
		for (Iterator iter = getGroupoptionslist ().iterator (); iter.hasNext ();){ 
			obj  = (DhcpOptionsObject)iter.next();
			obj.updateControls(container);
			}
		
	}
	
	public void updateControls ( DHCPGroupsContainer container ) {
//		super.updateControls ( container );
	}
	
	public void deleteGroup() throws ObjectDeletionException {
		
		Linux_DHCPGroup fco = (Linux_DHCPGroup) this.fco;
		ArrayList list = Linux_DHCPGroupsForEntityHelper.enumerateInstanceNames ( adapter.getCimClient (), true );
		
		if(DhcpCimAdapter.isDummyMode ()){
		for (int i = 0; i < list.size (); i++) {
			Linux_DHCPGroupsForEntity p = new Linux_DHCPGroupsForEntity (((CIMObjectPath) list.get ( i )).getKeys ());
			Linux_DHCPGroupsForEntity Groupforentity = new Linux_DHCPGroupsForEntity (((CIMObjectPath) list.get ( i )),p.getCimInstance ());
			String InstanceinAssoc = (String) Groupforentity.get_Linux_DHCPGroup ().getKey (
					CIM_SettingData.CIM_PROPERTY_INSTANCEID ).getValue ().getValue ();
			String Instanceinfco = fco.get_InstanceID ();
			if (InstanceinAssoc.equals ( Instanceinfco ))
				adapter.getFcoHelper ().delete ( Groupforentity, adapter.getCimClient (), true );
		}
		}
		adapter.getFcoHelper ().delete ( fco, adapter.getCimClient (), true );
		
//		super.deleteGroup ();
		adapter.setMarkedForReload ();
	}

	public DhcpOptionsList getGroupoptionslist () {
		return Groupoptionslist;
	}

	public void setGroupoptionslist ( DhcpOptionsList groupoptionslist ) {
		Groupoptionslist = groupoptionslist;
	}

	public DhcpParamsList getGroupparamslist () {
		return Groupparamslist;
	}

	public void setGroupparamslist ( DhcpParamsList groupparamslist ) {
		Groupparamslist = groupparamslist;
	}
	
}