/** 
  * DhcpCimAdapterIf.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/adapterInterface.vm
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
	 * This is the interface containing all Methods
	 **/

public interface DhcpCimAdapterIf extends DhcpCimAdapterCountIf, DhcpCimAdapterCreateIf, DhcpCimAdapterDeleteIf, DhcpCimAdapterInstallValidatorsIf, DhcpCimAdapterSaveIf, DhcpCimAdapterRevertIf, DhcpCimAdapterUpdateControlsIf, DhcpCimAdapterUpdateModelIf, DhcpCimAdapterInitWizardIf, DhcpCimAdapterInitContainerIf
{

	public static final String[] RESOURCE_BUNDLE_NAMES = new String[]{"messages","messagesDhcp"};

	/** 
	 * Create-Methods
	 **/
	public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPOptionsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPParamsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewGroupContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolSummaryContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetSummaryContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetSummaryContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	
	/** 
	 * Save-Methods
	 **/
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalParamsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupOptionsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupParamsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostOptionsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostParamsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPOptionsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPParamsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolOptionsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolParamsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednerOptionsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetParamsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetOptionsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetParamsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetsContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	public MessageList saveImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DhcpServiceConfContainer container)  throws org.sblim.wbemsmt.exception.ObjectSaveException;
	
	/** 
	 * Save-Methods for Lists
	 **/
	
	/** 
	 * Revert-Methods
	 **/
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalParamsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupOptionsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupParamsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostOptionsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostParamsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPOptionsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPParamsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolOptionsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolParamsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednerOptionsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetParamsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetOptionsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetParamsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetsContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	public MessageList revertImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DhcpServiceConfContainer container)  throws org.sblim.wbemsmt.exception.ObjectRevertException;
	
	/** 
	 * Revert-Methods for Lists
	 **/
	
	
	/** 
	 * UpdateModel-Methods
	 **/
	public void updateModelImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DhcpServiceConfContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
	public void updateModelImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetContainer container) throws org.sblim.wbemsmt.exception.ModelUpdateException;
		
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
	
		
	/** 
	 * Delete-Methods
	 **/
	public void deleteImpl(org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPHost fco) throws org.sblim.wbemsmt.exception.ObjectDeletionException;
	public void deleteImpl(org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptions fco) throws org.sblim.wbemsmt.exception.ObjectDeletionException;
	public void deleteImpl(org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParams fco) throws org.sblim.wbemsmt.exception.ObjectDeletionException;
	public void deleteImpl(org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPPool fco) throws org.sblim.wbemsmt.exception.ObjectDeletionException;
	public void deleteImpl(org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSharednet fco) throws org.sblim.wbemsmt.exception.ObjectDeletionException;
	public void deleteImpl(org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSubnet fco) throws org.sblim.wbemsmt.exception.ObjectDeletionException;
			
	/** 
	 * Count-Methods
	 **/
	
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