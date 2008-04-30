/** 
  * PooleditActionListenerSelectors.java
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
  * Description: 
  * 
  */
package org.sblim.wbemsmt.dhcp.bl.listener;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.TaskLauncherTreeNodeSelector;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;

public class PooleditActionListenerSelectors {

	public static class PoolTabPooleditPanelSelector implements TaskLauncherTreeNodeSelector {

		public void select ( ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter adapter, String editPanelId )
				throws ObjectNotFoundException {
			((DhcpCimAdapter)adapter).selectByKey ( adapter.getKeyByTreeNode ( treeNode ) );
		}

	}

	public static class PoolParamsTabPoolParamseditPanelSelector implements TaskLauncherTreeNodeSelector {

		public void select ( ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter adapter, String editPanelId )
				throws ObjectNotFoundException {
			((DhcpCimAdapter)adapter).selectByKey ( adapter.getKeyByTreeNode ( treeNode ) );
		}

	}

	public static class PoolOptionsTabPoolOptionseditPanelSelector implements TaskLauncherTreeNodeSelector {

		public void select ( ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter adapter, String editPanelId )
				throws ObjectNotFoundException {
			((DhcpCimAdapter)adapter).selectByKey ( adapter.getKeyByTreeNode ( treeNode ) );
		}

	}

	public static class FieldTabPooleditPanelSelector implements TaskLauncherTreeNodeSelector {

		public void select ( ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter adapter, String editPanelId )
				throws ObjectNotFoundException {
			((DhcpCimAdapter)adapter).selectByKey ( adapter.getKeyByTreeNode ( treeNode ) );
		}

	}

}
