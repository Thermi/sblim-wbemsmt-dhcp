/** 
 * DhcpServiceConfigurationObject.java
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


import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DhcpServiceConfContainer;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPServiceConfiguration;
import org.sblim.wbemsmt.exception.ErrorCode;
import org.sblim.wbemsmt.exception.WbemsmtException;


public class DhcpServiceConfigurationObject {
	
	private final Linux_DHCPServiceConfiguration fco;

	private final DhcpCimAdapter adapter;

	public DhcpServiceConfigurationObject(
			final Linux_DHCPServiceConfiguration fco,
			final DhcpCimAdapter adapter) {
		super();
		this.fco = fco;
		this.adapter = adapter;
	}

	public Linux_DHCPServiceConfiguration getFco() {
		return fco;
	}

	public CimObjectKey getCimObjectKey() {
		return new CimObjectKey(fco.getCimObjectPath());
	}

	public void updateControls(DhcpServiceConfContainer container) {
		container.get_ConfigurationFile().setControlValue(
				fco.get_configurationFile());
	}

	public MessageList save(DhcpServiceConfContainer container)
			throws WbemsmtException {
		fco.set_configurationFile((String) container.get_ConfigurationFile()
				.getConvertedControlValue());
		adapter.getFcoHelper().save(fco, adapter.getCimClient());

		return null;

	}

	public MessageList revert(DhcpServiceConfContainer container)
			throws WbemsmtException {
		try {
			adapter.getFcoHelper().reload(fco, adapter.getCimClient());
		} catch (WbemsmtException e) {
			throw new WbemsmtException((ErrorCode)e.getErrorCode (),e);
		}
		return null;
	}

	public void updateModel(DhcpServiceConfContainer container) throws WbemsmtException{
		WBEMClient cimclient = adapter.getCimClient ();
		
		if(adapter.getUpdateTrigger () == container.get_invoke_StartService ()){
					adapter.getDhcpServiceObj ().getFco ().invoke_StartService ( cimclient );
		}
		
		if(adapter.getUpdateTrigger () == container.get_invoke_StopService ()){
			adapter.getDhcpServiceObj ().getFco ().invoke_StopService ( cimclient );
		}

		if(adapter.getUpdateTrigger () == container.get_usr_Restartservice ()){
			adapter.getDhcpServiceObj ().getFco ().invoke_StopService ( cimclient );
			adapter.getDhcpServiceObj ().getFco ().invoke_StartService ( cimclient );
		}

	}
	
}
