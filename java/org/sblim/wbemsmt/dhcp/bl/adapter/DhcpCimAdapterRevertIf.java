/** 
  * DhcpCimAdapterRevertIf.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceRevert.vm
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
	 * This is the interface containing only the Revert-Methods for the delegate
	 **/

public interface DhcpCimAdapterRevertIf extends RevertDelegatee
{

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
	
		
}