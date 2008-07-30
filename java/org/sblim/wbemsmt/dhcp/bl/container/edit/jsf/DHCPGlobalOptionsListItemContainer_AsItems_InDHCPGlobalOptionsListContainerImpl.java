/** 
  * DHCPGlobalOptionsListItemContainer_AsItems_InDHCPGlobalOptionsListContainerImpl.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImplMultiLine.vm
  *
  * Contributors: Prashanth Karnam <prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.container.edit.jsf;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;


	
public class DHCPGlobalOptionsListItemContainer_AsItems_InDHCPGlobalOptionsListContainerImpl extends org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel2 implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsListItemContainer {

			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Values;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_InstanceID;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_ElementName;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Caption;
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Description;
		
	public static final int COLS = 5;
	
	public static String[] orientationOfColumnAsCss = new String[]{
    				"left",
    				"left",
    				"left",
    				"left",
    				"left",
    		
	};
	
	
	
	public DHCPGlobalOptionsListItemContainer_AsItems_InDHCPGlobalOptionsListContainerImpl(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter,String bindingPrefix,int index) throws WbemsmtException {
	    super(adapter,bindingPrefix,index);
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Values() {
    		if (ic_Values == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsListItemContainer.Values");
				String binding = bindingPrefix + "items["+ index +"]._Values.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Values = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)ic_Values).setOrientation( LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_Values;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_InstanceID() {
    		if (ic_InstanceID == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsListItemContainer.InstanceID");
				String binding = bindingPrefix + "items["+ index +"]._InstanceID.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_InstanceID = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)ic_InstanceID).setOrientation( LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_InstanceID;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_ElementName() {
    		if (ic_ElementName == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsListItemContainer.ElementName");
				String binding = bindingPrefix + "items["+ index +"]._ElementName.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_ElementName = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)ic_ElementName).setOrientation( LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_ElementName;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Caption() {
    		if (ic_Caption == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsListItemContainer.Caption");
				String binding = bindingPrefix + "items["+ index +"]._Caption.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Caption = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)ic_Caption).setOrientation( LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_Caption;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		* Orientation LEFT
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Description() {
    		if (ic_Description == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsListItemContainer.Description");
				String binding = bindingPrefix + "items["+ index +"]._Description.item";
				logger.fine("Using binding " + binding);
				DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Description = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)ic_Description).setOrientation( LabeledBaseInputComponentIf.LEFT );
    		}

						
    		return ic_Description;
    	}
		

	/**
	 * @return all the Components
	 */
	public LabeledJSFInputComponent[] getComponents() {
		return new LabeledJSFInputComponent[]{
						(LabeledJSFInputComponent)get_Values(),
						(LabeledJSFInputComponent)get_InstanceID(),
						(LabeledJSFInputComponent)get_ElementName(),
						(LabeledJSFInputComponent)get_Caption(),
						(LabeledJSFInputComponent)get_Description(),
					};
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
	
	protected String getOrientationOfColumnAsCss(int column) {
		return orientationOfColumnAsCss[column];
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
		DHCPGlobalOptionsListItemContainer_AsItems_InDHCPGlobalOptionsListContainerImpl source = (DHCPGlobalOptionsListItemContainer_AsItems_InDHCPGlobalOptionsListContainerImpl)sourceContainer;
	
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