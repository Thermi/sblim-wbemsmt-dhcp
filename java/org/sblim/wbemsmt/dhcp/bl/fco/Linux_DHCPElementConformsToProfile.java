/**
 * Linux_DHCPElementConformsToProfile.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED
 * UNDER THE TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
 * DISTRIBUTION OF THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a
 * current copy of the Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Association between the DHCP Registered
 *            Profile and the DHCP Service generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class Linux_DHCPElementConformsToProfile extends CIM_ElementConformsToProfile {

    public final static String CIM_CLASS_NAME = "Linux_DHCPElementConformsToProfile";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ConformantStandard
     * 
     */
    public static class PROPERTY_CONFORMANTSTANDARD_LINUX_DHCPREGISTEREDPROFILE {
        /**
         * name of the property ConformantStandard
         */
        public final static String NAME = "ConformantStandard";

    }

    /**
     * Constants of property ManagedElement
     * 
     */
    public static class PROPERTY_MANAGEDELEMENT_LINUX_DHCPSERVICE {
        /**
         * name of the property ManagedElement
         */
        public final static String NAME = "ManagedElement";

    }

    static {
        addPackage("org.sblim.wbemsmt.dhcp.bl.fco");
        String[] parentClassPackageList = CIM_ElementConformsToProfile.getPackages();

        for (int i = 0; i < parentClassPackageList.length; i++) {
            addPackage(parentClassPackageList[i]);
        }

    };

    //**********************************************************************
    // Constructors     
    //**********************************************************************

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Association between the DHCP Registered Profile and the DHCP Service
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public Linux_DHCPElementConformsToProfile(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Association between the DHCP Registered Profile and the DHCP Service
     *   @param cimInstance the instance that is used to create the Object
     */

    public Linux_DHCPElementConformsToProfile(CIMInstance cimInstance) throws WbemsmtException {

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
    protected Linux_DHCPElementConformsToProfile() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ConformantStandard", new CIMProperty("ConformantStandard",
                new CIMDataType(Linux_DHCPRegisteredProfile.CIM_CLASS_NAME), null));
        propertiesToCheck.put("ManagedElement", new CIMProperty("ManagedElement", new CIMDataType(
                Linux_DHCPService.CIM_CLASS_NAME), null));

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

    public Linux_DHCPRegisteredProfile get_ConformantStandard_Linux_DHCPRegisteredProfile(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_CONFORMANTSTANDARD_LINUX_DHCPREGISTEREDPROFILE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property "
                    + PROPERTY_CONFORMANTSTANDARD_LINUX_DHCPREGISTEREDPROFILE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return Linux_DHCPRegisteredProfileHelper.getInstance(client,
                (CIMObjectPath) currentProperty.getValue());

    }

    /**
     * Set the property ConformantStandard
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ConformantStandard_Linux_DHCPRegisteredProfile(
            Linux_DHCPRegisteredProfile newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CONFORMANTSTANDARD_LINUX_DHCPREGISTEREDPROFILE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ConformantStandard_Linux_DHCPRegisteredProfile(
                    currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property "
                    + PROPERTY_CONFORMANTSTANDARD_LINUX_DHCPREGISTEREDPROFILE.NAME
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

    public static CIMProperty create_ConformantStandard_Linux_DHCPRegisteredProfile(
            WBEMClient client, String namespace, Linux_DHCPRegisteredProfile newValue)
            throws WbemsmtException {
        Linux_DHCPElementConformsToProfile fco = new Linux_DHCPElementConformsToProfile(client,
                namespace);
        CIMProperty property = fco
                .getProperty(PROPERTY_CONFORMANTSTANDARD_LINUX_DHCPREGISTEREDPROFILE.NAME);
        if (property != null) {
            property = setPropertyValue_ConformantStandard_Linux_DHCPRegisteredProfile(property,
                    newValue);
        }
        else {
            logger.warning("Property "
                    + PROPERTY_CONFORMANTSTANDARD_LINUX_DHCPREGISTEREDPROFILE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ConformantStandard
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ConformantStandard_Linux_DHCPRegisteredProfile(
            CIMProperty currentProperty, Linux_DHCPRegisteredProfile newValue) {
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

    public Linux_DHCPService get_ManagedElement_Linux_DHCPService(
            javax.wbem.client.WBEMClient client) throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_LINUX_DHCPSERVICE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_LINUX_DHCPSERVICE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return Linux_DHCPServiceHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ManagedElement_Linux_DHCPService(Linux_DHCPService newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MANAGEDELEMENT_LINUX_DHCPSERVICE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ManagedElement_Linux_DHCPService(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_LINUX_DHCPSERVICE.NAME
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

    public static CIMProperty create_ManagedElement_Linux_DHCPService(WBEMClient client,
            String namespace, Linux_DHCPService newValue) throws WbemsmtException {
        Linux_DHCPElementConformsToProfile fco = new Linux_DHCPElementConformsToProfile(client,
                namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MANAGEDELEMENT_LINUX_DHCPSERVICE.NAME);
        if (property != null) {
            property = setPropertyValue_ManagedElement_Linux_DHCPService(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MANAGEDELEMENT_LINUX_DHCPSERVICE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ManagedElement
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_ManagedElement_Linux_DHCPService(
            CIMProperty currentProperty, Linux_DHCPService newValue) {
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
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return Linux_DHCPElementConformsToProfile.CIM_CLASS_NAME;
    }

}