/** 
 * NewHostWizard.java
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


package org.sblim.wbemsmt.dhcp.wrapper.wizard;

import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPHost;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPHostsForEntity;
import org.sblim.wbemsmt.exception.ObjectCreationException;

public class NewHostWizard {
	
	private NewHostContainer newHost = null;
	private DhcpCimAdapter adapter = null;
	
	public NewHostWizard ( DhcpCimAdapter adapter ) {
		super ();
		this.adapter = adapter;
	}
	
	public void updateControls(NewHostContainer container){
		this.newHost = container;
	}
	
	public void updateControls(NewHostSummaryContainer container){
		
		container.get_IPAddr ().setControlValue ( newHost.get_IPAddr ().getConvertedControlValue () );
		container.get_MACAddr ().setControlValue ( newHost.get_MACAddr ().getConvertedControlValue () );
		container.get_Name ().setControlValue ( newHost.get_Name ().getConvertedControlValue () );
	}

	public void create(NewHostSummaryContainer container) throws ObjectCreationException{
	
		Linux_DHCPHost host = new Linux_DHCPHost();
		host.set_IPAddr ( (String) container.get_IPAddr ().getConvertedControlValue () );
		host.set_MACAddr ( (String) container.get_MACAddr ().getConvertedControlValue () );
		host.set_Name ( (String) container.get_Name ().getConvertedControlValue () );
		if(DhcpCimAdapter.isDummyMode ())
			host.set_InstanceID ( "WBEM_SMT:LinuxDHCPHost::dhcp::" +adapter.getSelectedEntity ().get_Name ()+ "::"+  container.get_Name ().getConvertedControlValue ());
		else
			host.set_InstanceID ("");
		host.set_ParentID ( adapter.getSelectedEntity ().get_InstanceID () );
		host = (Linux_DHCPHost) adapter.getFcoHelper ().create ( host, adapter.getCimClient () );
		
		if(DhcpCimAdapter.isDummyMode ()){
		Linux_DHCPHostsForEntity assoc = new Linux_DHCPHostsForEntity();
		
		assoc.set_Linux_DHCPHost ( host );
		assoc.set_Linux_DHCPEntity ( adapter.getSelectedEntity () );
		
		assoc = (Linux_DHCPHostsForEntity) adapter.getFcoHelper ().create ( assoc, adapter.getCimClient () );
		}
		adapter.setMarkedForReload ();
		adapter.setPathOfTreeNode ( host.getCimObjectPath () );
		
	}
	
}
