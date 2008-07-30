/** 
 * NewGroupContainerImpl.java
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

package org.sblim.wbemsmt.dhcp.bl.container.wizard.jsf;

import org.sblim.wbemsmt.exception.*;
import java.util.*;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;

public class NewGroupContainerImpl extends org.sblim.wbemsmt.tools.wizard.jsf.WizardBasePanel
        implements org.sblim.wbemsmt.dhcp.bl.container.wizard.NewGroupContainer {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_Name;

    public NewGroupContainerImpl(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "NewGroupContainer.caption", "NewGroupContainer.subTitle",
                false);

        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_Name());

        setFooter(getPanelForCustomLayout(), "NewGroupContainer.footerText");
        adapter.initContainer(this);
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly true
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Name() {
        if (ic_Name == null) {
            String label = bundle.getString("NewGroupContainer.Name");
            String binding = bindingPrefix + "_Name.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = true;
            ic_Name = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(parent,
                    label, binding, converter, readOnly);
            ;
        }

        return ic_Name;
    }

    public void reload() {
        super.reload();
        if (ic_Name != null) {
            ic_Name.setLabelText(bundle.getString("NewGroupContainer.Name"));
        }
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
        fields.add(get_Name());
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
        NewGroupContainerImpl source = (NewGroupContainerImpl) sourceContainer;

        get_Name().copyFrom(source.get_Name());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}