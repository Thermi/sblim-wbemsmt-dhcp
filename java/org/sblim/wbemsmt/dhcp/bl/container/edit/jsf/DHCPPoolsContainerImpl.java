/** 
  * DHCPPoolsContainerImpl.java
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

public class DHCPPoolsContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolsContainer
	{
			private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Name;
    	
		
	
	public DHCPPoolsContainerImpl(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter,String bindingPrefix) throws InitContainerException  {

			
				super(adapter,bindingPrefix, "DHCPPoolsContainer.caption",false);
				
				
		
				
    			
    	    		        		addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent)get_Name());
        					
		setFooter(getPanelForCustomLayout(),"DHCPPoolsContainer.footerText");
		adapter.initContainer(this);
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
				String label = bundle.getString("DHCPPoolsContainer.Name");
				String binding = bindingPrefix + "_Name.item";
				logger.fine("Using binding " + binding);
				org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
				org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
				boolean readOnly = false;
    			ic_Name = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,label,binding,converter, readOnly);
				;
    		}
			
						
    		return ic_Name;
    	}
		
	
		
	public void reload()
	{
		super.reload();
	    		if (ic_Name != null)
    		{
				ic_Name.setLabelText(bundle.getString("DHCPPoolsContainer.Name"));
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
    				fields.add(get_Name());
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
		DHCPPoolsContainerImpl source = (DHCPPoolsContainerImpl)sourceContainer;
	
    	    		get_Name().setValue(source.get_Name().getValue());
				
    	    		}
	
	public boolean isModified()
	{
    	return DataContainerUtil.isModified(this);
	}		

	
}