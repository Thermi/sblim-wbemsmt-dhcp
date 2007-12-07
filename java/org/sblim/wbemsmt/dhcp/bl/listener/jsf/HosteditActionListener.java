/** 
  * HosteditActionListener.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/editListener.vm
  *
  * Contributors: Prashanth Karnam <prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.listener.jsf;

import java.util.*;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tasklauncher.event.jsf.*;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.jsf.*;
import org.sblim.wbemsmt.tools.resources.*;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;
import org.sblim.wbemsmt.bl.help.HelpManager;

public class HosteditActionListener extends JsfEditListener {

	public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemSmtException {

			ITaskLauncherTreeNode treeNode = event.getTreeNode();

			
			FacesContext fc = FacesContext.getCurrentInstance();
			Locale locale = LocaleManager.getCurrent(FacesContext.getCurrentInstance()).getCurrentLocale();
        	bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesDhcp"},locale);
            final ObjectActionControllerBean oac = (ObjectActionControllerBean)BeanNameConstants.OBJECT_ACTION_CONTROLLER.asValueBinding(fc).getValue(fc);
			
			//set the currentListener as topic for the help
            final HelpManager helpManager = (HelpManager)BeanNameConstants.HELP_MANAGER.asValueBinding(fc).getValue(fc);
			helpManager.setMode(HelpManager.MODE_EDIT);
			helpManager.setCurrentTopic("DHCP","HosteditActionListener");
			
			EditBean bean = null;

			Boolean revert = event.getBooleanParameter(TaskLauncherTreeNodeEvent.PARAM_REVERT);
			
			if (oac.getCurrentEditListener() != null && revert != null && revert.booleanValue())
			{
				oac.getCurrentEditListener().revert(false);
			}

    		oac.clearEditBeans();
			
			
							TabbedPane tabbedPane = new TabbedPane(bundle);
				String bundleKey;
						
			
	        
							
				//ADD THE CONTAINERS IN TAB HostTab			
    			bean = new org.sblim.wbemsmt.dhcp.bl.listener.jsf.HosteditActionListenerEditBeanHostTab();
				editBeans.add(bean);
    			bean.edit(treeNode);
    			oac.addEditBean("HostTab",bean);
        		bundleKey = "tab.HostTab";
        		tabbedPane.addTab("HostTab",bundleKey,bean.getPanel());
    						
				//ADD THE CONTAINERS IN TAB HostOptionsTab			
    			bean = new org.sblim.wbemsmt.dhcp.bl.listener.jsf.HosteditActionListenerEditBeanHostOptionsTab();
				editBeans.add(bean);
    			bean.edit(treeNode);
    			oac.addEditBean("HostOptionsTab",bean);
        		bundleKey = "tab.HostOptionsTab";
        		tabbedPane.addTab("HostOptionsTab",bundleKey,bean.getPanel());
    						
				//ADD THE CONTAINERS IN TAB HostParamsTab			
    			bean = new org.sblim.wbemsmt.dhcp.bl.listener.jsf.HosteditActionListenerEditBeanHostParamsTab();
				editBeans.add(bean);
    			bean.edit(treeNode);
    			oac.addEditBean("HostParamsTab",bean);
        		bundleKey = "tab.HostParamsTab";
        		tabbedPane.addTab("HostParamsTab",bundleKey,bean.getPanel());
    		    			
							boolean createOKRevertButtons = ! false && true;
    			tabbedPane.create(createOKRevertButtons);
				oac.setCurrentEditor(tabbedPane.getPanel());
    			oac.setSelectedTabIndex(0);
				oac.setTabbedPane(tabbedPane);
						oac.setCurrentEditListener(this);
			
			return "editPage";		
	}
}