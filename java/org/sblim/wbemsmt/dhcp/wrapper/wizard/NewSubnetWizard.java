/** 
 * NewSubnetWizard.java
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


package org.sblim.wbemsmt.dhcp.wrapper.wizard;

import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetSummaryContainer;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSubnet;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSubnetsForEntity;
import org.sblim.wbemsmt.exception.WbemsmtException;

public class NewSubnetWizard {

	private NewSubnetContainer newSubnet = null;
	private DhcpCimAdapter adapter = null;
	
	public NewSubnetWizard ( DhcpCimAdapter adapter ) {
		super ();
		this.adapter = adapter;
	}
	
	public void updateControls(NewSubnetContainer container){
		this.newSubnet = container;
	}
	
	public void updateControls(NewSubnetSummaryContainer container){
		
		container.get_Netmask ().setControlValue ( newSubnet.get_Netmask ().getConvertedControlValue () );
		container.get_Name ().setControlValue ( newSubnet.get_Name ().getConvertedControlValue () );
	}

	public void create(NewSubnetSummaryContainer container) throws WbemsmtException{
	
		Linux_DHCPSubnet Subnet = new Linux_DHCPSubnet(adapter.getCimClient (),adapter.getNamespace ());
		Subnet.set_Netmask ( (String) container.get_Netmask ().getConvertedControlValue () );
		Subnet.set_Name ( (String) container.get_Name ().getConvertedControlValue () );
		if(DhcpCimAdapter.isDummyMode ())
			Subnet.set_key_InstanceID ( "WBEM_SMT:LinuxDHCPSubnet::dhcp::" + adapter.getSelectedEntity ().get_Name ()+ "::"+ container.get_Name ().getConvertedControlValue ());
		else
			Subnet.set_key_InstanceID ("");
		Subnet.set_ParentID ( adapter.getSelectedEntity ().get_key_InstanceID() );
		
		Subnet = (Linux_DHCPSubnet) adapter.getFcoHelper ().create ( Subnet, adapter.getCimClient () );
		
		if(DhcpCimAdapter.isDummyMode ()){
		Linux_DHCPSubnetsForEntity assoc = new Linux_DHCPSubnetsForEntity(adapter.getCimClient (),adapter.getNamespace ());
		
		assoc.set_PartComponent_Linux_DHCPSubnet ( Subnet );
		assoc.set_GroupComponent_Linux_DHCPEntity ( adapter.getSelectedEntity () );
		
		assoc = (Linux_DHCPSubnetsForEntity) adapter.getFcoHelper ().create ( assoc, adapter.getCimClient () );
		}
		adapter.setMarkedForReload ();
		adapter.setPathOfTreeNode ( Subnet.getCimObjectPath () );
		
	}

	
}
