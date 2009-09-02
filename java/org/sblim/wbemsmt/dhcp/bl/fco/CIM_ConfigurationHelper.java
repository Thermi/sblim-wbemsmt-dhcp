/** 
  * CIM_ConfigurationHelper.java
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
  * Description: Helper class for CIM_Configuration
  *    
  * 
  * generated Class
  * @see CIM_Configuration
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




public class CIM_ConfigurationHelper extends AbstractWbemsmtFcoHelper
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
    * @return a list of CIMObjectPathes of instances of type CIM_Configuration or the subclasses if deep == true
    */    
    public final static List<CIMObjectPath> enumerateInstanceNames(WBEMClient client, String namespace, boolean deep) throws WbemsmtException {
    
       List<CIMObjectPath> cimInstanceNamesList = new ArrayList<CIMObjectPath>(); 
    
       if (client == null) {
          throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,"The client parameter does not contain a valid reference.");
       }
            
       CloseableIterator iterator = null;

	       CIMObjectPath path = new CIMObjectPath(CIM_Configuration.CIM_CLASS_NAME,AbstractWbemsmtFcoHelper.harmonizeNamespace(namespace));
        
       try {
           iterator = client.enumerateInstanceNames(path);

           CIMObjectPath cimObjectPath = null;
        
           while (iterator != null && iterator.hasNext()) {
                   
              checkException(iterator);
              cimObjectPath = (CIMObjectPath) iterator.next();
              checkException(iterator);
                            
              if (deep || CIM_Configuration.CIM_CLASS_NAME.equals(cimObjectPath.getObjectName())) {
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
    * @return a list of instances of type CIM_Configuration or the subclasses if deep == true
    */        
    public final static List<CIM_Configuration> enumerateInstances(WBEMClient client, String namespace, boolean deep) throws WbemsmtException {
    
        ArrayList<CIM_Configuration> resultArrayList = new ArrayList<CIM_Configuration>();
    
        if (client == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,"The client parameter does not contain a valid reference.");
        }
            
        CloseableIterator iterator = null;
        
        CIMObjectPath path = new CIMObjectPath(CIM_Configuration.CIM_CLASS_NAME,AbstractWbemsmtFcoHelper.harmonizeNamespace(namespace));
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
                    if (!deep && cimInstance.getClassName().equals(CIM_Configuration.CIM_CLASS_NAME)) {
                        resultArrayList.add(new CIM_Configuration(cimInstance));
                        continue;
                    }
                    Class<?> clazz = CIM_ConfigurationHelper.findClass(client, cimInstance);
                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of class CIM_Configuration.");
                        resultArrayList.add(new CIM_Configuration(cimInstance));
                        continue;
                    }
                
                    Class<?>[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor<?> cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    
                    } catch(NoSuchMethodException e) {
                        System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of class CIM_Configuration.");
                        resultArrayList.add(new CIM_Configuration(cimInstance));
                        continue;
                    }
                
                    try {
                        Object[] actargs = new Object[] {cimInstance};
                    
                        Object dataObj = cons.newInstance(actargs);
                    
                        resultArrayList.add((CIM_Configuration)dataObj);
                    } catch (Exception e) {
                        System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of class CIM_Configuration.");
                        resultArrayList.add(new CIM_Configuration(cimInstance));
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
    public final static CIM_Configuration getInstance(WBEMClient client, CIMObjectPath cimObjectPath) throws WbemsmtException  {
    
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
    public final static CIM_Configuration getInstance(WBEMClient client, CIMInstance cimInstance) throws WbemsmtException  {
        
        CIM_Configuration dataInstance = null;
        Class<?> clazz = CIM_ConfigurationHelper.findClass(client, cimInstance);

        if (clazz == null) {
            System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of class CIM_Configuration.");
        }
        else
        {
            Class<?>[] constParams = new Class[1];
            constParams[0] = CIMInstance.class;
            try {
                Constructor<?> cons = clazz.getConstructor(constParams);
                Object[] actargs = new Object[] {cimInstance};
                dataInstance = (CIM_Configuration)cons.newInstance(actargs);
            } catch (Exception e) {
                System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of class CIM_Configuration.");
            }
        }

        try {
            if (dataInstance == null)
            {
                dataInstance = new CIM_Configuration(cimInstance);
            }
        } catch (Exception e) {
            throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The received CIMInstance object was not valid",new CIMInstance[]{cimInstance},e);
        }
        return dataInstance;
                    
    }


        
    /**
    *    The method returns an instance of a given WBEMClient for the given key properties
    */    
    public final static CIM_Configuration getInstance(WBEMClient client, String namespace
                                                       ,String Name
                                                           
     ) throws WbemsmtException  {
    
        if (client == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The WBEMClient parameter does not contain a valid reference.");
    
        }         
        CIMProperty[] keyProperties = new CIMProperty[1];
        
        Object setThis = null;

                   
                   setThis = Name;
                
           keyProperties[0]  = new CIMProperty(CIM_Configuration.PROPERTY_NAME.NAME,CIMDataType.STRING_T,setThis,true,false,CIM_Configuration.CIM_CLASS_NAME); 
                
        
        CIMObjectPath path = new CIMObjectPath(CIM_Configuration.CIM_CLASS_NAME,AbstractWbemsmtFcoHelper.harmonizeNamespace(namespace),keyProperties);        

        return getInstance(client,path);
                    
    }
     

//**********************************************************************
// createInstance     
//**********************************************************************



   /**
    * The method creates a class instance in a given CIM client
    * method executes a getInstance after creation to retrieve the instance
    * @param client the CIM client for the connection to the server
    * @param dataInstance the FCO to create
    * @param notifyDifferencies if true the method checks 
    *        if after the creation there\'s a difference and throws an WbemsmtException with Errorcode ERR_CIM_DIFFERENCE_AFTER_CREATE
    *        the userObject of the exception is a List with all Properties that are different. Every list entry contains a CIMProperty array with two elements. the first is the old property and the second is the property after creation
    * @return the created instance
    *
    */    
    public final static CIM_Configuration createInstance(WBEMClient client, CIM_Configuration dataInstance, boolean notifyDifferencies)
           throws WbemsmtException
    { 
    
        if (client == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,"The WBEMClient parameter does not contain a valid reference.");
    
        } else if (dataInstance == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,"The dataInstance parameter does not contain a valid CIMInstance object.");
    
        } else if (dataInstance.getCimObjectPath() == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,"The cimObjectPath parameter does not contain a valid reference.");
        }
    
        CIMObjectPath cimObjectPath = null;
        
        try {
           cimObjectPath = client.createInstance(dataInstance.getCimInstance());
        } catch (WBEMException e) {
           throw new CreateInstanceException(e, new CreateInstanceUserObject(dataInstance.getCimInstance()));
        }
        
        
        CIM_Configuration newDataInstance = CIM_ConfigurationHelper.getInstance(client, cimObjectPath);
        if (notifyDifferencies)
        {
           checkDifferencesAfterCreate(dataInstance, newDataInstance);
        }
        
        return newDataInstance;
    }


//**********************************************************************
// saveInstance     
//**********************************************************************


 
   /**
    * The method modifies a class instance in a given CIM client
    * @param client the CIM client for the connection to the server
    * @param dataInstance the FCO to create
    * @param notifyDifferencies if true the method checks 
    *        if after the modification there\'s a difference and throws an WbemsmtException with Errorcode ERR_CIM_DIFFERENCE_AFTER_MODIFY
    *        the userObject of the exception is a List with all Properties that are different. Every list entry contains a CIMProperty array with two elements. the first is the old property and the second is the property after creation
    * @return the modified instance
    */    
    public final static CIM_Configuration modifyInstance(WBEMClient client, CIM_Configuration dataInstance, boolean notifyDifferencies) throws WbemsmtException { 
    
        if (client == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,"The WBEMClient parameter does not contain a valid reference.");
        
        } else if (dataInstance == null || dataInstance.getCimObjectPath() == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,"The dataInstance parameter does not contain a valid reference to the destination object.");
    
        } else if (dataInstance == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,"The dataInstance parameter does not contain a valid CIMInstance object.");
        }
        
        if (dataInstance.isModified()) {
           try {
              client.modifyInstance(dataInstance.getCimInstance(),null);
           } catch (WBEMException e) {
              throw new ModifyInstanceException(e, new ModifyInstanceUserObject(dataInstance.getCimInstance(),null));
           }
           CIM_Configuration dataInstance2 = CIM_ConfigurationHelper.getInstance(client, dataInstance.getCimObjectPath());
           if (notifyDifferencies)
           {
              checkDifferencesAfterModify(dataInstance, dataInstance2);
           }
           return dataInstance2;
        }
        
        return dataInstance;
    }

//**********************************************************************
// deleteInstance     
//**********************************************************************


   /**
    * The method deletes a class instance in a given CIM client
    * @param client the CIM client for the connection to the server
    * @param dataInstance the FCO to create
    */    
    public final static void deleteInstance(WBEMClient client, CIM_Configuration dataInstance) throws WbemsmtException {
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

        return org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFcoHelper.findClass(client,cimInstance,CIM_Configuration.getPackages());
    }


           

}