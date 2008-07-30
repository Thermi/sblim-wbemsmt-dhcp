/** 
 * DhcpCimAdapterUpdateModelIf.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceUpdateModel.vm
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
 * This is the interface containing only the updateModel-Methods for the delegate
 **/

public interface DhcpCimAdapterUpdateModelIf extends UpdateModelDelegatee {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages", "messagesDhcp" };

    /** 
     * UpdateModel-Methods
     **/
    public void updateModelImpl(
            org.sblim.wbemsmt.dhcp.bl.container.edit.DhcpServiceConfContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetContainer container)
            throws WbemsmtException;

    public void updateModelImpl(
            org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetContainer container)
            throws WbemsmtException;

}