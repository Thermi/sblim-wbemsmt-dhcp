/** 
 * DHCPSubnetOptionsContainerImpl.java
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
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/containerImpl.vm
 *
 * Contributors: 
 *   TODO add author by using vm argument -Ddcg.author=<email> during startup
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.container.edit.cli;

import java.util.*;

import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class DHCPSubnetOptionsContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetOptionsContainer {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Subnetmask;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Broadcastaddress;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Domainnameservers;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Domainname;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Routers;

    public DHCPSubnetOptionsContainerImpl(AbstractBaseCimAdapter adapter) throws WbemsmtException {
        super();
        setAdapter(adapter);
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Subnetmask() {
        if (ic_usr_Subnetmask == null) {
            String label = getAdapter().getBundle().getString(
                    "DHCPSubnetOptionsContainer.subnetmask");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Subnetmask = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return ic_usr_Subnetmask;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Broadcastaddress() {
        if (ic_usr_Broadcastaddress == null) {
            String label = getAdapter().getBundle().getString(
                    "DHCPSubnetOptionsContainer.broadcastaddress");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Broadcastaddress = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return ic_usr_Broadcastaddress;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Domainnameservers() {
        if (ic_usr_Domainnameservers == null) {
            String label = getAdapter().getBundle().getString(
                    "DHCPSubnetOptionsContainer.domainnameservers");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Domainnameservers = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return ic_usr_Domainnameservers;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Domainname() {
        if (ic_usr_Domainname == null) {
            String label = getAdapter().getBundle().getString(
                    "DHCPSubnetOptionsContainer.domainname");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Domainname = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return ic_usr_Domainname;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Routers() {
        if (ic_usr_Routers == null) {
            String label = getAdapter().getBundle().getString("DHCPSubnetOptionsContainer.routers");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Routers = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, "", converter);
        }
        return ic_usr_Routers;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString(
                    "DHCPSubnetOptionsContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_usr_Subnetmask().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Subnetmask())
                        .getValue();
                printStream.println(get_usr_Subnetmask().getLabelText() + ": " + value);
            }
            if (get_usr_Broadcastaddress().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Broadcastaddress())
                        .getValue();
                printStream.println(get_usr_Broadcastaddress().getLabelText() + ": " + value);
            }
            if (get_usr_Domainnameservers().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Domainnameservers())
                        .getValue();
                printStream.println(get_usr_Domainnameservers().getLabelText() + ": " + value);
            }
            if (get_usr_Domainname().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Domainname())
                        .getValue();
                printStream.println(get_usr_Domainname().getLabelText() + ": " + value);
            }
            if (get_usr_Routers().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Routers())
                        .getValue();
                printStream.println(get_usr_Routers().getLabelText() + ": " + value);
            }
        }

        if (showChilds(listOptions)) {
            traceChilds(printStream, listOptions, title);
        }
    }

    public void traceChilds(java.io.PrintWriter printStream, String listOptions, boolean title) {

    }

    /**
     * Return a list of all Fields. A Field is a LabeledBaseInputComponentIf
     * @return
     */
    public List getFields() {
        List fields = new ArrayList();
        fields.add(get_usr_Subnetmask());
        fields.add(get_usr_Broadcastaddress());
        fields.add(get_usr_Domainnameservers());
        fields.add(get_usr_Domainname());
        fields.add(get_usr_Routers());
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
        DHCPSubnetOptionsContainerImpl source = (DHCPSubnetOptionsContainerImpl) sourceContainer;

        get_usr_Subnetmask().copyFrom(source.get_usr_Subnetmask());
        get_usr_Broadcastaddress().copyFrom(source.get_usr_Broadcastaddress());
        get_usr_Domainnameservers().copyFrom(source.get_usr_Domainnameservers());
        get_usr_Domainname().copyFrom(source.get_usr_Domainname());
        get_usr_Routers().copyFrom(source.get_usr_Routers());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}