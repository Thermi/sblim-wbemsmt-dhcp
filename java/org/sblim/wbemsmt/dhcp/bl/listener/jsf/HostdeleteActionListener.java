/** 
  * HostdeleteActionListener.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/deleteListener.vm
  *
  * Contributors: Prashanth Karnam <prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.listener.jsf;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.bl.adapter.CimAdapterFactory;
import org.sblim.wbemsmt.bl.adapter.TaskLauncherTreeNodeSelector;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.ITreeSelector;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.tasklauncher.event.jsf.*;

public class HostdeleteActionListener extends JsfDeleteListener {

	public String processEvent(TaskLauncherTreeNodeEvent event) throws org.sblim.wbemsmt.exception.WbemSmtException {
				ITaskLauncherTreeNode treeNode = event.getTreeNode();

				org.sblim.wbem.client.CIMClient cimClient = treeNode.getCimClient();

				org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter = 
					(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter)CimAdapterFactory.getInstance()
					.getAdapter(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter.class,FacesContext.getCurrentInstance(),cimClient);


				TaskLauncherTreeNodeSelector selector = new org.sblim.wbemsmt.dhcp.bl.listener.HostdeleteActionListenerSelector();
    			selector.select(treeNode,adapter,"HostdeleteAction");
				
								adapter.delete();
				adapter.reload();
				ITreeSelector treeSelectorBean = (ITreeSelector)BeanNameConstants.TREE_SELECTOR.getBoundValue(FacesContext.getCurrentInstance());
				treeSelectorBean.setSelectedTaskLauncherTreeNode(null);
								
				clearEditBeans();
				
				return "start";
	}
}