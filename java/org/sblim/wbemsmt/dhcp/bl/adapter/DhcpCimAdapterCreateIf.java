/** 
  * DhcpCimAdapterCreateIf.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceCreate.vm
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
	 * This is the interface containing only the Create-Methods for the delegate
	 **/

public interface DhcpCimAdapterCreateIf extends CreateDelegatee
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
	
		
}