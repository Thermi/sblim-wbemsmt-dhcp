/**
 * CIM_Profile.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF THE
 * ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Note: The use of CIM_Profile is deprecated in
 *            favor of aggregating instances of Setting or SettingData into "higher-level" Settings
 *            or SettingData objects using the ConcreteComponent association. This use simplifies
 *            the use of Settings or SettingData. With Profiles subclassing from Collection,
 *            separate associations were needed between an element and either its Profiles or
 *            Settings or SettingData. This class introduced unnecessary complexity and redundancy
 *            into the model. Deprecated description: Profile specifies a general collection of
 *            Settings or SettingData objects that are logically grouped together. Note: The
 *            CIM_Profile class uses simplified naming or identity algorithms and collection
 *            algorithms, as compared to CIM_Configuration. The settings are "collected" into the
 *            Profile using the MemberOfCollection association. Note that a Profile obtains its
 *            setting data and other necessary information from collected Setting and SettingData
 *            instances and by the definition of additional properties in subclasses. One example of
 *            a Profile is to define the collection of settings for a particular person. Another is
 *            to define the collection of settings that are appropriate when initializing a system.
 *            Profile is tied to a ManagedElement using the ElementProfile association. The
 *            ManagedElement provides the context for the Profile, and the settings collected by
 *            Profile should be settings of the associated ManagedElement. Note that a
 *            ManagedElement cannot exist when the Profile is instantiated. This situation is
 *            important to remember when the Profile is used in the creation of the real-world
 *            entity that is represented by (and then instantiated in) the ManagedElement. generated
 *            Class
 */

package org.sblim.wbemsmt.dhcp.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_Profile extends CIM_Collection {

    public final static String CIM_CLASS_NAME = "CIM_Profile";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property InstanceID
     * Note: The use of this element is deprecated. Deprecated description: Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following "preferred" algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness, <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above "preferred" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs that are produced by this or other providers for the NameSpace of this instance. 
     * For DMTF-defined instances, the preferred algorithm must be used with the <OrgID> set to CIM.
     */
    public static class PROPERTY_INSTANCEID {
        /**
         * name of the property InstanceID
         */
        public final static String NAME = "InstanceID";

    }

    static {
        addPackage("org.sblim.wbemsmt.dhcp.bl.fco");
        String[] parentClassPackageList = CIM_Collection.getPackages();

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
     *   Note: The use of CIM_Profile is deprecated in favor of aggregating instances of Setting or SettingData into "higher-level" Settings or SettingData objects using the ConcreteComponent association. This use simplifies the use of Settings or SettingData. With Profiles subclassing from Collection, separate associations were needed between an element and either its Profiles or Settings or SettingData. This class introduced unnecessary complexity and redundancy into the model. 
     * Deprecated description: Profile specifies a general collection of Settings or SettingData objects that are logically grouped together. Note: The CIM_Profile class uses simplified naming or identity algorithms and collection algorithms, as compared to CIM_Configuration. The settings are "collected" into the Profile using the MemberOfCollection association. Note that a Profile obtains its setting data and other necessary information from collected Setting and SettingData instances and by the definition of additional properties in subclasses. One example of a Profile is to define the collection of settings for a particular person. Another is to define the collection of settings that are appropriate when initializing a system. 
     * Profile is tied to a ManagedElement using the ElementProfile association. The ManagedElement provides the context for the Profile, and the settings collected by Profile should be settings of the associated ManagedElement. Note that a ManagedElement cannot exist when the Profile is instantiated. This situation is important to remember when the Profile is used in the creation of the real-world entity that is represented by (and then instantiated in) the ManagedElement.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_Profile(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Note: The use of CIM_Profile is deprecated in favor of aggregating instances of Setting or SettingData into "higher-level" Settings or SettingData objects using the ConcreteComponent association. This use simplifies the use of Settings or SettingData. With Profiles subclassing from Collection, separate associations were needed between an element and either its Profiles or Settings or SettingData. This class introduced unnecessary complexity and redundancy into the model. 
     * Deprecated description: Profile specifies a general collection of Settings or SettingData objects that are logically grouped together. Note: The CIM_Profile class uses simplified naming or identity algorithms and collection algorithms, as compared to CIM_Configuration. The settings are "collected" into the Profile using the MemberOfCollection association. Note that a Profile obtains its setting data and other necessary information from collected Setting and SettingData instances and by the definition of additional properties in subclasses. One example of a Profile is to define the collection of settings for a particular person. Another is to define the collection of settings that are appropriate when initializing a system. 
     * Profile is tied to a ManagedElement using the ElementProfile association. The ManagedElement provides the context for the Profile, and the settings collected by Profile should be settings of the associated ManagedElement. Note that a ManagedElement cannot exist when the Profile is instantiated. This situation is important to remember when the Profile is used in the creation of the real-world entity that is represented by (and then instantiated in) the ManagedElement.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_Profile(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Profile() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("InstanceID", new CIMProperty("InstanceID", CIMDataType.STRING_T,
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
     * Get the property InstanceID
     *     * <br>
     * Note: The use of this element is deprecated. Deprecated description: Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following "preferred" algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness, <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above "preferred" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs that are produced by this or other providers for the NameSpace of this instance. 
     * For DMTF-defined instances, the preferred algorithm must be used with the <OrgID> set to CIM.
     *     */

    public String get_key_InstanceID() {
        CIMProperty currentProperty = getProperty(PROPERTY_INSTANCEID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property InstanceID
     * <br>
     * Note: The use of this element is deprecated. Deprecated description: Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following "preferred" algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness, <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above "preferred" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs that are produced by this or other providers for the NameSpace of this instance. 
     * For DMTF-defined instances, the preferred algorithm must be used with the <OrgID> set to CIM.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_key_InstanceID(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INSTANCEID.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_key_InstanceID(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property InstanceID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_key_InstanceID(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Profile fco = new CIM_Profile(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INSTANCEID.NAME);
        if (property != null) {
            property = setPropertyValue_key_InstanceID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property InstanceID
     * <br>
     * Note: The use of this element is deprecated. Deprecated description: Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. To ensure uniqueness within the NameSpace, the value of InstanceID should be constructed using the following "preferred" algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID or that is a registered ID assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness, <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in InstanceID must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be reused to identify different underlying (real-world) elements. If the above "preferred" algorithm is not used, the defining entity must assure that the resulting InstanceID is not reused across any InstanceIDs that are produced by this or other providers for the NameSpace of this instance. 
     * For DMTF-defined instances, the preferred algorithm must be used with the <OrgID> set to CIM.
     */

    private static CIMProperty setPropertyValue_key_InstanceID(CIMProperty currentProperty,
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

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_Profile.CIM_CLASS_NAME;
    }

}