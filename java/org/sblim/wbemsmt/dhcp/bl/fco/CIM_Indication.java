/**
 * CIM_Indication.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: CIM_Indication is the abstract root class for
 *            all notifications about changes in schema, objects and their data, and about events
 *            detected by providers and instrumentation. Subclasses represent specific types of
 *            notifications. To receive an Indication, a consumer (or subscriber) must create an
 *            instance of CIM_IndicationFilter describing the criteria of the notification, an
 *            instance of CIM_ListenerDestination describing the delivery of the notification, and
 *            an instance of CIM_IndicationSubscription associating the Filter and Handler.
 *            generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_Indication extends org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco {

    public final static String CIM_CLASS_NAME = "CIM_Indication";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property CorrelatedIndications
     * A list of IndicationIdentifiers whose notifications are correlated with (related to) this one.
     */
    public static class PROPERTY_CORRELATEDINDICATIONS {
        /**
         * name of the property CorrelatedIndications
         */
        public final static String NAME = "CorrelatedIndications";

    }

    /**
     * Constants of property IndicationIdentifier
     * An identifier for the Indication. This property is similar to a key value in that it can be used for identification, when correlating Indications (see the CorrelatedIndications array). Its value SHOULD be unique as long as correlations are reported, but MAY be reused or left NULL if no future Indications will reference it in their CorrelatedIndications array.To ensure uniqueness, the value of IndicationIdentifier should be constructed using the following "preferred" algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the IndicationIdentifier or that is a recognized ID that is assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in IndicationIdentifier must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be re-used to identify different underlying (real-world) elements. 
     * If the above "preferred" algorithm is not used, the defining entity should assure that the resulting IndicationIdentifier is not re-used across any IndicationIdentifiers that are produced by this or other providers for the NameSpace of this instance. 
     * For DMTF-defined instances, the "preferred" algorithm should be used with the <OrgID> set to CIM.
     */
    public static class PROPERTY_INDICATIONIDENTIFIER {
        /**
         * name of the property IndicationIdentifier
         */
        public final static String NAME = "IndicationIdentifier";

    }

    /**
     * Constants of property IndicationTime
     * The time and date of creation of the Indication. The property may be set to NULL if the entity creating the Indication is not capable of determining this information. Note that IndicationTime may be the same for two Indications that are generated in rapid succession.
     */
    public static class PROPERTY_INDICATIONTIME {
        /**
         * name of the property IndicationTime
         */
        public final static String NAME = "IndicationTime";

    }

    /**
     * Constants of property OtherSeverity
     * Holds the value of the user defined severity value when 'PerceivedSeverity' is 1 ("Other").
     */
    public static class PROPERTY_OTHERSEVERITY {
        /**
         * name of the property OtherSeverity
         */
        public final static String NAME = "OtherSeverity";

    }

    /**
     * Constants of property PerceivedSeverity
     * An enumerated value that describes the severity of the Indication from the notifier's point of view: 
     * 1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
     * 3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
     * 4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
     * 5 - Major should be used to indicate action is needed NOW. 
     * 6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
     * 7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
     * 2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the Indication is purely informational or its severity is simply unknown.
     */
    public static class PROPERTY_PERCEIVEDSEVERITY {
        /**
         * name of the property PerceivedSeverity
         */
        public final static String NAME = "PerceivedSeverity";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Other (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Other = "Other";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Information = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Information (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Information = "Information";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded_Warning = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Degraded/Warning (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Degraded_Warning = "Degraded/Warning";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Minor = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Minor (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Minor = "Minor";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Major = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Major (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Major = "Major";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Critical = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Critical (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Critical = "Critical";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fatal_NonRecoverable = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Fatal/NonRecoverable (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Fatal_NonRecoverable = "Fatal/NonRecoverable";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Information.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Information;
            }

            if (VALUE_ENTRY_Degraded_Warning.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded_Warning;
            }

            if (VALUE_ENTRY_Minor.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Minor;
            }

            if (VALUE_ENTRY_Major.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Major;
            }

            if (VALUE_ENTRY_Critical.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Critical;
            }

            if (VALUE_ENTRY_Fatal_NonRecoverable.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fatal_NonRecoverable;
            }
            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(
                Number indexInPulldown) {
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
        public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue) {
            String valueEntry = getValueEntry(currentValue);
            if (valueEntry != null) {
                for (int i = 0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++) {
                    if (VALUE_ENTRIES_FOR_DISPLAY[i].equals(valueEntry)) {
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

        public static String getValueEntry(javax.cim.UnsignedInteger16 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Information.intValue()) {
                return VALUE_ENTRY_Information;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded_Warning.intValue()) {
                return VALUE_ENTRY_Degraded_Warning;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Minor.intValue()) {
                return VALUE_ENTRY_Minor;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Major.intValue()) {
                return VALUE_ENTRY_Major;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Critical.intValue()) {
                return VALUE_ENTRY_Critical;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fatal_NonRecoverable.intValue()) {
                return VALUE_ENTRY_Fatal_NonRecoverable;
            }
            return null;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property PerceivedSeverity   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Information,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Degraded_Warning,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Minor, VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Major,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Critical,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Fatal_NonRecoverable };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PerceivedSeverity   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Information, VALUE_ENTRY_Degraded_Warning, VALUE_ENTRY_Minor,
                VALUE_ENTRY_Major, VALUE_ENTRY_Critical, VALUE_ENTRY_Fatal_NonRecoverable };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PerceivedSeverity   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Information, VALUE_ENTRY_Degraded_Warning,
                VALUE_ENTRY_Minor, VALUE_ENTRY_Major, VALUE_ENTRY_Critical,
                VALUE_ENTRY_Fatal_NonRecoverable };

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
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   CIM_Indication is the abstract root class for all notifications about changes in schema, objects and their data, and about events detected by providers and instrumentation. Subclasses represent specific types of notifications. 
     * 
     * To receive an Indication, a consumer (or subscriber) must create an instance of CIM_IndicationFilter describing the criteria of the notification, an instance of CIM_ListenerDestination describing the delivery of the notification, and an instance of CIM_IndicationSubscription associating the Filter and Handler.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected CIM_Indication(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   CIM_Indication is the abstract root class for all notifications about changes in schema, objects and their data, and about events detected by providers and instrumentation. Subclasses represent specific types of notifications. 
     * 
     * To receive an Indication, a consumer (or subscriber) must create an instance of CIM_IndicationFilter describing the criteria of the notification, an instance of CIM_ListenerDestination describing the delivery of the notification, and an instance of CIM_IndicationSubscription associating the Filter and Handler.
     *   @param cimInstance the instance that is used to create the Object
     */

    protected CIM_Indication(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Indication() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CorrelatedIndications", new CIMProperty("CorrelatedIndications",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("IndicationIdentifier", new CIMProperty("IndicationIdentifier",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("IndicationTime", new CIMProperty("IndicationTime",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("OtherSeverity", new CIMProperty("OtherSeverity",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("PerceivedSeverity", new CIMProperty("PerceivedSeverity",
                CIMDataType.UINT16_T, null));

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
     * Get the property CorrelatedIndications
     *     * <br>
     * A list of IndicationIdentifiers whose notifications are correlated with (related to) this one.
     *     */

    public String[] get_CorrelatedIndications() {
        CIMProperty currentProperty = getProperty(PROPERTY_CORRELATEDINDICATIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CORRELATEDINDICATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property CorrelatedIndications
     * <br>
     * A list of IndicationIdentifiers whose notifications are correlated with (related to) this one.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CorrelatedIndications(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CORRELATEDINDICATIONS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_CorrelatedIndications(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CORRELATEDINDICATIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CorrelatedIndications by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CorrelatedIndications(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_Indication fco = new CIM_Indication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CORRELATEDINDICATIONS.NAME);
        if (property != null) {
            property = setPropertyValue_CorrelatedIndications(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CORRELATEDINDICATIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CorrelatedIndications
     * <br>
     * A list of IndicationIdentifiers whose notifications are correlated with (related to) this one.
     */

    private static CIMProperty setPropertyValue_CorrelatedIndications(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IndicationIdentifier
     *     * <br>
     * An identifier for the Indication. This property is similar to a key value in that it can be used for identification, when correlating Indications (see the CorrelatedIndications array). Its value SHOULD be unique as long as correlations are reported, but MAY be reused or left NULL if no future Indications will reference it in their CorrelatedIndications array.To ensure uniqueness, the value of IndicationIdentifier should be constructed using the following "preferred" algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the IndicationIdentifier or that is a recognized ID that is assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in IndicationIdentifier must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be re-used to identify different underlying (real-world) elements. 
     * If the above "preferred" algorithm is not used, the defining entity should assure that the resulting IndicationIdentifier is not re-used across any IndicationIdentifiers that are produced by this or other providers for the NameSpace of this instance. 
     * For DMTF-defined instances, the "preferred" algorithm should be used with the <OrgID> set to CIM.
     *     */

    public String get_IndicationIdentifier() {
        CIMProperty currentProperty = getProperty(PROPERTY_INDICATIONIDENTIFIER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INDICATIONIDENTIFIER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property IndicationIdentifier
     * <br>
     * An identifier for the Indication. This property is similar to a key value in that it can be used for identification, when correlating Indications (see the CorrelatedIndications array). Its value SHOULD be unique as long as correlations are reported, but MAY be reused or left NULL if no future Indications will reference it in their CorrelatedIndications array.To ensure uniqueness, the value of IndicationIdentifier should be constructed using the following "preferred" algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the IndicationIdentifier or that is a recognized ID that is assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in IndicationIdentifier must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be re-used to identify different underlying (real-world) elements. 
     * If the above "preferred" algorithm is not used, the defining entity should assure that the resulting IndicationIdentifier is not re-used across any IndicationIdentifiers that are produced by this or other providers for the NameSpace of this instance. 
     * For DMTF-defined instances, the "preferred" algorithm should be used with the <OrgID> set to CIM.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IndicationIdentifier(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INDICATIONIDENTIFIER.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IndicationIdentifier(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INDICATIONIDENTIFIER.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IndicationIdentifier by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IndicationIdentifier(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Indication fco = new CIM_Indication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INDICATIONIDENTIFIER.NAME);
        if (property != null) {
            property = setPropertyValue_IndicationIdentifier(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INDICATIONIDENTIFIER.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IndicationIdentifier
     * <br>
     * An identifier for the Indication. This property is similar to a key value in that it can be used for identification, when correlating Indications (see the CorrelatedIndications array). Its value SHOULD be unique as long as correlations are reported, but MAY be reused or left NULL if no future Indications will reference it in their CorrelatedIndications array.To ensure uniqueness, the value of IndicationIdentifier should be constructed using the following "preferred" algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon (:), and where <OrgID> must include a copyrighted, trademarked, or otherwise unique name that is owned by the business entity that is creating or defining the IndicationIdentifier or that is a recognized ID that is assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> must not contain a colon (:). When using this algorithm, the first colon to appear in IndicationIdentifier must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be re-used to identify different underlying (real-world) elements. 
     * If the above "preferred" algorithm is not used, the defining entity should assure that the resulting IndicationIdentifier is not re-used across any IndicationIdentifiers that are produced by this or other providers for the NameSpace of this instance. 
     * For DMTF-defined instances, the "preferred" algorithm should be used with the <OrgID> set to CIM.
     */

    private static CIMProperty setPropertyValue_IndicationIdentifier(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IndicationTime
     *     * <br>
     * The time and date of creation of the Indication. The property may be set to NULL if the entity creating the Indication is not capable of determining this information. Note that IndicationTime may be the same for two Indications that are generated in rapid succession.
     *     */

    public javax.cim.CIMDateTime get_IndicationTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_INDICATIONTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INDICATIONTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property IndicationTime
     * <br>
     * The time and date of creation of the Indication. The property may be set to NULL if the entity creating the Indication is not capable of determining this information. Note that IndicationTime may be the same for two Indications that are generated in rapid succession.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IndicationTime(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INDICATIONTIME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IndicationTime(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INDICATIONTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IndicationTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IndicationTime(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_Indication fco = new CIM_Indication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INDICATIONTIME.NAME);
        if (property != null) {
            property = setPropertyValue_IndicationTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INDICATIONTIME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IndicationTime
     * <br>
     * The time and date of creation of the Indication. The property may be set to NULL if the entity creating the Indication is not capable of determining this information. Note that IndicationTime may be the same for two Indications that are generated in rapid succession.
     */

    private static CIMProperty setPropertyValue_IndicationTime(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherSeverity
     *     * <br>
     * Holds the value of the user defined severity value when 'PerceivedSeverity' is 1 ("Other").
     *     */

    public String get_OtherSeverity() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERSEVERITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERSEVERITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherSeverity
     * <br>
     * Holds the value of the user defined severity value when 'PerceivedSeverity' is 1 ("Other").
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherSeverity(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERSEVERITY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherSeverity(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERSEVERITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherSeverity by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherSeverity(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Indication fco = new CIM_Indication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERSEVERITY.NAME);
        if (property != null) {
            property = setPropertyValue_OtherSeverity(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERSEVERITY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherSeverity
     * <br>
     * Holds the value of the user defined severity value when 'PerceivedSeverity' is 1 ("Other").
     */

    private static CIMProperty setPropertyValue_OtherSeverity(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PerceivedSeverity
     *     * <br>
     * An enumerated value that describes the severity of the Indication from the notifier's point of view: 
     * 1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
     * 3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
     * 4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
     * 5 - Major should be used to indicate action is needed NOW. 
     * 6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
     * 7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
     * 2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the Indication is purely informational or its severity is simply unknown.
     *     */

    public javax.cim.UnsignedInteger16 get_PerceivedSeverity() {
        CIMProperty currentProperty = getProperty(PROPERTY_PERCEIVEDSEVERITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PERCEIVEDSEVERITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PerceivedSeverity
     * <br>
     * An enumerated value that describes the severity of the Indication from the notifier's point of view: 
     * 1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
     * 3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
     * 4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
     * 5 - Major should be used to indicate action is needed NOW. 
     * 6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
     * 7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
     * 2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the Indication is purely informational or its severity is simply unknown.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PerceivedSeverity(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PERCEIVEDSEVERITY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PerceivedSeverity(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PERCEIVEDSEVERITY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PerceivedSeverity by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PerceivedSeverity(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Indication fco = new CIM_Indication(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PERCEIVEDSEVERITY.NAME);
        if (property != null) {
            property = setPropertyValue_PerceivedSeverity(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PERCEIVEDSEVERITY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PerceivedSeverity
     * <br>
     * An enumerated value that describes the severity of the Indication from the notifier's point of view: 
     * 1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
     * 3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
     * 4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
     * 5 - Major should be used to indicate action is needed NOW. 
     * 6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
     * 7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
     * 2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the Indication is purely informational or its severity is simply unknown.
     */

    private static CIMProperty setPropertyValue_PerceivedSeverity(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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
     * returns true if the objects are the same
     * 
     * @return
     * @see org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco\#equals(Object)
     */
    public boolean equals(Object object) {
        if (!(object instanceof CIM_Indication)) {
            return false;
        }

        return super.equals(object);
    }

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_Indication.CIM_CLASS_NAME;
    }

}