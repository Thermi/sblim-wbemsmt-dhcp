/** 
 * DhcpServiceObject.java
 *
 * © Copyright IBM Corp.  2009,2007
 *
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Eclipse Public License from
 * http://www.opensource.org/licenses/eclipse-1.0.php
 *
 * @author: Prashanth Karnam <prkarnam@in.ibm.com>
 *
 * Contributors: 
 * 
 * Description: 
 * 
 */

package org.sblim.wbemsmt.dhcp.wrapper.object;


import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.WbemsmtBusinessObject;
import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPService;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpOptionsList;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpParamsList;

public class DhcpServiceObject extends WbemsmtBusinessObject {

	private final Linux_DHCPService fco;

	private DhcpServiceConfigurationObject serviceconf = null;
	
	private DhcpOptionsList globalopslist = null;
	
	private DhcpParamsList globalparamslist = null;
	
//	private final DhcpCimAdapter adapter;

	public DhcpServiceObject(Linux_DHCPService fco, DhcpCimAdapter adapter) {
		super(adapter);
		this.fco = fco;
//		this.adapter = adapter;
	}

	public Linux_DHCPService getFco() {
		return fco;
	}

	public CimObjectKey getCimObjectKey() {
		return new CimObjectKey(fco.getCimObjectPath());
	}

	/**
	 * @return the serviceconf
	 */
	public DhcpServiceConfigurationObject getServiceconf () {
		return serviceconf;
	}

	/**
	 * @param serviceconf the serviceconf to set
	 */
	public void setServiceconf ( DhcpServiceConfigurationObject serviceconf ) {
		this.serviceconf = serviceconf;
	}

	/**
	 * @return the globalopslist
	 */
	public DhcpOptionsList getGlobalopslist () {
		return globalopslist;
	}

	/**
	 * @param globalopslist the globalopslist to set
	 */
	public void setGlobalopslist ( DhcpOptionsList globalopslist ) {
		this.globalopslist = globalopslist;
	}

	/**
	 * @return the globalparamslist
	 */
	public DhcpParamsList getGlobalparamslist () {
		return globalparamslist;
	}

	/**
	 * @param globalparamslist the globalparamslist to set
	 */
	public void setGlobalparamslist ( DhcpParamsList globalparamslist ) {
		this.globalparamslist = globalparamslist;
	}

}
