/** 
 * DhcpCimAdapterRevertIf.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceRevert.vm
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
import org.sblim.wbemsmt.bl.messages.MessageList;

import org.sblim.wbemsmt.exception.WbemsmtException;

/** 
 * This is the interface containing only the Revert-Methods for the delegate
 **/

public interface DhcpCimAdapterRevertIf extends RevertDelegatee {

    /** 
     * Revert-Methods
     **/
    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalParamsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupOptionsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupParamsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostOptionsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostParamsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPOptionsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPParamsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolOptionsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolParamsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednerOptionsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetParamsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetOptionsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetParamsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetsContainer container)
            throws WbemsmtException;

    public MessageList revertImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DhcpServiceConfContainer container)
            throws WbemsmtException;

}