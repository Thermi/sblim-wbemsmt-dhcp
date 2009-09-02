/** 
  * DHCPPoolOptionsContainerImpl.java
  * 
  * Â© Copyright IBM Corp.  2009,2006,2007
  *
  * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/cmd/containerImpl.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.container.edit.cli;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class DHCPPoolOptionsContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolOptionsContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Domainnameservers;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Domainname;
    	
		
	public DHCPPoolOptionsContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
		super();
		setAdapter(adapter);
    			adapter.initContainer(this);
	}

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Domainnameservers() {
    		if (ic_usr_Domainnameservers == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPPoolOptionsContainer.domainnameservers");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Domainnameservers = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Domainnameservers;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Domainname() {
    		if (ic_usr_Domainname == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPPoolOptionsContainer.domainname");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Domainname = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Domainname;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("DHCPPoolOptionsContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_usr_Domainnameservers().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Domainnameservers()).getValue();
        				printStream.println(get_usr_Domainnameservers().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Domainname().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Domainname()).getValue();
        				printStream.println(get_usr_Domainname().getLabelText() + ": " + value);
   			}
   					}

		if (showChilds(listOptions))
		{
			traceChilds(printStream,listOptions,title);
		}
	}
	
	public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title)
	{
    			
			
	}
	
	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_usr_Domainnameservers());
    				fields.add(get_usr_Domainname());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List<DataContainer> getChildContainers()
	{
		List<DataContainer> childs = new ArrayList<DataContainer>();
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer) throws WbemsmtException
	{
	    		       DHCPPoolOptionsContainerImpl source = (DHCPPoolOptionsContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_Domainnameservers().copyFrom(source.get_usr_Domainnameservers());
		        		   get_usr_Domainname().copyFrom(source.get_usr_Domainname());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}