/** 
 * NewGroupWizard.java
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
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewGroupContainer;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGroup;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGroupsForEntity;
import org.sblim.wbemsmt.exception.ObjectCreationException;

public class NewGroupWizard {

//	private NewGroupContainer newGroup = null;
	private DhcpCimAdapter adapter = null;
	
	public NewGroupWizard ( DhcpCimAdapter adapter ) {
		super ();
		this.adapter = adapter;
	}
	
	public void updateControls(NewGroupContainer container){
		container.get_Name ().setControlValue ( "Group" );
//		this.newGroup = container;
	}
	
	public void create(NewGroupContainer container) throws ObjectCreationException{
	
		Linux_DHCPGroup Group = new Linux_DHCPGroup();
		Group.set_Name ( (String) container.get_Name ().getConvertedControlValue () );
		if(DhcpCimAdapter.isDummyMode ())
			Group.set_InstanceID ( "WBEM_SMT:LinuxDHCPGroup::dhcp::" +  adapter.getSelectedEntity ().get_Name ()+ "::"+ container.get_Name ().getConvertedControlValue ()+System.currentTimeMillis ());
		else
			Group.set_InstanceID ("");
		Group.set_ParentID ( adapter.getSelectedEntity ().get_InstanceID () );
		Group = (Linux_DHCPGroup) adapter.getFcoHelper ().create ( Group, adapter.getCimClient () );
		
		if(DhcpCimAdapter.isDummyMode ()){
		Linux_DHCPGroupsForEntity assoc = new Linux_DHCPGroupsForEntity();
		
		assoc.set_Linux_DHCPGroup ( Group );
		assoc.set_Linux_DHCPEntity ( adapter.getSelectedEntity () );
		
		assoc = (Linux_DHCPGroupsForEntity) adapter.getFcoHelper ().create ( assoc, adapter.getCimClient () );
		}
		adapter.setMarkedForReload ();
		adapter.setPathOfTreeNode ( Group.getCimObjectPath () );
		
	}

	
}
