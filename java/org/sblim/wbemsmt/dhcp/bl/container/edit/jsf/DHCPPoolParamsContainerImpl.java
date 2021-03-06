/** 
  * DHCPPoolParamsContainerImpl.java
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

public class DHCPPoolParamsContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolParamsContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Range;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Allow;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Allowmembersof;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Deny;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Denymembersof;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Maxleasetime;

    	
		
	
	public DHCPPoolParamsContainerImpl(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "DHCPPoolParamsContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Range());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Allow());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Allowmembersof());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Deny());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Denymembersof());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Maxleasetime());
        					
		setFooter(getPanelForCustomLayout(),"DHCPPoolParamsContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Range() {
    		if (ic_usr_Range == null)
    		{
				String label = bundle.getString("DHCPPoolParamsContainer.range");
				String binding = expressionPrefix + "_usr_Range.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Range = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Range;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Allow() {
    		if (ic_usr_Allow == null)
    		{
				String label = bundle.getString("DHCPPoolParamsContainer.allow");
				String binding = expressionPrefix + "_usr_Allow.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Allow = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Allow;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Allowmembersof() {
    		if (ic_usr_Allowmembersof == null)
    		{
				String label = bundle.getString("DHCPPoolParamsContainer.allowmembersof");
				String binding = expressionPrefix + "_usr_Allowmembersof.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Allowmembersof = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Allowmembersof;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Deny() {
    		if (ic_usr_Deny == null)
    		{
				String label = bundle.getString("DHCPPoolParamsContainer.deny");
				String binding = expressionPrefix + "_usr_Deny.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Deny = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Deny;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Denymembersof() {
    		if (ic_usr_Denymembersof == null)
    		{
				String label = bundle.getString("DHCPPoolParamsContainer.denymembersof");
				String binding = expressionPrefix + "_usr_Denymembersof.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Denymembersof = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Denymembersof;
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
				String label = bundle.getString("DHCPPoolParamsContainer.maxleasetime");
				String binding = expressionPrefix + "_usr_Maxleasetime.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Maxleasetime = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Maxleasetime;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_Range != null)
    		{
				ic_usr_Range.setLabelText(bundle.getString("DHCPPoolParamsContainer.range"));
    		}
	    		if (ic_usr_Allow != null)
    		{
				ic_usr_Allow.setLabelText(bundle.getString("DHCPPoolParamsContainer.allow"));
    		}
	    		if (ic_usr_Allowmembersof != null)
    		{
				ic_usr_Allowmembersof.setLabelText(bundle.getString("DHCPPoolParamsContainer.allowmembersof"));
    		}
	    		if (ic_usr_Deny != null)
    		{
				ic_usr_Deny.setLabelText(bundle.getString("DHCPPoolParamsContainer.deny"));
    		}
	    		if (ic_usr_Denymembersof != null)
    		{
				ic_usr_Denymembersof.setLabelText(bundle.getString("DHCPPoolParamsContainer.denymembersof"));
    		}
	    		if (ic_usr_Maxleasetime != null)
    		{
				ic_usr_Maxleasetime.setLabelText(bundle.getString("DHCPPoolParamsContainer.maxleasetime"));
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
    				fields.add(get_usr_Range());
    				fields.add(get_usr_Allow());
    				fields.add(get_usr_Allowmembersof());
    				fields.add(get_usr_Deny());
    				fields.add(get_usr_Denymembersof());
    				fields.add(get_usr_Maxleasetime());
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
	    		       DHCPPoolParamsContainerImpl source = (DHCPPoolParamsContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_Range().copyFrom(source.get_usr_Range());
		        		   get_usr_Allow().copyFrom(source.get_usr_Allow());
		        		   get_usr_Allowmembersof().copyFrom(source.get_usr_Allowmembersof());
		        		   get_usr_Deny().copyFrom(source.get_usr_Deny());
		        		   get_usr_Denymembersof().copyFrom(source.get_usr_Denymembersof());
		        		   get_usr_Maxleasetime().copyFrom(source.get_usr_Maxleasetime());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}