/**
 * DhcpCimAdapterInitWizardIf.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE
 * TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceInitWizard.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

/*
 * * This is the interface containing only the initWizard-Methods for the delegate
 */

public interface DhcpCimAdapterInitWizardIf extends InitWizardDelegatee {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages", "messagesDhcp" };

    /** 
     * UpdateControls-Methods
     **/

    public void initWizardImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewGroupContainer container,
            org.sblim.wbemsmt.dhcp.wizard.NewGroupWizardContainer wizardContainer,
            String currentPagename) throws WbemsmtException;

    public void initWizardImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer container,
            org.sblim.wbemsmt.dhcp.wizard.NewHostWizardContainer wizardContainer,
            String currentPagename) throws WbemsmtException;

    public void initWizardImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolContainer container,
            org.sblim.wbemsmt.dhcp.wizard.NewPoolWizardContainer wizardContainer,
            String currentPagename) throws WbemsmtException;

    public void initWizardImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetContainer container,
            org.sblim.wbemsmt.dhcp.wizard.NewSharednetWizardContainer wizardContainer,
            String currentPagename) throws WbemsmtException;

    public void initWizardImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetContainer container,
            org.sblim.wbemsmt.dhcp.wizard.NewSubnetWizardContainer wizardContainer,
            String currentPagename) throws WbemsmtException;
}