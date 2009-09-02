/** 
 * DhcpEntityObject.java
 *
 * © Copyright IBM Corp.  2009,2007
 *
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Eclipse Public License from
 * http://www.opensource.org/licenses/eclipse-1.0.php
 *
 * @author: Prashanth Karnam <prkarnam@in.ibm.com>
 *
 * Contributors: 
 * 
 * Description: 
 * 
 */


package org.sblim.wbemsmt.dhcp.wrapper.object;


import java.util.Iterator;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.bl.wrapper.WbemsmtBusinessObject;
import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetsContainer;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGlobal;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptions;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptionsForEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParams;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParamsForEntity;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class DhcpEntityObject extends WbemsmtBusinessObject {

	protected Linux_DHCPEntity fco = null;
	protected Linux_DHCPEntity parentfco = null;
	protected DhcpCimAdapter adapter = null;
	
	
	public DhcpEntityObject ( Linux_DHCPEntity fco, DhcpCimAdapter adapter ) {
		super (adapter);
		this.fco = fco;
		this.adapter = adapter;
	}
	
	public DhcpEntityObject ( Linux_DHCPEntity fco, DhcpCimAdapter adapter , Linux_DHCPEntity parentfco) {
		super (adapter);
		this.fco = fco;
		this.adapter = adapter;
		this.parentfco = parentfco;
	}
	
	public Linux_DHCPEntity getFco() {
		return fco;
	}

	public CimObjectKey getCimObjectKey() {
		return new CimObjectKey(fco.getCimObjectPath());
	}

//	protected MessageList saveHost ( DHCPHostsContainer container) throws WbemsmtException {
//		
//		Linux_DHCPHost fco = (Linux_DHCPHost) this.fco;
//		
//		fco.set_IPAddr ( (String) container.get_IPAddr ().getConvertedControlValue () );
//		fco.set_MACAddr ( (String) container.get_MACAddr ().getConvertedControlValue () );
//		fco.set_ElementName ( (String) container.get_Name ().getConvertedControlValue () );
//		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );
//		
////		adapter.setMarkedForReload();
////		adapter.setPathOfTreeNode(fco.getCimObjectPath());
//		return null;
//	}
//
//	protected MessageList saveSubnet ( DHCPSubnetsContainer container) throws WbemsmtException {
//		
//		Linux_DHCPSubnet fco = (Linux_DHCPSubnet) this.fco;
//		
//		fco.set_Netmask ( (String) container.get_Netmask ().getConvertedControlValue () );
//		fco.set_Name ( (String) container.get_Name ().getConvertedControlValue () );
//		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );
//
////		adapter.setMarkedForReload();
////		adapter.setPathOfTreeNode(fco.getCimObjectPath());
//
//		return null;
//	}
//
//	protected MessageList saveSharedNet ( DHCPSharednetsContainer container) throws WbemsmtException {
//
//		Linux_DHCPSharednet fco = (Linux_DHCPSharednet) this.fco;
//
//		fco.set_Name ( (String) container.get_Name ().getConvertedControlValue () );
//		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );
//
////		adapter.setMarkedForReload();
////		adapter.setPathOfTreeNode(fco.getCimObjectPath());
//
//		return null;
//	}
//
//	protected MessageList savePool ( DHCPPoolsContainer container) throws WbemsmtException {
//
//		Linux_DHCPPool fco = (Linux_DHCPPool) this.fco;
//		
//		fco.set_IPAddrEnd ( (String) container.get_IPAddrEnd ().getConvertedControlValue () );
//		fco.set_Name ( (String) container.get_Name ().getConvertedControlValue () );
//		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );
//
////		adapter.setMarkedForReload();
////		adapter.setPathOfTreeNode(fco.getCimObjectPath());
//
//		return null;
//	}
//
//	protected MessageList saveGroup ( DHCPGroupsContainer container) throws WbemsmtException {
//
//		Linux_DHCPGroup fco = (Linux_DHCPGroup) this.fco;
//		
//		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );
//
////		adapter.setMarkedForReload();
////		adapter.setPathOfTreeNode(fco.getCimObjectPath());
//
//		return null;
//	}

	
//	protected void deleteHost() throws WbemsmtException {
//		
//		Linux_DHCPHost fco = (Linux_DHCPHost) this.fco;
//		ArrayList list = Linux_DHCPHostsForEntityHelper.enumerateInstanceNames ( adapter.getCimClient (), true );
//		if(DhcpCimAdapter.isDummyMode ()){
//		for (int i = 0; i < list.size (); i++) {
//			Linux_DHCPHostsForEntity p = new Linux_DHCPHostsForEntity (((CIMObjectPath) list.get ( i )).getKeys ());
//			Linux_DHCPHostsForEntity Hostforentity = new Linux_DHCPHostsForEntity (((CIMObjectPath) list.get ( i )),p.getCimInstance ());
//			String InstanceinAssoc = (String) Hostforentity.get_Linux_DHCPHost ().getKey (
//					CIM_SettingData.PROPERTY_INSTANCEID ).getValue ().getValue ();
//			String Instanceinfco = fco.get_key_InstanceID();
//			if (InstanceinAssoc.equals ( Instanceinfco ))
//				adapter.getFcoHelper ().delete ( Hostforentity, adapter.getCimClient (), true );
//		}
//		}
//		adapter.getFcoHelper ().delete ( fco, adapter.getCimClient (), true );
//	}
//	
//	protected void deletePool () throws WbemsmtException {
//
//		Linux_DHCPPool fco = (Linux_DHCPPool) this.fco;
//		ArrayList list = Linux_DHCPPoolsForEntityHelper.enumerateInstanceNames ( adapter.getCimClient (), true );
//
//		if(DhcpCimAdapter.isDummyMode ()){
//		for (int i = 0; i < list.size (); i++) {
//			Linux_DHCPPoolsForEntity p = new Linux_DHCPPoolsForEntity (((CIMObjectPath) list.get ( i )).getKeys ());
//			Linux_DHCPPoolsForEntity poolforentity = new Linux_DHCPPoolsForEntity (((CIMObjectPath) list.get ( i )),p.getCimInstance ());
//			String InstanceinAssoc = (String) poolforentity.get_Linux_DHCPPool ().getKey (
//					CIM_SettingData.PROPERTY_INSTANCEID ).getValue ().getValue ();
//			String Instanceinfco = fco.get_key_InstanceID();
//			if (InstanceinAssoc.equals ( Instanceinfco ))
//				adapter.getFcoHelper ().delete ( poolforentity, adapter.getCimClient (), true );
//		}
//		}
//		adapter.getFcoHelper ().delete ( fco, adapter.getCimClient (), true );
//	}
//
//	protected void deleteSubnet() throws WbemsmtException {
//
//		Linux_DHCPSubnet fco = (Linux_DHCPSubnet) this.fco;
//
//		ArrayList list = Linux_DHCPSubnetsForEntityHelper.enumerateInstanceNames ( adapter.getCimClient (), true );
//		
//		if(DhcpCimAdapter.isDummyMode ()){
//		for (int i = 0; i < list.size (); i++) {
//			Linux_DHCPSubnetsForEntity p = new Linux_DHCPSubnetsForEntity (((CIMObjectPath) list.get ( i )).getKeys ());
//			Linux_DHCPSubnetsForEntity Subnetforentity = new Linux_DHCPSubnetsForEntity (((CIMObjectPath) list.get ( i )),p.getCimInstance ());
//			String InstanceinAssoc = (String) Subnetforentity.get_Linux_DHCPSubnet ().getKey (
//					CIM_SettingData.PROPERTY_INSTANCEID ).getValue ().getValue ();
//			String Instanceinfco = fco.get_key_InstanceID();
//			if (InstanceinAssoc.equals ( Instanceinfco ))
//				adapter.getFcoHelper ().delete ( Subnetforentity, adapter.getCimClient (), true );
//		}
//		}
//		adapter.getFcoHelper ().delete ( fco, adapter.getCimClient (), true );
//	}
//
//	protected void deleteSharednet() throws WbemsmtException {
//	
//		Linux_DHCPSharednet fco = (Linux_DHCPSharednet) this.fco;
//		ArrayList list = Linux_DHCPSharednetsForEntityHelper.enumerateInstanceNames ( adapter.getCimClient (), true );
//		
//		if(DhcpCimAdapter.isDummyMode ()){
//		for (int i = 0; i < list.size (); i++) {
//			Linux_DHCPSharednetsForEntity p = new Linux_DHCPSharednetsForEntity (((CIMObjectPath) list.get ( i )).getKeys ());
//			Linux_DHCPSharednetsForEntity Sharednetforentity = new Linux_DHCPSharednetsForEntity (((CIMObjectPath) list.get ( i )),p.getCimInstance ());
//			String InstanceinAssoc = (String) Sharednetforentity.get_Linux_DHCPSharednet ().getKey (
//					CIM_SettingData.PROPERTY_INSTANCEID ).getValue ().getValue ();
//			String Instanceinfco = fco.get_key_InstanceID();
//			if (InstanceinAssoc.equals ( Instanceinfco ))
//				adapter.getFcoHelper ().delete ( Sharednetforentity, adapter.getCimClient (), true );
//		}
//		}
//		adapter.getFcoHelper ().delete ( fco, adapter.getCimClient (), true );
//	}
//
//	protected void deleteGroup() throws WbemsmtException {
//	
//		Linux_DHCPGroup fco = (Linux_DHCPGroup) this.fco;
//		ArrayList list = Linux_DHCPGroupsForEntityHelper.enumerateInstanceNames ( adapter.getCimClient (), true );
//		
//		if(DhcpCimAdapter.isDummyMode ()){
//		for (int i = 0; i < list.size (); i++) {
//			Linux_DHCPGroupsForEntity p = new Linux_DHCPGroupsForEntity (((CIMObjectPath) list.get ( i )).getKeys ());
//			Linux_DHCPGroupsForEntity Groupforentity = new Linux_DHCPGroupsForEntity (((CIMObjectPath) list.get ( i )),p.getCimInstance ());
//			String InstanceinAssoc = (String) Groupforentity.get_Linux_DHCPGroup ().getKey (
//					CIM_SettingData.PROPERTY_INSTANCEID ).getValue ().getValue ();
//			String Instanceinfco = fco.get_key_InstanceID();
//			if (InstanceinAssoc.equals ( Instanceinfco ))
//				adapter.getFcoHelper ().delete ( Groupforentity, adapter.getCimClient (), true );
//		}
//		}
//		adapter.getFcoHelper ().delete ( fco, adapter.getCimClient (), true );
//	}

	public MessageList save(DHCPGlobalOptionsContainer container) throws WbemsmtException{
		
		DhcpOptionsObject obj = null;
		boolean objFound = false;

			// if the option does not exist then create and add to the objects list
			List<LabeledBaseInputComponentIf> fields = container.getFields();
			for (Iterator<LabeledBaseInputComponentIf> iter2 = fields.iterator (); iter2.hasNext ();){
				LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter2.next();
				objFound = false;
				for (Iterator<Object> iter1 = adapter.getDhcpglobalopslist ().iterator (); iter1.hasNext ();){
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
			if(objFound==false && fld.getConvertedControlValue() != null && fld.getConvertedControlValue ().toString ().equals("") == false){

				Linux_DHCPOptions opFco = new Linux_DHCPOptions(adapter.getCimClient (),adapter.getNamespace ());
				opFco.set_key_InstanceID ( "WBEM_SMT:Linux_DHCPOptions::dhcp::" + fld.getLabelText () );
				opFco.set_Name ( fld.getLabelText () );
				opFco.set_values ( fld.getConvertedControlValue ().toString () );
				try{
				opFco = (Linux_DHCPOptions)adapter.getFcoHelper ().create ( opFco, adapter.getCimClient () );
				} catch (WbemsmtException e) {
					e.printStackTrace();
				}
				if (DhcpCimAdapter.isDummyMode ()) {
					Linux_DHCPGlobal globalFco = null;

					List<Linux_DHCPGlobal> globalEntityArrayList = adapter.getDhcpServiceObj ().getFco ()
							.getAssociated_Linux_DHCPGlobal_Linux_DHCPGlobalForServices ( adapter.getCimClient () );
					for (Iterator<Linux_DHCPGlobal> iter = globalEntityArrayList.iterator (); iter.hasNext ();) {
						globalFco = (Linux_DHCPGlobal) iter.next ();
					}

					Linux_DHCPOptionsForEntity globalopfco = new Linux_DHCPOptionsForEntity (adapter.getCimClient (),adapter.getNamespace ());
					globalopfco.set_GroupComponent_Linux_DHCPEntity ( globalFco );
					globalopfco.set_PartComponent_Linux_DHCPOptions ( opFco );
					try{
					globalopfco = (Linux_DHCPOptionsForEntity)adapter.getFcoHelper ().create ( globalopfco, adapter.getCimClient () );
					} catch (WbemsmtException e) {
						e.printStackTrace();
					}
					obj = new DhcpOptionsObject ( opFco, adapter );
				}
				
				adapter.getDhcpglobalopslist ().addDhcpOptionsObject ( obj );
			}
				
			}
		return null;
	}
	
	
	public MessageList save(DHCPGlobalParamsContainer container) throws WbemsmtException{
		
		DhcpParamsObject obj = null;
		boolean objFound = false;

			// if the option does not exist then create and add to the objects list
			List<LabeledBaseInputComponentIf> fields = container.getFields();
			for (Iterator<LabeledBaseInputComponentIf> iter2 = fields.iterator (); iter2.hasNext ();){
				LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter2.next();
				objFound = false;
				for (Iterator<Object> iter1 = adapter.getDhcpglobalparamslist ().iterator (); iter1.hasNext ();){
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
			if(objFound==false && fld.getConvertedControlValue() != null&& fld.getConvertedControlValue ().toString ().equals("") == false){

				Linux_DHCPParams opFco = new Linux_DHCPParams(adapter.getCimClient (),adapter.getNamespace ());
				opFco.set_key_InstanceID ( "WBEM_SMT:Linux_DHCPParams::dhcp::" + fld.getLabelText () );
				opFco.set_Name ( fld.getLabelText () );
				opFco.set_values ( fld.getConvertedControlValue ().toString () );
				try{
				opFco = (Linux_DHCPParams)adapter.getFcoHelper ().create ( opFco, adapter.getCimClient () );
				} catch (WbemsmtException e) {
					e.printStackTrace();
				}
				if (DhcpCimAdapter.isDummyMode ()) {
					Linux_DHCPGlobal globalFco = null;

					List<Linux_DHCPGlobal> globalEntityArrayList = adapter.getDhcpServiceObj ().getFco ()
							.getAssociated_Linux_DHCPGlobal_Linux_DHCPGlobalForServices ( adapter.getCimClient ());
					for (Iterator<Linux_DHCPGlobal> iter = globalEntityArrayList.iterator (); iter.hasNext ();) {
						globalFco = (Linux_DHCPGlobal) iter.next ();
					}

					Linux_DHCPParamsForEntity globalopfco = new Linux_DHCPParamsForEntity (adapter.getCimClient (),adapter.getNamespace ());
					globalopfco.set_GroupComponent_Linux_DHCPEntity ( globalFco );
					globalopfco.set_PartComponent_Linux_DHCPParams ( opFco );
					try {
						globalopfco = (Linux_DHCPParamsForEntity)adapter.getFcoHelper ().create ( globalopfco, adapter.getCimClient () );
					} catch (WbemsmtException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					obj = new DhcpParamsObject ( opFco, adapter );
				}
				
				adapter.getDhcpglobalparamslist ().addDhcpParamsObject ( obj );
			}
				
			}
		return null;
	}
	
	public void updateControls(DHCPGlobalParamsContainer container) throws WbemsmtException{
		
		DhcpParamsObject obj = null;
		
		for (Iterator<Object> iter = adapter.getDhcpglobalparamslist ().iterator (); iter.hasNext ();){ 
			obj  = (DhcpParamsObject)iter.next();
			obj.updateControls(container);
			}
		
	}

	
	
	public void updateControls(DHCPGlobalOptionsContainer container) throws WbemsmtException{
		
		DhcpOptionsObject obj = null;
		
		for (Iterator<Object> iter = adapter.getDhcpglobalopslist ().iterator (); iter.hasNext ();){ 
			obj  = (DhcpOptionsObject)iter.next();
			obj.updateControls(container);
			}
		
	}
	
	
//	protected void updateControls(DHCPHostsContainer container) {
//		
//		Linux_DHCPHost fco = (Linux_DHCPHost) this.fco;
//		
//		container.get_IPAddr ().setControlValue ( fco.get_IPAddr () );
//		container.get_MACAddr ().setControlValue ( fco.get_MACAddr () );
//		container.get_Name ().setControlValue ( fco.get_Name () );
//		
//	}
//
//	protected void updateControls(DHCPPoolsContainer container) {
//		
//		Linux_DHCPPool fco = (Linux_DHCPPool) this.fco;
//		
//		container.get_Name ().setControlValue ( fco.get_Name () );
////		container.get_IPAddrEnd ().setControlValue ( fco.get_IPAddrEnd () );
//		
//	}
//
//	protected void updateControls(DHCPGroupsContainer container) {
//	}
//
//	protected void updateControls(DHCPSubnetsContainer container) {
//		
//		Linux_DHCPSubnet fco = (Linux_DHCPSubnet) this.fco;
//		
//		container.get_Name ().setControlValue ( fco.get_Name () );
//		container.get_Netmask ().setControlValue ( fco.get_Netmask () );
//	}
//
//	protected void updateControls(DHCPSharednetsContainer container) {
//		
//		Linux_DHCPSharednet fco = (Linux_DHCPSharednet) this.fco;
//		
//		container.get_Name ().setControlValue ( fco.get_Name () );
//	}

	protected MessageList revert ( DHCPHostsContainer container ) throws WbemsmtException {
		return null;
	}

	protected MessageList revert ( DHCPPoolsContainer container ) throws WbemsmtException {
		return null;
	}
	
	protected MessageList revert ( DHCPGroupsContainer container ) throws WbemsmtException {
		return null;
	}
	
	protected MessageList revert ( DHCPSubnetsContainer container ) throws WbemsmtException {
		return null;
	}
	
	protected MessageList revert ( DHCPSharednetsContainer container ) throws WbemsmtException {
		return null;
	}
	
//	protected void loadFcosFromGlobal(Linux_DHCPEntity fco , WBEMClient cimclient) throws SecurityException, NoSuchMethodException, InstantiationException, ClassNotFoundException{
//		
//		String EntityTypes[] = {"Linux_DHCPSubnet","Linux_DHCPSharednet","Linux_DHCPGroup","Linux_DHCPPool","Linux_DHCPHost"};
//		String BusinessObjs[] = {"DhcpSubnetObject","DhcpSharednetObject","DhcpGroupObject","DhcpPoolObject","DhcpHostObject"};
//		String BusinessObjsList[] = {"DhcpSubnetObjectList","DhcpSharednetObjectList","DhcpGroupObjectList","DhcpPoolObjectList","DhcpHostObjectList"};
//		String ObjsList[] = {"Subnetobjlist","Sharednetobjlist","Groupobjlist","Poolobjlist","Hostobjlist"};
//		String methodName = null; 
//		
//		Class partypes[] = new Class[4];
//        partypes[0] = WBEMClient.class;
//        partypes[1] = Boolean.TYPE;
//        partypes[2] = Boolean.TYPE;
//        partypes[3] = String[].class;
//		
//        Object args[] = new Object[4];
//        args[0] = cimclient;
//        args[1] = new Boolean(false);
//        args[2] = new Boolean(false);
//        args[3] = null;
//        
//        Class[] listType = {DhcpEntityObject.class};
//        Object[] listArgs = new Object[1];
//        
//        for (int i = 0; i < EntityTypes.length; i++) {
//        	
//			methodName = "getAssociated_" + EntityTypes[i] + "_" + EntityTypes[i] + "sForEntitys";
//			Method method = fco.getClass ().getMethod ( methodName, partypes );
//			method.setAccessible ( true );
//			try {
//				ArrayList list = (ArrayList) method.invoke ( fco, args );
//				System.out.println(methodName);
//				if (list.size () > 0) {
//
//					for (Iterator iter = list.iterator (); iter.hasNext ();) {
//
//						Linux_DHCPEntity fco1 = (Linux_DHCPEntity) iter.next ();
//						
//						String fcoName = fco1.getCimObjectPath ().getObjectName ();
//						
//						if(fcoName == "Linux_DHCPHost"){
//							DhcpHostObject obj = new DhcpHostObject(fco1,adapter);
//							DhcpHostObjectList objlist = new DhcpHostObjectList();
//							objlist.addDhcpHostObject ( obj );
//							setHostobjlist ( objlist );
//						}
//						if(fcoName == "Linux_DHCPGroup"){
//							DhcpGroupObject obj = new DhcpGroupObject(fco1,adapter);
//							DhcpGroupObjectList objlist = new DhcpGroupObjectList();
//							objlist.addDhcpGroupObject ( obj );
//							setGroupobjlist ( objlist );
//						}
//						if(fcoName == "Linux_DHCPSubnet"){
//							DhcpSubnetObject obj = new DhcpSubnetObject(fco1,adapter);
//							DhcpSubnetObjectList objlist = new DhcpSubnetObjectList();
//							objlist.addDhcpSubnetObject ( obj );
//							setSubnetobjlist ( objlist );
//						}
//						if(fcoName == "Linux_DHCPSharednet"){
//							DhcpSharednetObject obj = new DhcpSharednetObject(fco1,adapter);
//							DhcpSharednetObjectList objlist = new DhcpSharednetObjectList();
//							objlist.addDhcpSharednetObject ( obj );
//							setSharednetobjlist ( objlist );
//						}
//						if(fcoName == "Linux_DHCPPool"){
//							DhcpPoolObject obj = new DhcpPoolObject(fco1,adapter);
//							DhcpPoolObjectList objlist = new DhcpPoolObjectList();
//							objlist.addDhcpPoolObject ( obj );
//							setPoolobjlist ( objlist );
//						}
//
//						loadFcosFromGlobal ( fco1, cimclient ) ;
//					}
//
//				} else
//					continue;
//
//			} catch (IllegalArgumentException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace ();
//			} catch (IllegalAccessException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace ();
//			} catch (InvocationTargetException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace ();
//			}
//		}
//
//		return;
//	}
		
}
