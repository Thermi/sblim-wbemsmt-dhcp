/** 
  * CIM_Configuration.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm
  *
  * Contributors:
  *    Prashanth Karnam<prkarnam@in.ibm.com> 
  * 
  * Description: Note: The use of CIM_Configuration is deprecated in favor of aggregating instances of Setting or SettingData into "higher-level" Settings or SettingData objects using the ConcreteComponent association. This association simplifies the use of Settings or SettingData. With Configurations serving as aggregations of Settings (as defined by the Configuration Component relationship), separate associations were needed for the aggregation and to tie an element to either its Configurations or Settings or SettingData. These separate associations introduced unnecessary complexity and redundancy into the model. 
  * Deprecated description: The Configuration object allows the grouping of sets of parameters (defined in Setting objects) and dependencies for one or more ManagedSystemElements. It represents a certain behavior or a desired functional state for the ManagedSystemElements. The desired functional state of the Configuration is typically driven by external requirements such as time or location. For example, to connect to a Mail System from home, a dependency on a modem exists, but a dependency on a network adapter exists at work. Settings for the pertinent LogicalDevices (in this example, POTSModem and NetworkAdapter) can be defined and aggregated by the Configuration. Therefore, two "Connect to Mail" Configurations can be defined by grouping the relevant dependencies and Setting objects.
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
   import org.sblim.wbemsmt.exception.impl.*;
	   import org.sblim.wbemsmt.exception.impl.userobject.*;




import java.lang.reflect.*;
import javax.wbem.*;
public class CIM_Configuration extends  CIM_ManagedElement {



   public final static String CIM_CLASS_NAME = "CIM_Configuration";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     * Note: The Configuration class is being deprecated in lieu of using a ConcreteComponent relationship to indicate a hierarchy of Setting or SettingData instances. This association allows the reuse of the element to Setting or SettingData associations instead of defining a peer association specifically for Configurations. 
     * Deprecated description: This association relates a Configuration object to one or more ManagedSystemElements. The Configuration object represents a certain behavior or a desired functional state for the associated ManagedSystemElements.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION = "CIM_ElementConfiguration";
    
    
    
	    /**
	     * Constants of property Name
     * Note: The use of this element is deprecated. Deprecated description: The label by which the Configuration object is known.
     */
    public static class PROPERTY_NAME
    {
       /**
        * name of the property Name
        */
       public final static String NAME = "Name";                  

	    	
    

    		    
	
	    
	    }
	    	    

   

    
    static {    
           addPackage("org.sblim.wbemsmt.dhcp.bl.fco");
                         String[] parentClassPackageList = CIM_ManagedElement.getPackages();
        
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
    *   Note: The use of CIM_Configuration is deprecated in favor of aggregating instances of Setting or SettingData into "higher-level" Settings or SettingData objects using the ConcreteComponent association. This association simplifies the use of Settings or SettingData. With Configurations serving as aggregations of Settings (as defined by the Configuration Component relationship), separate associations were needed for the aggregation and to tie an element to either its Configurations or Settings or SettingData. These separate associations introduced unnecessary complexity and redundancy into the model. 
     * Deprecated description: The Configuration object allows the grouping of sets of parameters (defined in Setting objects) and dependencies for one or more ManagedSystemElements. It represents a certain behavior or a desired functional state for the ManagedSystemElements. The desired functional state of the Configuration is typically driven by external requirements such as time or location. For example, to connect to a Mail System from home, a dependency on a modem exists, but a dependency on a network adapter exists at work. Settings for the pertinent LogicalDevices (in this example, POTSModem and NetworkAdapter) can be defined and aggregated by the Configuration. Therefore, two "Connect to Mail" Configurations can be defined by grouping the relevant dependencies and Setting objects.
    *   @param client the CIM Client
    *   @param namespace the target namespace
    */  

      
   public CIM_Configuration(WBEMClient client, String namespace) throws WbemsmtException
   {
       CIMClass cls = getClass(client,namespace);
       setFromServer(false);
       init(cls.newInstance(),true);
   }
        
   /**
    *   Class constructor
    * 
    *       *   <br>
    *   Note: The use of CIM_Configuration is deprecated in favor of aggregating instances of Setting or SettingData into "higher-level" Settings or SettingData objects using the ConcreteComponent association. This association simplifies the use of Settings or SettingData. With Configurations serving as aggregations of Settings (as defined by the Configuration Component relationship), separate associations were needed for the aggregation and to tie an element to either its Configurations or Settings or SettingData. These separate associations introduced unnecessary complexity and redundancy into the model. 
     * Deprecated description: The Configuration object allows the grouping of sets of parameters (defined in Setting objects) and dependencies for one or more ManagedSystemElements. It represents a certain behavior or a desired functional state for the ManagedSystemElements. The desired functional state of the Configuration is typically driven by external requirements such as time or location. For example, to connect to a Mail System from home, a dependency on a modem exists, but a dependency on a network adapter exists at work. Settings for the pertinent LogicalDevices (in this example, POTSModem and NetworkAdapter) can be defined and aggregated by the Configuration. Therefore, two "Connect to Mail" Configurations can be defined by grouping the relevant dependencies and Setting objects.
    *   @param cimInstance the instance that is used to create the Object
    */  
   
   public CIM_Configuration(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected CIM_Configuration()
   {	
   }
   
   /**
    * initializes the FCO
    *
    *   @param cimInstance the instance that is used to create the Object
    *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
    */
   protected void init(CIMInstance cimInstance,boolean overwrite) throws WbemsmtException
   {
              propertiesToCheck.put("Name",new CIMProperty("Name",CIMDataType.STRING_T,null));
       	
	       super.init(cimInstance,overwrite);
	       
	       
	       //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
	       //we overwrite the dataType by setting null for every embeddedObject/Instance property
	       if (overwrite)
	       {
			                              
       }
   }

//**********************************************************************
// Properties get/set     
//**********************************************************************


   
   
   /**
    * Get the property Name
    *     * <br>
    * Note: The use of this element is deprecated. Deprecated description: The label by which the Configuration object is known.
    *     */

      

               
   public String get_key_Name()    {
       CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property Name
    * <br>
    * Note: The use of this element is deprecated. Deprecated description: The label by which the Configuration object is known.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_Name(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_Name(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance " + getCimObjectPath());
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

    public static CIMProperty create_key_Name(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_Configuration fco = new CIM_Configuration(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_Name(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property Name
    * <br>
    * Note: The use of this element is deprecated. Deprecated description: The label by which the Configuration object is known.
    */
    
   private static CIMProperty setPropertyValue_key_Name(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
    
//**********************************************************************
// Associators methods     
//**********************************************************************



    
                    
                                        
        
    /**
     * Get the list with CIM_ManagedSystemElement objects associated by the association CIM_ElementConfiguration
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ManagedSystemElement> getAssociated_CIM_ManagedSystemElement_CIM_ElementConfigurations(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_ManagedSystemElement_CIM_ElementConfigurations(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION,
     	                CIM_ManagedSystemElement.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ManagedSystemElement objects associated by the association CIM_ElementConfiguration
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ManagedSystemElement> getAssociated_CIM_ManagedSystemElement_CIM_ElementConfigurations(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_ManagedSystemElement_CIM_ElementConfigurations(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ManagedSystemElement objects associated by the association CIM_ElementConfiguration
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ManagedSystemElement> getAssociated_CIM_ManagedSystemElement_CIM_ElementConfigurations(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_ManagedSystemElement> result = new java.util.ArrayList<CIM_ManagedSystemElement>();
         CloseableIterator enumeration = null;

         try {
             enumeration = cimClient.associators(
                 this.getCimObjectPath(),
                 associationClass, 
                 resultClass,
                 role,resultRole, 
                 includeQualifiers,
                 includeClassOrigin,
                 propertyList);
         } catch (WBEMException e) {
         	  throw new AssociatorException(e, new AssociatorUserObject(
                 this.getCimObjectPath(),
                 associationClass, 
                 resultClass,
                 role,resultRole, 
                 includeQualifiers,
                 includeClassOrigin,
                 propertyList));	
         }
         
         try {
	             while (enumeration.hasNext()) {
                 CIM_ConfigurationHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_ConfigurationHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_ConfigurationHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_ManagedSystemElement(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_ManagedSystemElement(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_ManagedSystemElement)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_ManagedSystemElement(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_ConfigurationHelper.checkException(enumeration);
         } finally {
         try {
             if (enumeration != null) {
                 enumeration.close();
             }
         } catch(Exception e) {
             throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
         }
     }

     return result;
   }
    
   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementConfiguration
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ManagedSystemElement_CIM_ElementConfigurationNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_ManagedSystemElement_CIM_ElementConfigurationNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION,
    	                             CIM_ManagedSystemElement.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementConfiguration
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ManagedSystemElement_CIM_ElementConfigurationNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_ManagedSystemElement_CIM_ElementConfigurationNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementConfiguration
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ManagedSystemElement_CIM_ElementConfigurationNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(
                this.getCimObjectPath(),
                associationClass, 
                resultClass,
                role,resultRole);
		        
         } catch (WBEMException e) {
         	  throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION, 
                CIM_ManagedSystemElement.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_ConfigurationHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_ConfigurationHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ManagedSystemElement.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_ConfigurationHelper.checkException(enumeration);
        } finally {
        try {
            if (enumeration != null) {
                    enumeration.close();
            }
        } catch(Exception e) {
               throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
        }
      }
      return result;
   }
    
   /**
    * Get the list with CIM_ElementConfiguration associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_ElementConfiguration> getAssociations_CIM_ElementConfiguration(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_ElementConfiguration> result = new java.util.ArrayList<CIM_ElementConfiguration>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_ConfigurationHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_ConfigurationHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_ElementConfigurationHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_ElementConfiguration(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_ElementConfiguration(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_ElementConfiguration)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_ElementConfiguration(cimInstance));
                   continue;
                }
              }
           }
           CIM_ConfigurationHelper.checkException(enumeration);
        } finally {
           try {
              if (enumeration != null) {
                 enumeration.close();
              }
           } catch(Exception e) {
              throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
           }
       }

       return result;
   }
    
   /**
    * Get a list of CIMObjectPath items of the associations CIM_ElementConfiguration
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_ElementConfiguration(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFIGURATION, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_ConfigurationHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_ConfigurationHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ElementConfiguration.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_ConfigurationHelper.checkException(enumeration);
        } finally {
        try {
            if (enumeration != null) {
                    enumeration.close();
            }
        } catch(Exception e) {
               throw new WbemsmtException(WbemsmtException.ERR_FAILED, "The socket of the result could not be closed properly.");
        }
     }
     return result;
   }
    
                           
                                        
                
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
    public String getObjectName()
    {
    	    return CIM_Configuration.CIM_CLASS_NAME;
    }



}