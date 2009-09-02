/**
 * DhcpCimAdapterDeleteIf.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER
 * MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.AdapterStubGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/adapterInterfaceDelete.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.adapter;

import org.sblim.wbemsmt.bl.adapter.*;

import org.sblim.wbemsmt.exception.WbemsmtException;

/*
 * * This is the interface containing only the Delete-Methods for the delegate
 */

public interface DhcpCimAdapterDeleteIf extends DeleteDelegatee {

    public static final String[] RESOURCE_BUNDLE_NAMES = new String[] { "messages", "messagesDhcp" };

    /** 
     * Delete-Methods
     **/
    public void deleteImpl(org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPHost fco)
            throws WbemsmtException;

    public void deleteImpl(org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptions fco)
            throws WbemsmtException;

    public void deleteImpl(org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParams fco)
            throws WbemsmtException;

    public void deleteImpl(org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPPool fco)
            throws WbemsmtException;

    public void deleteImpl(org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSharednet fco)
            throws WbemsmtException;

    public void deleteImpl(org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSubnet fco)
            throws WbemsmtException;
}