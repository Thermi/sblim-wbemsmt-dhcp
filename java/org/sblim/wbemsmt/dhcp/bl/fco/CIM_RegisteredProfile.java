/** 
  * CIM_RegisteredProfile.java
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
  * Description: A RegisteredProfile describes a set of CIM Schema classes with required properties and/or methods, necessary to manage a real-world entity or to support a usage scenario, in an interoperable fashion. RegisteredProfiles can be defined by the DMTF or other standards organizations. Note that this class should not be confused with CIM_Profile, which collects SettingData instances, to be applied as a 'configuration profile' for an element. 
  * A RegisteredProfile is a named 'standard' for CIM-based management of a particular System, subsystem, Service or other entity, for a specified set of uses. It is a complete, standalone definition, as opposed to the subclass RegisteredSubProfile, which requires a scoping profile for context. 
  * The uses for a RegisteredProfile or SubProfile MUST be specified in the document that defines the profile. Examples of Profiles are to manage various aspects of an Operating System, Storage Array, or Database. The name of the profile is defined and scoped by its authoring organization.
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
public class CIM_RegisteredProfile extends  CIM_ManagedElement {



   public final static String CIM_CLASS_NAME = "CIM_RegisteredProfile";
   public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    
    /**
     * The CIM_ElementConformsToProfile association defines the RegisteredProfiles to which the referenced ManagedElement is conformant. Note: This association may apply to any Managed Element. Typical usage will apply it to a higher level instance, such as a System, NameSpace, or Service. When applied to a higher level instance, all constituent parts MUST behave appropriately in support of the ManagedElement's conformance to the named RegisteredProfile.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE = "CIM_ElementConformsToProfile";
    
    
    
	    /**
	     * Constants of property AdvertiseTypeDescriptions
     * A free-form string providing additional information related to the AdvertiseType. A description MUST be provided when the AdvertiseType is 1, "Other". An entry in this array corresponds to the entry in the AdvertiseTypes array at the same index. It is not expected that additional descriptions are needed if the Type is set to "Not Advertised" or "SLP". However, as the SLP template expands, or as other advertisement mechanisms are defined, support for additional descriptions may be needed. This array is defined to support this.
     */
    public static class PROPERTY_ADVERTISETYPEDESCRIPTIONS
    {
       /**
        * name of the property AdvertiseTypeDescriptions
        */
       public final static String NAME = "AdvertiseTypeDescriptions";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property AdvertiseTypes
     * This property signifies the advertisement for the profile information. It is used by the advertising services of the WBEM infrastructure to determine what should be advertised, via what mechanisms. The property is an array so that the profile MAY be advertised using several mechanisms. Note: If this property is null/uninitialized, this is equivalent to specifying the value 2, "Not Advertised".
     */
    public static class PROPERTY_ADVERTISETYPES
    {
       /**
        * name of the property AdvertiseTypes
        */
       public final static String NAME = "AdvertiseTypes";                  

	    	
    

              
       		
          /**
           * constant for value map entry 1
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other 
                              = new javax.cim.UnsignedInteger16("1");
	          	
                       /**
              * constant for value entry Other (corresponds to mapEntry 1 )
              */
             public final static String VALUE_ENTRY_Other 
                              = "Other";
                    
       		
          /**
           * constant for value map entry 2
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Advertised 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry Not Advertised (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_Not_Advertised 
                              = "Not Advertised";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_SLP 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry SLP (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_SLP 
                              = "SLP";
                    
                                        /**
                 * get the ValueMapEntry of the given value
                 * @param value the value to find the ValueMapEntry for
                 * @return the ValueMap entry or null if not found
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntry(String value)
                {
                                                
	                                               if (VALUE_ENTRY_Other.equals(value))
                         {
                            return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Not_Advertised.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Advertised;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_SLP.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_SLP;
                         }
	                      	                   	                                         return null;
                                   
                }
                
                /**
                 * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
                 * @param indexInPulldown the index within the pulldown element, the list etc
                 * @return the ValueMap entry from the displayed values
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(Number indexInPulldown)
                {
                   return getValueMapEntry(VALUE_ENTRIES_FOR_DISPLAY[indexInPulldown.intValue()]);
                }
                
               /**
                 * gets the value for the given valueMap entry (currentValue) and gives back the index of this value within the VALUE_ENTRIES_FOR_DISPLAY array
                 *
                 * can be used to set the correct selection index for a pulldown field
                 *
                 * @return -1 if for the currentValue no value within VALUE_ENTRIES_FOR_DISPLAY was found
                 * @param currentValue the currentValue to get the index for
                 */
                public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue)
                {
                   String valueEntry = getValueEntry(currentValue);
                   if (valueEntry != null)
                   {
                      for (int i=0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++)
                      {
                         if (VALUE_ENTRIES_FOR_DISPLAY[	i].equals(valueEntry))
                         {
                         	   return i;
                         }
                      }
                   }
                  	 return -1;
                   
                }

                /**
                 * get the ValueEntry of the given valueMapEntry
                 * @param valueMapEntry the entry within the valueMap to find the ValueEntry for
                 * @return the Value entry or null if not found
                 */
                
                public static String getValueEntry(javax.cim.UnsignedInteger16 value)
                {
                   int iValue = value.intValue();
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue())
                         {
                            return VALUE_ENTRY_Other;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Advertised.intValue())
                         {
                            return VALUE_ENTRY_Not_Advertised;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_SLP.intValue())
                         {
                            return VALUE_ENTRY_SLP;
                         }
                                                                                  return null;
                                   
                }
          
                          
                /**
                 * get the ValueEntries of the given valueMapEntries
                 * @param values the values to find the ValueMapEntries for
                 * @return the array with ValueMap entries. Some of them may be null to if no valueMap entry was found
                 */
                 
                public static javax.cim.UnsignedInteger16[] getValueMapEntries(String[] values)
                {
                    javax.cim.UnsignedInteger16[] result = new javax.cim.UnsignedInteger16[values.length];
                    
                    for (int i=0; i < result.length; i++)
                    {
	                       result[i] = getValueMapEntry(values[i]);
                    }
                    
                    return result;
                }
                
                
                /**
                 * get the ValueMapEntries of the given valueEntries
                 * @param valueMapEntries the valueMap entries to find the Values for
                 * @return the array with Value entries. Some of them may be null to if no value entry was found
                 */          
                
                public static String[] getValueEntries(javax.cim.UnsignedInteger16[] values)
                {
                    String[] result = new String[values.length];
                    
                    for (int i=0; i < result.length; i++)
                    {
	                       result[i] = getValueEntry(values[i]);
                    }
                    
                    return result;
                }
                                    
          /**
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property AdvertiseTypes   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other
                     	                            ,  VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Advertised
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_SLP
                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property AdvertiseTypes   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_Not_Advertised
                                                                 ,  VALUE_ENTRY_SLP
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property AdvertiseTypes   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_Not_Advertised
                                                                 ,  VALUE_ENTRY_SLP
                                    };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property InstanceID
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness, <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the organizational entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
     */
    public static class PROPERTY_INSTANCEID
    {
       /**
        * name of the property InstanceID
        */
       public final static String NAME = "InstanceID";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property OtherRegisteredOrganization
     * A free-form string providing a description of the organization when 1, "Other", is specified for the RegisteredOrganization.
     */
    public static class PROPERTY_OTHERREGISTEREDORGANIZATION
    {
       /**
        * name of the property OtherRegisteredOrganization
        */
       public final static String NAME = "OtherRegisteredOrganization";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property RegisteredName
     * The name of this registered profile. Since multiple versions can exist for the same RegisteredName, the combination of RegisteredName, RegisteredOrganization, and RegisteredVersion MUST uniquely identify the registered profile within the scope of the organization.
     */
    public static class PROPERTY_REGISTEREDNAME
    {
       /**
        * name of the property RegisteredName
        */
       public final static String NAME = "RegisteredName";                  

	    	
    

    		    
	
	    
	    }
	    
	    /**
	     * Constants of property RegisteredOrganization
     * The organization that defines this profile.
     */
    public static class PROPERTY_REGISTEREDORGANIZATION
    {
       /**
        * name of the property RegisteredOrganization
        */
       public final static String NAME = "RegisteredOrganization";                  

	    	
    

              
       		
          /**
           * constant for value map entry 1
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other 
                              = new javax.cim.UnsignedInteger16("1");
	          	
                       /**
              * constant for value entry Other (corresponds to mapEntry 1 )
              */
             public final static String VALUE_ENTRY_Other 
                              = "Other";
                    
       		
          /**
           * constant for value map entry 2
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DMTF 
                              = new javax.cim.UnsignedInteger16("2");
	          	
                       /**
              * constant for value entry DMTF (corresponds to mapEntry 2 )
              */
             public final static String VALUE_ENTRY_DMTF 
                              = "DMTF";
                    
       		
          /**
           * constant for value map entry 3
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CompTIA 
                              = new javax.cim.UnsignedInteger16("3");
	          	
                       /**
              * constant for value entry CompTIA (corresponds to mapEntry 3 )
              */
             public final static String VALUE_ENTRY_CompTIA 
                              = "CompTIA";
                    
       		
          /**
           * constant for value map entry 4
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Consortium_for_Service_Innovation 
                              = new javax.cim.UnsignedInteger16("4");
	          	
                       /**
              * constant for value entry Consortium for Service Innovation (corresponds to mapEntry 4 )
              */
             public final static String VALUE_ENTRY_Consortium_for_Service_Innovation 
                              = "Consortium for Service Innovation";
                    
       		
          /**
           * constant for value map entry 5
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_FAST 
                              = new javax.cim.UnsignedInteger16("5");
	          	
                       /**
              * constant for value entry FAST (corresponds to mapEntry 5 )
              */
             public final static String VALUE_ENTRY_FAST 
                              = "FAST";
                    
       		
          /**
           * constant for value map entry 6
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_GGF 
                              = new javax.cim.UnsignedInteger16("6");
	          	
                       /**
              * constant for value entry GGF (corresponds to mapEntry 6 )
              */
             public final static String VALUE_ENTRY_GGF 
                              = "GGF";
                    
       		
          /**
           * constant for value map entry 7
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_INTAP 
                              = new javax.cim.UnsignedInteger16("7");
	          	
                       /**
              * constant for value entry INTAP (corresponds to mapEntry 7 )
              */
             public final static String VALUE_ENTRY_INTAP 
                              = "INTAP";
                    
       		
          /**
           * constant for value map entry 8
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_itSMF 
                              = new javax.cim.UnsignedInteger16("8");
	          	
                       /**
              * constant for value entry itSMF (corresponds to mapEntry 8 )
              */
             public final static String VALUE_ENTRY_itSMF 
                              = "itSMF";
                    
       		
          /**
           * constant for value map entry 9
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_NAC 
                              = new javax.cim.UnsignedInteger16("9");
	          	
                       /**
              * constant for value entry NAC (corresponds to mapEntry 9 )
              */
             public final static String VALUE_ENTRY_NAC 
                              = "NAC";
                    
       		
          /**
           * constant for value map entry 10
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Northwest_Energy_Efficiency_Alliance 
                              = new javax.cim.UnsignedInteger16("10");
	          	
                       /**
              * constant for value entry Northwest Energy Efficiency Alliance (corresponds to mapEntry 10 )
              */
             public final static String VALUE_ENTRY_Northwest_Energy_Efficiency_Alliance 
                              = "Northwest Energy Efficiency Alliance";
                    
       		
          /**
           * constant for value map entry 11
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SNIA 
                              = new javax.cim.UnsignedInteger16("11");
	          	
                       /**
              * constant for value entry SNIA (corresponds to mapEntry 11 )
              */
             public final static String VALUE_ENTRY_SNIA 
                              = "SNIA";
                    
       		
          /**
           * constant for value map entry 12
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_TM_Forum 
                              = new javax.cim.UnsignedInteger16("12");
	          	
                       /**
              * constant for value entry TM Forum (corresponds to mapEntry 12 )
              */
             public final static String VALUE_ENTRY_TM_Forum 
                              = "TM Forum";
                    
       		
          /**
           * constant for value map entry 13
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_The_Open_Group 
                              = new javax.cim.UnsignedInteger16("13");
	          	
                       /**
              * constant for value entry The Open Group (corresponds to mapEntry 13 )
              */
             public final static String VALUE_ENTRY_The_Open_Group 
                              = "The Open Group";
                    
       		
          /**
           * constant for value map entry 14
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_ANSI 
                              = new javax.cim.UnsignedInteger16("14");
	          	
                       /**
              * constant for value entry ANSI (corresponds to mapEntry 14 )
              */
             public final static String VALUE_ENTRY_ANSI 
                              = "ANSI";
                    
       		
          /**
           * constant for value map entry 15
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_IEEE 
                              = new javax.cim.UnsignedInteger16("15");
	          	
                       /**
              * constant for value entry IEEE (corresponds to mapEntry 15 )
              */
             public final static String VALUE_ENTRY_IEEE 
                              = "IEEE";
                    
       		
          /**
           * constant for value map entry 16
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_IETF 
                              = new javax.cim.UnsignedInteger16("16");
	          	
                       /**
              * constant for value entry IETF (corresponds to mapEntry 16 )
              */
             public final static String VALUE_ENTRY_IETF 
                              = "IETF";
                    
       		
          /**
           * constant for value map entry 17
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_INCITS 
                              = new javax.cim.UnsignedInteger16("17");
	          	
                       /**
              * constant for value entry INCITS (corresponds to mapEntry 17 )
              */
             public final static String VALUE_ENTRY_INCITS 
                              = "INCITS";
                    
       		
          /**
           * constant for value map entry 18
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_ISO 
                              = new javax.cim.UnsignedInteger16("18");
	          	
                       /**
              * constant for value entry ISO (corresponds to mapEntry 18 )
              */
             public final static String VALUE_ENTRY_ISO 
                              = "ISO";
                    
       		
          /**
           * constant for value map entry 19
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_W3C 
                              = new javax.cim.UnsignedInteger16("19");
	          	
                       /**
              * constant for value entry W3C (corresponds to mapEntry 19 )
              */
             public final static String VALUE_ENTRY_W3C 
                              = "W3C";
                    
       		
          /**
           * constant for value map entry 20
           */ 
		          
          public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_OGF 
                              = new javax.cim.UnsignedInteger16("20");
	          	
                       /**
              * constant for value entry OGF (corresponds to mapEntry 20 )
              */
             public final static String VALUE_ENTRY_OGF 
                              = "OGF";
                    
       		
          /**
           * constant for value map entry ..
           */ 
		          	
                       /**
              * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
              */
             public final static String VALUE_ENTRY_DMTF_Reserved 
                              = "DMTF Reserved";
                    
                                        /**
                 * get the ValueMapEntry of the given value
                 * @param value the value to find the ValueMapEntry for
                 * @return the ValueMap entry or null if not found
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntry(String value)
                {
                                                
	                                               if (VALUE_ENTRY_Other.equals(value))
                         {
                            return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_DMTF.equals(value))
                         {
                            return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DMTF;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_CompTIA.equals(value))
                         {
                            return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CompTIA;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Consortium_for_Service_Innovation.equals(value))
                         {
                            return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Consortium_for_Service_Innovation;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_FAST.equals(value))
                         {
                            return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_FAST;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_GGF.equals(value))
                         {
                            return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_GGF;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_INTAP.equals(value))
                         {
                            return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_INTAP;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_itSMF.equals(value))
                         {
                            return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_itSMF;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_NAC.equals(value))
                         {
                            return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_NAC;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_Northwest_Energy_Efficiency_Alliance.equals(value))
                         {
                            return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Northwest_Energy_Efficiency_Alliance;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_SNIA.equals(value))
                         {
                            return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SNIA;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_TM_Forum.equals(value))
                         {
                            return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_TM_Forum;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_The_Open_Group.equals(value))
                         {
                            return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_The_Open_Group;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_ANSI.equals(value))
                         {
                            return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_ANSI;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_IEEE.equals(value))
                         {
                            return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_IEEE;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_IETF.equals(value))
                         {
                            return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_IETF;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_INCITS.equals(value))
                         {
                            return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_INCITS;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_ISO.equals(value))
                         {
                            return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_ISO;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_W3C.equals(value))
                         {
                            return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_W3C;
                         }
	                      	                             
	                                               if (VALUE_ENTRY_OGF.equals(value))
                         {
                            return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_OGF;
                         }
	                      	                             
	                      	                   	                                         return null;
                                   
                }
                
                /**
                 * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
                 * @param indexInPulldown the index within the pulldown element, the list etc
                 * @return the ValueMap entry from the displayed values
                 */
                public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(Number indexInPulldown)
                {
                   return getValueMapEntry(VALUE_ENTRIES_FOR_DISPLAY[indexInPulldown.intValue()]);
                }
                
               /**
                 * gets the value for the given valueMap entry (currentValue) and gives back the index of this value within the VALUE_ENTRIES_FOR_DISPLAY array
                 *
                 * can be used to set the correct selection index for a pulldown field
                 *
                 * @return -1 if for the currentValue no value within VALUE_ENTRIES_FOR_DISPLAY was found
                 * @param currentValue the currentValue to get the index for
                 */
                public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue)
                {
                   String valueEntry = getValueEntry(currentValue);
                   if (valueEntry != null)
                   {
                      for (int i=0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++)
                      {
                         if (VALUE_ENTRIES_FOR_DISPLAY[	i].equals(valueEntry))
                         {
                         	   return i;
                         }
                      }
                   }
                  	 return -1;
                   
                }

                /**
                 * get the ValueEntry of the given valueMapEntry
                 * @param valueMapEntry the entry within the valueMap to find the ValueEntry for
                 * @return the Value entry or null if not found
                 */
                
                public static String getValueEntry(javax.cim.UnsignedInteger16 value)
                {
                   int iValue = value.intValue();
                                                                                     
                         if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue())
                         {
                            return VALUE_ENTRY_Other;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DMTF.intValue())
                         {
                            return VALUE_ENTRY_DMTF;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CompTIA.intValue())
                         {
                            return VALUE_ENTRY_CompTIA;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Consortium_for_Service_Innovation.intValue())
                         {
                            return VALUE_ENTRY_Consortium_for_Service_Innovation;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_FAST.intValue())
                         {
                            return VALUE_ENTRY_FAST;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_GGF.intValue())
                         {
                            return VALUE_ENTRY_GGF;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_INTAP.intValue())
                         {
                            return VALUE_ENTRY_INTAP;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_itSMF.intValue())
                         {
                            return VALUE_ENTRY_itSMF;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_NAC.intValue())
                         {
                            return VALUE_ENTRY_NAC;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Northwest_Energy_Efficiency_Alliance.intValue())
                         {
                            return VALUE_ENTRY_Northwest_Energy_Efficiency_Alliance;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SNIA.intValue())
                         {
                            return VALUE_ENTRY_SNIA;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_TM_Forum.intValue())
                         {
                            return VALUE_ENTRY_TM_Forum;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_The_Open_Group.intValue())
                         {
                            return VALUE_ENTRY_The_Open_Group;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_ANSI.intValue())
                         {
                            return VALUE_ENTRY_ANSI;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_IEEE.intValue())
                         {
                            return VALUE_ENTRY_IEEE;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_IETF.intValue())
                         {
                            return VALUE_ENTRY_IETF;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_INCITS.intValue())
                         {
                            return VALUE_ENTRY_INCITS;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_ISO.intValue())
                         {
                            return VALUE_ENTRY_ISO;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_W3C.intValue())
                         {
                            return VALUE_ENTRY_W3C;
                         }
                                                                                        
                         if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_OGF.intValue())
                         {
                            return VALUE_ENTRY_OGF;
                         }
                                                                                        return VALUE_ENTRY_DMTF_Reserved;
                                                                            
                }
          
                                    
          /**
	       * ValueMap entries
       * Contains no entries that having an integer value range representation
       * 
       * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
       *
       * @see \#VALUE_ENTRIES_FOR_DISPLAY
       * 
       * Value Map for the property RegisteredOrganization   
       */
      public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = { 
	         	                              VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other
                     	                            ,  VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_DMTF
                     	                            ,  VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_CompTIA
                     	                            ,  VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Consortium_for_Service_Innovation
                     	                            ,  VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_FAST
                     	                            ,  VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_GGF
                     	                            ,  VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_INTAP
                     	                            ,  VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_itSMF
                     	                            ,  VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_NAC
                     	                            ,  VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Northwest_Energy_Efficiency_Alliance
                     	                            ,  VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_SNIA
                     	                            ,  VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_TM_Forum
                     	                            ,  VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_The_Open_Group
                     	                            ,  VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_ANSI
                     	                            ,  VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_IEEE
                     	                            ,  VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_IETF
                     	                            ,  VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_INCITS
                     	                            ,  VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_ISO
                     	                            ,  VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_W3C
                     	                            ,  VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_OGF
                     	                           };
    	
	           /**
        * Values
        * Contains all values even those having an integer value range representation within the valueMap
        * Value Map for the property RegisteredOrganization   
        */
       public final static String[] VALUE_ENTRIES = { 
                                                   VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_DMTF
                                                                 ,  VALUE_ENTRY_CompTIA
                                                                 ,  VALUE_ENTRY_Consortium_for_Service_Innovation
                                                                 ,  VALUE_ENTRY_FAST
                                                                 ,  VALUE_ENTRY_GGF
                                                                 ,  VALUE_ENTRY_INTAP
                                                                 ,  VALUE_ENTRY_itSMF
                                                                 ,  VALUE_ENTRY_NAC
                                                                 ,  VALUE_ENTRY_Northwest_Energy_Efficiency_Alliance
                                                                 ,  VALUE_ENTRY_SNIA
                                                                 ,  VALUE_ENTRY_TM_Forum
                                                                 ,  VALUE_ENTRY_The_Open_Group
                                                                 ,  VALUE_ENTRY_ANSI
                                                                 ,  VALUE_ENTRY_IEEE
                                                                 ,  VALUE_ENTRY_IETF
                                                                 ,  VALUE_ENTRY_INCITS
                                                                 ,  VALUE_ENTRY_ISO
                                                                 ,  VALUE_ENTRY_W3C
                                                                 ,  VALUE_ENTRY_OGF
                                                                 ,  VALUE_ENTRY_DMTF_Reserved
                                    };

              /**
        * Values for displaying within pulldown elements, lists, radio buttons etc
        * Contains no values that having an integer value range representation within the valueMap
        * 
        * Value Map for the property RegisteredOrganization   
        */
       public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { 
                                                   VALUE_ENTRY_Other
                                                                 ,  VALUE_ENTRY_DMTF
                                                                 ,  VALUE_ENTRY_CompTIA
                                                                 ,  VALUE_ENTRY_Consortium_for_Service_Innovation
                                                                 ,  VALUE_ENTRY_FAST
                                                                 ,  VALUE_ENTRY_GGF
                                                                 ,  VALUE_ENTRY_INTAP
                                                                 ,  VALUE_ENTRY_itSMF
                                                                 ,  VALUE_ENTRY_NAC
                                                                 ,  VALUE_ENTRY_Northwest_Energy_Efficiency_Alliance
                                                                 ,  VALUE_ENTRY_SNIA
                                                                 ,  VALUE_ENTRY_TM_Forum
                                                                 ,  VALUE_ENTRY_The_Open_Group
                                                                 ,  VALUE_ENTRY_ANSI
                                                                 ,  VALUE_ENTRY_IEEE
                                                                 ,  VALUE_ENTRY_IETF
                                                                 ,  VALUE_ENTRY_INCITS
                                                                 ,  VALUE_ENTRY_ISO
                                                                 ,  VALUE_ENTRY_W3C
                                                                 ,  VALUE_ENTRY_OGF
                                                                 };

        
		    
	
	    
	    }
	    
	    /**
	     * Constants of property RegisteredVersion
     * The version of this profile. The string representing the version MUST be in the form: 
     * M + "." + N + "." + U 
     * Where: 
     * M - The major version (in numeric form) describing the profile's creation or last modification. 
     * N - The minor version (in numeric form) describing the profile's creation or last modification. 
     * U - The update (e.g. errata, patch, ..., in numeric form) describing the profile's creation or last modification.
     */
    public static class PROPERTY_REGISTEREDVERSION
    {
       /**
        * name of the property RegisteredVersion
        */
       public final static String NAME = "RegisteredVersion";                  

	    	
    

    		    
	
	    
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
    *   A RegisteredProfile describes a set of CIM Schema classes with required properties and/or methods, necessary to manage a real-world entity or to support a usage scenario, in an interoperable fashion. RegisteredProfiles can be defined by the DMTF or other standards organizations. Note that this class should not be confused with CIM_Profile, which collects SettingData instances, to be applied as a 'configuration profile' for an element. 
     * A RegisteredProfile is a named 'standard' for CIM-based management of a particular System, subsystem, Service or other entity, for a specified set of uses. It is a complete, standalone definition, as opposed to the subclass RegisteredSubProfile, which requires a scoping profile for context. 
     * The uses for a RegisteredProfile or SubProfile MUST be specified in the document that defines the profile. Examples of Profiles are to manage various aspects of an Operating System, Storage Array, or Database. The name of the profile is defined and scoped by its authoring organization.
    *   @param client the CIM Client
    *   @param namespace the target namespace
    */  

      
   public CIM_RegisteredProfile(WBEMClient client, String namespace) throws WbemsmtException
   {
       CIMClass cls = getClass(client,namespace);
       setFromServer(false);
       init(cls.newInstance(),true);
   }
        
   /**
    *   Class constructor
    * 
    *       *   <br>
    *   A RegisteredProfile describes a set of CIM Schema classes with required properties and/or methods, necessary to manage a real-world entity or to support a usage scenario, in an interoperable fashion. RegisteredProfiles can be defined by the DMTF or other standards organizations. Note that this class should not be confused with CIM_Profile, which collects SettingData instances, to be applied as a 'configuration profile' for an element. 
     * A RegisteredProfile is a named 'standard' for CIM-based management of a particular System, subsystem, Service or other entity, for a specified set of uses. It is a complete, standalone definition, as opposed to the subclass RegisteredSubProfile, which requires a scoping profile for context. 
     * The uses for a RegisteredProfile or SubProfile MUST be specified in the document that defines the profile. Examples of Profiles are to manage various aspects of an Operating System, Storage Array, or Database. The name of the profile is defined and scoped by its authoring organization.
    *   @param cimInstance the instance that is used to create the Object
    */  
   
   public CIM_RegisteredProfile(CIMInstance cimInstance)  throws WbemsmtException { 
        
       if (cimInstance == null) {
           throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER, "The cimInstance parameter does not contain a valid reference.");
       }
       setFromServer(true);
       init(cimInstance,false);
   }
   
   /**
    * Default constructor
    */
   protected CIM_RegisteredProfile()
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
              propertiesToCheck.put("AdvertiseTypeDescriptions",new CIMProperty("AdvertiseTypeDescriptions",CIMDataType.STRING_ARRAY_T,null));
              propertiesToCheck.put("AdvertiseTypes",new CIMProperty("AdvertiseTypes",CIMDataType.UINT16_ARRAY_T,null));
              propertiesToCheck.put("InstanceID",new CIMProperty("InstanceID",CIMDataType.STRING_T,null));
              propertiesToCheck.put("OtherRegisteredOrganization",new CIMProperty("OtherRegisteredOrganization",CIMDataType.STRING_T,null));
              propertiesToCheck.put("RegisteredName",new CIMProperty("RegisteredName",CIMDataType.STRING_T,null));
              propertiesToCheck.put("RegisteredOrganization",new CIMProperty("RegisteredOrganization",CIMDataType.UINT16_T,null));
              propertiesToCheck.put("RegisteredVersion",new CIMProperty("RegisteredVersion",CIMDataType.STRING_T,null));
       	
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
    * Get the property AdvertiseTypeDescriptions
    *     * <br>
    * A free-form string providing additional information related to the AdvertiseType. A description MUST be provided when the AdvertiseType is 1, "Other". An entry in this array corresponds to the entry in the AdvertiseTypes array at the same index. It is not expected that additional descriptions are needed if the Type is set to "Not Advertised" or "SLP". However, as the SLP template expands, or as other advertisement mechanisms are defined, support for additional descriptions may be needed. This array is defined to support this.
    *     */

      

               
   public String[] get_AdvertiseTypeDescriptions()    {
       CIMProperty currentProperty = getProperty(PROPERTY_ADVERTISETYPEDESCRIPTIONS.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_ADVERTISETYPEDESCRIPTIONS.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String[])currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property AdvertiseTypeDescriptions
    * <br>
    * A free-form string providing additional information related to the AdvertiseType. A description MUST be provided when the AdvertiseType is 1, "Other". An entry in this array corresponds to the entry in the AdvertiseTypes array at the same index. It is not expected that additional descriptions are needed if the Type is set to "Not Advertised" or "SLP". However, as the SLP template expands, or as other advertisement mechanisms are defined, support for additional descriptions may be needed. This array is defined to support this.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_AdvertiseTypeDescriptions(String[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_ADVERTISETYPEDESCRIPTIONS.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_AdvertiseTypeDescriptions(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_ADVERTISETYPEDESCRIPTIONS.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property AdvertiseTypeDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AdvertiseTypeDescriptions(WBEMClient client, String namespace, String[] newValue) throws WbemsmtException {
        CIM_RegisteredProfile fco = new CIM_RegisteredProfile(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADVERTISETYPEDESCRIPTIONS.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_AdvertiseTypeDescriptions(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_ADVERTISETYPEDESCRIPTIONS.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property AdvertiseTypeDescriptions
    * <br>
    * A free-form string providing additional information related to the AdvertiseType. A description MUST be provided when the AdvertiseType is 1, "Other". An entry in this array corresponds to the entry in the AdvertiseTypes array at the same index. It is not expected that additional descriptions are needed if the Type is set to "Not Advertised" or "SLP". However, as the SLP template expands, or as other advertisement mechanisms are defined, support for additional descriptions may be needed. This array is defined to support this.
    */
    
   private static CIMProperty setPropertyValue_AdvertiseTypeDescriptions(CIMProperty currentProperty, String[] newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property AdvertiseTypes
    *     * <br>
    * This property signifies the advertisement for the profile information. It is used by the advertising services of the WBEM infrastructure to determine what should be advertised, via what mechanisms. The property is an array so that the profile MAY be advertised using several mechanisms. Note: If this property is null/uninitialized, this is equivalent to specifying the value 2, "Not Advertised".
    *     */

      

               
   public javax.cim.UnsignedInteger16[] get_AdvertiseTypes()    {
       CIMProperty currentProperty = getProperty(PROPERTY_ADVERTISETYPES.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_ADVERTISETYPES.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16[])currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property AdvertiseTypes
    * <br>
    * This property signifies the advertisement for the profile information. It is used by the advertising services of the WBEM infrastructure to determine what should be advertised, via what mechanisms. The property is an array so that the profile MAY be advertised using several mechanisms. Note: If this property is null/uninitialized, this is equivalent to specifying the value 2, "Not Advertised".
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_AdvertiseTypes(javax.cim.UnsignedInteger16[] newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_ADVERTISETYPES.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_AdvertiseTypes(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_ADVERTISETYPES.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property AdvertiseTypes by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AdvertiseTypes(WBEMClient client, String namespace, javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_RegisteredProfile fco = new CIM_RegisteredProfile(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADVERTISETYPES.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_AdvertiseTypes(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_ADVERTISETYPES.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property AdvertiseTypes
    * <br>
    * This property signifies the advertisement for the profile information. It is used by the advertising services of the WBEM infrastructure to determine what should be advertised, via what mechanisms. The property is an array so that the profile MAY be advertised using several mechanisms. Note: If this property is null/uninitialized, this is equivalent to specifying the value 2, "Not Advertised".
    */
    
   private static CIMProperty setPropertyValue_AdvertiseTypes(CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property InstanceID
    *     * <br>
    * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness, <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the organizational entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
    *     */

      

               
   public String get_key_InstanceID()    {
       CIMProperty currentProperty = getProperty(PROPERTY_INSTANCEID.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property InstanceID
    * <br>
    * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness, <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the organizational entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_key_InstanceID(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_INSTANCEID.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_key_InstanceID(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance " + getCimObjectPath());
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

    public static CIMProperty create_key_InstanceID(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_RegisteredProfile fco = new CIM_RegisteredProfile(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INSTANCEID.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_key_InstanceID(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_INSTANCEID.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property InstanceID
    * <br>
    * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness, <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the organizational entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
     * For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
    */
    
   private static CIMProperty setPropertyValue_key_InstanceID(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property OtherRegisteredOrganization
    *     * <br>
    * A free-form string providing a description of the organization when 1, "Other", is specified for the RegisteredOrganization.
    *     */

      

               
   public String get_OtherRegisteredOrganization()    {
       CIMProperty currentProperty = getProperty(PROPERTY_OTHERREGISTEREDORGANIZATION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_OTHERREGISTEREDORGANIZATION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property OtherRegisteredOrganization
    * <br>
    * A free-form string providing a description of the organization when 1, "Other", is specified for the RegisteredOrganization.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_OtherRegisteredOrganization(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_OTHERREGISTEREDORGANIZATION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_OtherRegisteredOrganization(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_OTHERREGISTEREDORGANIZATION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property OtherRegisteredOrganization by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherRegisteredOrganization(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_RegisteredProfile fco = new CIM_RegisteredProfile(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERREGISTEREDORGANIZATION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_OtherRegisteredOrganization(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_OTHERREGISTEREDORGANIZATION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property OtherRegisteredOrganization
    * <br>
    * A free-form string providing a description of the organization when 1, "Other", is specified for the RegisteredOrganization.
    */
    
   private static CIMProperty setPropertyValue_OtherRegisteredOrganization(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property RegisteredName
    *     * <br>
    * The name of this registered profile. Since multiple versions can exist for the same RegisteredName, the combination of RegisteredName, RegisteredOrganization, and RegisteredVersion MUST uniquely identify the registered profile within the scope of the organization.
    *     */

      

               
   public String get_RegisteredName()    {
       CIMProperty currentProperty = getProperty(PROPERTY_REGISTEREDNAME.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_REGISTEREDNAME.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property RegisteredName
    * <br>
    * The name of this registered profile. Since multiple versions can exist for the same RegisteredName, the combination of RegisteredName, RegisteredOrganization, and RegisteredVersion MUST uniquely identify the registered profile within the scope of the organization.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_RegisteredName(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_REGISTEREDNAME.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_RegisteredName(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_REGISTEREDNAME.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property RegisteredName by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RegisteredName(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_RegisteredProfile fco = new CIM_RegisteredProfile(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REGISTEREDNAME.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_RegisteredName(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_REGISTEREDNAME.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property RegisteredName
    * <br>
    * The name of this registered profile. Since multiple versions can exist for the same RegisteredName, the combination of RegisteredName, RegisteredOrganization, and RegisteredVersion MUST uniquely identify the registered profile within the scope of the organization.
    */
    
   private static CIMProperty setPropertyValue_RegisteredName(CIMProperty currentProperty, String newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property RegisteredOrganization
    *     * <br>
    * The organization that defines this profile.
    *     */

      

               
   public javax.cim.UnsignedInteger16 get_RegisteredOrganization()    {
       CIMProperty currentProperty = getProperty(PROPERTY_REGISTEREDORGANIZATION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_REGISTEREDORGANIZATION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (javax.cim.UnsignedInteger16)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property RegisteredOrganization
    * <br>
    * The organization that defines this profile.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_RegisteredOrganization(javax.cim.UnsignedInteger16 newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_REGISTEREDORGANIZATION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_RegisteredOrganization(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_REGISTEREDORGANIZATION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property RegisteredOrganization by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RegisteredOrganization(WBEMClient client, String namespace, javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_RegisteredProfile fco = new CIM_RegisteredProfile(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REGISTEREDORGANIZATION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_RegisteredOrganization(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_REGISTEREDORGANIZATION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property RegisteredOrganization
    * <br>
    * The organization that defines this profile.
    */
    
   private static CIMProperty setPropertyValue_RegisteredOrganization(CIMProperty currentProperty, javax.cim.UnsignedInteger16 newValue)
   {
        Object setThis = null;        


                   setThis = newValue;
                
        CIMProperty newProperty = new CIMProperty(currentProperty.getName(),currentProperty.getDataType(),setThis,currentProperty.isKey(),currentProperty.isPropagated(),currentProperty.getOriginClass());
        
        return newProperty;
   }   
   
   
   
   /**
    * Get the property RegisteredVersion
    *     * <br>
    * The version of this profile. The string representing the version MUST be in the form: 
     * M + "." + N + "." + U 
     * Where: 
     * M - The major version (in numeric form) describing the profile's creation or last modification. 
     * N - The minor version (in numeric form) describing the profile's creation or last modification. 
     * U - The update (e.g. errata, patch, ..., in numeric form) describing the profile's creation or last modification.
    *     */

      

               
   public String get_RegisteredVersion()    {
       CIMProperty currentProperty = getProperty(PROPERTY_REGISTEREDVERSION.NAME);

       if (currentProperty == null || currentProperty.getValue() == null) {
           logger.warning("Property " + PROPERTY_REGISTEREDVERSION.NAME + " was not found in instance " + getCimObjectPath());
           return null;
       }
        
              
          return (String)currentProperty.getValue();
           
    }
    
       
      
   /**
    * Set the property RegisteredVersion
    * <br>
    * The version of this profile. The string representing the version MUST be in the form: 
     * M + "." + N + "." + U 
     * Where: 
     * M - The major version (in numeric form) describing the profile's creation or last modification. 
     * N - The minor version (in numeric form) describing the profile's creation or last modification. 
     * U - The update (e.g. errata, patch, ..., in numeric form) describing the profile's creation or last modification.
    *
    * @return true if the property was found, false if the property was not found and the value was not set
    */
    
   public boolean set_RegisteredVersion(String newValue)
   {
	        CIMProperty currentProperty = getProperty(PROPERTY_REGISTEREDVERSION.NAME);
	        if (currentProperty != null)
	        {
           setProperty(setPropertyValue_RegisteredVersion(currentProperty,newValue));
	           return true;  
	        }
	        else
	       	 {
	       	 	   logger.warning("Property " + PROPERTY_REGISTEREDVERSION.NAME + " was not found in instance " + getCimObjectPath());
	       	    return false;
	       	 }
	        
   }
    
      
    /**
     * Get the property RegisteredVersion by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RegisteredVersion(WBEMClient client, String namespace, String newValue) throws WbemsmtException {
        CIM_RegisteredProfile fco = new CIM_RegisteredProfile(client,namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REGISTEREDVERSION.NAME);
        if (property != null)
        {
	        	   property = setPropertyValue_RegisteredVersion(property,newValue);
        }
        else
       	 {
       	 		   logger.warning("Property " + PROPERTY_REGISTEREDVERSION.NAME + " was not found in instance " + fco.getCimObjectPath());
       	 }
        return property;
    }
   
   /**
    * Set the property RegisteredVersion
    * <br>
    * The version of this profile. The string representing the version MUST be in the form: 
     * M + "." + N + "." + U 
     * Where: 
     * M - The major version (in numeric form) describing the profile's creation or last modification. 
     * N - The minor version (in numeric form) describing the profile's creation or last modification. 
     * U - The update (e.g. errata, patch, ..., in numeric form) describing the profile's creation or last modification.
    */
    
   private static CIMProperty setPropertyValue_RegisteredVersion(CIMProperty currentProperty, String newValue)
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
     * Get the list with CIM_ManagedElement objects associated by the association CIM_ElementConformsToProfile
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ManagedElement> getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfiles(WBEMClient cimClient) throws WbemsmtException {
     
     	   return getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfiles(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE,
     	                CIM_ManagedElement.CIM_CLASS_NAME,
     	                null,
     	                null,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ManagedElement objects associated by the association CIM_ElementConformsToProfile
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ManagedElement> getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfiles(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
     
     	   return getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfiles(
     	                cimClient,
     	                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE,
     	                resultClass,
     	                role,
     	                resultRole,
     	                false,
     	                false,
     	                null);
     		
     }

    /**
     * Get the list with CIM_ManagedElement objects associated by the association CIM_ElementConformsToProfile
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/
                        
     public java.util.List<CIM_ManagedElement> getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfiles(WBEMClient cimClient, String associationClass, String resultClass, String role, String resultRole, boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList) throws WbemsmtException {

         if (cimClient == null) {
             throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
         }

         java.util.List<CIM_ManagedElement> result = new java.util.ArrayList<CIM_ManagedElement>();
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
                 CIM_RegisteredProfileHelper.checkException(enumeration);
           
                 Object obj = enumeration.next();
                 CIM_RegisteredProfileHelper.checkException(enumeration);

                 if (obj instanceof CIMInstance) {
                     CIMInstance cimInstance = (CIMInstance)obj;
                     Class<?> clazz = CIM_RegisteredProfileHelper.findClass(cimClient, cimInstance);
                    
                     if (clazz == null) {
                         System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                         result.add(new CIM_ManagedElement(cimInstance));
                         continue;
                     }

                     Class<?>[] constParams = new Class[1];
                     constParams[0] = CIMInstance.class;
                     Constructor<?> cons = null;
                     try {
                         cons = clazz.getConstructor(constParams);
                     } catch(NoSuchMethodException e) {
                         System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                         result.add(new CIM_ManagedElement(cimInstance));
                         continue;
                     }

                     try {
                         Object[] actargs = new Object[] {cimInstance};
                         Object dataObj = cons.newInstance(actargs);
                         result.add((CIM_ManagedElement)dataObj);
                     } catch (Exception e) {
                         System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                         result.add(new CIM_ManagedElement(cimInstance));
                         continue;
                     }
                 }
             }
             CIM_RegisteredProfileHelper.checkException(enumeration);
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
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementConformsToProfile
    * @param cimClient the WBEMClient for the communication
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfileNames(WBEMClient cimClient) throws WbemsmtException {
    
    	    return getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfileNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE,
    	                             CIM_ManagedElement.CIM_CLASS_NAME,
    	                             null,
    	                             null);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementConformsToProfile
    * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
    *
    * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE as associationClass<br>
    * uses false for includeQualifiers and includeClassOrigin <br>
    * uses null for resultClass, role, resultRole<br>
    * <br>
    
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfileNames(WBEMClient cimClient,String resultClass, String role, String resultRole) throws WbemsmtException {
    
    	    return getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfileNames (
    	                             cimClient,
    	                             true,
    	                             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE,
    	                             resultClass,
    	                             role,
    	                             resultRole);
    }

   /**
    * Get the list of CIMObjectPath items of the objects associated by the association CIM_ElementConformsToProfile
    * @param cimClient the WBEMClient for the communication
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfileNames(WBEMClient cimClient,boolean deep,String associationClass, String resultClass, String role, String resultRole) throws WbemsmtException {

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
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE, 
                CIM_ManagedElement.CIM_CLASS_NAME,
                null,null));	
         }
         
         try {
	            while (enumeration.hasNext()) {
                CIM_RegisteredProfileHelper.checkException(enumeration);
                                
                Object obj = enumeration.next();
                CIM_RegisteredProfileHelper.checkException(enumeration); 
                if (obj instanceof CIMObjectPath) {
                    if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
                        result.add((CIMObjectPath)obj);
                    }
                }
            }
            CIM_RegisteredProfileHelper.checkException(enumeration);
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
    * Get the list with CIM_ElementConformsToProfile associations
    *
    * @param cimClient the WBEMClient for the communication
    * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
    * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
    *
    * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
    **/
                        
                        
   public java.util.List<CIM_ElementConformsToProfile> getAssociations_CIM_ElementConformsToProfile(WBEMClient cimClient, boolean includeQualifiers, boolean includeClassOrigin, String role,java.lang.String[] propertyList) throws WbemsmtException {

       if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
       }

       java.util.List<CIM_ElementConformsToProfile> result = new java.util.ArrayList<CIM_ElementConformsToProfile>();
       CloseableIterator enumeration = null;

       try {
          enumeration = cimClient.references(
             this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList);
        } catch (WBEMException e) {
         	  throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
             CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE, 
             role,
             includeQualifiers,
             includeClassOrigin,
             propertyList));	
        }
         
        try {
          while (enumeration.hasNext()) {
             CIM_RegisteredProfileHelper.checkException(enumeration);
             Object obj = enumeration.next();
             CIM_RegisteredProfileHelper.checkException(enumeration);

             if (obj instanceof CIMInstance) {
                CIMInstance cimInstance = (CIMInstance)obj;
                Class<?> clazz = CIM_ElementConformsToProfileHelper.findClass(cimClient, cimInstance);
                    
                if (clazz == null) {
                   System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
                   result.add(new CIM_ElementConformsToProfile(cimInstance));
                   continue;
                }

                Class<?>[] constParams = new Class[1];
                constParams[0] = CIMInstance.class;
                Constructor<?> cons = null;
                try {
                   cons = clazz.getConstructor(constParams);
                } catch(NoSuchMethodException e) {
                   System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
                   result.add(new CIM_ElementConformsToProfile(cimInstance));
                   continue;
                }

                try {
                   Object[] actargs = new Object[] {cimInstance};
                   Object dataObj = cons.newInstance(actargs);
                   result.add((CIM_ElementConformsToProfile)dataObj);
                } catch (Exception e) {
                   System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
                   result.add(new CIM_ElementConformsToProfile(cimInstance));
                   continue;
                }
              }
           }
           CIM_RegisteredProfileHelper.checkException(enumeration);
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
    * Get a list of CIMObjectPath items of the associations CIM_ElementConformsToProfile
    *
    * @param cimClient the WBEMClient for the communication
    * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
    * @param deep if true the subclasses returned also
    *
    * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
    **/
                         
    public java.util.List<CIMObjectPath> getAssociationNames_CIM_ElementConformsToProfile(WBEMClient cimClient,String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER ,"The cimClient parameter does not contain a valid reference.");
        }

        java.util.List<CIMObjectPath> result = new java.util.ArrayList<CIMObjectPath>();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(
                this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE, 
                role);
        } catch (WBEMException e) {
         	  throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this.getCimObjectPath(),
                CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE, 
                role));	
        }
         
        try {
                while (enumeration.hasNext()) {
                   CIM_RegisteredProfileHelper.checkException(enumeration);
                   Object obj = enumeration.next();
                   CIM_RegisteredProfileHelper.checkException(enumeration); 
                   
                   if (obj instanceof CIMObjectPath) {
                      if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ElementConformsToProfile.CIM_CLASS_NAME)) {
                         result.add((CIMObjectPath)obj);
                      }
                   }
                }
                CIM_RegisteredProfileHelper.checkException(enumeration);
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
    	    return CIM_RegisteredProfile.CIM_CLASS_NAME;
    }



}