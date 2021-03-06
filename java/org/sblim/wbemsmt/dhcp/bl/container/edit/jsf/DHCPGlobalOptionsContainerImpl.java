/** 
  * DHCPGlobalOptionsContainerImpl.java
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

public class DHCPGlobalOptionsContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Timeoffset;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Subnetmask;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Domainname;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Staticroutes;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Policyfilter;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Interfacemtu;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Hostname;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Dhcpclientidentifier;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Trailerencapsulation;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Ipforwarding;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Nonlocalsourcerouting;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Defaultipttl;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Defaulttcpttl;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Routers;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Broadcastaddress;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Domainnameservers;

    	
		
	
	public DHCPGlobalOptionsContainerImpl(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "DHCPGlobalOptionsContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Timeoffset());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Subnetmask());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Domainname());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Staticroutes());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Policyfilter());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Interfacemtu());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Hostname());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Dhcpclientidentifier());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Trailerencapsulation());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Ipforwarding());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Nonlocalsourcerouting());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Defaultipttl());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Defaulttcpttl());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Routers());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Broadcastaddress());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Domainnameservers());
        					
		setFooter(getPanelForCustomLayout(),"DHCPGlobalOptionsContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Timeoffset() {
    		if (ic_usr_Timeoffset == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsContainer.timeoffset");
				String binding = expressionPrefix + "_usr_Timeoffset.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Timeoffset = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Timeoffset;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Subnetmask() {
    		if (ic_usr_Subnetmask == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsContainer.subnetmask");
				String binding = expressionPrefix + "_usr_Subnetmask.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Subnetmask = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Subnetmask;
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
				String label = bundle.getString("DHCPGlobalOptionsContainer.domainname");
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Staticroutes() {
    		if (ic_usr_Staticroutes == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsContainer.staticroutes");
				String binding = expressionPrefix + "_usr_Staticroutes.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Staticroutes = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Staticroutes;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Policyfilter() {
    		if (ic_usr_Policyfilter == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsContainer.policyfilter");
				String binding = expressionPrefix + "_usr_Policyfilter.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Policyfilter = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Policyfilter;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Interfacemtu() {
    		if (ic_usr_Interfacemtu == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsContainer.interfacemtu");
				String binding = expressionPrefix + "_usr_Interfacemtu.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Interfacemtu = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Interfacemtu;
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
				String label = bundle.getString("DHCPGlobalOptionsContainer.hostname");
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Dhcpclientidentifier() {
    		if (ic_usr_Dhcpclientidentifier == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsContainer.dhcpclientidentifier");
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
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Trailerencapsulation() {
    		if (ic_usr_Trailerencapsulation == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsContainer.trailerencapsulation");
				String binding = expressionPrefix + "_usr_Trailerencapsulation.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Trailerencapsulation = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Trailerencapsulation;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Ipforwarding() {
    		if (ic_usr_Ipforwarding == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsContainer.ipforwarding");
				String binding = expressionPrefix + "_usr_Ipforwarding.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Ipforwarding = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Ipforwarding;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Nonlocalsourcerouting() {
    		if (ic_usr_Nonlocalsourcerouting == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsContainer.nonlocalsourcerouting");
				String binding = expressionPrefix + "_usr_Nonlocalsourcerouting.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Nonlocalsourcerouting = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Nonlocalsourcerouting;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Defaultipttl() {
    		if (ic_usr_Defaultipttl == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsContainer.defaultipttl");
				String binding = expressionPrefix + "_usr_Defaultipttl.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Defaultipttl = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Defaultipttl;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Defaulttcpttl() {
    		if (ic_usr_Defaulttcpttl == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsContainer.defaulttcpttl");
				String binding = expressionPrefix + "_usr_Defaulttcpttl.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Defaulttcpttl = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Defaulttcpttl;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Routers() {
    		if (ic_usr_Routers == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsContainer.routers");
				String binding = expressionPrefix + "_usr_Routers.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Routers = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Routers;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Broadcastaddress() {
    		if (ic_usr_Broadcastaddress == null)
    		{
				String label = bundle.getString("DHCPGlobalOptionsContainer.broadcastaddress");
				String binding = expressionPrefix + "_usr_Broadcastaddress.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Broadcastaddress = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Broadcastaddress;
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
				String label = bundle.getString("DHCPGlobalOptionsContainer.domainnameservers");
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
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_Timeoffset != null)
    		{
				ic_usr_Timeoffset.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.timeoffset"));
    		}
	    		if (ic_usr_Subnetmask != null)
    		{
				ic_usr_Subnetmask.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.subnetmask"));
    		}
	    		if (ic_usr_Domainname != null)
    		{
				ic_usr_Domainname.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.domainname"));
    		}
	    		if (ic_usr_Staticroutes != null)
    		{
				ic_usr_Staticroutes.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.staticroutes"));
    		}
	    		if (ic_usr_Policyfilter != null)
    		{
				ic_usr_Policyfilter.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.policyfilter"));
    		}
	    		if (ic_usr_Interfacemtu != null)
    		{
				ic_usr_Interfacemtu.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.interfacemtu"));
    		}
	    		if (ic_usr_Hostname != null)
    		{
				ic_usr_Hostname.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.hostname"));
    		}
	    		if (ic_usr_Dhcpclientidentifier != null)
    		{
				ic_usr_Dhcpclientidentifier.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.dhcpclientidentifier"));
    		}
	    		if (ic_usr_Trailerencapsulation != null)
    		{
				ic_usr_Trailerencapsulation.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.trailerencapsulation"));
    		}
	    		if (ic_usr_Ipforwarding != null)
    		{
				ic_usr_Ipforwarding.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.ipforwarding"));
    		}
	    		if (ic_usr_Nonlocalsourcerouting != null)
    		{
				ic_usr_Nonlocalsourcerouting.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.nonlocalsourcerouting"));
    		}
	    		if (ic_usr_Defaultipttl != null)
    		{
				ic_usr_Defaultipttl.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.defaultipttl"));
    		}
	    		if (ic_usr_Defaulttcpttl != null)
    		{
				ic_usr_Defaulttcpttl.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.defaulttcpttl"));
    		}
	    		if (ic_usr_Routers != null)
    		{
				ic_usr_Routers.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.routers"));
    		}
	    		if (ic_usr_Broadcastaddress != null)
    		{
				ic_usr_Broadcastaddress.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.broadcastaddress"));
    		}
	    		if (ic_usr_Domainnameservers != null)
    		{
				ic_usr_Domainnameservers.setLabelText(bundle.getString("DHCPGlobalOptionsContainer.domainnameservers"));
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
    				fields.add(get_usr_Timeoffset());
    				fields.add(get_usr_Subnetmask());
    				fields.add(get_usr_Domainname());
    				fields.add(get_usr_Staticroutes());
    				fields.add(get_usr_Policyfilter());
    				fields.add(get_usr_Interfacemtu());
    				fields.add(get_usr_Hostname());
    				fields.add(get_usr_Dhcpclientidentifier());
    				fields.add(get_usr_Trailerencapsulation());
    				fields.add(get_usr_Ipforwarding());
    				fields.add(get_usr_Nonlocalsourcerouting());
    				fields.add(get_usr_Defaultipttl());
    				fields.add(get_usr_Defaulttcpttl());
    				fields.add(get_usr_Routers());
    				fields.add(get_usr_Broadcastaddress());
    				fields.add(get_usr_Domainnameservers());
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
	    		       DHCPGlobalOptionsContainerImpl source = (DHCPGlobalOptionsContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_Timeoffset().copyFrom(source.get_usr_Timeoffset());
		        		   get_usr_Subnetmask().copyFrom(source.get_usr_Subnetmask());
		        		   get_usr_Domainname().copyFrom(source.get_usr_Domainname());
		        		   get_usr_Staticroutes().copyFrom(source.get_usr_Staticroutes());
		        		   get_usr_Policyfilter().copyFrom(source.get_usr_Policyfilter());
		        		   get_usr_Interfacemtu().copyFrom(source.get_usr_Interfacemtu());
		        		   get_usr_Hostname().copyFrom(source.get_usr_Hostname());
		        		   get_usr_Dhcpclientidentifier().copyFrom(source.get_usr_Dhcpclientidentifier());
		        		   get_usr_Trailerencapsulation().copyFrom(source.get_usr_Trailerencapsulation());
		        		   get_usr_Ipforwarding().copyFrom(source.get_usr_Ipforwarding());
		        		   get_usr_Nonlocalsourcerouting().copyFrom(source.get_usr_Nonlocalsourcerouting());
		        		   get_usr_Defaultipttl().copyFrom(source.get_usr_Defaultipttl());
		        		   get_usr_Defaulttcpttl().copyFrom(source.get_usr_Defaulttcpttl());
		        		   get_usr_Routers().copyFrom(source.get_usr_Routers());
		        		   get_usr_Broadcastaddress().copyFrom(source.get_usr_Broadcastaddress());
		        		   get_usr_Domainnameservers().copyFrom(source.get_usr_Domainnameservers());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}