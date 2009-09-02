/**
 * CIM_Service.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF THE
 * ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: A Service is a LogicalElement that represents
 *            the availability of functionality that can be managed. This functionality may be
 *            provided by a seperately modeled entity such as a LogicalDevice or a SoftwareFeature,
 *            or both. The modeled Service typically provides only functionality required for
 *            management of itself or the elements it affects. generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import javax.wbem.*;

public class CIM_Service extends CIM_EnabledLogicalElement {

    public final static String CIM_CLASS_NAME = "CIM_Service";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constant for method\'s name and parameters
     * The StartService method places the Service in the started state. Note that the function of this method overlaps with the RequestedState property. RequestedState was added to the model to maintain a record (such as a persisted value) of the last state request. Invoking the StartService method should set the RequestedState property appropriately. The method returns an integer value of 0 if the Service was successfully started, 1 if the request is not supported, and any other number to indicate an error. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are translated can also be specified in the subclass as a Values array qualifier. 
     * 
     * Note: The semantics of this method overlap with the RequestStateChange method that is inherited from EnabledLogicalElement. This method is maintained because it has been widely implemented, and its simple "start" semantics are convenient to use.
     */

    public static class METHOD_STARTSERVICE {
        /**
         * Constant for method StartService
         */
        public final static String NAME = "StartService";

    }

    /**
     * Constant for method\'s name and parameters
     * The StopService method places the Service in the stopped state. Note that the function of this method overlaps with the RequestedState property. RequestedState was added to the model to maintain a record (such as a persisted value) of the last state request. Invoking the StopService method should set the RequestedState property appropriately. The method returns an integer value of 0 if the Service was successfully stopped, 1 if the request is not supported, and any other number to indicate an error. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are translated can also be specified in the subclass as a Values array qualifier. 
     * 
     * Note: The semantics of this method overlap with the RequestStateChange method that is inherited from EnabledLogicalElement. This method is maintained because it has been widely implemented, and its simple "stop" semantics are convenient to use.
     */

    public static class METHOD_STOPSERVICE {
        /**
         * Constant for method StopService
         */
        public final static String NAME = "StopService";

    }

    /**
     * Constants of property CreationClassName
     * CreationClassName indicates the name of the class or the subclass that is used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     */
    public static class PROPERTY_CREATIONCLASSNAME {
        /**
         * name of the property CreationClassName
         */
        public final static String NAME = "CreationClassName";

    }

    /**
     * Constants of property Name
     * The Name property uniquely identifies the Service and provides an indication of the functionality that is managed. This functionality is described in more detail in the Description property of the object.
     */
    public static class PROPERTY_NAME {
        /**
         * name of the property Name
         */
        public final static String NAME = "Name";

    }

    /**
     * Constants of property PrimaryOwnerContact
     * A string that provides information on how the primary owner of the Service can be reached (for example, phone number, e-mail address, and so on).
     */
    public static class PROPERTY_PRIMARYOWNERCONTACT {
        /**
         * name of the property PrimaryOwnerContact
         */
        public final static String NAME = "PrimaryOwnerContact";

    }

    /**
     * Constants of property PrimaryOwnerName
     * The name of the primary owner for the service, if one is defined. The primary owner is the initial support contact for the Service.
     */
    public static class PROPERTY_PRIMARYOWNERNAME {
        /**
         * name of the property PrimaryOwnerName
         */
        public final static String NAME = "PrimaryOwnerName";

    }

    /**
     * Constants of property StartMode
     * Note: The use of this element is deprecated in lieu of the EnabledDefault property that is inherited from EnabledLogicalElement. The EnabledLogicalElement addresses the same semantics. The change to a uint16 data type was discussed when CIM V2.0 was defined. However, existing V1.0 implementations used the string property. To remain compatible with those implementations, StartMode was grandfathered into the schema. Use of the deprecated qualifier allows the maintenance of the existing property but also permits an improved, clarified definition using EnabledDefault. 
     * Deprecated description: StartMode is a string value that indicates whether the Service is automatically started by a System, an Operating System, and so on, or is started only upon request.
     */
    public static class PROPERTY_STARTMODE {
        /**
         * name of the property StartMode
         */
        public final static String NAME = "StartMode";

        /**
         * constant for value map entry Automatic
         */

        public final static String VALUE_MAP_ENTRY_Automatic = new String("Automatic");

        /**
         * constant for value map entry Manual
         */

        public final static String VALUE_MAP_ENTRY_Manual = new String("Manual");

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property StartMode   
         */
        public final static String[] VALUE_MAP_ENTRIES = { VALUE_MAP_ENTRY_Automatic,
                VALUE_MAP_ENTRY_Manual };

    }

    /**
     * Constants of property Started
     * Started is a Boolean that indicates whether the Service has been started (TRUE), or stopped (FALSE).
     */
    public static class PROPERTY_STARTED {
        /**
         * name of the property Started
         */
        public final static String NAME = "Started";

    }

    /**
     * Constants of property SystemCreationClassName
     * The CreationClassName of the scoping System.
     */
    public static class PROPERTY_SYSTEMCREATIONCLASSNAME {
        /**
         * name of the property SystemCreationClassName
         */
        public final static String NAME = "SystemCreationClassName";

    }

    /**
     * Constants of property SystemName
     * The Name of the scoping System.
     */
    public static class PROPERTY_SYSTEMNAME {
        /**
         * name of the property SystemName
         */
        public final static String NAME = "SystemName";

    }

    static {
        addPackage("org.sblim.wbemsmt.dhcp.bl.fco");
        String[] parentClassPackageList = CIM_EnabledLogicalElement.getPackages();

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
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   A Service is a LogicalElement that represents the availability of functionality that can be managed. This functionality may be provided by a seperately modeled entity such as a LogicalDevice or a SoftwareFeature, or both. The modeled Service typically provides only functionality required for management of itself or the elements it affects.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected CIM_Service(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   A Service is a LogicalElement that represents the availability of functionality that can be managed. This functionality may be provided by a seperately modeled entity such as a LogicalDevice or a SoftwareFeature, or both. The modeled Service typically provides only functionality required for management of itself or the elements it affects.
     *   @param cimInstance the instance that is used to create the Object
     */

    protected CIM_Service(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Service() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CreationClassName", new CIMProperty("CreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));
        propertiesToCheck.put("PrimaryOwnerContact", new CIMProperty("PrimaryOwnerContact",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("PrimaryOwnerName", new CIMProperty("PrimaryOwnerName",
                CIMDataType.STRING_T, null));
        propertiesToCheck
                .put("StartMode", new CIMProperty("StartMode", CIMDataType.STRING_T, null));
        propertiesToCheck.put("Started", new CIMProperty("Started", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("SystemCreationClassName", new CIMProperty("SystemCreationClassName",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("SystemName", new CIMProperty("SystemName", CIMDataType.STRING_T,
                null));

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
     * Get the property CreationClassName
     *     * <br>
     * CreationClassName indicates the name of the class or the subclass that is used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     *     */

    public String get_key_CreationClassName() {
        CIMProperty currentProperty = getProperty(PROPERTY_CREATIONCLASSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property CreationClassName
     * <br>
     * CreationClassName indicates the name of the class or the subclass that is used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_CreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_key_CreationClassName(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_CreationClassName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Service fco = new CIM_Service(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_CreationClassName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CREATIONCLASSNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CreationClassName
     * <br>
     * CreationClassName indicates the name of the class or the subclass that is used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
     */

    private static CIMProperty setPropertyValue_key_CreationClassName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Name
     *     * <br>
     * The Name property uniquely identifies the Service and provides an indication of the functionality that is managed. This functionality is described in more detail in the Description property of the object.
     *     */

    public String get_key_Name() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Name
     * <br>
     * The Name property uniquely identifies the Service and provides an indication of the functionality that is managed. This functionality is described in more detail in the Description property of the object.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_Name(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_key_Name(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Name by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_Name(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_Service fco = new CIM_Service(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_Name(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Name
     * <br>
     * The Name property uniquely identifies the Service and provides an indication of the functionality that is managed. This functionality is described in more detail in the Description property of the object.
     */

    private static CIMProperty setPropertyValue_key_Name(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PrimaryOwnerContact
     *     * <br>
     * A string that provides information on how the primary owner of the Service can be reached (for example, phone number, e-mail address, and so on).
     *     */

    public String get_PrimaryOwnerContact() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIMARYOWNERCONTACT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRIMARYOWNERCONTACT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property PrimaryOwnerContact
     * <br>
     * A string that provides information on how the primary owner of the Service can be reached (for example, phone number, e-mail address, and so on).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PrimaryOwnerContact(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIMARYOWNERCONTACT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PrimaryOwnerContact(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRIMARYOWNERCONTACT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PrimaryOwnerContact by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PrimaryOwnerContact(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Service fco = new CIM_Service(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRIMARYOWNERCONTACT.NAME);
        if (property != null) {
            property = setPropertyValue_PrimaryOwnerContact(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRIMARYOWNERCONTACT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PrimaryOwnerContact
     * <br>
     * A string that provides information on how the primary owner of the Service can be reached (for example, phone number, e-mail address, and so on).
     */

    private static CIMProperty setPropertyValue_PrimaryOwnerContact(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PrimaryOwnerName
     *     * <br>
     * The name of the primary owner for the service, if one is defined. The primary owner is the initial support contact for the Service.
     *     */

    public String get_PrimaryOwnerName() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIMARYOWNERNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRIMARYOWNERNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property PrimaryOwnerName
     * <br>
     * The name of the primary owner for the service, if one is defined. The primary owner is the initial support contact for the Service.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PrimaryOwnerName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIMARYOWNERNAME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PrimaryOwnerName(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRIMARYOWNERNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PrimaryOwnerName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PrimaryOwnerName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Service fco = new CIM_Service(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRIMARYOWNERNAME.NAME);
        if (property != null) {
            property = setPropertyValue_PrimaryOwnerName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRIMARYOWNERNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PrimaryOwnerName
     * <br>
     * The name of the primary owner for the service, if one is defined. The primary owner is the initial support contact for the Service.
     */

    private static CIMProperty setPropertyValue_PrimaryOwnerName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property StartMode
     *     * <br>
     * Note: The use of this element is deprecated in lieu of the EnabledDefault property that is inherited from EnabledLogicalElement. The EnabledLogicalElement addresses the same semantics. The change to a uint16 data type was discussed when CIM V2.0 was defined. However, existing V1.0 implementations used the string property. To remain compatible with those implementations, StartMode was grandfathered into the schema. Use of the deprecated qualifier allows the maintenance of the existing property but also permits an improved, clarified definition using EnabledDefault. 
     * Deprecated description: StartMode is a string value that indicates whether the Service is automatically started by a System, an Operating System, and so on, or is started only upon request.
     *     */

    public String get_StartMode() {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTMODE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STARTMODE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property StartMode
     * <br>
     * Note: The use of this element is deprecated in lieu of the EnabledDefault property that is inherited from EnabledLogicalElement. The EnabledLogicalElement addresses the same semantics. The change to a uint16 data type was discussed when CIM V2.0 was defined. However, existing V1.0 implementations used the string property. To remain compatible with those implementations, StartMode was grandfathered into the schema. Use of the deprecated qualifier allows the maintenance of the existing property but also permits an improved, clarified definition using EnabledDefault. 
     * Deprecated description: StartMode is a string value that indicates whether the Service is automatically started by a System, an Operating System, and so on, or is started only upon request.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_StartMode(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTMODE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_StartMode(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STARTMODE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property StartMode by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_StartMode(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_Service fco = new CIM_Service(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STARTMODE.NAME);
        if (property != null) {
            property = setPropertyValue_StartMode(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STARTMODE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property StartMode
     * <br>
     * Note: The use of this element is deprecated in lieu of the EnabledDefault property that is inherited from EnabledLogicalElement. The EnabledLogicalElement addresses the same semantics. The change to a uint16 data type was discussed when CIM V2.0 was defined. However, existing V1.0 implementations used the string property. To remain compatible with those implementations, StartMode was grandfathered into the schema. Use of the deprecated qualifier allows the maintenance of the existing property but also permits an improved, clarified definition using EnabledDefault. 
     * Deprecated description: StartMode is a string value that indicates whether the Service is automatically started by a System, an Operating System, and so on, or is started only upon request.
     */

    private static CIMProperty setPropertyValue_StartMode(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Started
     *     * <br>
     * Started is a Boolean that indicates whether the Service has been started (TRUE), or stopped (FALSE).
     *     */

    public Boolean get_Started() {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STARTED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property Started
     * <br>
     * Started is a Boolean that indicates whether the Service has been started (TRUE), or stopped (FALSE).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Started(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Started(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STARTED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Started by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Started(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_Service fco = new CIM_Service(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STARTED.NAME);
        if (property != null) {
            property = setPropertyValue_Started(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STARTED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Started
     * <br>
     * Started is a Boolean that indicates whether the Service has been started (TRUE), or stopped (FALSE).
     */

    private static CIMProperty setPropertyValue_Started(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SystemCreationClassName
     *     * <br>
     * The CreationClassName of the scoping System.
     *     */

    public String get_key_SystemCreationClassName() {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYSTEMCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SystemCreationClassName
     * <br>
     * The CreationClassName of the scoping System.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_SystemCreationClassName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_key_SystemCreationClassName(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMCREATIONCLASSNAME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SystemCreationClassName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_SystemCreationClassName(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_Service fco = new CIM_Service(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMCREATIONCLASSNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_SystemCreationClassName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMCREATIONCLASSNAME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SystemCreationClassName
     * <br>
     * The CreationClassName of the scoping System.
     */

    private static CIMProperty setPropertyValue_key_SystemCreationClassName(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SystemName
     *     * <br>
     * The Name of the scoping System.
     *     */

    public String get_key_SystemName() {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMNAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYSTEMNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SystemName
     * <br>
     * The Name of the scoping System.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_SystemName(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYSTEMNAME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_key_SystemName(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMNAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SystemName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_SystemName(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Service fco = new CIM_Service(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYSTEMNAME.NAME);
        if (property != null) {
            property = setPropertyValue_key_SystemName(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYSTEMNAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SystemName
     * <br>
     * The Name of the scoping System.
     */

    private static CIMProperty setPropertyValue_key_SystemName(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

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

    /**
     * Invokes the Method StartService
     * <br>
     * @param client the cimclient
     * The StartService method places the Service in the started state. Note that the function of this method overlaps with the RequestedState property. RequestedState was added to the model to maintain a record (such as a persisted value) of the last state request. Invoking the StartService method should set the RequestedState property appropriately. The method returns an integer value of 0 if the Service was successfully started, 1 if the request is not supported, and any other number to indicate an error. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are translated can also be specified in the subclass as a Values array qualifier. 
     * 
     * Note: The semantics of this method overlap with the RequestStateChange method that is inherited from EnabledLogicalElement. This method is maintained because it has been widely implemented, and its simple "start" semantics are convenient to use.
     *
     */

    public StartServiceResult invoke_StartService(WBEMClient cimClient
                                 ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[0];
       CIMArgument[] outParameter = new CIMArgument[0];
    
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_STARTSERVICE.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_STARTSERVICE.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        StartServiceResult result = new StartServiceResult();
        result.setResultObject(resultObject);

        java.util.HashMap<String, CIMArgument> mapOutParameter = new java.util.HashMap<String, CIMArgument>();
        for (int i = 0; i < outParameter.length; i++) {
           CIMArgument argument = outParameter[i];
           if (argument != null)
           {
              mapOutParameter.put(argument.getName(), argument);
           }
        }
                  
     return result;               
   }

    /**
     * Result object for the method StartService
     */
    public static class StartServiceResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        StartServiceResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger32 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger32 getResultObject() {
            return this.resultObject;
        }

    }

    /**
     * Invokes the Method StopService
     * <br>
     * @param client the cimclient
     * The StopService method places the Service in the stopped state. Note that the function of this method overlaps with the RequestedState property. RequestedState was added to the model to maintain a record (such as a persisted value) of the last state request. Invoking the StopService method should set the RequestedState property appropriately. The method returns an integer value of 0 if the Service was successfully stopped, 1 if the request is not supported, and any other number to indicate an error. In a subclass, the set of possible return codes could be specified using a ValueMap qualifier on the method. The strings to which the ValueMap contents are translated can also be specified in the subclass as a Values array qualifier. 
     * 
     * Note: The semantics of this method overlap with the RequestStateChange method that is inherited from EnabledLogicalElement. This method is maintained because it has been widely implemented, and its simple "stop" semantics are convenient to use.
     *
     */

    public StopServiceResult invoke_StopService(WBEMClient cimClient
                                 ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[0];
       CIMArgument[] outParameter = new CIMArgument[0];
    
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_STOPSERVICE.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_STOPSERVICE.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        StopServiceResult result = new StopServiceResult();
        result.setResultObject(resultObject);

        java.util.HashMap<String, CIMArgument> mapOutParameter = new java.util.HashMap<String, CIMArgument>();
        for (int i = 0; i < outParameter.length; i++) {
           CIMArgument argument = outParameter[i];
           if (argument != null)
           {
              mapOutParameter.put(argument.getName(), argument);
           }
        }
                  
     return result;               
   }

    /**
     * Result object for the method StopService
     */
    public static class StopServiceResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        StopServiceResult() {
        }

        /**
         * Set the return value
         * @param rc
         */
        void setResultObject(javax.cim.UnsignedInteger32 resultObject) {
            this.resultObject = resultObject;
        }

        /**
         * Get the return value of the methid
         * @return the return value
         */
        public javax.cim.UnsignedInteger32 getResultObject() {
            return this.resultObject;
        }

    }

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_Service.CIM_CLASS_NAME;
    }

}