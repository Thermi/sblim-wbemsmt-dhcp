/** 
  * DHCPGlobalParamsContainerImpl.java
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

public class DHCPGlobalParamsContainerImpl extends BaseDataContainer implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalParamsContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Range;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Usehostdeclnames;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Hardware;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Servername;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Nextserver;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Fixedaddress;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Ddnsupdatestyle;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Serveridentifier;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Allow;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Allowmembersof;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Deny;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Denymembersof;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Defaultleasetime;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Maxleasetime;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Getleasehostnames;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Dynamicbootpleaselength;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Bootunknownclients;
    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Leaselimit;
    	
		
	public DHCPGlobalParamsContainerImpl(AbstractBaseCimAdapter adapter) throws InitContainerException {
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Range() {
    		if (ic_usr_Range == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.range");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Range = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Range;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Usehostdeclnames() {
    		if (ic_usr_Usehostdeclnames == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.usehostdeclnames");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Usehostdeclnames = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Usehostdeclnames;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Hardware() {
    		if (ic_usr_Hardware == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.hardware");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Hardware = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Hardware;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Servername() {
    		if (ic_usr_Servername == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.servername");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Servername = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Servername;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Nextserver() {
    		if (ic_usr_Nextserver == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.nextserver");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Nextserver = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Nextserver;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Fixedaddress() {
    		if (ic_usr_Fixedaddress == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.fixedaddress");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Fixedaddress = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Fixedaddress;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Ddnsupdatestyle() {
    		if (ic_usr_Ddnsupdatestyle == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.ddnsupdatestyle");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Ddnsupdatestyle = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Ddnsupdatestyle;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Serveridentifier() {
    		if (ic_usr_Serveridentifier == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.serveridentifier");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Serveridentifier = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Serveridentifier;
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
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.allow");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Allow = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.allowmembersof");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Allowmembersof = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.deny");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Deny = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
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
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.denymembersof");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Denymembersof = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Denymembersof;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Defaultleasetime() {
    		if (ic_usr_Defaultleasetime == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.defaultleasetime");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Defaultleasetime = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Defaultleasetime;
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
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.maxleasetime");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Maxleasetime = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Maxleasetime;
    	}
			/**
		* 
		* DataType BOOLEAN
		* UIType CHECKBOX
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Getleasehostnames() {
    		if (ic_usr_Getleasehostnames == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.getleasehostnames");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.BooleanStringConverter();
    			ic_usr_Getleasehostnames = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Getleasehostnames;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Dynamicbootpleaselength() {
    		if (ic_usr_Dynamicbootpleaselength == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.dynamicbootpleaselength");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Dynamicbootpleaselength = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Dynamicbootpleaselength;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Bootunknownclients() {
    		if (ic_usr_Bootunknownclients == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.bootunknownclients");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Bootunknownclients = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Bootunknownclients;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Leaselimit() {
    		if (ic_usr_Leaselimit == null)
    		{
				String label = getAdapter().getBundle().getString("DHCPGlobalParamsContainer.leaselimit");
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
    			ic_usr_Leaselimit = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,label,"",converter);
    		}
    		return ic_usr_Leaselimit;
    	}
		
	
		
	public void trace(java.io.PrintWriter 	printStream, String listOptions, boolean title)
	{
		if (title)
		{
			printStream.println(getAdapter().getBundle().getString("DHCPGlobalParamsContainer.caption"));
		}
		
		if (showKey(listOptions))
		{
			String key = getKey() != null ? getKey().toString() : "-";
			printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
		}
	
		if (showInstance(listOptions))
		{
			   			   			if (get_usr_Range().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Range()).getValue();
        				printStream.println(get_usr_Range().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Usehostdeclnames().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Usehostdeclnames()).getValue();
        				printStream.println(get_usr_Usehostdeclnames().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Hardware().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Hardware()).getValue();
        				printStream.println(get_usr_Hardware().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Servername().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Servername()).getValue();
        				printStream.println(get_usr_Servername().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Nextserver().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Nextserver()).getValue();
        				printStream.println(get_usr_Nextserver().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Fixedaddress().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Fixedaddress()).getValue();
        				printStream.println(get_usr_Fixedaddress().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Ddnsupdatestyle().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Ddnsupdatestyle()).getValue();
        				printStream.println(get_usr_Ddnsupdatestyle().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Serveridentifier().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Serveridentifier()).getValue();
        				printStream.println(get_usr_Serveridentifier().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Allow().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Allow()).getValue();
        				printStream.println(get_usr_Allow().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Allowmembersof().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Allowmembersof()).getValue();
        				printStream.println(get_usr_Allowmembersof().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Deny().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Deny()).getValue();
        				printStream.println(get_usr_Deny().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Denymembersof().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Denymembersof()).getValue();
        				printStream.println(get_usr_Denymembersof().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Defaultleasetime().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Defaultleasetime()).getValue();
        				printStream.println(get_usr_Defaultleasetime().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Maxleasetime().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Maxleasetime()).getValue();
        				printStream.println(get_usr_Maxleasetime().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Getleasehostnames().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Getleasehostnames()).getValue();
        				printStream.println(get_usr_Getleasehostnames().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Dynamicbootpleaselength().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Dynamicbootpleaselength()).getValue();
        				printStream.println(get_usr_Dynamicbootpleaselength().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Bootunknownclients().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Bootunknownclients()).getValue();
        				printStream.println(get_usr_Bootunknownclients().getLabelText() + ": " + value);
   			}
   			   			   			if (get_usr_Leaselimit().isVisible())
   			{
        				Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf)get_usr_Leaselimit()).getValue();
        				printStream.println(get_usr_Leaselimit().getLabelText() + ": " + value);
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
    				fields.add(get_usr_Range());
    				fields.add(get_usr_Usehostdeclnames());
    				fields.add(get_usr_Hardware());
    				fields.add(get_usr_Servername());
    				fields.add(get_usr_Nextserver());
    				fields.add(get_usr_Fixedaddress());
    				fields.add(get_usr_Ddnsupdatestyle());
    				fields.add(get_usr_Serveridentifier());
    				fields.add(get_usr_Allow());
    				fields.add(get_usr_Allowmembersof());
    				fields.add(get_usr_Deny());
    				fields.add(get_usr_Denymembersof());
    				fields.add(get_usr_Defaultleasetime());
    				fields.add(get_usr_Maxleasetime());
    				fields.add(get_usr_Getleasehostnames());
    				fields.add(get_usr_Dynamicbootpleaselength());
    				fields.add(get_usr_Bootunknownclients());
    				fields.add(get_usr_Leaselimit());
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
		DHCPGlobalParamsContainerImpl source = (DHCPGlobalParamsContainerImpl)sourceContainer;
	
    	    		get_usr_Range().setValue(source.get_usr_Range().getValue());
		    		get_usr_Usehostdeclnames().setValue(source.get_usr_Usehostdeclnames().getValue());
		    		get_usr_Hardware().setValue(source.get_usr_Hardware().getValue());
		    		get_usr_Servername().setValue(source.get_usr_Servername().getValue());
		    		get_usr_Nextserver().setValue(source.get_usr_Nextserver().getValue());
		    		get_usr_Fixedaddress().setValue(source.get_usr_Fixedaddress().getValue());
		    		get_usr_Ddnsupdatestyle().setValue(source.get_usr_Ddnsupdatestyle().getValue());
		    		get_usr_Serveridentifier().setValue(source.get_usr_Serveridentifier().getValue());
		    		get_usr_Allow().setValue(source.get_usr_Allow().getValue());
		    		get_usr_Allowmembersof().setValue(source.get_usr_Allowmembersof().getValue());
		    		get_usr_Deny().setValue(source.get_usr_Deny().getValue());
		    		get_usr_Denymembersof().setValue(source.get_usr_Denymembersof().getValue());
		    		get_usr_Defaultleasetime().setValue(source.get_usr_Defaultleasetime().getValue());
		    		get_usr_Maxleasetime().setValue(source.get_usr_Maxleasetime().getValue());
		    		get_usr_Getleasehostnames().setValue(source.get_usr_Getleasehostnames().getValue());
		    		get_usr_Dynamicbootpleaselength().setValue(source.get_usr_Dynamicbootpleaselength().getValue());
		    		get_usr_Bootunknownclients().setValue(source.get_usr_Bootunknownclients().getValue());
		    		get_usr_Leaselimit().setValue(source.get_usr_Leaselimit().getValue());
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		
}