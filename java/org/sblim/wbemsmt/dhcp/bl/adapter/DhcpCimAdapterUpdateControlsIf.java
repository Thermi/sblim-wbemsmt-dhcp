/** 
  * DhcpCimAdapterUpdateControlsIf.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceUpdateControls.vm
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
	 * This is the interface containing only the UpdateControls-Methods for the delegate
	 **/

public interface DhcpCimAdapterUpdateControlsIf extends UpdateControlsDelegatee
{

	public static final String[] RESOURCE_BUNDLE_NAMES = new String[]{"messages","messagesDhcp"};

	/** 
	 * UpdateControls-Methods
	 **/
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalParamsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupOptionsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupParamsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostOptionsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostParamsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPOptionsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPParamsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolOptionsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolParamsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednerOptionsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetParamsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetOptionsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetParamsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetsContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DhcpServiceConfContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewGroupContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolSummaryContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetSummaryContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetSummaryContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	public void updateControlsImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.WelcomeContainer container) throws org.sblim.wbemsmt.exception.UpdateControlsException;
	
	}