/** 
 * DhcpHostObject.java
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

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostsContainer;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPHost;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPHostsForEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPHostsForEntityHelper;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptions;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptionsForEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParams;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParamsForEntity;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpOptionsList;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpParamsList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class DhcpHostObject extends DhcpEntityObject {

	private DhcpOptionsList hostoptionslist = null;
	private DhcpParamsList hostparamslist = null;
	
	public DhcpHostObject ( Linux_DHCPEntity fco, DhcpCimAdapter adapter ) throws WbemsmtException {
		super ( fco, adapter );

		setHostoptionslist ( new DhcpOptionsList());
		setHostparamslist ( new DhcpParamsList());

		
		setHostoptionslist ( new DhcpOptionsList());
		setHostparamslist ( new DhcpParamsList());
		
		List<Linux_DHCPOptions> hostopArrayList = ((Linux_DHCPHost)fco).getAssociated_Linux_DHCPOptions_Linux_DHCPOptionsForEntitys (
						adapter.getCimClient ());

		for (Iterator<Linux_DHCPOptions> iter = hostopArrayList.iterator (); iter.hasNext ();) {
			Linux_DHCPOptions opsfco = (Linux_DHCPOptions) iter.next ();
			getHostoptionslist ().addDhcpOptionsObject ( new DhcpOptionsObject ( opsfco, adapter));
		}
		
		List<Linux_DHCPParams> hostparamArrayList = ((Linux_DHCPHost) fco).getAssociated_Linux_DHCPParams_Linux_DHCPParamsForEntitys (
				adapter.getCimClient () );

		for (Iterator<Linux_DHCPParams> iter = hostparamArrayList.iterator (); iter.hasNext ();) {
			Linux_DHCPParams paramsfco = (Linux_DHCPParams) iter.next ();
			getHostparamslist ().addDhcpParamsObject ( new DhcpParamsObject ( paramsfco, adapter ) );
		}

	}

	public DhcpHostObject ( Linux_DHCPEntity fco, DhcpCimAdapter adapter , Linux_DHCPEntity parentfco){
		super(fco , adapter , parentfco);
	}
	
	public MessageList saveHost ( DHCPHostsContainer container) throws WbemsmtException {
	
		Linux_DHCPHost fco = (Linux_DHCPHost) this.fco;
		
//		fco.set_IPAddr ( (String) container.get_IPAddr ().getConvertedControlValue () );
//		fco.set_MACAddr ( (String) container.get_MACAddr ().getConvertedControlValue () );
		fco.set_Name ( (String) container.get_Name ().getConvertedControlValue () );
		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );
		
		adapter.setMarkedForReload();
		adapter.setPathOfTreeNode(fco.getCimObjectPath());
		return null;
		
//		super.saveHost ( container );
//		return null;
	}

	public MessageList save ( DHCPHostOptionsContainer container) throws WbemsmtException {

		DhcpOptionsObject obj = null;
		boolean objFound = false;

			// if the option does not exist then create and add to the objects list
			List<LabeledBaseInputComponentIf> fields = container.getFields();
			for (Iterator<LabeledBaseInputComponentIf> iter2 = fields.iterator (); iter2.hasNext ();){
				LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter2.next();
				objFound = false;
				for (Iterator<Object> iter1 = getHostoptionslist ().iterator (); iter1.hasNext ();){
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
			if(objFound==false && fld.getConvertedControlValue () != null && fld.getConvertedControlValue ().toString ().equals("") == false){

				Linux_DHCPOptions opFco = new Linux_DHCPOptions(adapter.getCimClient (),adapter.getNamespace ());
				if (DhcpCimAdapter.isDummyMode ())
					opFco.set_key_InstanceID ( "WBEM_SMT:Linux_DHCPOptions::dhcp::" + adapter.getDhcpHostObj ().getFco ().get_Name () + "::" + fld.getLabelText () );
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

					Linux_DHCPOptionsForEntity Hostopfco = new Linux_DHCPOptionsForEntity (adapter.getCimClient (),adapter.getNamespace ());
					Hostopfco.set_GroupComponent_Linux_DHCPEntity ( adapter.getSelectedEntity () );
					Hostopfco.set_PartComponent_Linux_DHCPOptions ( opFco );
					try{
					Hostopfco = (Linux_DHCPOptionsForEntity)adapter.getFcoHelper ().create ( Hostopfco, adapter.getCimClient () );
					} catch (WbemsmtException e) {
						e.printStackTrace();
					}
//					obj = new DhcpOptionsObject ( opFco, adapter );
				}
				obj = new DhcpOptionsObject ( opFco, adapter );
				getHostoptionslist ().addDhcpOptionsObject ( obj );
			}
				
			}
		return null;
	}
	
	public MessageList save ( DHCPHostParamsContainer container ) throws WbemsmtException {
		
		DhcpParamsObject obj = null;
		boolean objFound = false;

			// if the Param does not exist then create and add to the objects list
			List<LabeledBaseInputComponentIf> fields = container.getFields();
			for (Iterator<LabeledBaseInputComponentIf> iter2 = fields.iterator (); iter2.hasNext ();){
				LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter2.next();
				objFound = false;
				for (Iterator<Object> iter1 = getHostparamslist ().iterator (); iter1.hasNext ();){
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
			if(objFound==false && fld.getConvertedControlValue () != null && fld.getConvertedControlValue ().toString ().equals("") == false){

				Linux_DHCPParams opFco = new Linux_DHCPParams(adapter.getCimClient (),adapter.getNamespace ());
				if (DhcpCimAdapter.isDummyMode ())
					opFco.set_key_InstanceID ( "WBEM_SMT:Linux_DHCPParams::dhcp::" + adapter.getDhcpHostObj ().getFco ().get_Name () + "::" + fld.getLabelText () );
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

					Linux_DHCPParamsForEntity Hostopfco = new Linux_DHCPParamsForEntity (adapter.getCimClient (),adapter.getNamespace ());
					Hostopfco.set_GroupComponent_Linux_DHCPEntity ( adapter.getSelectedEntity () );
					Hostopfco.set_PartComponent_Linux_DHCPParams ( opFco );
					try{
					Hostopfco = (Linux_DHCPParamsForEntity)adapter.getFcoHelper ().create ( Hostopfco, adapter.getCimClient () );
					} catch (WbemsmtException e) {
						e.printStackTrace();
					}
//					obj = new DhcpParamsObject ( opFco, adapter );
				}
				obj = new DhcpParamsObject ( opFco, adapter );
				getHostparamslist ().addDhcpParamsObject ( obj );
			}
				
			}
		return null;
		
	}
	
	public void updateControls(DHCPHostsContainer container) {
	
		Linux_DHCPHost fco = (Linux_DHCPHost) this.fco;
		
//		container.get_IPAddr ().setControlValue ( fco.get_IPAddr () );
//		container.get_MACAddr ().setControlValue ( fco.get_MACAddr () );
		container.get_Name ().setControlValue ( fco.get_Name () );
		
//		super.updateControls ( container );
	}
	
	public void updateControls(DHCPHostOptionsContainer container){
		
		DhcpOptionsObject obj = null;
		
		for (Iterator<Object> iter = getHostoptionslist ().iterator (); iter.hasNext ();){ 
			obj  = (DhcpOptionsObject)iter.next();
			obj.updateControls(container);
			}
		
	}

	public void updateControls(DHCPHostParamsContainer container){
		
		DhcpParamsObject obj = null;
		
		for (Iterator<Object> iter = getHostparamslist ().iterator (); iter.hasNext ();){ 
			obj  = (DhcpParamsObject)iter.next();
			obj.updateControls(container);
			}
		
	}

	public void deleteHost () throws WbemsmtException {
		
		Linux_DHCPHost fco = (Linux_DHCPHost) this.fco;
		List<CIMObjectPath> list = Linux_DHCPHostsForEntityHelper.enumerateInstanceNames ( adapter.getCimClient (),adapter.getNamespace (), true );
		if(DhcpCimAdapter.isDummyMode ()){
		for (int i = 0; i < list.size (); i++) {
			Linux_DHCPHostsForEntity p = new Linux_DHCPHostsForEntity (adapter.getCimClient (),adapter.getNamespace ());
			Linux_DHCPHostsForEntity Hostforentity = new Linux_DHCPHostsForEntity (p.getCimInstance ());
			String InstanceinAssoc = (String) Hostforentity.get_PartComponent_Linux_DHCPHost (adapter.getCimClient()).get_key_InstanceID ();
			String Instanceinfco = fco.get_key_InstanceID();
			if (InstanceinAssoc.equals ( Instanceinfco ))
				adapter.getFcoHelper ().delete ( Hostforentity, adapter.getCimClient (), true );
		}
		}
		adapter.getFcoHelper ().delete ( fco, adapter.getCimClient (), true );
		
//		super.deleteHost ();
		adapter.setMarkedForReload ();
	}

	public DhcpOptionsList getHostoptionslist () {
		
//		if (hostoptionslist == null) {
//			hostoptionslist = new DhcpOptionsList();
//			ArrayList hostopArrayList = ((Linux_DHCPHost) fco)
//					.getAssociated_Linux_DHCPOptions_Linux_DHCPOptionsForEntitys ( adapter.getCimClient (), false,
//							false, null );
//
//			for (Iterator iter = hostopArrayList.iterator (); iter.hasNext ();) {
//				Linux_DHCPOptions opsfco = (Linux_DHCPOptions) iter.next ();
//				hostoptionslist.addDhcpOptionsObject ( new DhcpOptionsObject ( opsfco, adapter ) );
//			}
//
//		}
		
		return hostoptionslist;
	}

	public void setHostoptionslist ( DhcpOptionsList hostoptionslist ) {
		this.hostoptionslist = hostoptionslist;
	}

	public DhcpParamsList getHostparamslist () {
		
//		if(hostparamslist == null){
//		
//			hostparamslist = new DhcpParamsList();
//			
//			ArrayList hostparamArrayList = ((Linux_DHCPHost) fco).getAssociated_Linux_DHCPParams_Linux_DHCPParamsForEntitys (
//					adapter.getCimClient (), false, false, null );
//
//			for (Iterator iter = hostparamArrayList.iterator (); iter.hasNext ();) {
//				Linux_DHCPParams paramsfco = (Linux_DHCPParams) iter.next ();
//				hostparamslist.addDhcpParamsObject ( new DhcpParamsObject ( paramsfco, adapter ) );
//			}
//
//		}
		
		return hostparamslist;
	}

	public void setHostparamslist ( DhcpParamsList hostparamslist ) {
		this.hostparamslist = hostparamslist;
	}
	
}
