/** 
  *
  * Â© Copyright IBM Corp. 2007
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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEventListener;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEventListenerImpl;
import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapterIf;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGlobal;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGlobalHelper;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGroup;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPPool;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSharednet;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSubnet;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.schema.cim29.tools.FcoHelper;
import org.sblim.wbemsmt.tasklauncher.CIMInstanceNode;
import org.sblim.wbemsmt.tasklauncher.SimpleTextTreeNode;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherContextMenu;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherDelegaterTreeNode;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ContextmenuDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ContextmenuDocument.Contextmenu;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.EventListenerDocument.EventListener;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.MenuitemDocument.Menuitem;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.util.StringTokenizer;

/**
 * Adds the DHCP hierarchial entities to the treeNode.
 * 
 * @author prashanth
 *
 */
public class DynamicTreeBuilderListener extends TaskLauncherTreeNodeEventListenerImpl {

	public DynamicTreeBuilderListener () {
		super ();
	}

	public String processEvent ( TaskLauncherTreeNodeEvent event ) {

		Linux_DHCPGlobal globalfco = null;

		if ((event.getType () & TaskLauncherTreeNodeEvent.TYPE_REFRESHED) > 0) {
			try {

				if (RuntimeUtil.getInstance ().isJSF ()) {
					// get the treeNode to add the new nodes
					ITaskLauncherTreeNode treeNode = event.getTreeNode ();

					// if we got the rootNode, get the first subnode as node to
					// ad the new nodes
					CIMClient cimClient = treeNode.getCimClient ();
					if (cimClient == null && treeNode.getPlainName ().equals ( "root" )
							&& treeNode instanceof TaskLauncherDelegaterTreeNode) {
						treeNode = (ITaskLauncherTreeNode) ((TaskLauncherDelegaterTreeNode) treeNode).getSubnodes ()
								.get ( 0 );
						cimClient = treeNode.getCimClient ();
					}
					
					// get the Global FCO from whcih the hierarchy starts
					ArrayList globallist = Linux_DHCPGlobalHelper.enumerateInstances ( treeNode.getCimClient (), true );

					for (Iterator iter = globallist.iterator (); iter.hasNext ();) {
						globalfco = (Linux_DHCPGlobal) iter.next ();
					}
					
					// add nodes recursively
					addNodes(globalfco,treeNode.getCimClient (),treeNode);
					
				} else if (RuntimeUtil.getInstance ().isSwing ()) {
					throw new IllegalArgumentException ( "Swing is not supported" );
				}
			} catch (Exception e) {
				ModelLoadException modelLoadException = new ModelLoadException ( e );
				ExceptionUtil.handleException ( modelLoadException );
			}

			return null;
		}

		return null;
	}

	public Priority getPriority () {
		return TaskLauncherTreeNodeEventListener.PRIO_HIGHEST;
	}

	public boolean isCustomListener () {
		return false;
	}

