/** 
  * DhcpCimAdapterInitWizardIf.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceInitWizard.vm
  *
  * Contributors: Prashanth Karnam <pkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

	/** 
	 * This is the interface containing only the initWizard-Methods for the delegate
	 **/

public interface DhcpCimAdapterInitWizardIf extends InitWizardDelegatee
{

	public static final String[] RESOURCE_BUNDLE_NAMES = new String[]{"messages","messagesDhcp"};

	/** 
	 * UpdateControls-Methods
	 **/
			
public void initWizardImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewGroupContainer container,org.sblim.wbemsmt.dhcp.wizard.NewGroupWizardContainer wizardContainer, String currentPagename) throws org.sblim.wbemsmt.exception.InitWizardException;
			
public void initWizardImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer container,org.sblim.wbemsmt.dhcp.wizard.NewHostWizardContainer wizardContainer, String currentPagename) throws org.sblim.wbemsmt.exception.InitWizardException;
			
public void initWizardImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolContainer container,org.sblim.wbemsmt.dhcp.wizard.NewPoolWizardContainer wizardContainer, String currentPagename) throws org.sblim.wbemsmt.exception.InitWizardException;
			
public void initWizardImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetContainer container,org.sblim.wbemsmt.dhcp.wizard.NewSharednetWizardContainer wizardContainer, String currentPagename) throws org.sblim.wbemsmt.exception.InitWizardException;
			
public void initWizardImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetContainer container,org.sblim.wbemsmt.dhcp.wizard.NewSubnetWizardContainer wizardContainer, String currentPagename) throws org.sblim.wbemsmt.exception.InitWizardException;
	}