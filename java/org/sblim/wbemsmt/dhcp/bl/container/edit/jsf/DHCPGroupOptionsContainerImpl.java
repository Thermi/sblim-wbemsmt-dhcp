/** 
  * DHCPGroupOptionsContainerImpl.java
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

public class DHCPGroupOptionsContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupOptionsContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Domainname;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Domainnameservers;

    		private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Routers;

    	
		
	
	public DHCPGroupOptionsContainerImpl(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter,String expressionPrefix) throws WbemsmtException  {

			
				super(adapter,expressionPrefix, "DHCPGroupOptionsContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Domainname());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Domainnameservers());
        	        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_usr_Routers());
        					
		setFooter(getPanelForCustomLayout(),"DHCPGroupOptionsContainer.footerText");
		adapter.initContainer(this);
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
				String label = bundle.getString("DHCPGroupOptionsContainer.domainname");
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Domainnameservers() {
    		if (ic_usr_Domainnameservers == null)
    		{
				String label = bundle.getString("DHCPGroupOptionsContainer.domainnameservers");
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

		public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Routers() {
    		if (ic_usr_Routers == null)
    		{
				String label = bundle.getString("DHCPGroupOptionsContainer.routers");
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
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_usr_Domainname != null)
    		{
				ic_usr_Domainname.setLabelText(bundle.getString("DHCPGroupOptionsContainer.domainname"));
    		}
	    		if (ic_usr_Domainnameservers != null)
    		{
				ic_usr_Domainnameservers.setLabelText(bundle.getString("DHCPGroupOptionsContainer.domainnameservers"));
    		}
	    		if (ic_usr_Routers != null)
    		{
				ic_usr_Routers.setLabelText(bundle.getString("DHCPGroupOptionsContainer.routers"));
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
    				fields.add(get_usr_Domainname());
    				fields.add(get_usr_Domainnameservers());
    				fields.add(get_usr_Routers());
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
	    		       DHCPGroupOptionsContainerImpl source = (DHCPGroupOptionsContainerImpl)sourceContainer;
		    		    
    	    		   get_usr_Domainname().copyFrom(source.get_usr_Domainname());
		        		   get_usr_Domainnameservers().copyFrom(source.get_usr_Domainnameservers());
		        		   get_usr_Routers().copyFrom(source.get_usr_Routers());
		    		
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}