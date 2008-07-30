/** 
 * DHCPGlobalParamsContainerImpl.java
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

public class DHCPGlobalParamsContainerImpl extends org.sblim.wbemsmt.tools.jsf.EditBasePanel
        implements org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalParamsContainer {
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Range;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Usehostdeclnames;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Hardware;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Servername;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Nextserver;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Fixedaddress;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Ddnsupdatestyle;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Serveridentifier;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Allow;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Allowmembersof;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Deny;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Denymembersof;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Defaultleasetime;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Maxleasetime;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Getleasehostnames;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Dynamicbootpleaselength;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Bootunknownclients;
    private org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf ic_usr_Leaselimit;

    public DHCPGlobalParamsContainerImpl(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter adapter,
            String bindingPrefix) throws WbemsmtException {

        super(adapter, bindingPrefix, "DHCPGlobalParamsContainer.caption", false);

        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Range());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Usehostdeclnames());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Hardware());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Servername());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Nextserver());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Fixedaddress());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Ddnsupdatestyle());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Serveridentifier());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Allow());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Allowmembersof());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Deny());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Denymembersof());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Defaultleasetime());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Maxleasetime());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Getleasehostnames());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Dynamicbootpleaselength());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Bootunknownclients());
        addComponent((org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent) get_usr_Leaselimit());

        setFooter(getPanelForCustomLayout(), "DHCPGlobalParamsContainer.footerText");
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
            String label = bundle.getString("DHCPGlobalParamsContainer.range");
            String binding = bindingPrefix + "_usr_Range.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Range = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Range;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Usehostdeclnames() {
        if (ic_usr_Usehostdeclnames == null) {
            String label = bundle.getString("DHCPGlobalParamsContainer.usehostdeclnames");
            String binding = bindingPrefix + "_usr_Usehostdeclnames.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Usehostdeclnames = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Usehostdeclnames;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Hardware() {
        if (ic_usr_Hardware == null) {
            String label = bundle.getString("DHCPGlobalParamsContainer.hardware");
            String binding = bindingPrefix + "_usr_Hardware.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Hardware = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Hardware;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Servername() {
        if (ic_usr_Servername == null) {
            String label = bundle.getString("DHCPGlobalParamsContainer.servername");
            String binding = bindingPrefix + "_usr_Servername.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Servername = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Servername;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Nextserver() {
        if (ic_usr_Nextserver == null) {
            String label = bundle.getString("DHCPGlobalParamsContainer.nextserver");
            String binding = bindingPrefix + "_usr_Nextserver.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Nextserver = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Nextserver;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Fixedaddress() {
        if (ic_usr_Fixedaddress == null) {
            String label = bundle.getString("DHCPGlobalParamsContainer.fixedaddress");
            String binding = bindingPrefix + "_usr_Fixedaddress.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Fixedaddress = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Fixedaddress;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Ddnsupdatestyle() {
        if (ic_usr_Ddnsupdatestyle == null) {
            String label = bundle.getString("DHCPGlobalParamsContainer.ddnsupdatestyle");
            String binding = bindingPrefix + "_usr_Ddnsupdatestyle.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Ddnsupdatestyle = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Ddnsupdatestyle;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Serveridentifier() {
        if (ic_usr_Serveridentifier == null) {
            String label = bundle.getString("DHCPGlobalParamsContainer.serveridentifier");
            String binding = bindingPrefix + "_usr_Serveridentifier.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Serveridentifier = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Serveridentifier;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Allow() {
        if (ic_usr_Allow == null) {
            String label = bundle.getString("DHCPGlobalParamsContainer.allow");
            String binding = bindingPrefix + "_usr_Allow.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Allow = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
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
            String label = bundle.getString("DHCPGlobalParamsContainer.allowmembersof");
            String binding = bindingPrefix + "_usr_Allowmembersof.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Allowmembersof = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
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
            String label = bundle.getString("DHCPGlobalParamsContainer.deny");
            String binding = bindingPrefix + "_usr_Deny.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Deny = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
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
            String label = bundle.getString("DHCPGlobalParamsContainer.denymembersof");
            String binding = bindingPrefix + "_usr_Denymembersof.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Denymembersof = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Denymembersof;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Defaultleasetime() {
        if (ic_usr_Defaultleasetime == null) {
            String label = bundle.getString("DHCPGlobalParamsContainer.defaultleasetime");
            String binding = bindingPrefix + "_usr_Defaultleasetime.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Defaultleasetime = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Defaultleasetime;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Maxleasetime() {
        if (ic_usr_Maxleasetime == null) {
            String label = bundle.getString("DHCPGlobalParamsContainer.maxleasetime");
            String binding = bindingPrefix + "_usr_Maxleasetime.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Maxleasetime = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Maxleasetime;
    }

    /**
     * 
     * DataType BOOLEAN
     * UIType CHECKBOX
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Getleasehostnames() {
        if (ic_usr_Getleasehostnames == null) {
            String label = bundle.getString("DHCPGlobalParamsContainer.getleasehostnames");
            String binding = bindingPrefix + "_usr_Getleasehostnames.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Getleasehostnames = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFCheckboxComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Getleasehostnames;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Dynamicbootpleaselength() {
        if (ic_usr_Dynamicbootpleaselength == null) {
            String label = bundle.getString("DHCPGlobalParamsContainer.dynamicbootpleaselength");
            String binding = bindingPrefix + "_usr_Dynamicbootpleaselength.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Dynamicbootpleaselength = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Dynamicbootpleaselength;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Bootunknownclients() {
        if (ic_usr_Bootunknownclients == null) {
            String label = bundle.getString("DHCPGlobalParamsContainer.bootunknownclients");
            String binding = bindingPrefix + "_usr_Bootunknownclients.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Bootunknownclients = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Bootunknownclients;
    }

    /**
     * 
     * DataType STRING
     * UIType TEXTFIELD
     * ReadOnly false
     */

    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_usr_Leaselimit() {
        if (ic_usr_Leaselimit == null) {
            String label = bundle.getString("DHCPGlobalParamsContainer.leaselimit");
            String binding = bindingPrefix + "_usr_Leaselimit.item";
            logger.fine("Using binding " + binding);
            org.sblim.wbemsmt.bl.adapter.DataContainer parent = this;
            org.sblim.wbemsmt.tools.converter.Converter converter = new org.sblim.wbemsmt.tools.converter.test.DummyConverter();
            boolean readOnly = false;
            ic_usr_Leaselimit = new org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputFieldComponent(
                    parent, label, binding, converter, readOnly);
            ;
        }

        return ic_usr_Leaselimit;
    }

    public void reload() {
        super.reload();
        if (ic_usr_Range != null) {
            ic_usr_Range.setLabelText(bundle.getString("DHCPGlobalParamsContainer.range"));
        }
        if (ic_usr_Usehostdeclnames != null) {
            ic_usr_Usehostdeclnames.setLabelText(bundle
                    .getString("DHCPGlobalParamsContainer.usehostdeclnames"));
        }
        if (ic_usr_Hardware != null) {
            ic_usr_Hardware.setLabelText(bundle.getString("DHCPGlobalParamsContainer.hardware"));
        }
        if (ic_usr_Servername != null) {
            ic_usr_Servername
                    .setLabelText(bundle.getString("DHCPGlobalParamsContainer.servername"));
        }
        if (ic_usr_Nextserver != null) {
            ic_usr_Nextserver
                    .setLabelText(bundle.getString("DHCPGlobalParamsContainer.nextserver"));
        }
        if (ic_usr_Fixedaddress != null) {
            ic_usr_Fixedaddress.setLabelText(bundle
                    .getString("DHCPGlobalParamsContainer.fixedaddress"));
        }
        if (ic_usr_Ddnsupdatestyle != null) {
            ic_usr_Ddnsupdatestyle.setLabelText(bundle
                    .getString("DHCPGlobalParamsContainer.ddnsupdatestyle"));
        }
        if (ic_usr_Serveridentifier != null) {
            ic_usr_Serveridentifier.setLabelText(bundle
                    .getString("DHCPGlobalParamsContainer.serveridentifier"));
        }
        if (ic_usr_Allow != null) {
            ic_usr_Allow.setLabelText(bundle.getString("DHCPGlobalParamsContainer.allow"));
        }
        if (ic_usr_Allowmembersof != null) {
            ic_usr_Allowmembersof.setLabelText(bundle
                    .getString("DHCPGlobalParamsContainer.allowmembersof"));
        }
        if (ic_usr_Deny != null) {
            ic_usr_Deny.setLabelText(bundle.getString("DHCPGlobalParamsContainer.deny"));
        }
        if (ic_usr_Denymembersof != null) {
            ic_usr_Denymembersof.setLabelText(bundle
                    .getString("DHCPGlobalParamsContainer.denymembersof"));
        }
        if (ic_usr_Defaultleasetime != null) {
            ic_usr_Defaultleasetime.setLabelText(bundle
                    .getString("DHCPGlobalParamsContainer.defaultleasetime"));
        }
        if (ic_usr_Maxleasetime != null) {
            ic_usr_Maxleasetime.setLabelText(bundle
                    .getString("DHCPGlobalParamsContainer.maxleasetime"));
        }
        if (ic_usr_Getleasehostnames != null) {
            ic_usr_Getleasehostnames.setLabelText(bundle
                    .getString("DHCPGlobalParamsContainer.getleasehostnames"));
        }
        if (ic_usr_Dynamicbootpleaselength != null) {
            ic_usr_Dynamicbootpleaselength.setLabelText(bundle
                    .getString("DHCPGlobalParamsContainer.dynamicbootpleaselength"));
        }
        if (ic_usr_Bootunknownclients != null) {
            ic_usr_Bootunknownclients.setLabelText(bundle
                    .getString("DHCPGlobalParamsContainer.bootunknownclients"));
        }
        if (ic_usr_Leaselimit != null) {
            ic_usr_Leaselimit
                    .setLabelText(bundle.getString("DHCPGlobalParamsContainer.leaselimit"));
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
        fields.add(get_usr_Range());
        fields.add(get_usr_Usehostdeclnames());
        fields.add(get_usr_Hardware());
        fields.add(get_usr_Servername());
        fields.add(get_usr_Nextserver());
        fields.add(get_usr_Fixedaddress());
        fields.add(get_usr_Ddnsupdatestyle());
        fields.add(get_usr_Serveridentifier());
        fields.add(get_usr_Allow());
        fields.add(get_usr_Allowmembersof());
        fields.add(get_usr_Deny());
        fields.add(get_usr_Denymembersof());
        fields.add(get_usr_Defaultleasetime());
        fields.add(get_usr_Maxleasetime());
        fields.add(get_usr_Getleasehostnames());
        fields.add(get_usr_Dynamicbootpleaselength());
        fields.add(get_usr_Bootunknownclients());
        fields.add(get_usr_Leaselimit());
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
        DHCPGlobalParamsContainerImpl source = (DHCPGlobalParamsContainerImpl) sourceContainer;

        get_usr_Range().copyFrom(source.get_usr_Range());
        get_usr_Usehostdeclnames().copyFrom(source.get_usr_Usehostdeclnames());
        get_usr_Hardware().copyFrom(source.get_usr_Hardware());
        get_usr_Servername().copyFrom(source.get_usr_Servername());
        get_usr_Nextserver().copyFrom(source.get_usr_Nextserver());
        get_usr_Fixedaddress().copyFrom(source.get_usr_Fixedaddress());
        get_usr_Ddnsupdatestyle().copyFrom(source.get_usr_Ddnsupdatestyle());
        get_usr_Serveridentifier().copyFrom(source.get_usr_Serveridentifier());
        get_usr_Allow().copyFrom(source.get_usr_Allow());
        get_usr_Allowmembersof().copyFrom(source.get_usr_Allowmembersof());
        get_usr_Deny().copyFrom(source.get_usr_Deny());
        get_usr_Denymembersof().copyFrom(source.get_usr_Denymembersof());
        get_usr_Defaultleasetime().copyFrom(source.get_usr_Defaultleasetime());
        get_usr_Maxleasetime().copyFrom(source.get_usr_Maxleasetime());
        get_usr_Getleasehostnames().copyFrom(source.get_usr_Getleasehostnames());
        get_usr_Dynamicbootpleaselength().copyFrom(source.get_usr_Dynamicbootpleaselength());
        get_usr_Bootunknownclients().copyFrom(source.get_usr_Bootunknownclients());
        get_usr_Leaselimit().copyFrom(source.get_usr_Leaselimit());

    }

    public boolean isModified() {
        return DataContainerUtil.isModified(this);
    }

}