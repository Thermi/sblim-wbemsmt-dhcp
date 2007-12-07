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



import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class DHCPGlobalOptionsContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsContainer
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
    	
		
	public DHCPGlobalOptionsContainerImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Timeoffset() {
    		if (ic_usr_Timeoffset == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.timeoffset");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Timeoffset = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.subnetmask");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Subnetmask = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.domainname");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Domainname = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.staticroutes");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Staticroutes = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.policyfilter");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Policyfilter = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.interfacemtu");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Interfacemtu = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.hostname");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Hostname = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.dhcpclientidentifier");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Dhcpclientidentifier = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.trailerencapsulation");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Trailerencapsulation = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.ipforwarding");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Ipforwarding = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.nonlocalsourcerouting");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Nonlocalsourcerouting = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.defaultipttl");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Defaultipttl = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.defaulttcpttl");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Defaulttcpttl = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.routers");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Routers = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.broadcastaddress");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Broadcastaddress = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.domainnameservers");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Domainnameservers = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Domainnameservers;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("DHCPGlobalOptionsContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_usr_Timeoffset().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Timeoffset()).getValue();
        				printStream.println(get_usr_Timeoffset().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Subnetmask().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Subnetmask()).getValue();
        				printStream.println(get_usr_Subnetmask().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Domainname().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Domainname()).getValue();
        				printStream.println(get_usr_Domainname().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Staticroutes().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Staticroutes()).getValue();
        				printStream.println(get_usr_Staticroutes().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Policyfilter().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Policyfilter()).getValue();
        				printStream.println(get_usr_Policyfilter().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Interfacemtu().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Interfacemtu()).getValue();
        				printStream.println(get_usr_Interfacemtu().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Hostname().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Hostname()).getValue();
        				printStream.println(get_usr_Hostname().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Dhcpclientidentifier().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Dhcpclientidentifier()).getValue();
        				printStream.println(get_usr_Dhcpclientidentifier().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Trailerencapsulation().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Trailerencapsulation()).getValue();
        				printStream.println(get_usr_Trailerencapsulation().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Ipforwarding().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Ipforwarding()).getValue();
        				printStream.println(get_usr_Ipforwarding().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Nonlocalsourcerouting().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Nonlocalsourcerouting()).getValue();
        				printStream.println(get_usr_Nonlocalsourcerouting().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Defaultipttl().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Defaultipttl()).getValue();
        				printStream.println(get_usr_Defaultipttl().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Defaulttcpttl().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Defaulttcpttl()).getValue();
        				printStream.println(get_usr_Defaulttcpttl().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Routers().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Routers()).getValue();
        				printStream.println(get_usr_Routers().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Broadcastaddress().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Broadcastaddress()).getValue();
        				printStream.println(get_usr_Broadcastaddress().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Domainnameservers().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Domainnameservers()).getValue();
        				printStream.println(get_usr_Domainnameservers().getLabelText() + ": " + value);
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