/** 
 * DhcpSubnetObject.java
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
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetsContainer;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptions;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptionsForEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParams;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParamsForEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSubnet;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSubnetsForEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSubnetsForEntityHelper;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpOptionsList;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpParamsList;
import org.sblim.wbemsmt.exception.ObjectCreationException;
import org.sblim.wbemsmt.exception.ObjectDeletionException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.schema.cim29.CIM_SettingData;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class DhcpSubnetObject extends DhcpEntityObject {

	private DhcpOptionsList subnetoptionslist= null;
	private DhcpParamsList subnetparamslist = null;
	
	public DhcpSubnetObject ( Linux_DHCPEntity fco, DhcpCimAdapter adapter ) {
		super ( fco, adapter );
		
		setSubnetoptionslist ( new DhcpOptionsList());
		setSubnetparamslist ( new DhcpParamsList());
		
		ArrayList SubnetopArrayList = ((Linux_DHCPSubnet)fco).getAssociated_Linux_DHCPOptions_Linux_DHCPOptionsForEntitys (
						adapter.getCimClient (), false, false, null );

		for (Iterator iter = SubnetopArrayList.iterator (); iter.hasNext ();) {
			Linux_DHCPOptions opsfco = (Linux_DHCPOptions) iter.next ();
			getSubnetoptionslist ().addDhcpOptionsObject ( new DhcpOptionsObject ( opsfco, adapter));
		}
		
		ArrayList SubnetparamArrayList = ((Linux_DHCPSubnet) fco).getAssociated_Linux_DHCPParams_Linux_DHCPParamsForEntitys (
				adapter.getCimClient (), false, false, null );

		for (Iterator iter = SubnetparamArrayList.iterator (); iter.hasNext ();) {
			Linux_DHCPParams paramsfco = (Linux_DHCPParams) iter.next ();
			getSubnetparamslist ().addDhcpParamsObject ( new DhcpParamsObject ( paramsfco, adapter ) );
		}

	}

	public DhcpSubnetObject ( Linux_DHCPSubnet fco, DhcpCimAdapter adapter, Linux_DHCPEntity entity ) {
		super(fco,adapter,entity);
	}

	public MessageList saveSubnet ( DHCPSubnetsContainer container ) throws ObjectSaveException {
		
		Linux_DHCPSubnet fco = (Linux_DHCPSubnet) this.fco;
		
		fco.set_Netmask ( (String) container.get_Netmask ().getConvertedControlValue () );
		fco.set_Name ( (String) container.get_Name ().getConvertedControlValue () );
		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );

		adapter.setMarkedForReload();
		adapter.setPathOfTreeNode(fco.getCimObjectPath());

		return null;
		
//		return super.saveSubnet ( container );
	}

	public MessageList save(DHCPSubnetOptionsContainer container){
		
		DhcpOptionsObject obj = null;
		boolean objFound = false;

			// if the option does not exist then create and add to the objects list
			List fields = container.getFields();
			for (Iterator iter2 = fields.iterator (); iter2.hasNext ();){
				LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter2.next();
				objFound = false;
				for (Iterator iter1 = getSubnetoptionslist ().iterator (); iter1.hasNext ();){
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
					opFco.set_InstanceID ( "WBEM_SMT:Linux_DHCPOptions::dhcp::"+ adapter.getDhcpSubnetObj ().getFco ().get_Name () + "::"+ fld.getLabelText () );
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

					Linux_DHCPOptionsForEntity Subnetopfco = new Linux_DHCPOptionsForEntity ();
					Subnetopfco.set_Linux_DHCPEntity ( adapter.getSelectedEntity () );
					Subnetopfco.set_Linux_DHCPOptions ( opFco );
					try{
					Subnetopfco = (Linux_DHCPOptionsForEntity)adapter.getFcoHelper ().create ( Subnetopfco, adapter.getCimClient () );
					} catch (ObjectCreationException e) {
						e.printStackTrace();
					}
//					obj = new DhcpOptionsObject ( opFco, adapter );
				}
				obj = new DhcpOptionsObject ( opFco, adapter );
				getSubnetoptionslist ().addDhcpOptionsObject ( obj );
			}
				
			}
		return null;
	}

	public MessageList save(DHCPSubnetParamsContainer container){
		
		DhcpParamsObject obj = null;
		boolean objFound = false;

			// if the Param does not exist then create and add to the objects list
			List fields = container.getFields();
			for (Iterator iter2 = fields.iterator (); iter2.hasNext ();){
				LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter2.next();
				objFound = false;
				for (Iterator iter1 = getSubnetparamslist ().iterator (); iter1.hasNext ();){
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

				if(DhcpCimAdapter.isDummyMode ())
					opFco.set_InstanceID ( "WBEM_SMT:Linux_DHCPParams::dhcp::" + adapter.getDhcpPoolObj ().getFco ().get_Name () + "::" + fld.getLabelText () );
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

					Linux_DHCPParamsForEntity Subnetopfco = new Linux_DHCPParamsForEntity ();
					Subnetopfco.set_Linux_DHCPEntity ( adapter.getSelectedEntity () );
					Subnetopfco.set_Linux_DHCPParams ( opFco );
					try{
					Subnetopfco = (Linux_DHCPParamsForEntity)adapter.getFcoHelper ().create ( Subnetopfco, adapter.getCimClient () );
					} catch (ObjectCreationException e) {
						e.printStackTrace();
					}
					obj = new DhcpParamsObject ( opFco, adapter );
				}
				obj = new DhcpParamsObject ( opFco, adapter );
				getSubnetparamslist ().addDhcpParamsObject ( obj );
			}
				
			}
		return null;
	}
	
	public void updateControls(DHCPSubnetParamsContainer container){
		
		DhcpParamsObject obj = null;
		
		for (Iterator iter = getSubnetparamslist ().iterator (); iter.hasNext ();){ 
			obj  = (DhcpParamsObject)iter.next();
			obj.updateControls(container);
			}
		
	}

	public void updateControls(DHCPSubnetOptionsContainer container){
		
		DhcpOptionsObject obj = null;
		
		for (Iterator iter = getSubnetoptionslist ().iterator (); iter.hasNext ();){ 
			obj  = (DhcpOptionsObject)iter.next();
			obj.updateControls(container);
			}
		
	}

	
	public void updateControls ( DHCPSubnetsContainer container ) {
		
		Linux_DHCPSubnet fco = (Linux_DHCPSubnet) this.fco;
		
		container.get_Name ().setControlValue ( fco.get_Name () );
		container.get_Netmask ().setControlValue ( fco.get_Netmask () );
		
//		super.updateControls ( container );
	}

	public void deleteSubnet () throws ObjectDeletionException {

		Linux_DHCPSubnet fco = (Linux_DHCPSubnet) this.fco;

		ArrayList list = Linux_DHCPSubnetsForEntityHelper.enumerateInstanceNames ( adapter.getCimClient (), true );
		
		if(DhcpCimAdapter.isDummyMode ()){
		for (int i = 0; i < list.size (); i++) {
			Linux_DHCPSubnetsForEntity p = new Linux_DHCPSubnetsForEntity (((CIMObjectPath) list.get ( i )).getKeys ());
			Linux_DHCPSubnetsForEntity Subnetforentity = new Linux_DHCPSubnetsForEntity (((CIMObjectPath) list.get ( i )),p.getCimInstance ());
			String InstanceinAssoc = (String) Subnetforentity.get_Linux_DHCPSubnet ().getKey (
					CIM_SettingData.CIM_PROPERTY_INSTANCEID ).getValue ().getValue ();
			String Instanceinfco = fco.get_InstanceID ();
			if (InstanceinAssoc.equals ( Instanceinfco ))
				adapter.getFcoHelper ().delete ( Subnetforentity, adapter.getCimClient (), true );
		}
		}
		adapter.getFcoHelper ().delete ( fco, adapter.getCimClient (), true );
		
//		super.deleteSubnet ();
		adapter.setMarkedForReload ();
	}
	
	public DhcpOptionsList getSubnetoptionslist () {
		return subnetoptionslist;
	}

	public void setSubnetoptionslist ( DhcpOptionsList subnetoptionslist ) {
		this.subnetoptionslist = subnetoptionslist;
	}

	public DhcpParamsList getSubnetparamslist () {
		return subnetparamslist;
	}

	public void setSubnetparamslist ( DhcpParamsList subnetparamslist ) {
		this.subnetparamslist = subnetparamslist;
	}
	
}
