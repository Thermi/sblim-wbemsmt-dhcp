/**
 * CIM_LogicalElement.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS
 * OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: CIM_LogicalElement is a base class for all
 *            the components of a System that represent abstract system components, such as Files,
 *            Processes, or LogicalDevices. generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_LogicalElement extends CIM_ManagedSystemElement {

    public final static String CIM_CLASS_NAME = "CIM_LogicalElement";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    static {
        addPackage("org.sblim.wbemsmt.dhcp.bl.fco");
        String[] parentClassPackageList = CIM_ManagedSystemElement.getPackages();

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
     *   CIM_LogicalElement is a base class for all the components of a System that represent abstract system components, such as Files, Processes, or LogicalDevices.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected CIM_LogicalElement(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   CIM_LogicalElement is a base class for all the components of a System that represent abstract system components, such as Files, Processes, or LogicalDevices.
     *   @param cimInstance the instance that is used to create the Object
     */

    protected CIM_LogicalElement(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_LogicalElement() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

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
        return CIM_LogicalElement.CIM_CLASS_NAME;
    }

}