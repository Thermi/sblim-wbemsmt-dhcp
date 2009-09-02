/**
 * CIM_ConcreteJob.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: A concrete version of Job. This class
 *            represents a generic and instantiable unit of work, such as a batch or a print job.
 *            generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import javax.wbem.*;

public class CIM_ConcreteJob extends CIM_Job {

    public final static String CIM_CLASS_NAME = "CIM_ConcreteJob";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constant for method\'s name and parameters
     * Requests that the state of the job be changed to the value specified in the RequestedState parameter. Invoking the RequestStateChange method multiple times could result in earlier requests being overwritten or lost. 
     * If 0 is returned, then the task completed successfully. Any other return code indicates an error condition.
     */

    public static class METHOD_REQUESTSTATECHANGE {
        /**
         * Constant for method RequestStateChange
         */
        public final static String NAME = "RequestStateChange";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error = new javax.cim.UnsignedInteger32(
                "0");

        /**
         * constant for value entry Completed with No Error (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Completed_with_No_Error = "Completed with No Error";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported = new javax.cim.UnsignedInteger32(
                "1");

        /**
         * constant for value entry Not Supported (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Not_Supported = "Not Supported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown_Unspecified_Error = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Unknown/Unspecified Error (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unknown_Unspecified_Error = "Unknown/Unspecified Error";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Can_NOT_complete_within_Timeout_Period = new javax.cim.UnsignedInteger32(
                "3");

        /**
         * constant for value entry Can NOT complete within Timeout Period (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Can_NOT_complete_within_Timeout_Period = "Can NOT complete within Timeout Period";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed = new javax.cim.UnsignedInteger32(
                "4");

        /**
         * constant for value entry Failed (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Failed = "Failed";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter = new javax.cim.UnsignedInteger32(
                "5");

        /**
         * constant for value entry Invalid Parameter (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Invalid_Parameter = "Invalid Parameter";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry In Use (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_In_Use = "In Use";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 4096
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Transition_Started = new javax.cim.UnsignedInteger32(
                "4096");

        /**
         * constant for value entry Method Parameters Checked - Transition Started (corresponds to mapEntry 4096 )
         */
        public final static String VALUE_ENTRY_Method_Parameters_Checked___Transition_Started = "Method Parameters Checked - Transition Started";

        /**
         * constant for value map entry 4097
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Invalid_State_Transition = new javax.cim.UnsignedInteger32(
                "4097");

        /**
         * constant for value entry Invalid State Transition (corresponds to mapEntry 4097 )
         */
        public final static String VALUE_ENTRY_Invalid_State_Transition = "Invalid State Transition";

        /**
         * constant for value map entry 4098
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Use_of_Timeout_Parameter_Not_Supported = new javax.cim.UnsignedInteger32(
                "4098");

        /**
         * constant for value entry Use of Timeout Parameter Not Supported (corresponds to mapEntry 4098 )
         */
        public final static String VALUE_ENTRY_Use_of_Timeout_Parameter_Not_Supported = "Use of Timeout Parameter Not Supported";

        /**
         * constant for value map entry 4099
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Busy = new javax.cim.UnsignedInteger32(
                "4099");

        /**
         * constant for value entry Busy (corresponds to mapEntry 4099 )
         */
        public final static String VALUE_ENTRY_Busy = "Busy";

        /**
         * constant for value map entry 4100..32767
         */

        /**
         * constant for value entry Method Reserved (corresponds to mapEntry 4100..32767 )
         */
        public final static String VALUE_ENTRY_Method_Reserved = "Method Reserved";

        /**
         * constant for value map entry 32768..65535
         */

        /**
         * constant for value entry Vendor Specific (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Specific = "Vendor Specific";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger32 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Completed_with_No_Error.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Unknown_Unspecified_Error.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown_Unspecified_Error;
            }

            if (VALUE_ENTRY_Can_NOT_complete_within_Timeout_Period.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Can_NOT_complete_within_Timeout_Period;
            }

            if (VALUE_ENTRY_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed;
            }

            if (VALUE_ENTRY_Invalid_Parameter.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter;
            }

            if (VALUE_ENTRY_In_Use.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use;
            }

            if (VALUE_ENTRY_Method_Parameters_Checked___Transition_Started.equals(value)) {
                return VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Transition_Started;
            }

            if (VALUE_ENTRY_Invalid_State_Transition.equals(value)) {
                return VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Invalid_State_Transition;
            }

            if (VALUE_ENTRY_Use_of_Timeout_Parameter_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Use_of_Timeout_Parameter_Not_Supported;
            }

            if (VALUE_ENTRY_Busy.equals(value)) {
                return VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Busy;
            }

            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger32 getValueMapEntryFromDisplayedValue(
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
        public static int getIndexForDisplay(javax.cim.UnsignedInteger32 currentValue) {
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

        public static String getValueEntry(javax.cim.UnsignedInteger32 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error.intValue()) {
                return VALUE_ENTRY_Completed_with_No_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported.intValue()) {
                return VALUE_ENTRY_Not_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown_Unspecified_Error.intValue()) {
                return VALUE_ENTRY_Unknown_Unspecified_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Can_NOT_complete_within_Timeout_Period
                    .intValue()) {
                return VALUE_ENTRY_Can_NOT_complete_within_Timeout_Period;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed.intValue()) {
                return VALUE_ENTRY_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter.intValue()) {
                return VALUE_ENTRY_Invalid_Parameter;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use.intValue()) {
                return VALUE_ENTRY_In_Use;
            }

            if (iValue == VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Transition_Started
                    .intValue()) {
                return VALUE_ENTRY_Method_Parameters_Checked___Transition_Started;
            }

            if (iValue == VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Invalid_State_Transition.intValue()) {
                return VALUE_ENTRY_Invalid_State_Transition;
            }

            if (iValue == VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Use_of_Timeout_Parameter_Not_Supported
                    .intValue()) {
                return VALUE_ENTRY_Use_of_Timeout_Parameter_Not_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Busy.intValue()) {
                return VALUE_ENTRY_Busy;
            }

            if (iValue >= 4100 || iValue <= 32767) {
                return VALUE_ENTRY_Method_Reserved;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Specific;
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
         * Value Map for the method RequestStateChange   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Completed_with_No_Error,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown_Unspecified_Error,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Can_NOT_complete_within_Timeout_Period,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Transition_Started,
                VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Invalid_State_Transition,
                VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Use_of_Timeout_Parameter_Not_Supported,
                VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Busy };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method RequestStateChange   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Unknown_Unspecified_Error,
                VALUE_ENTRY_Can_NOT_complete_within_Timeout_Period, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Method_Parameters_Checked___Transition_Started,
                VALUE_ENTRY_Invalid_State_Transition,
                VALUE_ENTRY_Use_of_Timeout_Parameter_Not_Supported, VALUE_ENTRY_Busy,
                VALUE_ENTRY_Method_Reserved, VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method RequestStateChange   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = {
                VALUE_ENTRY_Completed_with_No_Error, VALUE_ENTRY_Not_Supported,
                VALUE_ENTRY_Unknown_Unspecified_Error,
                VALUE_ENTRY_Can_NOT_complete_within_Timeout_Period, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use,
                VALUE_ENTRY_Method_Parameters_Checked___Transition_Started,
                VALUE_ENTRY_Invalid_State_Transition,
                VALUE_ENTRY_Use_of_Timeout_Parameter_Not_Supported, VALUE_ENTRY_Busy };

        /**
         * constants for parameter RequestedState
         */
        public static class PARAMETER_REQUESTEDSTATE {
            /*
             * Name of the parameter RequestedState
             */
            public final static String NAME = "RequestedState";

            /**
             * constant for value map entry 2
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Start = new javax.cim.UnsignedInteger16(
                    "2");

            /**
             * constant for value entry Start (corresponds to mapEntry 2 )
             */
            public final static String VALUE_ENTRY_Start = "Start";

            /**
             * constant for value map entry 3
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Suspend = new javax.cim.UnsignedInteger16(
                    "3");

            /**
             * constant for value entry Suspend (corresponds to mapEntry 3 )
             */
            public final static String VALUE_ENTRY_Suspend = "Suspend";

            /**
             * constant for value map entry 4
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Terminate = new javax.cim.UnsignedInteger16(
                    "4");

            /**
             * constant for value entry Terminate (corresponds to mapEntry 4 )
             */
            public final static String VALUE_ENTRY_Terminate = "Terminate";

            /**
             * constant for value map entry 5
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Kill = new javax.cim.UnsignedInteger16(
                    "5");

            /**
             * constant for value entry Kill (corresponds to mapEntry 5 )
             */
            public final static String VALUE_ENTRY_Kill = "Kill";

            /**
             * constant for value map entry 6
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Service = new javax.cim.UnsignedInteger16(
                    "6");

            /**
             * constant for value entry Service (corresponds to mapEntry 6 )
             */
            public final static String VALUE_ENTRY_Service = "Service";

            /**
             * constant for value map entry 7..32767
             */

            /**
             * constant for value entry DMTF Reserved (corresponds to mapEntry 7..32767 )
             */
            public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

            /**
             * constant for value map entry 32768..65535
             */

            /**
             * constant for value entry Vendor Reserved (corresponds to mapEntry 32768..65535 )
             */
            public final static String VALUE_ENTRY_Vendor_Reserved = "Vendor Reserved";

            /**
             * get the ValueMapEntry of the given value
             * @param value the value to find the ValueMapEntry for
             * @return the ValueMap entry or null if not found
             */
            public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

                if (VALUE_ENTRY_Start.equals(value)) {
                    return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Start;
                }

                if (VALUE_ENTRY_Suspend.equals(value)) {
                    return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Suspend;
                }

                if (VALUE_ENTRY_Terminate.equals(value)) {
                    return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Terminate;
                }

                if (VALUE_ENTRY_Kill.equals(value)) {
                    return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Kill;
                }

                if (VALUE_ENTRY_Service.equals(value)) {
                    return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Service;
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

                if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Start.intValue()) {
                    return VALUE_ENTRY_Start;
                }

                if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Suspend.intValue()) {
                    return VALUE_ENTRY_Suspend;
                }

                if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Terminate.intValue()) {
                    return VALUE_ENTRY_Terminate;
                }

                if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Kill.intValue()) {
                    return VALUE_ENTRY_Kill;
                }

                if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Service.intValue()) {
                    return VALUE_ENTRY_Service;
                }

                if (iValue >= 7 || iValue <= 32767) {
                    return VALUE_ENTRY_DMTF_Reserved;
                }

                if (iValue >= 32768 || iValue <= 65535) {
                    return VALUE_ENTRY_Vendor_Reserved;
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
             * Value Map for the parameter RequestedState of the method RequestStateChange   
             */
            public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                    VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Start,
                    VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Suspend,
                    VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Terminate,
                    VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Kill,
                    VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Service };

            /**
             * Values
             * Contains all values even those having an integer value range representation within the valueMap
             * Value Map for the parameter RequestedState of the method RequestStateChange   
             */
            public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Start, VALUE_ENTRY_Suspend,
                    VALUE_ENTRY_Terminate, VALUE_ENTRY_Kill, VALUE_ENTRY_Service,
                    VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

            /**
             * Values for displaying within pulldown elements, lists, radio buttons etc
             * Contains no values that having an integer value range representation within the valueMap
             * 
             * Value Map for the parameter RequestedState of the method RequestStateChange   
             */
            public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Start,
                    VALUE_ENTRY_Suspend, VALUE_ENTRY_Terminate, VALUE_ENTRY_Kill,
                    VALUE_ENTRY_Service };

        }

        /**
         * constants for parameter TimeoutPeriod
         */
        public static class PARAMETER_TIMEOUTPERIOD {
            /*
             * Name of the parameter TimeoutPeriod
             */
            public final static String NAME = "TimeoutPeriod";

        }
    }

    /**
     * Constants of property InstanceID
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> must include a copyrighted, trademarked or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID, or that is a registered ID that is assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> must not contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity must assure that the resulting InstanceID is not re-used across any InstanceIDs produced by this or other providers for the NameSpace of this instance. 
     * For DMTF defined instances, the 'preferred' algorithm must be used with the <OrgID> set to 'CIM'.
     */
    public static class PROPERTY_INSTANCEID {
        /**
         * name of the property InstanceID
         */
        public final static String NAME = "InstanceID";

    }

    /**
     * Constants of property JobState
     * JobState is an integer enumeration that indicates the operational state of a Job. It can also indicate transitions between these states, for example, 'Shutting Down' and 'Starting'. Following is a brief description of the states: 
     * New (2) indicates that the job has never been started. 
     * Starting (3) indicates that the job is moving from the 'New', 'Suspended', or 'Service' states into the 'Running' state. 
     * Running (4) indicates that the Job is running. 
     * Suspended (5) indicates that the Job is stopped, but can be restarted in a seamless manner. 
     * Shutting Down (6) indicates that the job is moving to a 'Completed', 'Terminated', or 'Killed' state. 
     * Completed (7) indicates that the job has completed normally. 
     * Terminated (8) indicates that the job has been stopped by a 'Terminate' state change request. The job and all its underlying processes are ended and can be restarted (this is job-specific) only as a new job. 
     * Killed (9) indicates that the job has been stopped by a 'Kill' state change request. Underlying processes might have been left running, and cleanup might be required to free up resources. 
     * Exception (10) indicates that the Job is in an abnormal state that might be indicative of an error condition. Actual status might be displayed though job-specific objects. 
     * Service (11) indicates that the Job is in a vendor-specific state that supports problem discovery, or resolution, or both.
     * Query pending (12) waiting for a client to resolve a query
     */
    public static class PROPERTY_JOBSTATE {
        /**
         * name of the property JobState
         */
        public final static String NAME = "JobState";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_New = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry New (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_New = "New";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Starting = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Starting (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Starting = "Starting";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Running = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Running (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Running = "Running";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Suspended = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Suspended (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Suspended = "Suspended";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Shutting_Down = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Shutting Down (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Shutting_Down = "Shutting Down";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Completed = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Completed (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Completed = "Completed";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Terminated = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Terminated (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Terminated = "Terminated";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Killed = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Killed (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Killed = "Killed";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Exception = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Exception (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Exception = "Exception";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Service = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Service (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Service = "Service";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Query_Pending = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Query Pending (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Query_Pending = "Query Pending";

        /**
         * constant for value map entry 13..32767
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 13..32767 )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 32768..65535
         */

        /**
         * constant for value entry Vendor Reserved (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Reserved = "Vendor Reserved";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_New.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_New;
            }

            if (VALUE_ENTRY_Starting.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Starting;
            }

            if (VALUE_ENTRY_Running.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Running;
            }

            if (VALUE_ENTRY_Suspended.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Suspended;
            }

            if (VALUE_ENTRY_Shutting_Down.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Shutting_Down;
            }

            if (VALUE_ENTRY_Completed.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Completed;
            }

            if (VALUE_ENTRY_Terminated.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Terminated;
            }

            if (VALUE_ENTRY_Killed.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Killed;
            }

            if (VALUE_ENTRY_Exception.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Exception;
            }

            if (VALUE_ENTRY_Service.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Service;
            }

            if (VALUE_ENTRY_Query_Pending.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Query_Pending;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_New.intValue()) {
                return VALUE_ENTRY_New;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Starting.intValue()) {
                return VALUE_ENTRY_Starting;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Running.intValue()) {
                return VALUE_ENTRY_Running;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Suspended.intValue()) {
                return VALUE_ENTRY_Suspended;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Shutting_Down.intValue()) {
                return VALUE_ENTRY_Shutting_Down;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Completed.intValue()) {
                return VALUE_ENTRY_Completed;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Terminated.intValue()) {
                return VALUE_ENTRY_Terminated;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Killed.intValue()) {
                return VALUE_ENTRY_Killed;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Exception.intValue()) {
                return VALUE_ENTRY_Exception;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Service.intValue()) {
                return VALUE_ENTRY_Service;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Query_Pending.intValue()) {
                return VALUE_ENTRY_Query_Pending;
            }

            if (iValue >= 13 || iValue <= 32767) {
                return VALUE_ENTRY_DMTF_Reserved;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Reserved;
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
         * Value Map for the property JobState   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_New, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Starting,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Running,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Suspended,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Shutting_Down,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Completed,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Terminated,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Killed,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Exception,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Service,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Query_Pending };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property JobState   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_New, VALUE_ENTRY_Starting,
                VALUE_ENTRY_Running, VALUE_ENTRY_Suspended, VALUE_ENTRY_Shutting_Down,
                VALUE_ENTRY_Completed, VALUE_ENTRY_Terminated, VALUE_ENTRY_Killed,
                VALUE_ENTRY_Exception, VALUE_ENTRY_Service, VALUE_ENTRY_Query_Pending,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property JobState   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_New,
                VALUE_ENTRY_Starting, VALUE_ENTRY_Running, VALUE_ENTRY_Suspended,
                VALUE_ENTRY_Shutting_Down, VALUE_ENTRY_Completed, VALUE_ENTRY_Terminated,
                VALUE_ENTRY_Killed, VALUE_ENTRY_Exception, VALUE_ENTRY_Service,
                VALUE_ENTRY_Query_Pending };

    }

    /**
     * Constants of property Name
     * The user-friendly name for this instance of a Job. In addition, the user-friendly name can be used as a property for a search or query. (Note: Name does not have to be unique within a namespace.)
     */
    public static class PROPERTY_NAME {
        /**
         * name of the property Name
         */
        public final static String NAME = "Name";

    }

    /**
     * Constants of property TimeBeforeRemoval
     * The amount of time that the Job is retained after it has finished executing, either succeeding or failing in that execution. The job must remain in existence for some period of time regardless of the value of the DeleteOnCompletion property. 
     * The default is five minutes.
     */
    public static class PROPERTY_TIMEBEFOREREMOVAL {
        /**
         * name of the property TimeBeforeRemoval
         */
        public final static String NAME = "TimeBeforeRemoval";

    }

    /**
     * Constants of property TimeOfLastStateChange
     * The date or time when the state of the Job last changed. If the state of the Job has not changed and this property is populated, then it must be set to a 0 interval value. If a state change was requested, but rejected or not yet processed, the property must not be updated.
     */
    public static class PROPERTY_TIMEOFLASTSTATECHANGE {
        /**
         * name of the property TimeOfLastStateChange
         */
        public final static String NAME = "TimeOfLastStateChange";

    }

    static {
        addPackage("org.sblim.wbemsmt.dhcp.bl.fco");
        String[] parentClassPackageList = CIM_Job.getPackages();

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
     *   A concrete version of Job. This class represents a generic and instantiable unit of work, such as a batch or a print job.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ConcreteJob(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A concrete version of Job. This class represents a generic and instantiable unit of work, such as a batch or a print job.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ConcreteJob(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ConcreteJob() {
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
        propertiesToCheck.put("JobState", new CIMProperty("JobState", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));
        propertiesToCheck.put("TimeBeforeRemoval", new CIMProperty("TimeBeforeRemoval",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("TimeOfLastStateChange", new CIMProperty("TimeOfLastStateChange",
                CIMDataType.DATETIME_T, null));

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
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> must include a copyrighted, trademarked or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID, or that is a registered ID that is assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> must not contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity must assure that the resulting InstanceID is not re-used across any InstanceIDs produced by this or other providers for the NameSpace of this instance. 
     * For DMTF defined instances, the 'preferred' algorithm must be used with the <OrgID> set to 'CIM'.
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
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> must include a copyrighted, trademarked or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID, or that is a registered ID that is assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> must not contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity must assure that the resulting InstanceID is not re-used across any InstanceIDs produced by this or other providers for the NameSpace of this instance. 
     * For DMTF defined instances, the 'preferred' algorithm must be used with the <OrgID> set to 'CIM'.
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
        CIM_ConcreteJob fco = new CIM_ConcreteJob(client, namespace);
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
     * Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
     * <OrgID>:<LocalID> 
     * Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> must include a copyrighted, trademarked or otherwise unique name that is owned by the business entity that is creating or defining the InstanceID, or that is a registered ID that is assigned to the business entity by a recognized global authority. (This requirement is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> must not contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID must appear between <OrgID> and <LocalID>. 
     * <LocalID> is chosen by the business entity and should not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity must assure that the resulting InstanceID is not re-used across any InstanceIDs produced by this or other providers for the NameSpace of this instance. 
     * For DMTF defined instances, the 'preferred' algorithm must be used with the <OrgID> set to 'CIM'.
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

    /**
     * Get the property JobState
     *     * <br>
     * JobState is an integer enumeration that indicates the operational state of a Job. It can also indicate transitions between these states, for example, 'Shutting Down' and 'Starting'. Following is a brief description of the states: 
     * New (2) indicates that the job has never been started. 
     * Starting (3) indicates that the job is moving from the 'New', 'Suspended', or 'Service' states into the 'Running' state. 
     * Running (4) indicates that the Job is running. 
     * Suspended (5) indicates that the Job is stopped, but can be restarted in a seamless manner. 
     * Shutting Down (6) indicates that the job is moving to a 'Completed', 'Terminated', or 'Killed' state. 
     * Completed (7) indicates that the job has completed normally. 
     * Terminated (8) indicates that the job has been stopped by a 'Terminate' state change request. The job and all its underlying processes are ended and can be restarted (this is job-specific) only as a new job. 
     * Killed (9) indicates that the job has been stopped by a 'Kill' state change request. Underlying processes might have been left running, and cleanup might be required to free up resources. 
     * Exception (10) indicates that the Job is in an abnormal state that might be indicative of an error condition. Actual status might be displayed though job-specific objects. 
     * Service (11) indicates that the Job is in a vendor-specific state that supports problem discovery, or resolution, or both.
     * Query pending (12) waiting for a client to resolve a query
     *     */

    public javax.cim.UnsignedInteger16 get_JobState() {
        CIMProperty currentProperty = getProperty(PROPERTY_JOBSTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_JOBSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property JobState
     * <br>
     * JobState is an integer enumeration that indicates the operational state of a Job. It can also indicate transitions between these states, for example, 'Shutting Down' and 'Starting'. Following is a brief description of the states: 
     * New (2) indicates that the job has never been started. 
     * Starting (3) indicates that the job is moving from the 'New', 'Suspended', or 'Service' states into the 'Running' state. 
     * Running (4) indicates that the Job is running. 
     * Suspended (5) indicates that the Job is stopped, but can be restarted in a seamless manner. 
     * Shutting Down (6) indicates that the job is moving to a 'Completed', 'Terminated', or 'Killed' state. 
     * Completed (7) indicates that the job has completed normally. 
     * Terminated (8) indicates that the job has been stopped by a 'Terminate' state change request. The job and all its underlying processes are ended and can be restarted (this is job-specific) only as a new job. 
     * Killed (9) indicates that the job has been stopped by a 'Kill' state change request. Underlying processes might have been left running, and cleanup might be required to free up resources. 
     * Exception (10) indicates that the Job is in an abnormal state that might be indicative of an error condition. Actual status might be displayed though job-specific objects. 
     * Service (11) indicates that the Job is in a vendor-specific state that supports problem discovery, or resolution, or both.
     * Query pending (12) waiting for a client to resolve a query
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_JobState(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_JOBSTATE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_JobState(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_JOBSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property JobState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_JobState(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ConcreteJob fco = new CIM_ConcreteJob(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_JOBSTATE.NAME);
        if (property != null) {
            property = setPropertyValue_JobState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_JOBSTATE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property JobState
     * <br>
     * JobState is an integer enumeration that indicates the operational state of a Job. It can also indicate transitions between these states, for example, 'Shutting Down' and 'Starting'. Following is a brief description of the states: 
     * New (2) indicates that the job has never been started. 
     * Starting (3) indicates that the job is moving from the 'New', 'Suspended', or 'Service' states into the 'Running' state. 
     * Running (4) indicates that the Job is running. 
     * Suspended (5) indicates that the Job is stopped, but can be restarted in a seamless manner. 
     * Shutting Down (6) indicates that the job is moving to a 'Completed', 'Terminated', or 'Killed' state. 
     * Completed (7) indicates that the job has completed normally. 
     * Terminated (8) indicates that the job has been stopped by a 'Terminate' state change request. The job and all its underlying processes are ended and can be restarted (this is job-specific) only as a new job. 
     * Killed (9) indicates that the job has been stopped by a 'Kill' state change request. Underlying processes might have been left running, and cleanup might be required to free up resources. 
     * Exception (10) indicates that the Job is in an abnormal state that might be indicative of an error condition. Actual status might be displayed though job-specific objects. 
     * Service (11) indicates that the Job is in a vendor-specific state that supports problem discovery, or resolution, or both.
     * Query pending (12) waiting for a client to resolve a query
     */

    private static CIMProperty setPropertyValue_JobState(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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
     * The user-friendly name for this instance of a Job. In addition, the user-friendly name can be used as a property for a search or query. (Note: Name does not have to be unique within a namespace.)
     *     */

    public String get_Name() {
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
     * The user-friendly name for this instance of a Job. In addition, the user-friendly name can be used as a property for a search or query. (Note: Name does not have to be unique within a namespace.)
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Name(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Name(currentProperty, newValue));
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

    public static CIMProperty create_Name(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_ConcreteJob fco = new CIM_ConcreteJob(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null) {
            property = setPropertyValue_Name(property, newValue);
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
     * The user-friendly name for this instance of a Job. In addition, the user-friendly name can be used as a property for a search or query. (Note: Name does not have to be unique within a namespace.)
     */

    private static CIMProperty setPropertyValue_Name(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TimeBeforeRemoval
     *     * <br>
     * The amount of time that the Job is retained after it has finished executing, either succeeding or failing in that execution. The job must remain in existence for some period of time regardless of the value of the DeleteOnCompletion property. 
     * The default is five minutes.
     *     */

    public javax.cim.CIMDateTime get_TimeBeforeRemoval() {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEBEFOREREMOVAL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TIMEBEFOREREMOVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property TimeBeforeRemoval
     * <br>
     * The amount of time that the Job is retained after it has finished executing, either succeeding or failing in that execution. The job must remain in existence for some period of time regardless of the value of the DeleteOnCompletion property. 
     * The default is five minutes.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TimeBeforeRemoval(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEBEFOREREMOVAL.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_TimeBeforeRemoval(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEBEFOREREMOVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TimeBeforeRemoval by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TimeBeforeRemoval(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_ConcreteJob fco = new CIM_ConcreteJob(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TIMEBEFOREREMOVAL.NAME);
        if (property != null) {
            property = setPropertyValue_TimeBeforeRemoval(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEBEFOREREMOVAL.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TimeBeforeRemoval
     * <br>
     * The amount of time that the Job is retained after it has finished executing, either succeeding or failing in that execution. The job must remain in existence for some period of time regardless of the value of the DeleteOnCompletion property. 
     * The default is five minutes.
     */

    private static CIMProperty setPropertyValue_TimeBeforeRemoval(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TimeOfLastStateChange
     *     * <br>
     * The date or time when the state of the Job last changed. If the state of the Job has not changed and this property is populated, then it must be set to a 0 interval value. If a state change was requested, but rejected or not yet processed, the property must not be updated.
     *     */

    public javax.cim.CIMDateTime get_TimeOfLastStateChange() {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEOFLASTSTATECHANGE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TIMEOFLASTSTATECHANGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property TimeOfLastStateChange
     * <br>
     * The date or time when the state of the Job last changed. If the state of the Job has not changed and this property is populated, then it must be set to a 0 interval value. If a state change was requested, but rejected or not yet processed, the property must not be updated.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TimeOfLastStateChange(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEOFLASTSTATECHANGE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_TimeOfLastStateChange(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEOFLASTSTATECHANGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TimeOfLastStateChange by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TimeOfLastStateChange(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_ConcreteJob fco = new CIM_ConcreteJob(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TIMEOFLASTSTATECHANGE.NAME);
        if (property != null) {
            property = setPropertyValue_TimeOfLastStateChange(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEOFLASTSTATECHANGE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TimeOfLastStateChange
     * <br>
     * The date or time when the state of the Job last changed. If the state of the Job has not changed and this property is populated, then it must be set to a 0 interval value. If a state change was requested, but rejected or not yet processed, the property must not be updated.
     */

    private static CIMProperty setPropertyValue_TimeOfLastStateChange(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
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
     * Invokes the Method RequestStateChange
     * <br>
     * @param client the cimclient
     * Requests that the state of the job be changed to the value specified in the RequestedState parameter. Invoking the RequestStateChange method multiple times could result in earlier requests being overwritten or lost. 
     * If 0 is returned, then the task completed successfully. Any other return code indicates an error condition.
     *   @param RequestedState RequestStateChange changes the state of a job. The possible values are as follows: 
     *     Start (2) changes the state to 'Running'. 
     *     Suspend (3) stops the job temporarily. The intention is to subsequently restart the job with 'Start'. It might be possible to enter the 'Service' state while suspended. (This is job-specific.) 
     *     Terminate (4) stops the job cleanly, saving data, preserving the state, and shutting down all underlying processes in an orderly manner. 
     *     Kill (5) terminates the job immediately with no requirement to save data or preserve the state. 
     *     Service (6) puts the job into a vendor-specific service state. It might be possible to restart the job.
     *   @param TimeoutPeriod A timeout period that specifies the maximum amount of time that the client expects the transition to the new state to take. The interval format must be used to specify the TimeoutPeriod. A value of 0 or a null parameter indicates that the client has no time requirements for the transition. 
     *     If this property does not contain 0 or null and the implementation does not support this parameter, a return code of 'Use Of Timeout Parameter Not Supported' must be returned.
     *
     */

    public RequestStateChangeResult invoke_RequestStateChange(WBEMClient cimClient
                                 ,javax.cim.UnsignedInteger16 RequestedState
                      ,javax.cim.CIMDateTime TimeoutPeriod
                      ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[2];
       CIMArgument[] outParameter = new CIMArgument[0];
    
                    inParameter[0] = ( RequestedState == null ? null : new CIMArgument("RequestedState", CIMDataType.UINT16_T, RequestedState) );
       
                    inParameter[1] = ( TimeoutPeriod == null ? null : new CIMArgument("TimeoutPeriod", CIMDataType.DATETIME_T, TimeoutPeriod) );
       
                            
       javax.cim.UnsignedInteger32 resultObject = null;
          
       try {
           Object oResult =  cimClient.invokeMethod(           	                                            this.getCimObjectPath()
           	                                         , 
                                                    METHOD_REQUESTSTATECHANGE.NAME,
                                                    inParameter,
                                                    outParameter);
           if (oResult != null)
           {
              
                                 resultObject = (javax.cim.UnsignedInteger32)oResult;    
                         }
        } catch (WBEMException e) {
            throw new InvokeMethodException(e,new InvokeMethodUserObject( this.getCimObjectPath() , 
                                                          METHOD_REQUESTSTATECHANGE.NAME,
                                                          inParameter,
                                                          outParameter));
        }
        
        RequestStateChangeResult result = new RequestStateChangeResult();
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
     * Result object for the method RequestStateChange
     */
    public static class RequestStateChangeResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        RequestStateChangeResult() {
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
        return CIM_ConcreteJob.CIM_CLASS_NAME;
    }

}