/** 
  * DHCPParamsContainerImpl.java
  *
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
  * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImpl.vm
  *
  * Contributors: 
  *   Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.container.edit.jsf;

import org.sblim.wbemsmt.exception.*;
import java.util.*;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;




import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class DHCPParamsContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPParamsContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Values;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Name;

    	
		
	
	public DHCPParamsContainerImpl(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "DHCPParamsContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_Values());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_Name());
        					
		setFooter(getPanelForCustomLayout(),"DHCPParamsContainer.footerText");
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
				String label = bundle.getString("DHCPParamsContainer.Values");
				String binding = expressionPrefix + "_Values.item";
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Name() {
    		if (ic_Name == null)
    		{
				String label = bundle.getString("DHCPParamsContainer.Name");
				String binding = expressionPrefix + "_Name.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Name = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
								ic_Name.setRequired(true);
				;
    		}
			
						
    		return ic_Name;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_Values != null)
    		{
				ic_Values.setLabelText(bundle.getString("DHCPParamsContainer.Values"));
    		}
	    		if (ic_Name != null)
    		{
				ic_Name.setLabelText(bundle.getString("DHCPParamsContainer.Name"));
    		}
		}

	public String[] getResourceBundleNames() {
		return new String[]{"messages","messagesDhcp"};
	}

	public void countAndCreateChildren() throws WbemsmtException {
	
    		}


	/**
	 * count and create childrens
	 * @throws WbemsmtException
	 */
	public void updateControls() throws WbemsmtException {
			   countAndCreateChildren();
			   adapter.updateControls(this);
		
			   		}

	
 
	/**
	 * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
	 * @return
	 */
	public List<LabeledBaseInputComponentIf> getFields()
	{
		List<LabeledBaseInputComponentIf> fields = new ArrayList<LabeledBaseInputComponentIf>();
    				fields.add(get_Values());
    				fields.add(get_Name());
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
	    		       DHCPParamsContainerImpl source = (DHCPParamsContainerImpl)sourceContainer;
		    		    
    	    		   get_Values().copyFrom(source.get_Values());
		        		   get_Name().copyFrom(source.get_Name());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}