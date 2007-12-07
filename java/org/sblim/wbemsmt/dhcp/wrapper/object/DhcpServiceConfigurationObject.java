/** 
 * DhcpServiceConfigurationObject.java
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


package org.sblim.wbemsmt.dhcp.wrapper.object;


import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DhcpServiceConfContainer;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPServiceConfiguration;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ObjectRevertException;
import org.sblim.wbemsmt.exception.ObjectSaveException;


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
				fco.get_ConfigurationFile());
	}

	public MessageList save(DhcpServiceConfContainer container)
			throws ObjectSaveException {
		fco.set_ConfigurationFile((String) container.get_ConfigurationFile()
				.getConvertedControlValue());
		adapter.getFcoHelper().save(fco, adapter.getCimClient());

		return null;

	}

	public MessageList revert(DhcpServiceConfContainer container)
			throws ObjectRevertException {
		try {
			adapter.getFcoHelper().reload(fco, adapter.getCimClient());
		} catch (ModelLoadException e) {
			throw new ObjectRevertException(e);
		}
		return null;
	}

	public void updateModel(DhcpServiceConfContainer container){
		CIMClient cimclient = adapter.getCimClient ();
		
		if(adapter.getUpdateTrigger () == container.get_invoke_StartService ()){
					adapter.getDhcpServiceObj ().getFco ().invoke_startService ( cimclient );
		}
		
		if(adapter.getUpdateTrigger () == container.get_invoke_StopService ()){
			adapter.getDhcpServiceObj ().getFco ().invoke_stopService ( cimclient );
		}

		if(adapter.getUpdateTrigger () == container.get_usr_Restartservice ()){
			adapter.getDhcpServiceObj ().getFco ().invoke_stopService ( cimclient );
			adapter.getDhcpServiceObj ().getFco ().invoke_startService ( cimclient );
		}

	}
	
}
