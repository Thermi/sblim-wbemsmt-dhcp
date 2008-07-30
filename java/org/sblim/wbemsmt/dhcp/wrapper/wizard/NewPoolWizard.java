/** 
 * NewPoolWizard.java
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
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolSummaryContainer;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParams;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParamsForEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPPool;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPPoolsForEntity;
import org.sblim.wbemsmt.exception.WbemsmtException;

public class NewPoolWizard {

	private NewPoolContainer newPool = null;
	private DhcpCimAdapter adapter = null;
	
	public NewPoolWizard ( DhcpCimAdapter adapter ) {
		super ();
		this.adapter = adapter;
	}
	
	public void updateControls(NewPoolContainer container){
		this.newPool = container;
	}
	
	public void updateControls(NewPoolSummaryContainer container){
		
//		container.get_IPAddrEnd ().setControlValue ( newPool.get_IPAddrEnd ().getConvertedControlValue () );
		container.get_Name ().setControlValue ( newPool.get_Name ().getConvertedControlValue () );
		container.get_usr_Range ().setControlValue ( newPool.get_usr_Range ().getConvertedControlValue () );
	}

	public void create(NewPoolSummaryContainer container) throws WbemsmtException{
	
		Linux_DHCPPool Pool = new Linux_DHCPPool(adapter.getCimClient (),adapter.getNamespace ());
//		Pool.set_IPAddrEnd ( (String) container.get_IPAddrEnd ().getConvertedControlValue () );
		Pool.set_Name ( (String) container.get_Name ().getConvertedControlValue () );
		if(DhcpCimAdapter.isDummyMode ())
			Pool.set_key_InstanceID ( "WBEM_SMT:LinuxDHCPPool::dhcp::" + adapter.getSelectedEntity ().get_Name ()+ "::"+ container.get_Name ().getConvertedControlValue ());
		else
			Pool.set_key_InstanceID ("");
		Pool.set_ParentID ( adapter.getSelectedEntity ().get_key_InstanceID() );
		Pool = (Linux_DHCPPool) adapter.getFcoHelper ().create ( Pool, adapter.getCimClient () );
		
		if(DhcpCimAdapter.isDummyMode ()){
		Linux_DHCPPoolsForEntity assoc = new Linux_DHCPPoolsForEntity(adapter.getCimClient (),adapter.getNamespace ());
		
		assoc.set_PartComponent_Linux_DHCPPool ( Pool );
		assoc.set_GroupComponent_Linux_DHCPEntity ( adapter.getSelectedEntity () );
		
		assoc = (Linux_DHCPPoolsForEntity) adapter.getFcoHelper ().create ( assoc, adapter.getCimClient () );
		}
		Linux_DHCPParams poolop = new Linux_DHCPParams(adapter.getCimClient (),adapter.getNamespace ());
		if (DhcpCimAdapter.isDummyMode ())
			poolop.set_key_InstanceID ( "WBEM_SMT:LinuxDHCPParams::dhcp::" + adapter.getSelectedEntity ().get_Name ()+ ":: range" );
		poolop.set_Name ( "range" );
		poolop.set_ParentID ( Pool.get_key_InstanceID() );
		poolop.set_values ( (String)container.get_usr_Range ().getConvertedControlValue () );
		
		poolop = (Linux_DHCPParams) adapter.getFcoHelper ().create ( poolop, adapter.getCimClient () );
		
		if(DhcpCimAdapter.isDummyMode ()){
		Linux_DHCPParamsForEntity opentity = new Linux_DHCPParamsForEntity(adapter.getCimClient (),adapter.getNamespace ());
		opentity.set_GroupComponent_Linux_DHCPEntity ( Pool );
		opentity.set_PartComponent_Linux_DHCPParams ( poolop );
		
		opentity = (Linux_DHCPParamsForEntity) adapter.getFcoHelper ().create ( opentity, adapter.getCimClient () );
		}
		adapter.setMarkedForReload ();
		adapter.setPathOfTreeNode ( Pool.getCimObjectPath () );
		
	}

	
}
