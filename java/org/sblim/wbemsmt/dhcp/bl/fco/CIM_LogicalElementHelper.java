/** 
  * CIM_LogicalElementHelper.java
  *
  * 
  * Â© Copyright IBM Corp.  2009,2006,2007
  *
  * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/helper.vm
  *
  * Contributors: 
  *    Prashanth Karnam<prkarnam@in.ibm.com>
  * 
  * Description: Helper class for CIM_LogicalElement
  *    
  * 
  * generated Class
  * @see CIM_LogicalElement
  */

package org.sblim.wbemsmt.dhcp.bl.fco;

import java.util.*;
import java.lang.reflect.*;   

import javax.cim.*;
import javax.wbem.*;
import javax.wbem.client.*;
import org.sblim.wbemsmt.bl.fco.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;




public class CIM_LogicalElementHelper extends AbstractWbemsmtFcoHelper
{

//**********************************************************************
// EnumerateInstance / EnumerateInstanceNames     
//**********************************************************************


   /**
    * The method enumerates the instance names of a given CIM client with the same class name
    * @param client the CIM client for the connection to the server
    * @param namespace target namespace
    * @param deep set to true if the subclasses should be also included
    *
    * @return a list of CIMObjectPathes of instances of type CIM_LogicalElement or the subclasses if deep == true
    */    
    public final static List<CIMObjectPath> enumerateInstanceNames(WBEMClient client, String namespace, boolean deep) throws WbemsmtException {
    
       List<CIMObjectPath> cimInstanceNamesList = new ArrayList<CIMObjectPath>(); 
    
       if (client == null) {
          throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,"The client parameter does not contain a valid reference.");
       }
            
       CloseableIterator iterator = null;

	       CIMObjectPath path = new CIMObjectPath(CIM_LogicalElement.CIM_CLASS_NAME,AbstractWbemsmtFcoHelper.harmonizeNamespace(namespace));
        
       try {
           iterator = client.enumerateInstanceNames(path);

           CIMObjectPath cimObjectPath = null;
        
           while (iterator != null && iterator.hasNext()) {
                   
              checkException(iterator);
              cimObjectPath = (CIMObjectPath) iterator.next();
              checkException(iterator);
                            
              if (deep || CIM_LogicalElement.CIM_CLASS_NAME.equals(cimObjectPath.getObjectName())) {
                 cimInstanceNamesList.add(cimObjectPath);
              }
           }
           checkException(iterator);
        } catch (WBEMException e) {
        	  throw new EnumerateInstanceNamesException(e, new EnumerateInstanceNamesUserObject(path));
        } finally {
           try {
              if (iterator != null) {
                 iterator.close();
              }
           } catch(Exception e) {
              throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
           }
        }
            
        return cimInstanceNamesList;
    }


   /**
    * The method enumerates the instances of a given CIM client
    * @param client the CIM client for the connection to the server
    * @param namespace target namespace
    * @param deep set to true if the subclasses should be also included
    *
    * @return a list of instances of type CIM_LogicalElement or the subclasses if deep == true
    */        
    public final static List<CIM_LogicalElement> enumerateInstances(WBEMClient client, String namespace, boolean deep) throws WbemsmtException {
    
        ArrayList<CIM_LogicalElement> resultArrayList = new ArrayList<CIM_LogicalElement>();
    
        if (client == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,"The client parameter does not contain a valid reference.");
        }
            
        CloseableIterator iterator = null;
        
        CIMObjectPath path = new CIMObjectPath(CIM_LogicalElement.CIM_CLASS_NAME,AbstractWbemsmtFcoHelper.harmonizeNamespace(namespace));
        try {
            iterator = client.enumerateInstances(path,deep,false,false,null);
        } catch (WBEMException e) {
        		    throw new EnumerateInstancesException(e, new EnumerateInstancesUserObject(path,deep,false,false,null));
        }
        try {
            while (iterator.hasNext()) {
                   checkException(iterator);
            
                Object obj = iterator.next();
                checkException(iterator);
                
                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance)obj;
                    if (!deep && cimInstance.getClassName().equals(CIM_LogicalElement.CIM_CLASS_NAME)) {
                        resultArrayList.add(new CIM_LogicalElement(cimInstance));
                        continue;
                    }
                    Class<?> clazz = CIM_LogicalElementHelper.findClass(client, cimInstance);
                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of class CIM_LogicalElement.");
                        resultArrayList.add(new CIM_LogicalElement(cimInstance));
                        continue;
                    }
                
                    Class<?>[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor<?> cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    
                    } catch(NoSuchMethodException e) {
                        System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of class CIM_LogicalElement.");
                        resultArrayList.add(new CIM_LogicalElement(cimInstance));
                        continue;
                    }
                
                    try {
                        Object[] actargs = new Object[] {cimInstance};
                    
                        Object dataObj = cons.newInstance(actargs);
                    
                        resultArrayList.add((CIM_LogicalElement)dataObj);
                    } catch (Exception e) {
                        System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of class CIM_LogicalElement.");
                        resultArrayList.add(new CIM_LogicalElement(cimInstance));
                        continue;
                    }

                }
            }
            checkException(iterator);
            
        } finally {
            try {
                if (iterator != null) {
                    iterator.close();
                }
            } catch(Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
            }
        }
            
        return resultArrayList;
    }

