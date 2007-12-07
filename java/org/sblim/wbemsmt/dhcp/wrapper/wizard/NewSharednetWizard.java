/** 
 * NewSharednetWizard.java
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
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetSummaryContainer;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSharednet;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSharednetsForEntity;
import org.sblim.wbemsmt.exception.ObjectCreationException;

public class NewSharednetWizard {

	private NewSharednetContainer newSharednet = null;
	private DhcpCimAdapter adapter = null;
	
	public NewSharednetWizard ( DhcpCimAdapter adapter ) {
		super ();
		this.adapter = adapter;
	}
	
	public void updateControls(NewSharednetContainer container){
		this.newSharednet = container;
	}
	
	public void updateControls(NewSharednetSummaryContainer container){
		
		container.get_Name ().setControlValue ( newSharednet.get_Name ().getConvertedControlValue () );
	}

	public void create(NewSharednetSummaryContainer container) throws ObjectCreationException{
	
		Linux_DHCPSharednet Sharednet = new Linux_DHCPSharednet();
		Sharednet.set_Name ( (String) container.get_Name ().getConvertedControlValue () );
		if(DhcpCimAdapter.isDummyMode ())
			Sharednet.set_InstanceID ( "WBEM_SMT:LinuxDHCPSharednet::dhcp::" +  adapter.getSelectedEntity ().get_Name ()+ "::" + container.get_Name ().getConvertedControlValue ());
		else
			Sharednet.set_InstanceID ("");
		Sharednet.set_ParentID ( adapter.getSelectedEntity ().get_InstanceID () );
		Sharednet = (Linux_DHCPSharednet) adapter.getFcoHelper ().create ( Sharednet, adapter.getCimClient () );
		
		
		if(DhcpCimAdapter.isDummyMode ()){
		Linux_DHCPSharednetsForEntity assoc = new Linux_DHCPSharednetsForEntity();
		
		assoc.set_Linux_DHCPSharednet ( Sharednet );
		assoc.set_Linux_DHCPEntity ( adapter.getSelectedEntity () );
		
		assoc = (Linux_DHCPSharednetsForEntity) adapter.getFcoHelper ().create ( assoc, adapter.getCimClient () );
		}
		adapter.setMarkedForReload ();
		adapter.setPathOfTreeNode ( Sharednet.getCimObjectPath () );
		
	}

	
}
