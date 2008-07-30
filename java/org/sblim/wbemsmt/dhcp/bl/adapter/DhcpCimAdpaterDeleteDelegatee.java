/** 
 * DhcpCimAdpaterDeleteDelegatee.java
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

import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGroup;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPHost;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptions;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParams;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPPool;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSharednet;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSubnet;
import org.sblim.wbemsmt.exception.WbemsmtException;

public class DhcpCimAdpaterDeleteDelegatee implements DhcpCimAdapterDeleteIf {

	private DhcpCimAdapter adapter = null;
	
	public DhcpCimAdpaterDeleteDelegatee ( DhcpCimAdapter adapter ) {
		super ();
		this.adapter = adapter;
	}

	public void deleteImpl ( Linux_DHCPHost fco ) throws WbemsmtException {
		adapter.getDhcpHostObj ().deleteHost ();
	}

	public void deleteImpl ( Linux_DHCPOptions fco ) throws WbemsmtException {
	}

	public void deleteImpl ( Linux_DHCPParams fco ) throws WbemsmtException {
	}

	public void deleteImpl ( Linux_DHCPPool fco ) throws WbemsmtException {
		adapter.getDhcpPoolObj ().deletePool ();
	}

	public void deleteImpl ( Linux_DHCPSharednet fco ) throws WbemsmtException {
		adapter.getDhcpSharednetObj ().deleteSharednet ();
	}

	public void deleteImpl ( Linux_DHCPSubnet fco ) throws WbemsmtException {
		adapter.getDhcpSubnetObj ().deleteSubnet ();
	}

	public void deleteImpl ( Linux_DHCPGroup fco ) throws WbemsmtException {
		adapter.getDhcpGroupObj ().deleteGroup ();
	}

}
