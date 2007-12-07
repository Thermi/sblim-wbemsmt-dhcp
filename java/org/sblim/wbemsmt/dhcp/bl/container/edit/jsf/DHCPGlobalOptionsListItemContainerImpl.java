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
  * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImpl.vm
  *
  * Contributors: Prashanth Karnam <prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.container.edit.jsf;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

import java.util.*;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class DHCPGlobalOptionsListItemContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsListItemContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Values;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_InstanceID;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_ElementName;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Caption;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Description;
    	
		
	
	public DHCPGlobalOptionsListItemContainerImpl(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

			
				super(adapter,bindingPrefix, "DHCPGlobalOptionsListItemContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_Values());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_InstanceID());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_ElementName());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_Caption());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_Description());
        					
		setFooter(getPanelForCustomLayout(),"DHCPGlobalOptionsListItemContainer.footerText");
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
				String label = bundle.getString("DHCPGlobalOptionsListItemContainer.Values");
				String binding = bindingPrefix + "_Values.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Values = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String label = bundle.getString("DHCPGlobalOptionsListItemContainer.InstanceID");
				String binding = bindingPrefix + "_InstanceID.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_InstanceID = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String label = bundle.getString("DHCPGlobalOptionsListItemContainer.ElementName");
				String binding = bindingPrefix + "_ElementName.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_ElementName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String label = bundle.getString("DHCPGlobalOptionsListItemContainer.Caption");
				String binding = bindingPrefix + "_Caption.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Caption = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String label = bundle.getString("DHCPGlobalOptionsListItemContainer.Description");
				String binding = bindingPrefix + "_Description.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Description = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_Description;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_Values != null)
    		{
				ic_Values.setLabelText(bundle.getString("DHCPGlobalOptionsListItemContainer.Values"));
    		}
	    		if (ic_InstanceID != null)
    		{
				ic_InstanceID.setLabelText(bundle.getString("DHCPGlobalOptionsListItemContainer.InstanceID"));
    		}
	    		if (ic_ElementName != null)
    		{
				ic_ElementName.setLabelText(bundle.getString("DHCPGlobalOptionsListItemContainer.ElementName"));
    		}
	    		if (ic_Caption != null)
    		{
				ic_Caption.setLabelText(bundle.getString("DHCPGlobalOptionsListItemContainer.Caption"));
    		}
	    		if (ic_Description != null)
    		{
				ic_Description.setLabelText(bundle.getString("DHCPGlobalOptionsListItemContainer.Description"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesDhcp"};
	}

	public void countAndCreateChildren() throws InitContainerException {
	
    		}


	/**
	 * count and create childrens
	 * @throws UpdateControlsException
	 */
	public void updateControls() throws UpdateControlsException {
		try {
			countAndCreateChildren();
			adapter.updateControls(this);
		
					} catch (InitContainerException e) {
			throw new UpdateControlsException(e);
		}
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