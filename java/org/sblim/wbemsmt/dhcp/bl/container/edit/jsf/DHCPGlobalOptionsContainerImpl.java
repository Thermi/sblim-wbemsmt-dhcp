/** 
  * DHCPGlobalOptionsContainerImpl.java
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
import java.util.*;




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
    	
		
	
	public DHCPGlobalOptionsContainerImpl(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

			
				super(adapter,bindingPrefix, "DHCPGlobalOptionsContainer.caption",false);
				
				
		
				
    			
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
				String binding = bindingPrefix + "_usr_Timeoffset.item";
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
				String binding = bindingPrefix + "_usr_Subnetmask.item";
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
				String binding = bindingPrefix + "_usr_Domainname.item";
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
				String binding = bindingPrefix + "_usr_Staticroutes.item";
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
				String binding = bindingPrefix + "_usr_Policyfilter.item";
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
				String binding = bindingPrefix + "_usr_Interfacemtu.item";
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
				String binding = bindingPrefix + "_usr_Hostname.item";
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
				String binding = bindingPrefix + "_usr_Dhcpclientidentifier.item";
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
				String binding = bindingPrefix + "_usr_Trailerencapsulation.item";
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
				String binding = bindingPrefix + "_usr_Ipforwarding.item";
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
				String binding = bindingPrefix + "_usr_Nonlocalsourcerouting.item";
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
				String binding = bindingPrefix + "_usr_Defaultipttl.item";
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
				String binding = bindingPrefix + "_usr_Defaulttcpttl.item";
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
				String binding = bindingPrefix + "_usr_Routers.item";
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
				String binding = bindingPrefix + "_usr_Broadcastaddress.item";
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
				String binding = bindingPrefix + "_usr_Domainnameservers.item";
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
	public List getChildContainers()
	{
		List childs = new ArrayList();
    	    			return childs;
	
	}
	
	public void copyFrom(DataContainer sourceContainer)
	{
		DHCPGlobalOptionsContainerImpl source = (DHCPGlobalOptionsContainerImpl)sourceContainer;
	
    	    		get_usr_Timeoffset().setValue(source.get_usr_Timeoffset().getValue());
		    		get_usr_Subnetmask().setValue(source.get_usr_Subnetmask().getValue());
		    		get_usr_Domainname().setValue(source.get_usr_Domainname().getValue());
		    		get_usr_Staticroutes().setValue(source.get_usr_Staticroutes().getValue());
		    		get_usr_Policyfilter().setValue(source.get_usr_Policyfilter().getValue());
		    		get_usr_Interfacemtu().setValue(source.get_usr_Interfacemtu().getValue());
		    		get_usr_Hostname().setValue(source.get_usr_Hostname().getValue());
		    		get_usr_Dhcpclientidentifier().setValue(source.get_usr_Dhcpclientidentifier().getValue());
		    		get_usr_Trailerencapsulation().setValue(source.get_usr_Trailerencapsulation().getValue());
		    		get_usr_Ipforwarding().setValue(source.get_usr_Ipforwarding().getValue());
		    		get_usr_Nonlocalsourcerouting().setValue(source.get_usr_Nonlocalsourcerouting().getValue());
		    		get_usr_Defaultipttl().setValue(source.get_usr_Defaultipttl().getValue());
		    		get_usr_Defaulttcpttl().setValue(source.get_usr_Defaulttcpttl().getValue());
		    		get_usr_Routers().setValue(source.get_usr_Routers().getValue());
		    		get_usr_Broadcastaddress().setValue(source.get_usr_Broadcastaddress().getValue());
		    		get_usr_Domainnameservers().setValue(source.get_usr_Domainnameservers().getValue());
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}