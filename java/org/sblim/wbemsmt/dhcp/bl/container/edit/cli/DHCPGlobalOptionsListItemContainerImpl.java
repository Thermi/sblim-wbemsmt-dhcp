/** 
  * DHCPGlobalOptionsListItemContainerImpl.java
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

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;


public class DHCPGlobalOptionsListItemContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsListItemContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Values;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_InstanceID;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_ElementName;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Caption;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Description;
    	
		
	public DHCPGlobalOptionsListItemContainerImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Values() {
    		if (ic_Values == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsListItemContainer.Values");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_Values = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_Values;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_InstanceID() {
    		if (ic_InstanceID == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsListItemContainer.InstanceID");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_InstanceID = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_InstanceID;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_ElementName() {
    		if (ic_ElementName == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsListItemContainer.ElementName");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_ElementName = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_ElementName;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Caption() {
    		if (ic_Caption == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsListItemContainer.Caption");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_Caption = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_Caption;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Description() {
    		if (ic_Description == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsListItemContainer.Description");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_Description = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_Description;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("DHCPGlobalOptionsListItemContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_Values().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Values()).getValue();
        				printStream.println(get_Values().getLabelText() + ": " + value);
   			}
   			   			   			if (get_InstanceID().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_InstanceID()).getValue();
        				printStream.println(get_InstanceID().getLabelText() + ": " + value);
   			}
   			   			   			if (get_ElementName().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_ElementName()).getValue();
        				printStream.println(get_ElementName().getLabelText() + ": " + value);
   			}
   			   			   			if (get_Caption().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Caption()).getValue();
        				printStream.println(get_Caption().getLabelText() + ": " + value);
   			}
   			   			   			if (get_Description().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_Description()).getValue();
        				printStream.println(get_Description().getLabelText() + ": " + value);
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
	public List getFields()
	{
		List fields = new ArrayList();
    				fields.add(get_Values());
    				fields.add(get_InstanceID());
    				fields.add(get_ElementName());
    				fields.add(get_Caption());
    				fields.add(get_Description());
    			return fields;
	}

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return
	 */
	public List getChildContainers()
	{
		List childs = new ArrayList();
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer)
	{
		DHCPGlobalOptionsListItemContainerImpl source = (DHCPGlobalOptionsListItemContainerImpl)sourceContainer;
	
    	    		get_Values().setValue(source.get_Values().getValue());
		    		get_InstanceID().setValue(source.get_InstanceID().getValue());
		    		get_ElementName().setValue(source.get_ElementName().getValue());
		    		get_Caption().setValue(source.get_Caption().getValue());
		    		get_Description().setValue(source.get_Description().getValue());
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}

	public LabeledBaseInputComponentIf get_Name () {
		// TODO Auto-generated method stub
		return null;
	}		
}