/** 
 * DhcpCimAdapterUpdateControlsDelegatee.java
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


package org.sblim.wbemsmt.dhcp.bl.adapter;

import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsListContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsListItemContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednerOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DhcpServiceConfContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.WelcomeContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewGroupContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolSummaryContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetSummaryContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetSummaryContainer;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptions;
import org.sblim.wbemsmt.exception.UpdateControlsException;

public class DhcpCimAdapterUpdateControlsDelegatee implements DhcpCimAdapterUpdateControlsIf {

	private DhcpCimAdapter adapter = null;
	
	public DhcpCimAdapterUpdateControlsDelegatee(final DhcpCimAdapter adapter){
		this.adapter = adapter;
	}

	public void updateControlsImpl ( DHCPGroupsContainer container ) throws UpdateControlsException {
		adapter.getDhcpGroupObj ().updateControls ( container );
	}

	public void updateControlsImpl ( DHCPHostsContainer container ) throws UpdateControlsException {
		adapter.getDhcpHostObj ().updateControls ( container );
	}

	public void updateControlsImpl ( DHCPOptionsContainer container ) throws UpdateControlsException {
		
	}

	public void updateControlsImpl ( DHCPParamsContainer container ) throws UpdateControlsException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( DHCPPoolsContainer container ) throws UpdateControlsException {
		adapter.getDhcpPoolObj ().updateControls ( container );
	}

	public void updateControlsImpl ( DHCPSharednetsContainer container ) throws UpdateControlsException {
		adapter.getDhcpSharednetObj ().updateControls ( container );
	}

	public void updateControlsImpl ( DHCPSubnetsContainer container ) throws UpdateControlsException {
		adapter.getDhcpSubnetObj ().updateControls ( container );
	}

	public void updateControlsImpl ( DhcpServiceConfContainer container ) throws UpdateControlsException {
		adapter.getDhcpServiceConfigurationObj ().updateControls ( container );
	}

	public void updateControlsImpl ( DHCPGlobalOptionsListContainer container ) throws UpdateControlsException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( DHCPGlobalOptionsListItemContainer container ) throws UpdateControlsException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( DHCPGlobalOptionsListContainer container, Linux_DHCPOptions fco ) throws UpdateControlsException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( DHCPGlobalOptionsContainer container ) throws UpdateControlsException {
		adapter.getDhcpEntityObj ().updateControls(container);
	}

	public void updateControlsImpl ( DHCPGlobalParamsContainer container ) throws UpdateControlsException {
		adapter.getDhcpEntityObj ().updateControls(container);		
	}

	public void updateControlsImpl ( DHCPGlobalOptionsListItemContainer container, Linux_DHCPOptions fco ) throws UpdateControlsException {
		// TODO Auto-generated method stub
		
	}

	public void updateControlsImpl ( DHCPGroupOptionsContainer container ) throws UpdateControlsException {
		adapter.getDhcpGroupObj ().updateControls ( container );
	}

	public void updateControlsImpl ( DHCPGroupParamsContainer container ) throws UpdateControlsException {
		adapter.getDhcpGroupObj ().updateControls ( container );
	}

	public void updateControlsImpl ( DHCPHostOptionsContainer container ) throws UpdateControlsException {
		adapter.getDhcpHostObj ().updateControls ( container );
	}

	public void updateControlsImpl ( DHCPHostParamsContainer container ) throws UpdateControlsException {
		adapter.getDhcpHostObj ().updateControls ( container );
	}

	public void updateControlsImpl ( DHCPPoolOptionsContainer container ) throws UpdateControlsException {
		adapter.getDhcpPoolObj ().updateControls ( container );
	}

	public void updateControlsImpl ( DHCPPoolParamsContainer container ) throws UpdateControlsException {
		adapter.getDhcpPoolObj ().updateControls ( container );
	}

	public void updateControlsImpl ( DHCPSharednerOptionsContainer container ) throws UpdateControlsException {
		adapter.getDhcpSharednetObj ().updateControls ( container );
	}

	public void updateControlsImpl ( DHCPSharednetParamsContainer container ) throws UpdateControlsException {
		adapter.getDhcpSharednetObj ().updateControls ( container );
	}

	public void updateControlsImpl ( DHCPSubnetOptionsContainer container ) throws UpdateControlsException {
		adapter.getDhcpSubnetObj ().updateControls ( container );
	}

	public void updateControlsImpl ( DHCPSubnetParamsContainer container ) throws UpdateControlsException {
		adapter.getDhcpSubnetObj ().updateControls ( container );
	}

	public void updateControlsImpl ( NewGroupContainer container ) throws UpdateControlsException {
		adapter.getNewgroupwizard ().updateControls ( container );
	}

	public void updateControlsImpl ( NewHostContainer container ) throws UpdateControlsException {
		adapter.getNewhostwizard ().updateControls ( container );
	}

	public void updateControlsImpl ( NewHostSummaryContainer container ) throws UpdateControlsException {
		adapter.getNewhostwizard ().updateControls ( container );
	}

	public void updateControlsImpl ( NewPoolContainer container ) throws UpdateControlsException {
		adapter.getNewpoolwizard ().updateControls ( container );
	}

	public void updateControlsImpl ( NewPoolSummaryContainer container ) throws UpdateControlsException {
		adapter.getNewpoolwizard ().updateControls ( container );
	}

	public void updateControlsImpl ( NewSharednetContainer container ) throws UpdateControlsException {
		adapter.getNewsharednetwizard ().updateControls ( container );
	}

	public void updateControlsImpl ( NewSharednetSummaryContainer container ) throws UpdateControlsException {
		adapter.getNewsharednetwizard ().updateControls ( container );
	}

	public void updateControlsImpl ( NewSubnetContainer container ) throws UpdateControlsException {
		adapter.getNewsubnetwizard ().updateControls ( container );
	}

	public void updateControlsImpl ( NewSubnetSummaryContainer container ) throws UpdateControlsException {
		adapter.getNewsubnetwizard ().updateControls ( container );
	}

	public void updateControlsImpl ( WelcomeContainer container ) throws UpdateControlsException {
		// TODO Auto-generated method stub
		
	}

	
	
}
