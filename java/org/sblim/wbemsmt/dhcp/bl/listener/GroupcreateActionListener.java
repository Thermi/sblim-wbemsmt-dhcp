/** 
  * GroupcreateActionListener.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.ActionGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/actionListener.vm
  *
  * Contributors: Prashanth Karnam <prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.listener;

import org.sblim.wbemsmt.tasklauncher.event.TaskLauncherContextMenuEventListener;
import org.sblim.wbemsmt.tasklauncher.event.TaskLauncherContextMenuEventListenerImpl;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.exception.WbemSmtException;

public class GroupcreateActionListener extends TaskLauncherContextMenuEventListenerImpl implements org.sblim.wbemsmt.tasklauncher.event.CreateListener {

	String jsfListener = "org.sblim.wbemsmt.dhcp.bl.listener.jsf.GroupcreateActionListener";
	String swingListener = "org.sblim.wbemsmt.dhcp.bl.listener.jswing.GroupcreateActionListener";
	//String cmdListener = "org.sblim.wbemsmt.dhcp.bl.listener.cli.GroupcreateActionListener";
	
	public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemSmtException {
		
		if (event.type == TaskLauncherTreeNodeEvent.TYPE_CLICKED)
		{
    		String listenerClass = null;
    		try {
    		 
    			if (RuntimeUtil.getInstance().isJSF())
    			{
    				listenerClass = jsfListener; 
    			}
    			else if (RuntimeUtil.getInstance().isSwing())
    			{
    				listenerClass = swingListener; 
    			}
    //			else if (RuntimeUtil.getInstance().isCommandline())
    //			{
    //				listenerClass = cmdListener; 
    //			}
    			
    			TaskLauncherContextMenuEventListener listener = (TaskLauncherContextMenuEventListener) Class.forName(listenerClass).newInstance();
    			return listener.processEvent(event);
    		} catch (WbemSmtException  e) {
    			throw e;
    		} catch (Exception e) {
    			throw new WbemSmtException("Cannot process Event with listener " + listenerClass,e);
    		} 

		}
		return null;
	}

}