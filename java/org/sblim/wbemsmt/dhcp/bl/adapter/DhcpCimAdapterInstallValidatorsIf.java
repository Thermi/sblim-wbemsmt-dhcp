/** 
  * DhcpCimAdapterInstallValidatorsIf.java
  *

 
  * Â© Copyright IBM Corp. 2007
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceInstallValidators.vm
  *
  * Contributors: Prashanth Karnam <pkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

	/** 
	 * This is the interface containing only the InstallValidator-Methods for the delegate
	 **/

public interface DhcpCimAdapterInstallValidatorsIf extends InstallValidatorsDelegatee
{

	public static final String[] RESOURCE_BUNDLE_NAMES = new String[]{"messages","messagesDhcp"};

	/** 
	 * InstallValidator-Methods
	 **/
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalParamsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupOptionsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupParamsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostOptionsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostParamsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPOptionsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPParamsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolOptionsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolParamsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednerOptionsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetParamsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetOptionsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetParamsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetsContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DhcpServiceConfContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewGroupContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolSummaryContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetSummaryContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetContainer container);
	public void installValidatorsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetSummaryContainer container);
			
}