/** 
  * NewPoolWizard.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/cmd/wizardClass.vm
  *
  * Contributors: Prashanth Karnam <prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.container.wizard.cli;

import java.util.*;
import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.adapter.DataContainer;

import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.wizard.adapter.IPageWizardAdapter;
import org.sblim.wbemsmt.tools.wizard.cli.*;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;
import org.sblim.wbemsmt.exception.WbemSmtException;

public class NewPoolWizard extends CliWizardBase implements IPageWizardAdapter {

	static Logger logger = Logger.getLogger(NewPoolWizard.class.getName());
	private org.sblim.wbemsmt.dhcp.wizard.NewPoolWizardContainer container = null;
	
	public NewPoolWizard(final org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter) {
		super(adapter,ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesDhcp"},Locale.getDefault()));
		this.container = new org.sblim.wbemsmt.dhcp.wizard.NewPoolWizardContainer (adapter, new org.sblim.wbemsmt.dhcp.wizard.NewPoolWizardContainerPanels()
 			{
            					public Object getNewPool()  throws WbemSmtException {
					DataContainer dc = new org.sblim.wbemsmt.dhcp.bl.container.wizard.cli.NewPoolContainerImpl(adapter);
					return dc;
				}
            					public Object getNewPoolSummary()  throws WbemSmtException {
					DataContainer dc = new org.sblim.wbemsmt.dhcp.bl.container.wizard.cli.NewPoolSummaryContainerImpl(adapter);
					return dc;
				}
            	 			});
		super.initialize();
 		try {
 			super.initWizard((IWizardContainer)container, this);
 		} catch (Exception ex) {
 			ex.printStackTrace();
 			return;
 		}
 		logger.fine("Wizard initialized");
	}
	
	public void cleanUPPage(String panelName) {
		//cleanup is done in the adapter
	}
	
	public IWizardContainer getWizardContainer()
	{
		return container;
	}
}