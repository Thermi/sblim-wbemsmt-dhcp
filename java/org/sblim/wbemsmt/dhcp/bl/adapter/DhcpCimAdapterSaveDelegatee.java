/** 
 * DhcpCimAdapterSaveDelegatee.java
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

import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsContainer;
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
import org.sblim.wbemsmt.exception.ObjectSaveException;

public class DhcpCimAdapterSaveDelegatee implements DhcpCimAdapterSaveIf {

	DhcpCimAdapter adapter = null;
	
	public DhcpCimAdapterSaveDelegatee ( DhcpCimAdapter adapter ) {
		super ();
		this.adapter = adapter;
	}

	public MessageList saveImpl ( DHCPGroupsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpGroupObj ().saveGroup ( container );
	}

	public MessageList saveImpl ( DHCPHostsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpHostObj ().saveHost ( container );
	}

	public MessageList saveImpl ( DHCPOptionsContainer container ) throws ObjectSaveException {
		return null;
	}

	public MessageList saveImpl ( DHCPParamsContainer container ) throws ObjectSaveException {
		return null;
	}

	public MessageList saveImpl ( DHCPPoolsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpPoolObj ().savePool ( container );
	}

	public MessageList saveImpl ( DHCPSharednetsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpSharednetObj ().saveSharedNet ( container );
	}

	public MessageList saveImpl ( DHCPSubnetsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpSubnetObj ().saveSubnet ( container );
	}

	public MessageList saveImpl ( DhcpServiceConfContainer container ) throws ObjectSaveException {
//		return adapter.getDhcpServiceConfigurationObj().save(container);
		return null;
	}

	public MessageList saveImpl ( DHCPGlobalOptionsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpEntityObj ().save(container);
	}

	public MessageList saveImpl ( DHCPGlobalParamsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpEntityObj ().save(container);
	}

	public MessageList saveImpl ( DHCPGroupOptionsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpGroupObj ().save ( container);
	}

	public MessageList saveImpl ( DHCPGroupParamsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpGroupObj ().save ( container);
	}

	public MessageList saveImpl ( DHCPHostOptionsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpHostObj ().save ( container);
	}

	public MessageList saveImpl ( DHCPHostParamsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpHostObj ().save ( container);
	}

	public MessageList saveImpl ( DHCPPoolOptionsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpPoolObj ().save ( container);
	}

	public MessageList saveImpl ( DHCPPoolParamsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpPoolObj ().save ( container);
	}

	public MessageList saveImpl ( DHCPSharednerOptionsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpSharednetObj ().save ( container);
	}

	public MessageList saveImpl ( DHCPSharednetParamsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpSharednetObj ().save ( container);
	}

	public MessageList saveImpl ( DHCPSubnetOptionsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpSubnetObj ().save ( container);
	}

	public MessageList saveImpl ( DHCPSubnetParamsContainer container ) throws ObjectSaveException {
		return adapter.getDhcpSubnetObj ().save ( container);
	}

}