	/**
	 * Adds the Nodes recursively by calling the associator methods of the FCO.
	 * 
	 * @param fco - The FCO object for which the Entities are to be listed.
	 * @param cimclient - Instance of the cimclient 
	 * @param treeNode - Node to which the elements are to be added.
	 * @return
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 */
	public boolean addNodes(Linux_DHCPEntity fco , CIMClient cimclient , ITaskLauncherTreeNode treeNode) throws SecurityException, NoSuchMethodException{
		
		String EntityTypes[] = {"Linux_DHCPSubnet","Linux_DHCPSharednet","Linux_DHCPGroup","Linux_DHCPPool","Linux_DHCPHost"};
		String Listeners[] = {"SubneteditActionListener","SharedneteditActionListener","GroupeditActionListener","PooleditActionListener","HosteditActionListener"};
		String ContextMenus[] = {"Subnet","Sharednet","Group","Pool","Host"};
		String DeleteListeners[] = {"SubnetdeleteActionListener","SharednetdeleteActionListener","GroupdeleteActionListener","PooldeleteActionListener","HostdeleteActionListener"};
		String CreateListeners[] = {"SubnetcreateActionListener","SharednetcreateActionListener","GroupcreateActionListener","PoolcreateActionListener","HostcreateActionListener"};
		String methodName = null; 
		
		boolean exitstatus = false;
		
		Class partypes[] = new Class[4];
        partypes[0] = CIMClient.class;
        partypes[1] = Boolean.TYPE;
        partypes[2] = Boolean.TYPE;
        partypes[3] = String[].class;
		
        Object args[] = new Object[4];
        args[0] = cimclient;
        args[1] = new Boolean(false);
        args[2] = new Boolean(false);
        args[3] = null;
        
        SimpleTextTreeNode pNode = null;
        
        for (int i = 0; i < EntityTypes.length; i++) {
        	
			methodName = "getAssociated_" + EntityTypes[i] + "_" + EntityTypes[i] + "sForEntitys";
			Method method = fco.getClass ().getMethod ( methodName, partypes );
			method.setAccessible ( true );
			try {
				ArrayList list = (ArrayList) method.invoke ( fco, args );
				if (list.size () > 0) {

//					//add the Folder
					pNode = new SimpleTextTreeNode(ContextMenus[i]+"s");
					pNode.setCimClient ( cimclient );

					Contextmenu contextmenuP = ContextmenuDocument.Factory.newInstance ()
					.addNewContextmenu ();
					Menuitem menuitemP = contextmenuP.addNewMenuitem ();
					menuitemP.setDescription ( "Create" + ContextMenus[i] );
					EventListener listenerP = menuitemP.addNewEventListener();
					listenerP.setClassname("org.sblim.wbemsmt.dhcp.bl.listener."+CreateListeners[i]);
					pNode.setContextMenu(new	TaskLauncherContextMenu(contextmenuP,DhcpCimAdapterIf.RESOURCE_BUNDLE_NAMES));
					contextmenuP = null;menuitemP=null;
					super.addNode ( treeNode, pNode, true );

					//iterate through the child entities
					for (Iterator iter = list.iterator (); iter.hasNext ();) {
						
						Linux_DHCPEntity fco1 = (Linux_DHCPEntity) iter.next ();
						
						if(fco1.get_ParentID ()!=null  && fco.get_InstanceID ()!=null)
						if(checkIDAreEqual ( fco1.get_ParentID (), fco.get_InstanceID ()) == false){
							treeNode.deleteSubnode ( pNode );
//							pNode=null;
							continue;
						}

						CIMInstanceNode instanceNode = new CIMInstanceNode ( cimclient, null, fco1.get_Name (),
								fco1.getCimInstance () );
						
						if(fco1.getClassDisplayName ().equals(Linux_DHCPGroup.CIM_CLASS_NAME))
							instanceNode.setName("Group");

						if(fco1.getClassDisplayName ().equals(Linux_DHCPPool.CIM_CLASS_NAME))
							instanceNode.setName("Pool");
						
						// Create the contextmenu and the the items
						Contextmenu contextmenu = ContextmenuDocument.Factory.newInstance ()
						.addNewContextmenu ();
						for (int j = 0; j < ContextMenus.length; j++) {

								if(fco1.getCimObjectPath ().getObjectName ().equals (Linux_DHCPGroup.CIM_CLASS_NAME )){
									if(j != 3 ){
										Menuitem menuitem = contextmenu.addNewMenuitem ();
										menuitem.setDescription ( "Create" + ContextMenus[j] );
										EventListener listener = menuitem.addNewEventListener();
										listener.setClassname("org.sblim.wbemsmt.dhcp.bl.listener."+CreateListeners[j]);
										}										
								}
								
//								if(fco.getCimObjectPath ().getObjectName ().equals ( "Linux_DHCPHost" )){
//									if(j != 3){
//										Menuitem menuitem = contextmenu.addNewMenuitem ();
//										menuitem.setDescription ( "Create" + ContextMenus[j] );
//										}										
//								}
								if(fco1.getCimObjectPath ().getObjectName ().equals ( Linux_DHCPPool.CIM_CLASS_NAME )){
									if(j != 3){
										Menuitem menuitem = contextmenu.addNewMenuitem ();
										menuitem.setDescription ( "Create" + ContextMenus[j] );
										EventListener listener = menuitem.addNewEventListener();
										listener.setClassname("org.sblim.wbemsmt.dhcp.bl.listener."+CreateListeners[j]);
									}										
								}
								if(fco1.getCimObjectPath ().getObjectName ().equals (Linux_DHCPSharednet.CIM_CLASS_NAME )){
									if(j == 0 || j == 2 || j == 4){
										Menuitem menuitem = contextmenu.addNewMenuitem ();
										menuitem.setDescription ( "Create" + ContextMenus[j] );
										EventListener listener = menuitem.addNewEventListener();
										listener.setClassname("org.sblim.wbemsmt.dhcp.bl.listener."+CreateListeners[j]);
									}										
								}
								if(fco1.getCimObjectPath ().getObjectName ().equals (Linux_DHCPSubnet.CIM_CLASS_NAME )){
									if(j > 1){
										Menuitem menuitem = contextmenu.addNewMenuitem ();
										menuitem.setDescription ( "Create" + ContextMenus[j] );
										EventListener listener = menuitem.addNewEventListener();
										listener.setClassname("org.sblim.wbemsmt.dhcp.bl.listener."+CreateListeners[j]);
									}										
								}

						}
						Menuitem menuitem1 = contextmenu.addNewMenuitem ();
						menuitem1.setDescription ( "Delete" + ContextMenus[i] );
						EventListener listener = menuitem1.addNewEventListener();
						listener.setClassname("org.sblim.wbemsmt.dhcp.bl.listener."+DeleteListeners[i]);//DeleteAppContainerListener.class.getName());
						
						try {
							instanceNode.setCimObject ( new FcoHelper ().getCIM_ObjectCreator ().create ( cimclient ) );
						} catch (WbemSmtException e) {
							e.printStackTrace ();
						}

//						// set the properties of the node
//						pNode.setContextMenu(new	TaskLauncherContextMenu(contextmenu,DhcpCimAdapter.RESOURCE_BUNDLE_NAMES));
//						contextmenu = null;
//						pNode.addEventListener("org.sblim.wbemsmt.dhcp.bl.listener."+Listeners[i],null);
//						
//						super.addNode ( treeNode, instanceNode, true );

						instanceNode.setContextMenu(new	TaskLauncherContextMenu(contextmenu,DhcpCimAdapterIf.RESOURCE_BUNDLE_NAMES));
						contextmenu = null;
						instanceNode.addEventListener("org.sblim.wbemsmt.dhcp.bl.listener."+Listeners[i],null);

						super.addNode ( pNode, instanceNode, true );

						exitstatus = addNodes ( fco1, cimclient, instanceNode );
						
						instanceNode = null;
					}

				} else
//					break;
					continue;

			} catch (IllegalArgumentException e) {
				e.printStackTrace ();
			} catch (IllegalAccessException e) {
				e.printStackTrace ();
			} catch (InvocationTargetException e) {
				e.printStackTrace ();
			}
		}

		return exitstatus;
	}

	private boolean checkIDAreEqual(String str1 , String str2){
	
	     StringTokenizer st1 = new StringTokenizer(str1,":");
	     StringTokenizer st2 = new StringTokenizer(str2,":");
	     
	     if(st1.countTokens () != st2.countTokens ())
	    	 return false;
	    	 
	     for(;st1.hasMoreTokens() && st2.hasMoreTokens();) {
	    	 String s1 = st1.nextToken();
	    	 String s2 = st2.nextToken();
	         if(s1.equals("WBEM-SMT")) continue;
	         if(s1.substring(0,5).equals("Linux")) continue;
	         if(s1.equals(s2))continue;
	         else return false;
	     }
		
		return true;
	}
	
	
}