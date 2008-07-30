/** 
 * DHCPGroupsContainerImpl.java
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
 * @author: org.sblim.wbemsmt.dcg.generator.jsf.JSFPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/jsf/containerImpl.vm
 *
 * Contributors: 
 *   TODO add author by using vm argument -Ddcg.author=<email> during startup
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.container.edit.jsf;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class DHCPGroupsContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel implements
        org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupsContainer {

    public DHCPGroupsContainerImpl(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "DHCPGroupsContainer.caption", false);

        setFooter(getPanelForCustomLayout(), "DHCPGroupsContainer.footerText");
        adapter.initContainer(this);
    }

    public void reload() {
        super.reload();
    }

    public String[] getResourceBundleNames() {
        return new String[] { "messages", "messagesDhcp" };
    }

    public void countAndCreateChildren() throws WbemsmtException {

    }

    /**
     * count and create childrens
     * @throws WbemsmtException
     */
    public void updateControls() throws WbemsmtException {
        countAndCreateChildren();
        adapter.updateControls(this);

    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        return fields;
    }

    /**
     * Return a list of all associated childContainers. A childContainer is a DataContainer
     * @return
     */
    public List getChildContainers() {
        List childs = new ArrayList();
        return childs;

    }

    public void copyFrom(DataContainer sourceContainer) throws WbemsmtException {

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}