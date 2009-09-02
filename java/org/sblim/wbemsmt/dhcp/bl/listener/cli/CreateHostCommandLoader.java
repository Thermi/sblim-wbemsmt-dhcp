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

import javax.wbem.WBEMException;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer;
import org.sblim.wbemsmt.exception.ErrorCode;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.cli.CliDataLoader;
import org.sblim.wbemsmt.tools.cli.CliUtil;
import org.sblim.wbemsmt.tools.cli.OptionDefinition;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class CreateHostCommandLoader extends DhcpServiceLoader implements CliDataLoader {

	public void loadTracingObject ( WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, NewHostSummaryContainer container ) throws WbemsmtException {
		try {
			selectEntity ( adapter.getBundle (), adapter, getEntityType ());
		} catch (WbemsmtException e) {
			throw new WbemsmtException((ErrorCode)e.getErrorCode (),bundle.getString("Entity.not.found",new Object[]{getEntityType ()}),e);
		} catch (WBEMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected OptionDefinition getServiceNameKey () {
		return CreateHostCommand.KEY_GLOBAL_listEntities;
	}

	protected String getEntityType () {
		return "CreateIn-" + CliUtil.getOption ( cmd, CreateHostCommand.KEY_CreateIn);
	}

}
