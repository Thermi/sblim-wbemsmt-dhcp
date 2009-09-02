/** 
  * DHCPHostOptionsContainerImpl.java
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

public class DHCPHostOptionsContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostOptionsContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Hostname;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Domainnameservers;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Domainname;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Dhcpclientidentifier;

    	
		
	
	public DHCPHostOptionsContainerImpl(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "DHCPHostOptionsContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Hostname());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Domainnameservers());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Domainname());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Dhcpclientidentifier());
        					
		setFooter(getPanelForCustomLayout(),"DHCPHostOptionsContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Hostname() {
    		if (ic_usr_Hostname == null)
    		{
				String label = bundle.getString("DHCPHostOptionsContainer.hostname");
				String binding = expressionPrefix + "_usr_Hostname.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Hostname = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Hostname;
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
				String label = bundle.getString("DHCPHostOptionsContainer.domainnameservers");
				String binding = expressionPrefix + "_usr_Domainnameservers.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Domainnameservers = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
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
				String label = bundle.getString("DHCPHostOptionsContainer.domainname");
				String binding = expressionPrefix + "_usr_Domainname.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Domainname = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Domainname;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Dhcpclientidentifier() {
    		if (ic_usr_Dhcpclientidentifier == null)
    		{
				String label = bundle.getString("DHCPHostOptionsContainer.dhcpclientidentifier");
				String binding = expressionPrefix + "_usr_Dhcpclientidentifier.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Dhcpclientidentifier = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Dhcpclientidentifier;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_Hostname != null)
    		{
				ic_usr_Hostname.setLabelText(bundle.getString("DHCPHostOptionsContainer.hostname"));
    		}
	    		if (ic_usr_Domainnameservers != null)
    		{
				ic_usr_Domainnameservers.setLabelText(bundle.getString("DHCPHostOptionsContainer.domainnameservers"));
    		}
	    		if (ic_usr_Domainname != null)
    		{
				ic_usr_Domainname.setLabelText(bundle.getString("DHCPHostOptionsContainer.domainname"));
    		}
	    		if (ic_usr_Dhcpclientidentifier != null)
    		{
				ic_usr_Dhcpclientidentifier.setLabelText(bundle.getString("DHCPHostOptionsContainer.dhcpclientidentifier"));
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
    				fields.add(get_usr_Hostname());
    				fields.add(get_usr_Domainnameservers());
    				fields.add(get_usr_Domainname());
    				fields.add(get_usr_Dhcpclientidentifier());
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
	    		       DHCPHostOptionsContainerImpl source = (DHCPHostOptionsContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_Hostname().copyFrom(source.get_usr_Hostname());
		        		   get_usr_Domainnameservers().copyFrom(source.get_usr_Domainnameservers());
		        		   get_usr_Domainname().copyFrom(source.get_usr_Domainname());
		        		   get_usr_Dhcpclientidentifier().copyFrom(source.get_usr_Dhcpclientidentifier());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}