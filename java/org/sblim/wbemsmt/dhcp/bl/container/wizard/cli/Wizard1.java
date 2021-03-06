/** 
  * Wizard1.java
  *

 
  * © Copyright IBM Corp.  2009,2007
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
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

import java.util.Locale;
import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.wizard.adapter.IPageWizardAdapter;
import org.sblim.wbemsmt.tools.wizard.cli.CliWizardBase;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;

public class Wizard1 extends CliWizardBase implements IPageWizardAdapter {

	static Logger logger = Logger.getLogger(Wizard1.class.getName());
	private org.sblim.wbemsmt.dhcp.wizard.WizardContainer1 container = null;
	
	public Wizard1(final org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter) {
		super(adapter,ResourceBundleManager.getResourceBundle(new String[]{"messages","messagesDhcp"},Locale.getDefault()));
		this.container = new org.sblim.wbemsmt.dhcp.wizard.WizardContainer1 (adapter, new org.sblim.wbemsmt.dhcp.wizard.WizardContainer1Panels()
 			{
            					public DataContainer getNewGroup()  throws WbemsmtException {
					DataContainer dc = new org.sblim.wbemsmt.dhcp.bl.container.wizard.cli.NewGroupContainerImpl(adapter);
					return dc;
				}
            	 			});
		super.initialize();
 		try {
 			super.initWizard(container, this);
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