/**
 * DhcpCimAdapterInstallValidatorsIf.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED
 * UNDER THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
 * DISTRIBUTION OF THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a
 * current copy of the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceInstallValidators.vm Contributors:
 *            Prashanth Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

/*
 * * This is the interface containing only the InstallValidator-Methods for the delegate
 */

public interface DhcpCimAdapterInstallValidatorsIf extends InstallValidatorsDelegatee {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages", "messagesDhcp" };

    /** 
     * InstallValidator-Methods
     **/
    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalParamsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupOptionsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupParamsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostOptionsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostParamsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPOptionsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPParamsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolOptionsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolParamsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednerOptionsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetParamsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetOptionsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetParamsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetsContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DhcpServiceConfContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewGroupContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolSummaryContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetSummaryContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetContainer container)
            throws WbemsmtException;

    public void installValidatorsImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetSummaryContainer container)
            throws WbemsmtException;

}