//**********************************************************************
// getInstance     
//**********************************************************************


   /**
    * The method returns an instance of a given WBEMClient at a given path
    * @param client the CIM client for the connection to the server
    * @param cimObjectPath the object path of the instance
    * @return the instance
    */    
    public final static CIM_LogicalElement getInstance(WBEMClient client, CIMObjectPath cimObjectPath) throws WbemsmtException  {
    
        if (client == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The WBEMClient parameter does not contain a valid reference.");
    
        } else if (cimObjectPath == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimObjectPath parameter does not contain a valid reference.");
        }
        
        CIMInstance cimInstance = null;
        try {
           cimInstance = client.getInstance(cimObjectPath,false,false,null);
        } catch (WBEMException e) {
           throw new GetInstanceException(e, new GetInstanceUserObject(cimObjectPath,false,false,null));
        }
        
        return getInstance(client,cimInstance);
        
  }
  
   /**
    *    The method returns a FCO of a given WBEMClient with the given CIMInstance - If the cimInstance is coming from a subclass and the subclass FCO can be found
    *    the fco of the this subclass is returned;
    */    
    public final static CIM_LogicalElement getInstance(WBEMClient client, CIMInstance cimInstance) throws WbemsmtException  {
        
        CIM_LogicalElement dataInstance = null;
        Class<?> clazz = CIM_LogicalElementHelper.findClass(client, cimInstance);

        if (clazz == null) {
            System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of class CIM_LogicalElement.");
        }
        else
        {
            Class<?>[] constParams = new Class[1];
            constParams[0] = CIMInstance.class;
            try {
                Constructor<?> cons = clazz.getConstructor(constParams);
                Object[] actargs = new Object[] {cimInstance};
                dataInstance = (CIM_LogicalElement)cons.newInstance(actargs);
            } catch (Exception e) {
                System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of class CIM_LogicalElement.");
            }
        }

        try {
            if (dataInstance == null)
            {
                dataInstance = new CIM_LogicalElement(cimInstance);
            }
        } catch (Exception e) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The received CIMInstance object was not valid",new CIMInstance[]{cimInstance},e);
        }
        return dataInstance;
                    
    }


     

//**********************************************************************
// createInstance     
//**********************************************************************



//**********************************************************************
// saveInstance     
//**********************************************************************


 

//**********************************************************************
// deleteInstance     
//**********************************************************************


   /**
    * The method deletes a class instance in a given CIM client
    * @param client the CIM client for the connection to the server
    * @param dataInstance the FCO to create
    */    
    public final static void deleteInstance(WBEMClient client, CIM_LogicalElement dataInstance) throws WbemsmtException {
        org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFcoHelper.deleteInstance(client,dataInstance);
    }
 
    
//**********************************************************************
// utility methods     
//**********************************************************************


    /** 
     * find a FCO class which can represent the given cimInstance 
     * Begins at the lowest classes in the cim class hierarchy and try to create a FCO with
     * all the defined packages. If the Class cannot be created go one step up in the hierarchy 
     * and try again and again and again... 
     * @param WBEMClient 
     * @param cimInstance 
     * @return The class for the FCO or null if a class was NOT found to create a FCO from 
     * @see #Java_Package_List 
     */ 
    
    public static Class<?> findClass(WBEMClient client, CIMInstance cimInstance) throws WbemsmtException {

        return org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFcoHelper.findClass(client,cimInstance,CIM_LogicalElement.getPackages());
    }


           

}