/** 
 * GroupdeleteActionListener.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/jsf/deleteListener.vm
 *
 * Contributors: 
 *   TODO add author by using vm argument -Ddcg.author=<email> during startup
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.listener.jsf;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.bl.adapter.CimAdapterFactory;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.ITreeSelector;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.tasklauncher.event.jsf.*;
import org.sblim.wbemsmt.dhcp.bl.listener.GroupdeleteActionListenerSelector;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.bl.messages.*;

public class GroupdeleteActionListener extends JsfDeleteListener {

    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemsmtException {
        ITaskLauncherTreeNode treeNode = event.getTreeNode();

        javax.wbem.client.WBEMClient cimClient = treeNode.getCimClient();

        org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter = (org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter) CimAdapterFactory
                .getInstance().getAdapter(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter.class,
                        FacesContext.getCurrentInstance(), cimClient);

        GroupdeleteActionListenerSelector selector = new org.sblim.wbemsmt.dhcp.bl.listener.GroupdeleteActionListenerSelector();
        selector.select(treeNode, adapter, "GroupdeleteAction");

        adapter.delete();
        adapter.reload();
        ITreeSelector treeSelectorBean = (ITreeSelector) BeanNameConstants.TREE_SELECTOR
                .getBoundValue(FacesContext.getCurrentInstance());
        treeSelectorBean.setSelectedTaskLauncherTreeNode(null);

        clearEditBeans();

        return "start";
    }
}