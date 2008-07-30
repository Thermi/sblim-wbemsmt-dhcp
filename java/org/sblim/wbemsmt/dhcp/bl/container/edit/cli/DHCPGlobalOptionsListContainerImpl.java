/** 
  * DHCPGlobalOptionsListContainerImpl.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/cmd/containerImpl.vm
  *
  * Contributors: Prashanth Karnam <prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.container.edit.cli;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.BaseDataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;


public class DHCPGlobalOptionsListContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsListContainer {

				private java.util.List icItems = new java.util.ArrayList();
	
		
	public DHCPGlobalOptionsListContainerImpl(AbstractBaseCimAdapter adapter) throws WbemsmtException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

		
			
		/**
		* 
		* linked container DHCPGlobalOptionsListItemContainer
		*/
		public java.util.List getItems()
		{
			return icItems;
		}

	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("DHCPGlobalOptionsListContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title)
	{
    		        		List listitems = getItems();
        		printStream.println();
        		printStream.println(getAdapter().getBundle().getString("DHCPGlobalOptionsListContainer.role.items") + " " + getAdapter().getBundle().getString("items.found", new Object[]{new Integer(listitems.size())}));
        		for (int i = 0; i < listitems.size(); i++) {
        			BaseDataContainer child = (BaseDataContainer)listitems.get(i);
        			printStream.println();
        			printStream.println(getAdapter().getBundle().getString("item") + ": " + (i+1) + " " + getAdapter().getBundle().getString("of") + " " + listitems.size());
        			child.trace(printStream,listOptions,false);
        		}
    			
			
	}
	
	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List getFields()
	{
		List fields = new ArrayList();
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List getChildContainers()
	{
		List childs = new ArrayList();
    	    		childs.addAll(getItems());
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
		DHCPGlobalOptionsListContainerImpl source = (DHCPGlobalOptionsListContainerImpl)sourceContainer;
	
    			
    	    		List targetListForItems = getItems();
    		List sourceListForItems = source.getItems();
    		if (sourceListForItems.size() != targetListForItems.size())
    		{
    			throw new IllegalArgumentException("The Lists are not from same size. Source is " + sourceListForItems.size() + " and target is " + targetListForItems.size() );
    		}
			for (int ii=0; ii < sourceListForItems.size(); ii++)
			{
				((DataContainer) targetListForItems.get(ii)).copyFrom(((DataContainer) sourceListForItems.get(ii)));
			}
			
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}