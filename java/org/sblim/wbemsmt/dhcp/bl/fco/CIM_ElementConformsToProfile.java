/**
 * CIM_ElementConformsToProfile.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER
 * THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF
 * THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of
 * the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: The CIM_ElementConformsToProfile association
 *            defines the RegisteredProfiles to which the referenced ManagedElement is conformant.
 *            Note: This association may apply to any Managed Element. Typical usage will apply it
 *            to a higher level instance, such as a System, NameSpace, or Service. When applied to a
 *            higher level instance, all constituent parts MUST behave appropriately in support of
 *            the ManagedElement's conformance to the named RegisteredProfile. generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ElementConformsToProfile extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_ElementConformsToProfile";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ConformantStandard
     * 
     */
    public static class PROPERTY_CONFORMANTSTANDARD_CIM_REGISTEREDPROFILE {
        /**
         * name of the property ConformantStandard
         */
        public final static String NAME = "ConformantStandard";

    }

    /**
     * Constants of property ManagedElement
     * 
     */
    public static class PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT {
        /**
         * name of the property ManagedElement
         */
        public final static String NAME = "ManagedElement";

    }

    static {
        addPackage("org.sblim.wbemsmt.dhcp.bl.fco");

    };

    //**********************************************************************
    // Constructors     
    //**********************************************************************

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The CIM_ElementConformsToProfile association defines the RegisteredProfiles to which the referenced ManagedElement is conformant. Note: This association may apply to any Managed Element. Typical usage will apply it to a higher level instance, such as a System, NameSpace, or Service. When applied to a higher level instance, all constituent parts MUST behave appropriately in support of the ManagedElement's conformance to the named RegisteredProfile.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ElementConformsToProfile(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The CIM_ElementConformsToProfile association defines the RegisteredProfiles to which the referenced ManagedElement is conformant. Note: This association may apply to any Managed Element. Typical usage will apply it to a higher level instance, such as a System, NameSpace, or Service. When applied to a higher level instance, all constituent parts MUST behave appropriately in support of the ManagedElement's conformance to the named RegisteredProfile.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ElementConformsToProfile(CIMInstance cimInstance) throws WbemsmtException {

        if (cimInstance == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimInstance parameter does not contain a valid reference.");
        }
        setFromServer(true);
        init(cimInstance, false);
    }

    /**
     * Default constructor
     */
    protected CIM_ElementConformsToProfile() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ConformantStandard", new CIMProperty("ConformantStandard",
                new CIMDataType(CIM_RegisteredProfile.CIM_CLASS_NAME), null));
        propertiesToCheck.put("ManagedElement", new CIMProperty("ManagedElement", new CIMDataType(
                CIM_ManagedElement.CIM_CLASS_NAME), null));

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    /**
     * Get the property ConformantStandard
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_RegisteredProfile get_ConformantStandard_CIM_RegisteredProfile(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_CONFORMANTSTANDARD_CIM_REGISTEREDPROFILE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CONFORMANTSTANDARD_CIM_REGISTEREDPROFILE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_RegisteredProfileHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property ConformantStandard
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ConformantStandard_CIM_RegisteredProfile(CIM_RegisteredProfile newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONFORMANTSTANDARD_CIM_REGISTEREDPROFILE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ConformantStandard_CIM_RegisteredProfile(currentProperty,
                    newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CONFORMANTSTANDARD_CIM_REGISTEREDPROFILE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ConformantStandard by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ConformantStandard_CIM_RegisteredProfile(WBEMClient client,
            String namespace, CIM_RegisteredProfile newValue) throws WbemsmtException {
        CIM_ElementConformsToProfile fco = new CIM_ElementConformsToProfile(client, namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_CONFORMANTSTANDARD_CIM_REGISTEREDPROFILE.NAME);
        if (property != null) {
            property = setPropertyValue_ConformantStandard_CIM_RegisteredProfile(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CONFORMANTSTANDARD_CIM_REGISTEREDPROFILE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ConformantStandard
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ConformantStandard_CIM_RegisteredProfile(
            CIMProperty currentProperty, CIM_RegisteredProfile newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ManagedElement
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public CIM_ManagedElement get_ManagedElement_CIM_ManagedElement(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return CIM_ManagedElementHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ManagedElement_CIM_ManagedElement(CIM_ManagedElement newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ManagedElement_CIM_ManagedElement(currentProperty,
                    newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ManagedElement by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ManagedElement_CIM_ManagedElement(WBEMClient client,
            String namespace, CIM_ManagedElement newValue) throws WbemsmtException {
        CIM_ElementConformsToProfile fco = new CIM_ElementConformsToProfile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME);
        if (property != null) {
            property = setPropertyValue_ManagedElement_CIM_ManagedElement(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_CIM_MANAGEDELEMENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ManagedElement_CIM_ManagedElement(
            CIMProperty currentProperty, CIM_ManagedElement newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    //**********************************************************************
    // Associators methods     
    //**********************************************************************

    //**********************************************************************
    // Extrinsic Method invocations     
    //**********************************************************************                         

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * returns true if the objects are the same
     * 
     * @return
     * @see org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco\#equals(Object)
     */
    public boolean equals(Object object) {
        if (!(object instanceof CIM_ElementConformsToProfile)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_ElementConformsToProfile.CIM_CLASS_NAME;
    }

}