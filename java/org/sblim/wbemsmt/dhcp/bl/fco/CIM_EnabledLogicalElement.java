/**
 * CIM_EnabledLogicalElement.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE
 * TER MS OF THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS
 * FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the
 * Eclipse Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: This class extends LogicalElement to abstract
 *            the concept of an element that is enabled and disabled, such as a LogicalDevice or a
 *            ServiceAccessPoint. generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import javax.wbem.*;

public class CIM_EnabledLogicalElement extends CIM_LogicalElement {

    public final static String CIM_CLASS_NAME = "CIM_EnabledLogicalElement";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constant for method\'s name and parameters
     * Requests that the state of the element be changed to the value specified in the RequestedState parameter. When the requested state change takes place, the EnabledState and RequestedState of the element will be the same. Invoking the RequestStateChange method multiple times could result in earlier requests being overwritten or lost. 
     * A return code of 0 shall indicate the state change was successfully initiated. 
     * A return code of 3 shall indicate that the state transition cannot complete within the interval specified by the TimeoutPeriod parameter. 
     * A return code of 4096 (0x1000) shall indicate the state change was successfully initiated, a ConcreteJob has been created, and its reference returned in the output parameter Job. Any other return code indicates an error condition.
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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown_or_Unspecified_Error = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Unknown or Unspecified Error (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unknown_or_Unspecified_Error = "Unknown or Unspecified Error";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Cannot_complete_within_Timeout_Period = new javax.cim.UnsignedInteger32(
                "3");

        /**
         * constant for value entry Cannot complete within Timeout Period (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Cannot_complete_within_Timeout_Period = "Cannot complete within Timeout Period";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started = new javax.cim.UnsignedInteger32(
                "4096");

        /**
         * constant for value entry Method Parameters Checked - Job Started (corresponds to mapEntry 4096 )
         */
        public final static String VALUE_ENTRY_Method_Parameters_Checked___Job_Started = "Method Parameters Checked - Job Started";

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

            if (VALUE_ENTRY_Unknown_or_Unspecified_Error.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown_or_Unspecified_Error;
            }

            if (VALUE_ENTRY_Cannot_complete_within_Timeout_Period.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Cannot_complete_within_Timeout_Period;
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

            if (VALUE_ENTRY_Method_Parameters_Checked___Job_Started.equals(value)) {
                return VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown_or_Unspecified_Error.intValue()) {
                return VALUE_ENTRY_Unknown_or_Unspecified_Error;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Cannot_complete_within_Timeout_Period
                    .intValue()) {
                return VALUE_ENTRY_Cannot_complete_within_Timeout_Period;
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

            if (iValue == VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started
                    .intValue()) {
                return VALUE_ENTRY_Method_Parameters_Checked___Job_Started;
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
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown_or_Unspecified_Error,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Cannot_complete_within_Timeout_Period,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Invalid_Parameter,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_In_Use,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
                VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_Invalid_State_Transition,
                VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_Use_of_Timeout_Parameter_Not_Supported,
                VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_Busy };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method RequestStateChange   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Completed_with_No_Error,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Unknown_or_Unspecified_Error,
                VALUE_ENTRY_Cannot_complete_within_Timeout_Period, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
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
                VALUE_ENTRY_Unknown_or_Unspecified_Error,
                VALUE_ENTRY_Cannot_complete_within_Timeout_Period, VALUE_ENTRY_Failed,
                VALUE_ENTRY_Invalid_Parameter, VALUE_ENTRY_In_Use,
                VALUE_ENTRY_Method_Parameters_Checked___Job_Started,
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

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled = new javax.cim.UnsignedInteger16(
                    "2");

            /**
             * constant for value entry Enabled (corresponds to mapEntry 2 )
             */
            public final static String VALUE_ENTRY_Enabled = "Enabled";

            /**
             * constant for value map entry 3
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled = new javax.cim.UnsignedInteger16(
                    "3");

            /**
             * constant for value entry Disabled (corresponds to mapEntry 3 )
             */
            public final static String VALUE_ENTRY_Disabled = "Disabled";

            /**
             * constant for value map entry 4
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shut_Down = new javax.cim.UnsignedInteger16(
                    "4");

            /**
             * constant for value entry Shut Down (corresponds to mapEntry 4 )
             */
            public final static String VALUE_ENTRY_Shut_Down = "Shut Down";

            /**
             * constant for value map entry 6
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Offline = new javax.cim.UnsignedInteger16(
                    "6");

            /**
             * constant for value entry Offline (corresponds to mapEntry 6 )
             */
            public final static String VALUE_ENTRY_Offline = "Offline";

            /**
             * constant for value map entry 7
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Test = new javax.cim.UnsignedInteger16(
                    "7");

            /**
             * constant for value entry Test (corresponds to mapEntry 7 )
             */
            public final static String VALUE_ENTRY_Test = "Test";

            /**
             * constant for value map entry 8
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Defer = new javax.cim.UnsignedInteger16(
                    "8");

            /**
             * constant for value entry Defer (corresponds to mapEntry 8 )
             */
            public final static String VALUE_ENTRY_Defer = "Defer";

            /**
             * constant for value map entry 9
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce = new javax.cim.UnsignedInteger16(
                    "9");

            /**
             * constant for value entry Quiesce (corresponds to mapEntry 9 )
             */
            public final static String VALUE_ENTRY_Quiesce = "Quiesce";

            /**
             * constant for value map entry 10
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Reboot = new javax.cim.UnsignedInteger16(
                    "10");

            /**
             * constant for value entry Reboot (corresponds to mapEntry 10 )
             */
            public final static String VALUE_ENTRY_Reboot = "Reboot";

            /**
             * constant for value map entry 11
             */

            public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Reset = new javax.cim.UnsignedInteger16(
                    "11");

            /**
             * constant for value entry Reset (corresponds to mapEntry 11 )
             */
            public final static String VALUE_ENTRY_Reset = "Reset";

            /**
             * constant for value map entry ..
             */

            /**
             * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
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

                if (VALUE_ENTRY_Enabled.equals(value)) {
                    return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled;
                }

                if (VALUE_ENTRY_Disabled.equals(value)) {
                    return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled;
                }

                if (VALUE_ENTRY_Shut_Down.equals(value)) {
                    return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shut_Down;
                }

                if (VALUE_ENTRY_Offline.equals(value)) {
                    return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Offline;
                }

                if (VALUE_ENTRY_Test.equals(value)) {
                    return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Test;
                }

                if (VALUE_ENTRY_Defer.equals(value)) {
                    return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Defer;
                }

                if (VALUE_ENTRY_Quiesce.equals(value)) {
                    return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce;
                }

                if (VALUE_ENTRY_Reboot.equals(value)) {
                    return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Reboot;
                }

                if (VALUE_ENTRY_Reset.equals(value)) {
                    return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Reset;
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

                if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled.intValue()) {
                    return VALUE_ENTRY_Enabled;
                }

                if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled.intValue()) {
                    return VALUE_ENTRY_Disabled;
                }

                if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shut_Down.intValue()) {
                    return VALUE_ENTRY_Shut_Down;
                }

                if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Offline.intValue()) {
                    return VALUE_ENTRY_Offline;
                }

                if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Test.intValue()) {
                    return VALUE_ENTRY_Test;
                }

                if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Defer.intValue()) {
                    return VALUE_ENTRY_Defer;
                }

                if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce.intValue()) {
                    return VALUE_ENTRY_Quiesce;
                }

                if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Reboot.intValue()) {
                    return VALUE_ENTRY_Reboot;
                }

                if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Reset.intValue()) {
                    return VALUE_ENTRY_Reset;
                }

                if (iValue >= 32768 || iValue <= 65535) {
                    return VALUE_ENTRY_Vendor_Reserved;
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
             * Value Map for the parameter RequestedState of the method RequestStateChange   
             */
            public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                    VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled,
                    VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled,
                    VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shut_Down,
                    VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Offline,
                    VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Test,
                    VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Defer,
                    VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce,
                    VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Reboot,
                    VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Reset };

            /**
             * Values
             * Contains all values even those having an integer value range representation within the valueMap
             * Value Map for the parameter RequestedState of the method RequestStateChange   
             */
            public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Enabled,
                    VALUE_ENTRY_Disabled, VALUE_ENTRY_Shut_Down, VALUE_ENTRY_Offline,
                    VALUE_ENTRY_Test, VALUE_ENTRY_Defer, VALUE_ENTRY_Quiesce, VALUE_ENTRY_Reboot,
                    VALUE_ENTRY_Reset, VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

            /**
             * Values for displaying within pulldown elements, lists, radio buttons etc
             * Contains no values that having an integer value range representation within the valueMap
             * 
             * Value Map for the parameter RequestedState of the method RequestStateChange   
             */
            public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Enabled,
                    VALUE_ENTRY_Disabled, VALUE_ENTRY_Shut_Down, VALUE_ENTRY_Offline,
                    VALUE_ENTRY_Test, VALUE_ENTRY_Defer, VALUE_ENTRY_Quiesce, VALUE_ENTRY_Reboot,
                    VALUE_ENTRY_Reset };

        }

        /**
         * constants for parameter Job
         */
        public static class PARAMETER_JOB {
            /*
             * Name of the parameter Job
             */
            public final static String NAME = "Job";

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
     * Constants of property EnabledDefault
     * An enumerated value indicating an administrator's default or startup configuration for the Enabled State of an element. By default, the element is "Enabled" (value=2).
     */
    public static class PROPERTY_ENABLEDDEFAULT {
        /**
         * name of the property EnabledDefault
         */
        public final static String NAME = "EnabledDefault";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Enabled (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Enabled = "Enabled";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Disabled (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Disabled = "Disabled";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Enabled but Offline (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Enabled_but_Offline = "Enabled but Offline";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_No_Default = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry No Default (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_No_Default = "No Default";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Quiesce (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Quiesce = "Quiesce";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
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

            if (VALUE_ENTRY_Enabled.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled;
            }

            if (VALUE_ENTRY_Disabled.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable;
            }

            if (VALUE_ENTRY_Enabled_but_Offline.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline;
            }

            if (VALUE_ENTRY_No_Default.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_No_Default;
            }

            if (VALUE_ENTRY_Quiesce.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled.intValue()) {
                return VALUE_ENTRY_Enabled;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled.intValue()) {
                return VALUE_ENTRY_Disabled;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline.intValue()) {
                return VALUE_ENTRY_Enabled_but_Offline;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_No_Default.intValue()) {
                return VALUE_ENTRY_No_Default;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce.intValue()) {
                return VALUE_ENTRY_Quiesce;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Reserved;
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
         * Value Map for the property EnabledDefault   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_No_Default,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property EnabledDefault   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Enabled, VALUE_ENTRY_Disabled,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Enabled_but_Offline,
                VALUE_ENTRY_No_Default, VALUE_ENTRY_Quiesce, VALUE_ENTRY_DMTF_Reserved,
                VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property EnabledDefault   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Enabled,
                VALUE_ENTRY_Disabled, VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Enabled_but_Offline,
                VALUE_ENTRY_No_Default, VALUE_ENTRY_Quiesce };

    }

    /**
     * Constants of property EnabledState
     * EnabledState is an integer enumeration that indicates the enabled and disabled states of an element. It can also indicate the transitions between these requested states. For example, shutting down (value=4) and starting (value=10) are transient states between enabled and disabled. The following text briefly summarizes the various enabled and disabled states: 
     * Enabled (2) indicates that the element is or could be executing commands, will process any queued commands, and queues new requests. 
     * Disabled (3) indicates that the element will not execute commands and will drop any new requests. 
     * Shutting Down (4) indicates that the element is in the process of going to a Disabled state. 
     * Not Applicable (5) indicates the element does not support being enabled or disabled. 
     * Enabled but Offline (6) indicates that the element might be completing commands, and will drop any new requests. 
     * Test (7) indicates that the element is in a test state. 
     * Deferred (8) indicates that the element might be completing commands, but will queue any new requests. 
     * Quiesce (9) indicates that the element is enabled but in a restricted mode.
     * Starting (10) indicates that the element is in the process of going to an Enabled state. New requests are queued.
     */
    public static class PROPERTY_ENABLEDSTATE {
        /**
         * name of the property EnabledState
         */
        public final static String NAME = "EnabledState";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Enabled (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Enabled = "Enabled";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Disabled (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Disabled = "Disabled";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Shutting Down (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Shutting_Down = "Shutting Down";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Enabled but Offline (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Enabled_but_Offline = "Enabled but Offline";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_In_Test = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry In Test (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_In_Test = "In Test";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Deferred (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Deferred = "Deferred";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Quiesce (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Quiesce = "Quiesce";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Starting (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Starting = "Starting";

        /**
         * constant for value map entry 11..32767
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 11..32767 )
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

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Enabled.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled;
            }

            if (VALUE_ENTRY_Disabled.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled;
            }

            if (VALUE_ENTRY_Shutting_Down.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable;
            }

            if (VALUE_ENTRY_Enabled_but_Offline.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline;
            }

            if (VALUE_ENTRY_In_Test.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_In_Test;
            }

            if (VALUE_ENTRY_Deferred.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred;
            }

            if (VALUE_ENTRY_Quiesce.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce;
            }

            if (VALUE_ENTRY_Starting.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled.intValue()) {
                return VALUE_ENTRY_Enabled;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled.intValue()) {
                return VALUE_ENTRY_Disabled;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down.intValue()) {
                return VALUE_ENTRY_Shutting_Down;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline.intValue()) {
                return VALUE_ENTRY_Enabled_but_Offline;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_In_Test.intValue()) {
                return VALUE_ENTRY_In_Test;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred.intValue()) {
                return VALUE_ENTRY_Deferred;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce.intValue()) {
                return VALUE_ENTRY_Quiesce;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting.intValue()) {
                return VALUE_ENTRY_Starting;
            }

            if (iValue >= 11 || iValue <= 32767) {
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
         * Value Map for the property EnabledState   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shutting_Down,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Not_Applicable,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Enabled_but_Offline,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_In_Test,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Starting };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property EnabledState   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Enabled, VALUE_ENTRY_Disabled, VALUE_ENTRY_Shutting_Down,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Enabled_but_Offline, VALUE_ENTRY_In_Test,
                VALUE_ENTRY_Deferred, VALUE_ENTRY_Quiesce, VALUE_ENTRY_Starting,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property EnabledState   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Enabled, VALUE_ENTRY_Disabled,
                VALUE_ENTRY_Shutting_Down, VALUE_ENTRY_Not_Applicable,
                VALUE_ENTRY_Enabled_but_Offline, VALUE_ENTRY_In_Test, VALUE_ENTRY_Deferred,
                VALUE_ENTRY_Quiesce, VALUE_ENTRY_Starting };

    }

    /**
     * Constants of property OtherEnabledState
     * A string that describes the enabled or disabled state of the element when the EnabledState property is set to 1 ("Other"). This property must be set to null when EnabledState is any value other than 1.
     */
    public static class PROPERTY_OTHERENABLEDSTATE {
        /**
         * name of the property OtherEnabledState
         */
        public final static String NAME = "OtherEnabledState";

    }

    /**
     * Constants of property RequestedState
     * RequestedState is an integer enumeration that indicates the last requested or desired state for the element, irrespective of the mechanism through which it was requested. The actual state of the element is represented by EnabledState. This property is provided to compare the last requested and current enabled or disabled states. Note that when EnabledState is set to 5 ("Not Applicable"), then this property has no meaning. Refer to the EnabledState property description for explanations of the values in the RequestedState enumeration. 
     * "Unknown" (0) indicates the last requested state for the element is unknown.
     * Note that the value "No Change" (5) has been deprecated in lieu of indicating the last requested state is "Unknown" (0). If the last requested or desired state is unknown, RequestedState should have the value "Unknown" (0), but may have the value "No Change" (5).Offline (6) indicates that the element has been requested to transition to the Enabled but Offline EnabledState. 
     * It should be noted that there are two new values in RequestedState that build on the statuses of EnabledState. These are "Reboot" (10) and "Reset" (11). Reboot refers to doing a "Shut Down" and then moving to an "Enabled" state. Reset indicates that the element is first "Disabled" and then "Enabled". The distinction between requesting "Shut Down" and "Disabled" should also be noted. Shut Down requests an orderly transition to the Disabled state, and might involve removing power, to completely erase any existing state. The Disabled state requests an immediate disabling of the element, such that it will not execute or accept any commands or processing requests. 
     * 
     * This property is set as the result of a method invocation (such as Start or StopService on CIM_Service), or can be overridden and defined as WRITEable in a subclass. The method approach is considered superior to a WRITEable property, because it allows an explicit invocation of the operation and the return of a result code. 
     * 
     * If knowledge of the last RequestedState is not supported for the EnabledLogicalElement, the property shall be NULL or have the value 12 "Not Applicable".
     */
    public static class PROPERTY_REQUESTEDSTATE {
        /**
         * name of the property RequestedState
         */
        public final static String NAME = "RequestedState";

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
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Enabled (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Enabled = "Enabled";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Disabled (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Disabled = "Disabled";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shut_Down = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Shut Down (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Shut_Down = "Shut Down";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_No_Change = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry No Change (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_No_Change = "No Change";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Offline = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Offline (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Offline = "Offline";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Test = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Test (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Test = "Test";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Deferred (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Deferred = "Deferred";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Quiesce (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Quiesce = "Quiesce";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Reboot = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Reboot (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Reboot = "Reboot";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Reset = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Reset (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Reset = "Reset";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
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

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Enabled.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled;
            }

            if (VALUE_ENTRY_Disabled.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled;
            }

            if (VALUE_ENTRY_Shut_Down.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shut_Down;
            }

            if (VALUE_ENTRY_No_Change.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_No_Change;
            }

            if (VALUE_ENTRY_Offline.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Offline;
            }

            if (VALUE_ENTRY_Test.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Test;
            }

            if (VALUE_ENTRY_Deferred.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred;
            }

            if (VALUE_ENTRY_Quiesce.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce;
            }

            if (VALUE_ENTRY_Reboot.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Reboot;
            }

            if (VALUE_ENTRY_Reset.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Reset;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Not_Applicable;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled.intValue()) {
                return VALUE_ENTRY_Enabled;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled.intValue()) {
                return VALUE_ENTRY_Disabled;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shut_Down.intValue()) {
                return VALUE_ENTRY_Shut_Down;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_No_Change.intValue()) {
                return VALUE_ENTRY_No_Change;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Offline.intValue()) {
                return VALUE_ENTRY_Offline;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Test.intValue()) {
                return VALUE_ENTRY_Test;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred.intValue()) {
                return VALUE_ENTRY_Deferred;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce.intValue()) {
                return VALUE_ENTRY_Quiesce;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Reboot.intValue()) {
                return VALUE_ENTRY_Reboot;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Reset.intValue()) {
                return VALUE_ENTRY_Reset;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Reserved;
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
         * Value Map for the property RequestedState   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shut_Down,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_No_Change,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Offline, VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Test,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Deferred,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Reboot,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Reset,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Not_Applicable };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property RequestedState   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Enabled,
                VALUE_ENTRY_Disabled, VALUE_ENTRY_Shut_Down, VALUE_ENTRY_No_Change,
                VALUE_ENTRY_Offline, VALUE_ENTRY_Test, VALUE_ENTRY_Deferred, VALUE_ENTRY_Quiesce,
                VALUE_ENTRY_Reboot, VALUE_ENTRY_Reset, VALUE_ENTRY_Not_Applicable,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property RequestedState   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Enabled, VALUE_ENTRY_Disabled, VALUE_ENTRY_Shut_Down,
                VALUE_ENTRY_No_Change, VALUE_ENTRY_Offline, VALUE_ENTRY_Test, VALUE_ENTRY_Deferred,
                VALUE_ENTRY_Quiesce, VALUE_ENTRY_Reboot, VALUE_ENTRY_Reset,
                VALUE_ENTRY_Not_Applicable };

    }

    /**
     * Constants of property TimeOfLastStateChange
     * The date or time when the EnabledState of the element last changed. If the state of the element has not changed and this property is populated, then it must be set to a 0 interval value. If a state change was requested, but rejected or not yet processed, the property must not be updated.
     */
    public static class PROPERTY_TIMEOFLASTSTATECHANGE {
        /**
         * name of the property TimeOfLastStateChange
         */
        public final static String NAME = "TimeOfLastStateChange";

    }

    static {
        addPackage("org.sblim.wbemsmt.dhcp.bl.fco");
        String[] parentClassPackageList = CIM_LogicalElement.getPackages();

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
     *   This class extends LogicalElement to abstract the concept of an element that is enabled and disabled, such as a LogicalDevice or a ServiceAccessPoint.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected CIM_EnabledLogicalElement(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   This class extends LogicalElement to abstract the concept of an element that is enabled and disabled, such as a LogicalDevice or a ServiceAccessPoint.
     *   @param cimInstance the instance that is used to create the Object
     */

    protected CIM_EnabledLogicalElement(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_EnabledLogicalElement() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("EnabledDefault", new CIMProperty("EnabledDefault",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("EnabledState", new CIMProperty("EnabledState", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("OtherEnabledState", new CIMProperty("OtherEnabledState",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("RequestedState", new CIMProperty("RequestedState",
                CIMDataType.UINT16_T, null));
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
     * Get the property EnabledDefault
     *     * <br>
     * An enumerated value indicating an administrator's default or startup configuration for the Enabled State of an element. By default, the element is "Enabled" (value=2).
     *     */

    public javax.cim.UnsignedInteger16 get_EnabledDefault() {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEDDEFAULT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ENABLEDDEFAULT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property EnabledDefault
     * <br>
     * An enumerated value indicating an administrator's default or startup configuration for the Enabled State of an element. By default, the element is "Enabled" (value=2).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EnabledDefault(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEDDEFAULT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_EnabledDefault(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEDDEFAULT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EnabledDefault by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EnabledDefault(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_EnabledLogicalElement fco = new CIM_EnabledLogicalElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENABLEDDEFAULT.NAME);
        if (property != null) {
            property = setPropertyValue_EnabledDefault(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEDDEFAULT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EnabledDefault
     * <br>
     * An enumerated value indicating an administrator's default or startup configuration for the Enabled State of an element. By default, the element is "Enabled" (value=2).
     */

    private static CIMProperty setPropertyValue_EnabledDefault(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property EnabledState
     *     * <br>
     * EnabledState is an integer enumeration that indicates the enabled and disabled states of an element. It can also indicate the transitions between these requested states. For example, shutting down (value=4) and starting (value=10) are transient states between enabled and disabled. The following text briefly summarizes the various enabled and disabled states: 
     * Enabled (2) indicates that the element is or could be executing commands, will process any queued commands, and queues new requests. 
     * Disabled (3) indicates that the element will not execute commands and will drop any new requests. 
     * Shutting Down (4) indicates that the element is in the process of going to a Disabled state. 
     * Not Applicable (5) indicates the element does not support being enabled or disabled. 
     * Enabled but Offline (6) indicates that the element might be completing commands, and will drop any new requests. 
     * Test (7) indicates that the element is in a test state. 
     * Deferred (8) indicates that the element might be completing commands, but will queue any new requests. 
     * Quiesce (9) indicates that the element is enabled but in a restricted mode.
     * Starting (10) indicates that the element is in the process of going to an Enabled state. New requests are queued.
     *     */

    public javax.cim.UnsignedInteger16 get_EnabledState() {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEDSTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ENABLEDSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property EnabledState
     * <br>
     * EnabledState is an integer enumeration that indicates the enabled and disabled states of an element. It can also indicate the transitions between these requested states. For example, shutting down (value=4) and starting (value=10) are transient states between enabled and disabled. The following text briefly summarizes the various enabled and disabled states: 
     * Enabled (2) indicates that the element is or could be executing commands, will process any queued commands, and queues new requests. 
     * Disabled (3) indicates that the element will not execute commands and will drop any new requests. 
     * Shutting Down (4) indicates that the element is in the process of going to a Disabled state. 
     * Not Applicable (5) indicates the element does not support being enabled or disabled. 
     * Enabled but Offline (6) indicates that the element might be completing commands, and will drop any new requests. 
     * Test (7) indicates that the element is in a test state. 
     * Deferred (8) indicates that the element might be completing commands, but will queue any new requests. 
     * Quiesce (9) indicates that the element is enabled but in a restricted mode.
     * Starting (10) indicates that the element is in the process of going to an Enabled state. New requests are queued.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EnabledState(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEDSTATE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_EnabledState(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEDSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EnabledState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EnabledState(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_EnabledLogicalElement fco = new CIM_EnabledLogicalElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENABLEDSTATE.NAME);
        if (property != null) {
            property = setPropertyValue_EnabledState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEDSTATE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EnabledState
     * <br>
     * EnabledState is an integer enumeration that indicates the enabled and disabled states of an element. It can also indicate the transitions between these requested states. For example, shutting down (value=4) and starting (value=10) are transient states between enabled and disabled. The following text briefly summarizes the various enabled and disabled states: 
     * Enabled (2) indicates that the element is or could be executing commands, will process any queued commands, and queues new requests. 
     * Disabled (3) indicates that the element will not execute commands and will drop any new requests. 
     * Shutting Down (4) indicates that the element is in the process of going to a Disabled state. 
     * Not Applicable (5) indicates the element does not support being enabled or disabled. 
     * Enabled but Offline (6) indicates that the element might be completing commands, and will drop any new requests. 
     * Test (7) indicates that the element is in a test state. 
     * Deferred (8) indicates that the element might be completing commands, but will queue any new requests. 
     * Quiesce (9) indicates that the element is enabled but in a restricted mode.
     * Starting (10) indicates that the element is in the process of going to an Enabled state. New requests are queued.
     */

    private static CIMProperty setPropertyValue_EnabledState(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherEnabledState
     *     * <br>
     * A string that describes the enabled or disabled state of the element when the EnabledState property is set to 1 ("Other"). This property must be set to null when EnabledState is any value other than 1.
     *     */

    public String get_OtherEnabledState() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERENABLEDSTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERENABLEDSTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherEnabledState
     * <br>
     * A string that describes the enabled or disabled state of the element when the EnabledState property is set to 1 ("Other"). This property must be set to null when EnabledState is any value other than 1.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherEnabledState(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERENABLEDSTATE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherEnabledState(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERENABLEDSTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherEnabledState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherEnabledState(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_EnabledLogicalElement fco = new CIM_EnabledLogicalElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERENABLEDSTATE.NAME);
        if (property != null) {
            property = setPropertyValue_OtherEnabledState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERENABLEDSTATE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherEnabledState
     * <br>
     * A string that describes the enabled or disabled state of the element when the EnabledState property is set to 1 ("Other"). This property must be set to null when EnabledState is any value other than 1.
     */

    private static CIMProperty setPropertyValue_OtherEnabledState(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RequestedState
     *     * <br>
     * RequestedState is an integer enumeration that indicates the last requested or desired state for the element, irrespective of the mechanism through which it was requested. The actual state of the element is represented by EnabledState. This property is provided to compare the last requested and current enabled or disabled states. Note that when EnabledState is set to 5 ("Not Applicable"), then this property has no meaning. Refer to the EnabledState property description for explanations of the values in the RequestedState enumeration. 
     * "Unknown" (0) indicates the last requested state for the element is unknown.
     * Note that the value "No Change" (5) has been deprecated in lieu of indicating the last requested state is "Unknown" (0). If the last requested or desired state is unknown, RequestedState should have the value "Unknown" (0), but may have the value "No Change" (5).Offline (6) indicates that the element has been requested to transition to the Enabled but Offline EnabledState. 
     * It should be noted that there are two new values in RequestedState that build on the statuses of EnabledState. These are "Reboot" (10) and "Reset" (11). Reboot refers to doing a "Shut Down" and then moving to an "Enabled" state. Reset indicates that the element is first "Disabled" and then "Enabled". The distinction between requesting "Shut Down" and "Disabled" should also be noted. Shut Down requests an orderly transition to the Disabled state, and might involve removing power, to completely erase any existing state. The Disabled state requests an immediate disabling of the element, such that it will not execute or accept any commands or processing requests. 
     * 
     * This property is set as the result of a method invocation (such as Start or StopService on CIM_Service), or can be overridden and defined as WRITEable in a subclass. The method approach is considered superior to a WRITEable property, because it allows an explicit invocation of the operation and the return of a result code. 
     * 
     * If knowledge of the last RequestedState is not supported for the EnabledLogicalElement, the property shall be NULL or have the value 12 "Not Applicable".
     *     */

    public javax.cim.UnsignedInteger16 get_RequestedState() {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUESTEDSTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REQUESTEDSTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RequestedState
     * <br>
     * RequestedState is an integer enumeration that indicates the last requested or desired state for the element, irrespective of the mechanism through which it was requested. The actual state of the element is represented by EnabledState. This property is provided to compare the last requested and current enabled or disabled states. Note that when EnabledState is set to 5 ("Not Applicable"), then this property has no meaning. Refer to the EnabledState property description for explanations of the values in the RequestedState enumeration. 
     * "Unknown" (0) indicates the last requested state for the element is unknown.
     * Note that the value "No Change" (5) has been deprecated in lieu of indicating the last requested state is "Unknown" (0). If the last requested or desired state is unknown, RequestedState should have the value "Unknown" (0), but may have the value "No Change" (5).Offline (6) indicates that the element has been requested to transition to the Enabled but Offline EnabledState. 
     * It should be noted that there are two new values in RequestedState that build on the statuses of EnabledState. These are "Reboot" (10) and "Reset" (11). Reboot refers to doing a "Shut Down" and then moving to an "Enabled" state. Reset indicates that the element is first "Disabled" and then "Enabled". The distinction between requesting "Shut Down" and "Disabled" should also be noted. Shut Down requests an orderly transition to the Disabled state, and might involve removing power, to completely erase any existing state. The Disabled state requests an immediate disabling of the element, such that it will not execute or accept any commands or processing requests. 
     * 
     * This property is set as the result of a method invocation (such as Start or StopService on CIM_Service), or can be overridden and defined as WRITEable in a subclass. The method approach is considered superior to a WRITEable property, because it allows an explicit invocation of the operation and the return of a result code. 
     * 
     * If knowledge of the last RequestedState is not supported for the EnabledLogicalElement, the property shall be NULL or have the value 12 "Not Applicable".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RequestedState(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUESTEDSTATE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_RequestedState(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REQUESTEDSTATE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RequestedState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RequestedState(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_EnabledLogicalElement fco = new CIM_EnabledLogicalElement(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REQUESTEDSTATE.NAME);
        if (property != null) {
            property = setPropertyValue_RequestedState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REQUESTEDSTATE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RequestedState
     * <br>
     * RequestedState is an integer enumeration that indicates the last requested or desired state for the element, irrespective of the mechanism through which it was requested. The actual state of the element is represented by EnabledState. This property is provided to compare the last requested and current enabled or disabled states. Note that when EnabledState is set to 5 ("Not Applicable"), then this property has no meaning. Refer to the EnabledState property description for explanations of the values in the RequestedState enumeration. 
     * "Unknown" (0) indicates the last requested state for the element is unknown.
     * Note that the value "No Change" (5) has been deprecated in lieu of indicating the last requested state is "Unknown" (0). If the last requested or desired state is unknown, RequestedState should have the value "Unknown" (0), but may have the value "No Change" (5).Offline (6) indicates that the element has been requested to transition to the Enabled but Offline EnabledState. 
     * It should be noted that there are two new values in RequestedState that build on the statuses of EnabledState. These are "Reboot" (10) and "Reset" (11). Reboot refers to doing a "Shut Down" and then moving to an "Enabled" state. Reset indicates that the element is first "Disabled" and then "Enabled". The distinction between requesting "Shut Down" and "Disabled" should also be noted. Shut Down requests an orderly transition to the Disabled state, and might involve removing power, to completely erase any existing state. The Disabled state requests an immediate disabling of the element, such that it will not execute or accept any commands or processing requests. 
     * 
     * This property is set as the result of a method invocation (such as Start or StopService on CIM_Service), or can be overridden and defined as WRITEable in a subclass. The method approach is considered superior to a WRITEable property, because it allows an explicit invocation of the operation and the return of a result code. 
     * 
     * If knowledge of the last RequestedState is not supported for the EnabledLogicalElement, the property shall be NULL or have the value 12 "Not Applicable".
     */

    private static CIMProperty setPropertyValue_RequestedState(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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
     * The date or time when the EnabledState of the element last changed. If the state of the element has not changed and this property is populated, then it must be set to a 0 interval value. If a state change was requested, but rejected or not yet processed, the property must not be updated.
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
     * The date or time when the EnabledState of the element last changed. If the state of the element has not changed and this property is populated, then it must be set to a 0 interval value. If a state change was requested, but rejected or not yet processed, the property must not be updated.
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
        CIM_EnabledLogicalElement fco = new CIM_EnabledLogicalElement(client, namespace);
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
     * The date or time when the EnabledState of the element last changed. If the state of the element has not changed and this property is populated, then it must be set to a 0 interval value. If a state change was requested, but rejected or not yet processed, the property must not be updated.
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
     * Requests that the state of the element be changed to the value specified in the RequestedState parameter. When the requested state change takes place, the EnabledState and RequestedState of the element will be the same. Invoking the RequestStateChange method multiple times could result in earlier requests being overwritten or lost. 
     * A return code of 0 shall indicate the state change was successfully initiated. 
     * A return code of 3 shall indicate that the state transition cannot complete within the interval specified by the TimeoutPeriod parameter. 
     * A return code of 4096 (0x1000) shall indicate the state change was successfully initiated, a ConcreteJob has been created, and its reference returned in the output parameter Job. Any other return code indicates an error condition.
     *   @param RequestedState The state requested for the element. This information will be placed into the RequestedState property of the instance if the return code of the RequestStateChange method is 0 ('Completed with No Error'), or 4096 (0x1000) ('Job Started'). Refer to the description of the EnabledState and RequestedState properties for the detailed explanations of the RequestedState values.
     *   @param TimeoutPeriod A timeout period that specifies the maximum amount of time that the client expects the transition to the new state to take. The interval format must be used to specify the TimeoutPeriod. A value of 0 or a null parameter indicates that the client has no time requirements for the transition. 
     *     If this property does not contain 0 or null and the implementation does not support this parameter, a return code of 'Use Of Timeout Parameter Not Supported' shall be returned.
     *
     */

    public RequestStateChangeResult invoke_RequestStateChange(WBEMClient cimClient
                                 ,javax.cim.UnsignedInteger16 RequestedState
                      ,javax.cim.CIMDateTime TimeoutPeriod
                      ) throws WbemsmtException {
         
       CIMArgument[] inParameter = new CIMArgument[2];
       CIMArgument[] outParameter = new CIMArgument[1];
    
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
                
        
        CIMArgument arg_Job = (CIMArgument) mapOutParameter.get("Job");
        if (arg_Job != null)
       	 {
                                          CIM_ConcreteJob out_Job = CIM_ConcreteJobHelper.getInstance(cimClient,(CIMObjectPath)arg_Job.getValue());
                                    
           result.set_Job(out_Job);
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

        /**
         * The out parameter Job
         */
        CIM_ConcreteJob Job = null;

        /**
         * Set the out parameter Job
         * @param value
         */
        void set_Job(CIM_ConcreteJob value) {
            this.Job = value;
        }

        /**
         * get the out parameter Job
         * @return
         */
        public CIM_ConcreteJob get_Job() {
            return this.Job;
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
        return CIM_EnabledLogicalElement.CIM_CLASS_NAME;
    }

}