/** 
 * DhcpCimAdapterCreateDelegatee.java
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

import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewGroupContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolSummaryContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetSummaryContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetSummaryContainer;
import org.sblim.wbemsmt.exception.ObjectSaveException;

public class DhcpCimAdapterCreateDelegatee implements DhcpCimAdapterCreateIf {

	private DhcpCimAdapter adapter = null;
	
	public DhcpCimAdapterCreateDelegatee ( DhcpCimAdapter adapter ) {
		super ();
		this.adapter = adapter;
	}

	public void createImpl ( DHCPGroupsContainer container ) throws ObjectSaveException {
		// TODO Auto-generated method stub

	}

	public void createImpl ( DHCPHostsContainer container ) throws ObjectSaveException {
		// TODO Auto-generated method stub

	}

	public void createImpl ( DHCPOptionsContainer container ) throws ObjectSaveException {
		// TODO Auto-generated method stub

	}

	public void createImpl ( DHCPParamsContainer container ) throws ObjectSaveException {
		// TODO Auto-generated method stub

	}

	public void createImpl ( DHCPPoolsContainer container ) throws ObjectSaveException {
		// TODO Auto-generated method stub

	}

	public void createImpl ( DHCPSharednetsContainer container ) throws ObjectSaveException {
		// TODO Auto-generated method stub

	}

	public void createImpl ( DHCPSubnetsContainer container ) throws ObjectSaveException {
		// TODO Auto-generated method stub

	}

	public void createImpl ( NewGroupContainer container ) throws ObjectSaveException {
		adapter.getNewgroupwizard ().create ( container );
	}

	public void createImpl ( NewHostSummaryContainer container ) throws ObjectSaveException {
		adapter.getNewhostwizard ().create ( container );
	}

	public void createImpl ( NewPoolSummaryContainer container ) throws ObjectSaveException {
		adapter.getNewpoolwizard ().create ( container );
	}

	public void createImpl ( NewSharednetSummaryContainer container ) throws ObjectSaveException {
		adapter.getNewsharednetwizard ().create ( container );
	}

	public void createImpl ( NewSubnetSummaryContainer container ) throws ObjectSaveException {
		adapter.getNewsubnetwizard ().create ( container );
	}

}
