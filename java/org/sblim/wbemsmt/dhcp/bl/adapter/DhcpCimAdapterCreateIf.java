/** 
 * DhcpCimAdapterCreateIf.java
 *
 * 
 * © Copyright IBM Corp. 2006,2007
 *
 * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceCreate.vm
 *
 * Contributors: 
 *   TODO add author by using vm argument -Ddcg.author=<email> during startup
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

/** 
 * This is the interface containing only the Create-Methods for the delegate
 **/

public interface DhcpCimAdapterCreateIf extends CreateDelegatee {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages", "messagesDhcp" };

    /** 
     * Create-Methods
     **/
    public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupsContainer container)
            throws WbemsmtException;

    public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostsContainer container)
            throws WbemsmtException;

    public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPOptionsContainer container)
            throws WbemsmtException;

    public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPParamsContainer container)
            throws WbemsmtException;

    public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolsContainer container)
            throws WbemsmtException;

    public void createImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetsContainer container)
            throws WbemsmtException;

    public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetsContainer container)
            throws WbemsmtException;

    public void createImpl(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewGroupContainer container)
            throws WbemsmtException;

    public void createImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer container)
            throws WbemsmtException;

    public void createImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolSummaryContainer container)
            throws WbemsmtException;

    public void createImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetSummaryContainer container)
            throws WbemsmtException;

    public void createImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetSummaryContainer container)
            throws WbemsmtException;

}