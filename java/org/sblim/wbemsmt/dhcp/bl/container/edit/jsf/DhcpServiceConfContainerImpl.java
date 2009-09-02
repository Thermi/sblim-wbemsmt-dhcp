/** 
  * DhcpServiceConfContainerImpl.java
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

public class DhcpServiceConfContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.dhcp.bl.container.edit.DhcpServiceConfContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_ConfigurationFile;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_invoke_StartService;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_invoke_StopService;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Restartservice;

    	
		
	
	public DhcpServiceConfContainerImpl(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "DhcpServiceConfContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_ConfigurationFile());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_invoke_StartService());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_invoke_StopService());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Restartservice());
        					
		setFooter(getPanelForCustomLayout(),"DhcpServiceConfContainer.footerText");
		adapter.initContainer(this);
	}
	

			/**
		* 
		* DataType STRING
		* UIType TEXTFIELD
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_ConfigurationFile() {
    		if (ic_ConfigurationFile == null)
    		{
				String label = bundle.getString("DhcpServiceConfContainer.ConfigurationFile");
				String binding = expressionPrefix + "_ConfigurationFile.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_ConfigurationFile = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
								ic_ConfigurationFile.setRequired(true);
				;
    		}
			
						
    		return ic_ConfigurationFile;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_invoke_StartService() {
    		if (ic_invoke_StartService == null)
    		{
				String label = bundle.getString("DhcpServiceConfContainer.startService");
				String binding = expressionPrefix + "_invoke_StartService.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_invoke_StartService = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_invoke_StartService;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_invoke_StopService() {
    		if (ic_invoke_StopService == null)
    		{
				String label = bundle.getString("DhcpServiceConfContainer.stopService");
				String binding = expressionPrefix + "_invoke_StopService.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_invoke_StopService = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_invoke_StopService;
    	}
			/**
		* 
		* DataType ACTION
		* UIType BUTTON
		* ReadOnly false
		*/

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Restartservice() {
    		if (ic_usr_Restartservice == null)
    		{
				String label = bundle.getString("DhcpServiceConfContainer.restartservice");
				String binding = expressionPrefix + "_usr_Restartservice.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_usr_Restartservice = new org.sblim.wbemsmt.tools.input.jsf.JSFButtonComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_usr_Restartservice;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_ConfigurationFile != null)
    		{
				ic_ConfigurationFile.setLabelText(bundle.getString("DhcpServiceConfContainer.ConfigurationFile"));
    		}
	    		if (ic_invoke_StartService != null)
    		{
				ic_invoke_StartService.setLabelText(bundle.getString("DhcpServiceConfContainer.startService"));
    		}
	    		if (ic_invoke_StopService != null)
    		{
				ic_invoke_StopService.setLabelText(bundle.getString("DhcpServiceConfContainer.stopService"));
    		}
	    		if (ic_usr_Restartservice != null)
    		{
				ic_usr_Restartservice.setLabelText(bundle.getString("DhcpServiceConfContainer.restartservice"));
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
    				fields.add(get_ConfigurationFile());
    				fields.add(get_invoke_StartService());
    				fields.add(get_invoke_StopService());
    				fields.add(get_usr_Restartservice());
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
	    		       DhcpServiceConfContainerImpl source = (DhcpServiceConfContainerImpl)sourceContainer;
		    		    
    	    		   get_ConfigurationFile().copyFrom(source.get_ConfigurationFile());
		        		   get_invoke_StartService().copyFrom(source.get_invoke_StartService());
		        		   get_invoke_StopService().copyFrom(source.get_invoke_StopService());
		        		   get_usr_Restartservice().copyFrom(source.get_usr_Restartservice());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}