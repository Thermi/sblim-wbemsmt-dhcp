/** 
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
  * @author: Prashanth Karnam <prkarnam@in.ibm.com>
  * 
  * Description: WizardContainer for 
  * 
  */

package org.sblim.wbemsmt.dhcp.wizard;

import java.util.HashMap;
import java.util.Map;

import org.sblim.wbemsmt.tools.wizard.WizardContainerUtil;
import org.sblim.wbemsmt.tools.wizard.WizardStepList;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;

public class NewHostWizardContainerUtil extends WizardContainerUtil {

	private String[] panelNames = {NewHostWizardContainer.WIZARD_PANEL_NEWHOST,NewHostWizardContainer.WIZARD_PANEL_NEWHOSTSUMMARY};
	
	public void addInitialWizardSteps ( IWizardContainer wizardContainer, WizardStepList stepList, HashMap hmPages ) {
		super.addInitialWizardStepsDefault(wizardContainer, stepList, panelNames);
	}

	public String getNextPanel ( String currentPageName, Map hmPages ) {
		return super.getNextPanelDefault ( currentPageName, panelNames);
	}

}
