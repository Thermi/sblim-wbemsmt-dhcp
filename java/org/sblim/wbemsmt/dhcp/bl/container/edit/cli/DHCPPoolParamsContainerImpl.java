/** 
 * DHCPPoolParamsContainerImpl.java
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

public class DHCPPoolParamsContainerImpl extends BaseDataContainer implements
        org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolParamsContainer {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Range;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Allow;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Allowmembersof;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Deny;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Denymembersof;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Maxleasetime;

    public DHCPPoolParamsContainerImpl(AbstractBaseCimAdapter adapter) throws WbemsmtException {
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

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Range() {
        if (ic_usr_Range == null) {
            String label = getAdapter().getBundle().getString("DHCPPoolParamsContainer.range");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Range = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, "", converter);
        }
        return ic_usr_Range;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Allow() {
        if (ic_usr_Allow == null) {
            String label = getAdapter().getBundle().getString("DHCPPoolParamsContainer.allow");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Allow = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, "", converter);
        }
        return ic_usr_Allow;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Allowmembersof() {
        if (ic_usr_Allowmembersof == null) {
            String label = getAdapter().getBundle().getString(
                    "DHCPPoolParamsContainer.allowmembersof");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Allowmembersof = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return ic_usr_Allowmembersof;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Deny() {
        if (ic_usr_Deny == null) {
            String label = getAdapter().getBundle().getString("DHCPPoolParamsContainer.deny");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Deny = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(this,
                    label, "", converter);
        }
        return ic_usr_Deny;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Denymembersof() {
        if (ic_usr_Denymembersof == null) {
            String label = getAdapter().getBundle().getString(
                    "DHCPPoolParamsContainer.denymembersof");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Denymembersof = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return ic_usr_Denymembersof;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Maxleasetime() {
        if (ic_usr_Maxleasetime == null) {
            String label = getAdapter().getBundle().getString(
                    "DHCPPoolParamsContainer.maxleasetime");
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            ic_usr_Maxleasetime = new org.sblim.wbemsmt.tools.input.test.LabeledTestInputComponent(
                    this, label, "", converter);
        }
        return ic_usr_Maxleasetime;
    }

    public void trace(java.io.PrintWriter printStream, String listOptions, boolean title) {
        if (title) {
            printStream.println(getAdapter().getBundle().getString(
                    "DHCPPoolParamsContainer.caption"));
        }

        if (showKey(listOptions)) {
            String key = getKey() != null ? getKey().toString() : "-";
            printStream.println(getAdapter().getBundle().getString("key") + ": " + key + "\n");
        }

        if (showInstance(listOptions)) {
            if (get_usr_Range().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Range())
                        .getValue();
                printStream.println(get_usr_Range().getLabelText() + ": " + value);
            }
            if (get_usr_Allow().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Allow())
                        .getValue();
                printStream.println(get_usr_Allow().getLabelText() + ": " + value);
            }
            if (get_usr_Allowmembersof().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Allowmembersof())
                        .getValue();
                printStream.println(get_usr_Allowmembersof().getLabelText() + ": " + value);
            }
            if (get_usr_Deny().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Deny())
                        .getValue();
                printStream.println(get_usr_Deny().getLabelText() + ": " + value);
            }
            if (get_usr_Denymembersof().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Denymembersof())
                        .getValue();
                printStream.println(get_usr_Denymembersof().getLabelText() + ": " + value);
            }
            if (get_usr_Maxleasetime().isVisible()) {
                Object value = ((org.sblim.wbemsmt.tools.input.test.TestInputComponentIf) get_usr_Maxleasetime())
                        .getValue();
                printStream.println(get_usr_Maxleasetime().getLabelText() + ": " + value);
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
        fields.add(get_usr_Range());
        fields.add(get_usr_Allow());
        fields.add(get_usr_Allowmembersof());
        fields.add(get_usr_Deny());
        fields.add(get_usr_Denymembersof());
        fields.add(get_usr_Maxleasetime());
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
        DHCPPoolParamsContainerImpl source = (DHCPPoolParamsContainerImpl) sourceContainer;

        get_usr_Range().copyFrom(source.get_usr_Range());
        get_usr_Allow().copyFrom(source.get_usr_Allow());
        get_usr_Allowmembersof().copyFrom(source.get_usr_Allowmembersof());
        get_usr_Deny().copyFrom(source.get_usr_Deny());
        get_usr_Denymembersof().copyFrom(source.get_usr_Denymembersof());
        get_usr_Maxleasetime().copyFrom(source.get_usr_Maxleasetime());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }
}