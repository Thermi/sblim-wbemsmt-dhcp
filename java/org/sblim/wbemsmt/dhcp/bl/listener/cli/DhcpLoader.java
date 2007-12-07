/** 
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
  * Description: Class for listing objects
  * 
  */

package org.sblim.wbemsmt.dhcp.bl.listener.cli;

import java.util.ArrayList;

import org.apache.commons.cli.CommandLine;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPService;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPServiceConfiguration;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class DhcpLoader {
	
	protected CommandLine cmd;
	
	public DhcpLoader(){
		super();
	}

	
	protected void selectService(WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, String serviceName) throws ObjectNotFoundException {
		try {
			CIMObjectPath pathService = getPathOfService(adapter, serviceName);
			if (pathService != null)
			{
				CimObjectKey key = new CimObjectKey(pathService);
				adapter.select(key);
				return;
			}
			else
			{
				throw new ObjectNotFoundException(bundle.getString("service.not.found",new Object[]{serviceName}));
			}
		} catch (ObjectNotFoundException e) {
			throw new ObjectNotFoundException(bundle.getString("service.not.found",new Object[]{serviceName}),e);
		}
	}

	
	protected CIMObjectPath getPathOfService(AbstractBaseCimAdapter adapter, String serviceName) throws ObjectNotFoundException {

		return adapter.getFcoHelper().getPath(Linux_DHCPService.class,"Name",serviceName,adapter.getCimClient());
	}

	protected CIMObjectPath getPathOfServiceConfiguration(AbstractBaseCimAdapter adapter, Linux_DHCPServiceConfiguration serviceConf, String ServiceConfName) throws ObjectNotFoundException {
		ArrayList ServiceConfNames = serviceConf.getAssociated_Linux_DHCPService_Linux_DHCPServiceConfigurationForService_Names (adapter.getCimClient(),false);
		return adapter.getFcoHelper().getPath(ServiceConfNames,"Name",ServiceConfName);
	}

}
