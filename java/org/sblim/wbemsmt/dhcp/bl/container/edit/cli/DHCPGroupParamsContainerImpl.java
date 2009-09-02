/** 
  * DHCPGroupParamsContainerImpl.java
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

public class DHCPGroupParamsContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupParamsContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Nextserver;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Filename;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Maxleasetime;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Defaultleasetime;
    	
		
	public DHCPGroupParamsContainerImpl(AbstractBaseCimAdapter adapter) throws  WbemsmtException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Nextserver() {
    		if (ic_usr_Nextserver == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGroupParamsContainer.nextserver");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Nextserver = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Nextserver;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Filename() {
    		if (ic_usr_Filename == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGroupParamsContainer.filename");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Filename = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Filename;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Maxleasetime() {
    		if (ic_usr_Maxleasetime == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGroupParamsContainer.maxleasetime");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Maxleasetime = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Maxleasetime;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Defaultleasetime() {
    		if (ic_usr_Defaultleasetime == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGroupParamsContainer.defaultleasetime");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Defaultleasetime = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,null,converter);
    		}
    		return ic_usr_Defaultleasetime;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("DHCPGroupParamsContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_usr_Nextserver().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Nextserver()).getValue();
        				printStream.println(get_usr_Nextserver().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Filename().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Filename()).getValue();
        				printStream.println(get_usr_Filename().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Maxleasetime().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Maxleasetime()).getValue();
        				printStream.println(get_usr_Maxleasetime().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Defaultleasetime().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Defaultleasetime()).getValue();
        				printStream.println(get_usr_Defaultleasetime().getLabelText() + ": " + value);
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
    				fields.add(get_usr_Nextserver());
    				fields.add(get_usr_Filename());
    				fields.add(get_usr_Maxleasetime());
    				fields.add(get_usr_Defaultleasetime());
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
	    		       DHCPGroupParamsContainerImpl source = (DHCPGroupParamsContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_Nextserver().copyFrom(source.get_usr_Nextserver());
		        		   get_usr_Filename().copyFrom(source.get_usr_Filename());
		        		   get_usr_Maxleasetime().copyFrom(source.get_usr_Maxleasetime());
		        		   get_usr_Defaultleasetime().copyFrom(source.get_usr_Defaultleasetime());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}