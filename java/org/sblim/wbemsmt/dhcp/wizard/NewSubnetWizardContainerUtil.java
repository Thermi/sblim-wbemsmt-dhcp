/** 
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
  * @author: Prashanth Karnam <prkarnam@in.ibm.com>
  * 
  * Description: WizardContainer for 
  * 
  */

package org.sblim.wbemsmt.dhcp.wizard;

import java.util.HashMap;
import java.util.Map;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.wizard.WizardContainerUtil;
import org.sblim.wbemsmt.tools.wizard.WizardStepList;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;

public class NewSubnetWizardContainerUtil extends WizardContainerUtil {

	private String[] panelNames = {NewSubnetWizardContainer.WIZARD_PANEL_NEWSUBNET,NewSubnetWizardContainer.WIZARD_PANEL_NEWSUBNETSUMMARY};
	
	public void addInitialWizardSteps ( IWizardContainer wizardContainer, WizardStepList stepList, HashMap<String, DataContainer> hmPages ) {
		super.addInitialWizardStepsDefault(wizardContainer, stepList, panelNames);
	}

	public String getNextPanel ( String currentPageName, Map<String, DataContainer> hmPages ) {
		return super.getNextPanelDefault ( currentPageName, panelNames );
	}

}
