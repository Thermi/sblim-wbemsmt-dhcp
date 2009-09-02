/**
 * SharedneteditActionListener.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE
 * TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/jsf/editListener.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.listener.jsf;

import java.util.*;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tasklauncher.event.jsf.*;
import org.sblim.wbemsmt.bl.tree.*;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.jsf.*;
import org.sblim.wbemsmt.tools.resources.*;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;
import org.sblim.wbemsmt.bl.help.HelpManager;

public class SharedneteditActionListener extends JsfEditListener {

    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemsmtException {

        ITaskLauncherTreeNode treeNode = event.getTreeNode();

        FacesContext fc = FacesContext.getCurrentInstance();
        Locale locale = LocaleManager.getCurrent(FacesContext.getCurrentInstance())
                .getCurrentLocale();
        bundle = ResourceBundleManager.getResourceBundle(
                new String[] { "messages", "messagesDhcp" }, locale);
        final ObjectActionControllerBean oac = (ObjectActionControllerBean) BeanNameConstants.OBJECT_ACTION_CONTROLLER
                .asValueExpression(fc).getValue(fc.getELContext());

        //set the currentListener as topic for the help
        final HelpManager helpManager = (HelpManager) BeanNameConstants.HELP_MANAGER
                .asValueExpression(fc).getValue(fc.getELContext());
        helpManager.setMode(HelpManager.MODE_EDIT);
        helpManager.setCurrentTopic("DHCP", "SharedneteditActionListener");

        EditBean bean = null;

        Boolean revert = event.getBooleanParameter(TaskLauncherTreeNodeEvent.PARAM_REVERT);

        if (oac.getCurrentEditListener() != null && revert != null && revert.booleanValue()) {
            oac.getCurrentEditListener().revert(false);
        }

        oac.clearEditBeans();

        TabbedPane tabbedPane = new TabbedPane(bundle);
        String bundleKey;

        //ADD THE CONTAINERS IN TAB SharednetTab			
        bean = new org.sblim.wbemsmt.dhcp.bl.listener.jsf.SharedneteditActionListenerEditBeanSharednetTab();
        editBeans.add(bean);
        bean.edit(treeNode);
        oac.addEditBean("SharednetTab", bean);
        bundleKey = "tab.SharednetTab";
        tabbedPane.addTab("SharednetTab", bundleKey, bean.getPanel());

        //ADD THE CONTAINERS IN TAB SharednetOptionTab			
        bean = new org.sblim.wbemsmt.dhcp.bl.listener.jsf.SharedneteditActionListenerEditBeanSharednetOptionTab();
        editBeans.add(bean);
        bean.edit(treeNode);
        oac.addEditBean("SharednetOptionTab", bean);
        bundleKey = "tab.SharednetOptionTab";
        tabbedPane.addTab("SharednetOptionTab", bundleKey, bean.getPanel());

        //ADD THE CONTAINERS IN TAB SharednetParamTab			
        bean = new org.sblim.wbemsmt.dhcp.bl.listener.jsf.SharedneteditActionListenerEditBeanSharednetParamTab();
        editBeans.add(bean);
        bean.edit(treeNode);
        oac.addEditBean("SharednetParamTab", bean);
        bundleKey = "tab.SharednetParamTab";
        tabbedPane.addTab("SharednetParamTab", bundleKey, bean.getPanel());

        boolean createOKRevertButtons = !false && true;
        tabbedPane.create(createOKRevertButtons);
        oac.setCurrentEditor(tabbedPane.getPanel());
        oac.setSelectedTabIndex(0);
        oac.setTabbedPane(tabbedPane);
        oac.setCurrentEditListener(this);

        return "editPage";
    }
}