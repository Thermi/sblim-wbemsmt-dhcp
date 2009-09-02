/** 
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
  * Description: Class for listing objects
  * 
  */
package org.sblim.wbemsmt.dhcp.bl.listener.cli;

import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSubnet;
import org.sblim.wbemsmt.tools.cli.CliDataLoader;
import org.sblim.wbemsmt.tools.cli.OptionDefinition;

public class EditSubnetParamsCommandLoader extends DhcpServiceLoader implements CliDataLoader {

	protected String getEntityType () {
		return ClassUtils.getShortClassName(Linux_DHCPSubnet.class);
	}

	protected OptionDefinition getServiceNameKey () {
		return EditSubnetParamsCommand.KEY_GLOBAL_listEntities;
	}

}
