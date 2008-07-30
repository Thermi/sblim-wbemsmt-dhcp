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

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.exception.ErrorCode;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.MultiLinePanel;

public class DHCPGlobalOptionsListContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsListContainer {

				
				private java.util.List icItems = new java.util.ArrayList();
		
		private MultiLinePanel itemsPanel;
		private int itemsCount;

				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icItems_ValuesHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icItems_InstanceIDHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icItems_ElementNameHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icItems_CaptionHeader;
				private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf icItems_DescriptionHeader;
				
	
		
	
	public DHCPGlobalOptionsListContainerImpl(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter,String bindingPrefix) throws WbemsmtException  {

			
				super(adapter,bindingPrefix, "DHCPGlobalOptionsListContainer.caption",false);
				
				
		
				
    			
    	    						
		setFooter(getPanelForCustomLayout(),"DHCPGlobalOptionsListContainer.footerText");
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
		
		public MultiLinePanel getItemsPanel()
		{
			if (itemsPanel == null)
			{
  			   itemsPanel = new ItemsPanel(adapter,bindingPrefix, // the prefix for binding values
							  "#{" +  bindingPrefix + "itemsPanel", // binding for Title
							  "DHCPGlobalOptionsListItemContainer_AsItems_InDHCPGlobalOptionsListContainer.caption", //Key for title
							  org.sblim.wbemsmt.dhcp.bl.container.edit.jsf.DHCPGlobalOptionsListItemContainer_AsItems_InDHCPGlobalOptionsListContainerImpl.COLS);
			  addItemsHeader();							  
			}		
			
			return itemsPanel;
		}

		static class ItemsPanel extends MultiLinePanel
		{
			public ItemsPanel(AbstractBaseCimAdapter adapter, String bindingPrefix, String bindigForTitle, String keyForTitle, int cols) {
				super(adapter, bindingPrefix, bindigForTitle, keyForTitle, "items", cols);
			}
	
			protected String getOrientationOfColumnAsCss(int column) {
				return org.sblim.wbemsmt.dhcp.bl.container.edit.jsf.DHCPGlobalOptionsListItemContainer_AsItems_InDHCPGlobalOptionsListContainerImpl.orientationOfColumnAsCss[column];
			}
		}

	private void addItems(org.sblim.wbemsmt.dhcp.bl.container.edit.jsf.DHCPGlobalOptionsListItemContainer_AsItems_InDHCPGlobalOptionsListContainerImpl child) {

		getItems().add(child);
		getItemsPanel().addComponents(child.getComponents());
		
					//((LabeledJSFInputComponent)getItems_ValuesHeader()).getDependentChildFields().add(child.get_Values());
					//((LabeledJSFInputComponent)getItems_InstanceIDHeader()).getDependentChildFields().add(child.get_InstanceID());
					//((LabeledJSFInputComponent)getItems_ElementNameHeader()).getDependentChildFields().add(child.get_ElementName());
					//((LabeledJSFInputComponent)getItems_CaptionHeader()).getDependentChildFields().add(child.get_Caption());
					//((LabeledJSFInputComponent)getItems_DescriptionHeader()).getDependentChildFields().add(child.get_Description());
			}
	
	private void clearItems() {
		getItems().clear();
	}

	/**
	* 
	* Get the Items for the UI repesentation
	*/
	public java.util.List getItemsForUI()
	{
				
		List result = new ArrayList();
		result.addAll(icItems);
		
		while (result.size() < MIN_TABLE_LENGTH)
		{
			try {
				org.sblim.wbemsmt.dhcp.bl.container.edit.jsf.DHCPGlobalOptionsListItemContainer_AsItems_InDHCPGlobalOptionsListContainerImpl item = new org.sblim.wbemsmt.dhcp.bl.container.edit.jsf.DHCPGlobalOptionsListItemContainer_AsItems_InDHCPGlobalOptionsListContainerImpl((org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter)adapter,bindingPrefix, result.size());
				result.add(item);
			} catch (WbemsmtException e) {
				e.printStackTrace();
			}
		}
		
		itemsPanel.setList(result);
		
		return result;
	}		
		
		
	/**
	 * manages the style for whole footer which is displayed if there are no entries in the table or if there is a custom panel in it
	 * @return
	 */
	public String getItemsFooterClass()
	{
		return "multiLineRowHeader center "  
		+ (icItems.size() == 0 || getItemsPanel().isHavingCustomFooter() ?  "visible " : "hidden ");
	}
	
	/**
	 * manages the style for the label which is displayed if there are no entries in the table
	 * @return
	 */
	public String getItemsAvailableFooterClass()
	{
		return icItems.size() > 0 ? " hidden " : " visible ";
	}
	
	private void addItemsHeader() {
		getItemsPanel().setHeader(getItemsHeaderComponents(),getItemsFieldNames());
	}
	
	private LabeledJSFInputComponent[] getItemsHeaderComponents() {
		return new LabeledJSFInputComponent[]{
							(LabeledJSFInputComponent)getItems_ValuesHeader(),
							(LabeledJSFInputComponent)getItems_InstanceIDHeader(),
							(LabeledJSFInputComponent)getItems_ElementNameHeader(),
							(LabeledJSFInputComponent)getItems_CaptionHeader(),
							(LabeledJSFInputComponent)getItems_DescriptionHeader(),
						};
	}

	private String[] getItemsFieldNames() {
		return new String[]{
							"_Values",
							"_InstanceID",
							"_ElementName",
							"_Caption",
							"_Description",
						};
	}

			/**
   		 * Header for field Values
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getItems_ValuesHeader() {
    		if (icItems_ValuesHeader == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsListItemContainer.Values");
				String binding = bindingPrefix + "items_ValuesHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icItems_ValuesHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icItems_ValuesHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icItems_ValuesHeader).setHeader(true);
			
    		return icItems_ValuesHeader;
    	}
			/**
   		 * Header for field InstanceID
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getItems_InstanceIDHeader() {
    		if (icItems_InstanceIDHeader == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsListItemContainer.InstanceID");
				String binding = bindingPrefix + "items_InstanceIDHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icItems_InstanceIDHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icItems_InstanceIDHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icItems_InstanceIDHeader).setHeader(true);
			
    		return icItems_InstanceIDHeader;
    	}
			/**
   		 * Header for field ElementName
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getItems_ElementNameHeader() {
    		if (icItems_ElementNameHeader == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsListItemContainer.ElementName");
				String binding = bindingPrefix + "items_ElementNameHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icItems_ElementNameHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icItems_ElementNameHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icItems_ElementNameHeader).setHeader(true);
			
    		return icItems_ElementNameHeader;
    	}
			/**
   		 * Header for field Caption
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getItems_CaptionHeader() {
    		if (icItems_CaptionHeader == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsListItemContainer.Caption");
				String binding = bindingPrefix + "items_CaptionHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icItems_CaptionHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icItems_CaptionHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icItems_CaptionHeader).setHeader(true);
			
    		return icItems_CaptionHeader;
    	}
			/**
   		 * Header for field Description
		 */
		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf getItems_DescriptionHeader() {
    		if (icItems_DescriptionHeader == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsListItemContainer.Description");
				String binding = bindingPrefix + "items_DescriptionHeader.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			icItems_DescriptionHeader = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icItems_DescriptionHeader).setOrientation( LabeledBaseInputComponentIf.LEFT );    		}
				((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent)icItems_DescriptionHeader).setHeader(true);
			
    		return icItems_DescriptionHeader;
    	}
	
	
		
	public void reload()
	{
		super.reload();
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesDhcp"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    			try
		{
			int count = adapter.count(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsListItemContainer.class);
	        if (count != itemsCount)
	        {
	           itemsCount = count;
	           clearItems();
			   for (int i=0; i < count ; i++) {
	    			addItems(new org.sblim.wbemsmt.dhcp.bl.container.edit.jsf.DHCPGlobalOptionsListItemContainer_AsItems_InDHCPGlobalOptionsListContainerImpl((org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter)adapter,bindingPrefix, i));
			   }
	        }
			getItemsPanel().setList(getItems());				   
		} catch (WbemsmtException e) {
			throw new WbemsmtException((ErrorCode)e.getErrorCode (),e);
		}
    		}


	/**
	 * count and create childrens
	 * @throws WbemsmtException
	 */
	public void updateControls() throws WbemsmtException {
		try {
			countAndCreateChildren();
			adapter.updateControls(this);
		
							getItemsPanel().updateRows();				
					} catch (WbemsmtException e) {
			throw new WbemsmtException((ErrorCode)e.getErrorCode (),e);
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