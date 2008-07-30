/** 
 * DhcpServiceConfeditActionListener.java
 *
 * 
 * © Copyright IBM Corp. 2006,2007
 *
 * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/jsf/editListener.vm
 *
 * Contributors: 
 *   TODO add author by using vm argument -Ddcg.author=<email> during startup
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
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;
import org.sblim.wbemsmt.bl.help.HelpManager;

public class DhcpServiceConfeditActionListener extends JsfEditListener {

    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemsmtException {

        ITaskLauncherTreeNode treeNode = event.getTreeNode();

        FacesContext fc = FacesContext.getCurrentInstance();
        Locale locale = LocaleManager.getCurrent(FacesContext.getCurrentInstance())
                .getCurrentLocale();
        bundle = ResourceBundleManager.getResourceBundle(
                new String[] { "messages", "messagesDhcp" }, locale);
        final ObjectActionControllerBean oac = (ObjectActionControllerBean) BeanNameConstants.OBJECT_ACTION_CONTROLLER
                .asValueBinding(fc).getValue(fc);

        //set the currentListener as topic for the help
        final HelpManager helpManager = (HelpManager) BeanNameConstants.HELP_MANAGER
                .asValueBinding(fc).getValue(fc);
        helpManager.setMode(HelpManager.MODE_EDIT);
        helpManager.setCurrentTopic("DHCP", "DhcpServiceConfeditActionListener");

        EditBean bean = null;

        Boolean revert = event.getBooleanParameter(TaskLauncherTreeNodeEvent.PARAM_REVERT);

        if (oac.getCurrentEditListener() != null && revert != null && revert.booleanValue()) {
            oac.getCurrentEditListener().revert(false);
        }

        oac.clearEditBeans();

        TabbedPane tabbedPane = new TabbedPane(bundle);
        String bundleKey;

        //ADD THE CONTAINERS IN TAB SettingsTab			
        bean = new org.sblim.wbemsmt.dhcp.bl.listener.jsf.DhcpServiceConfeditActionListenerEditBeanSettingsTab();
        editBeans.add(bean);
        bean.edit(treeNode);
        oac.addEditBean("SettingsTab", bean);
        bundleKey = "tab.SettingsTab";
        tabbedPane.addTab("SettingsTab", bundleKey, bean.getPanel());

        //ADD THE CONTAINERS IN TAB GlobalOptionsTab			
        bean = new org.sblim.wbemsmt.dhcp.bl.listener.jsf.DhcpServiceConfeditActionListenerEditBeanGlobalOptionsTab();
        editBeans.add(bean);
        bean.edit(treeNode);
        oac.addEditBean("GlobalOptionsTab", bean);
        bundleKey = "tab.GlobalOptionsTab";
        tabbedPane.addTab("GlobalOptionsTab", bundleKey, bean.getPanel());

        //ADD THE CONTAINERS IN TAB GlobalParamsTab			
        bean = new org.sblim.wbemsmt.dhcp.bl.listener.jsf.DhcpServiceConfeditActionListenerEditBeanGlobalParamsTab();
        editBeans.add(bean);
        bean.edit(treeNode);
        oac.addEditBean("GlobalParamsTab", bean);
        bundleKey = "tab.GlobalParamsTab";
        tabbedPane.addTab("GlobalParamsTab", bundleKey, bean.getPanel());

        boolean createOKRevertButtons = !false && true;
        tabbedPane.create(createOKRevertButtons);
        oac.setCurrentEditor(tabbedPane.getPanel());
        oac.setSelectedTabIndex(0);
        oac.setTabbedPane(tabbedPane);
        oac.setCurrentEditListener(this);

        return "editPage";
    }
}