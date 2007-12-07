/** 
  * WelcomeListener.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/jsf/welcomeListener.vm
  *
  * Contributors: Prashanth Karnam <prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.listener.jsf;

import javax.faces.context.FacesContext;
import javax.faces.component.html.*;

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.bl.welcome.*;
import org.sblim.wbemsmt.exception.WbemSmtException;
import javax.faces.component.UIComponentBase;

import org.apache.myfaces.custom.div.Div;



public class WelcomeListener implements JsfWelcomeListener {

	HtmlPanelGrid panel;
	DataContainer dataContainer;

		   	public void create(String bindingPrefix, CIMClient cimClient) throws WbemSmtException
   	{
   	   try
   	   {
   	       org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter = 
	         					   (org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter)CimAdapterFactory.getInstance()
            					.getAdapter(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter.class,FacesContext.getCurrentInstance(),cimClient);
   	       //create container
          			org.sblim.wbemsmt.dhcp.bl.container.edit.jsf.WelcomeContainerImpl container = new org.sblim.wbemsmt.dhcp.bl.container.edit.jsf.WelcomeContainerImpl(adapter,bindingPrefix);
     				     container.getPanelForCustomLayout().setStyleClass("mainTable");

				//update the container and children objects
				container.updateControls();
	
				this.dataContainer = container;
				panel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);

	          						                			container.getLayouter().layout(container.getPanelForCustomLayout(),container ,adapter.getBundle());
	          	

				HtmlPanelGrid containerPanel = (HtmlPanelGrid)container.getInputFieldContainer();
    			
    			HtmlPanelGrid childEditFields = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
				childEditFields.setStyleClass("childTable");
    			

				//add the single childs
								
				//add the childs with occurence list
            					
				Div div = (Div) FacesContext.getCurrentInstance().getApplication().createComponent(Div.COMPONENT_TYPE);
				div.setStyleClass("divWrappingChildTable");
				div.getChildren().add(childEditFields);
				
				containerPanel.getChildren().add(div);
				
				UIComponentBase panelToAdd = null;
									panelToAdd = containerPanel;
								
    			
				panel.getChildren().add(panelToAdd);
     				     
      		} catch (Exception e) {
          throw new WbemSmtException("Cannot process Event with listener " + getClass().getName(),e);
      		} 
   }
   
	   public org.sblim.wbemsmt.bl.welcome.WelcomeListener getListenerByPlType() throws WbemSmtException {
      		return this;
   	}
   	
	public UIComponentBase getPanel()
	{
		return panel;
	}
	
	public DataContainer getContainer()
	{
		return dataContainer;
	}
}