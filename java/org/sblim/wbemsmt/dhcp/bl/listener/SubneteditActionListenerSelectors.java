/** 
 * SubneteditActionListenerSelectors.java
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
 * Contributors: 
 * 
 * Description: 
 * 
 */


package org.sblim.wbemsmt.dhcp.bl.listener;

import javax.wbem.WBEMException;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeSelector;
import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;
import org.sblim.wbemsmt.exception.WbemsmtException;

public class SubneteditActionListenerSelectors {

	public static class SubnetTabSubneteditPanelSelector implements TaskLauncherTreeNodeSelector {

		public void select ( ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter adapter, String editPanelId )
				throws WbemsmtException {
			try {
				((DhcpCimAdapter)adapter).selectByKey ( adapter.getKeyByTreeNode ( treeNode ) );
			} catch (WBEMException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static class SubnetParamsTabSubnetParamseditPanelSelector implements TaskLauncherTreeNodeSelector {

		public void select ( ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter adapter, String editPanelId )
				throws WbemsmtException {
			try {
				((DhcpCimAdapter)adapter).selectByKey ( adapter.getKeyByTreeNode ( treeNode ) );
			} catch (WBEMException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static class SubnetOptionsTabSubnetoptionseditPanelSelector implements TaskLauncherTreeNodeSelector {

		public void select ( ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter adapter, String editPanelId )
				throws WbemsmtException {
			try {
				((DhcpCimAdapter)adapter).selectByKey ( adapter.getKeyByTreeNode ( treeNode ) );
			} catch (WBEMException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static class FieldTabSubneteditPanelSelector implements TaskLauncherTreeNodeSelector {

		public void select ( ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter adapter, String editPanelId )
				throws WbemsmtException {
			try {
				((DhcpCimAdapter)adapter).selectByKey ( adapter.getKeyByTreeNode ( treeNode ) );
			} catch (WBEMException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
;