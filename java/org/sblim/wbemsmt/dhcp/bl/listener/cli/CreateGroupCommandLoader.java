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

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewGroupContainer;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;
import org.sblim.wbemsmt.tools.cli.CliDataLoader;
import org.sblim.wbemsmt.tools.cli.CliUtil;
import org.sblim.wbemsmt.tools.cli.OptionDefinition;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class CreateGroupCommandLoader extends DhcpServiceLoader implements CliDataLoader {

	public void loadTracingObject ( WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, NewGroupContainer container ) throws ObjectNotFoundException {
		try {
			selectEntity ( adapter.getBundle (), adapter, getEntityType ());
		} catch (ObjectNotFoundException e) {
			throw new ObjectNotFoundException(bundle.getString("Entity.not.found",new Object[]{getEntityType ()}),e);
		}
	}

	protected OptionDefinition getServiceNameKey () {
		return CreateGroupCommand.KEY_GLOBAL_listEntities;
	}

	protected String getEntityType () {
		return "CreateIn-" + CliUtil.getOption ( cmd, CreateSharednetCommand.KEY_CreateIn);
	}

}
