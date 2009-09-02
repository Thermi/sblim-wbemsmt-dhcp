package org.sblim.wbemsmt.dhcp.bl.adapter;

import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewGroupContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetContainer;
import org.sblim.wbemsmt.dhcp.wizard.NewGroupWizardContainer;
import org.sblim.wbemsmt.dhcp.wizard.NewHostWizardContainer;
import org.sblim.wbemsmt.dhcp.wizard.NewPoolWizardContainer;
import org.sblim.wbemsmt.dhcp.wizard.NewSharednetWizardContainer;
import org.sblim.wbemsmt.dhcp.wizard.NewSubnetWizardContainer;
import org.sblim.wbemsmt.exception.WbemsmtException;

public class DhcpCimAdapterInitWizardDelegatee implements DhcpCimAdapterInitWizardIf {

	public void initWizardImpl ( NewGroupContainer container, NewGroupWizardContainer wizardContainer, String currentPagename ) throws WbemsmtException {
		
	}

	public void initWizardImpl ( NewHostContainer container, NewHostWizardContainer wizardContainer, String currentPagename ) throws WbemsmtException {
		System.out.println ("test");
	}

	public void initWizardImpl ( NewPoolContainer container, NewPoolWizardContainer wizardContainer, String currentPagename ) throws WbemsmtException {
		
	}

	public void initWizardImpl ( NewSharednetContainer container, NewSharednetWizardContainer wizardContainer, String currentPagename ) throws WbemsmtException {
		
	}

	public void initWizardImpl ( NewSubnetContainer container, NewSubnetWizardContainer wizardContainer, String currentPagename ) throws WbemsmtException {
		
	}

	
	
}
