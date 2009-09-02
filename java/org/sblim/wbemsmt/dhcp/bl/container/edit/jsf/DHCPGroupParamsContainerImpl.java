/** 
  * DHCPGroupParamsContainerImpl.java
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

public class DHCPGroupParamsContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupParamsContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Nextserver;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Filename;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Maxleasetime;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Defaultleasetime;

    	
		
	
	public DHCPGroupParamsContainerImpl(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "DHCPGroupParamsContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Nextserver());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Filename());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Maxleasetime());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Defaultleasetime());
        					
		setFooter(getPanelForCustomLayout(),"DHCPGroupParamsContainer.footerText");
		adapter.initContainer(this);
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
				String label = bundle.getString("DHCPGroupParamsContainer.nextserver");
				String binding = expressionPrefix + "_usr_Nextserver.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Nextserver = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Nextserver;
    	}
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Filename() {
    		if (ic_usr_Filename == null)
    		{
				String label = bundle.getString("DHCPGroupParamsContainer.filename");
				String binding = expressionPrefix + "_usr_Filename.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Filename = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Filename;
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
				String label = bundle.getString("DHCPGroupParamsContainer.maxleasetime");
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
			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Defaultleasetime() {
    		if (ic_usr_Defaultleasetime == null)
    		{
				String label = bundle.getString("DHCPGroupParamsContainer.defaultleasetime");
				String binding = expressionPrefix + "_usr_Defaultleasetime.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Defaultleasetime = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Defaultleasetime;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_Nextserver != null)
    		{
				ic_usr_Nextserver.setLabelText(bundle.getString("DHCPGroupParamsContainer.nextserver"));
    		}
	    		if (ic_usr_Filename != null)
    		{
				ic_usr_Filename.setLabelText(bundle.getString("DHCPGroupParamsContainer.filename"));
    		}
	    		if (ic_usr_Maxleasetime != null)
    		{
				ic_usr_Maxleasetime.setLabelText(bundle.getString("DHCPGroupParamsContainer.maxleasetime"));
    		}
	    		if (ic_usr_Defaultleasetime != null)
    		{
				ic_usr_Defaultleasetime.setLabelText(bundle.getString("DHCPGroupParamsContainer.defaultleasetime"));
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
    				fields.add(get_usr_Nextserver());
    				fields.add(get_usr_Filename());
    				fields.add(get_usr_Maxleasetime());
    				fields.add(get_usr_Defaultleasetime());
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
	    		       DHCPGroupParamsContainerImpl source = (DHCPGroupParamsContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_Nextserver().copyFrom(source.get_usr_Nextserver());
		        		   get_usr_Filename().copyFrom(source.get_usr_Filename());
		        		   get_usr_Maxleasetime().copyFrom(source.get_usr_Maxleasetime());
		        		   get_usr_Defaultleasetime().copyFrom(source.get_usr_Defaultleasetime());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}