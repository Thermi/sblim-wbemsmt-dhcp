/**
 * Linux_DHCPParamsForEntity.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE
 * TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: The hierarchial structure fo the dhcp viz
 *            subnets inside sharednets ,pools within subnets ..etc can be achieved by using this
 *            association.Here the Params entity is associated with DHCPEntity which can be any of
 *            the classes extending the DHCPEntity class. generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class Linux_DHCPParamsForEntity extends CIM_Component {

    public final static String CIM_CLASS_NAME = "Linux_DHCPParamsForEntity";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property GroupComponent
     * 
     */
    public static class PROPERTY_GROUPCOMPONENT_LINUX_DHCPENTITY {
        /**
         * name of the property GroupComponent
         */
        public final static String NAME = "GroupComponent";

    }

    /**
     * Constants of property PartComponent
     * 
     */
    public static class PROPERTY_PARTCOMPONENT_LINUX_DHCPPARAMS {
        /**
         * name of the property PartComponent
         */
        public final static String NAME = "PartComponent";

    }

    static {
        addPackage("org.sblim.wbemsmt.dhcp.bl.fco");
        String[] parentClassPackageList = CIM_Component.getPackages();

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
     *    The hierarchial structure fo the dhcp viz subnets inside sharednets ,pools within subnets ..etc can be achieved by using this association.Here the Params entity is associated with DHCPEntity which can be any of the classes extending the DHCPEntity class.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public Linux_DHCPParamsForEntity(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *    The hierarchial structure fo the dhcp viz subnets inside sharednets ,pools within subnets ..etc can be achieved by using this association.Here the Params entity is associated with DHCPEntity which can be any of the classes extending the DHCPEntity class.
     *   @param cimInstance the instance that is used to create the Object
     */

    public Linux_DHCPParamsForEntity(CIMInstance cimInstance) throws WbemsmtException {

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
    protected Linux_DHCPParamsForEntity() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("GroupComponent", new CIMProperty("GroupComponent", new CIMDataType(
                Linux_DHCPEntity.CIM_CLASS_NAME), null));
        propertiesToCheck.put("PartComponent", new CIMProperty("PartComponent", new CIMDataType(
                Linux_DHCPParams.CIM_CLASS_NAME), null));

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
     * Get the property GroupComponent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public Linux_DHCPEntity get_GroupComponent_Linux_DHCPEntity(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_LINUX_DHCPENTITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_LINUX_DHCPENTITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return Linux_DHCPEntityHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_GroupComponent_Linux_DHCPEntity(Linux_DHCPEntity newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPCOMPONENT_LINUX_DHCPENTITY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_GroupComponent_Linux_DHCPEntity(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_LINUX_DHCPENTITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property GroupComponent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_GroupComponent_Linux_DHCPEntity(WBEMClient client,
            String namespace, Linux_DHCPEntity newValue) throws WbemsmtException {
        Linux_DHCPParamsForEntity fco = new Linux_DHCPParamsForEntity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_GROUPCOMPONENT_LINUX_DHCPENTITY.NAME);
        if (property != null) {
            property = setPropertyValue_GroupComponent_Linux_DHCPEntity(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPCOMPONENT_LINUX_DHCPENTITY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property GroupComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_GroupComponent_Linux_DHCPEntity(
            CIMProperty currentProperty, Linux_DHCPEntity newValue) {
        Object setThis = null;

        setThis = newValue != null ? newValue.getCimObjectPath() : null;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PartComponent
     * @param client the client used to get the JavaObject by the retrieved CIMObjectPath of this attribute    * <br>
     * 
     *     */

    public Linux_DHCPParams get_PartComponent_Linux_DHCPParams(javax.wbem.client.WBEMClient client)
            throws WbemsmtException {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_LINUX_DHCPPARAMS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_LINUX_DHCPPARAMS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return Linux_DHCPParamsHelper.getInstance(client, (CIMObjectPath) currentProperty
                .getValue());

    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PartComponent_Linux_DHCPParams(Linux_DHCPParams newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PARTCOMPONENT_LINUX_DHCPPARAMS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PartComponent_Linux_DHCPParams(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_LINUX_DHCPPARAMS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PartComponent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PartComponent_Linux_DHCPParams(WBEMClient client,
            String namespace, Linux_DHCPParams newValue) throws WbemsmtException {
        Linux_DHCPParamsForEntity fco = new Linux_DHCPParamsForEntity(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PARTCOMPONENT_LINUX_DHCPPARAMS.NAME);
        if (property != null) {
            property = setPropertyValue_PartComponent_Linux_DHCPParams(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PARTCOMPONENT_LINUX_DHCPPARAMS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PartComponent
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_PartComponent_Linux_DHCPParams(
            CIMProperty currentProperty, Linux_DHCPParams newValue) {
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
        return Linux_DHCPParamsForEntity.CIM_CLASS_NAME;
    }

}