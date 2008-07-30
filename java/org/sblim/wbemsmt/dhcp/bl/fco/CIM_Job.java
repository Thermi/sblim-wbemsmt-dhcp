/** 
 * CIM_Job.java
 *
 * 
 * © Copyright IBM Corp. 2006,2007
 *
 * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm
 *
 * Contributors:
 *    TODO add author by using vm argument -Ddcg.author=<email> during startup 
 * 
 * Description: A Job is a LogicalElement that represents an executing unit of work, such as a script or a print job. A Job is distinct from a Process in that a Job can be scheduled or queued, and its execution is not limited to a single system.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.fco;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import javax.wbem.*;

public class CIM_Job extends CIM_LogicalElement {

    public final static String CIM_CLASS_NAME = "CIM_Job";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constant for method\'s name and parameters
     * KillJob is being deprecated because there is no distinction made between an orderly shutdown and an immediate kill. CIM_ConcreteJob.RequestStateChange() provides 'Terminate' and 'Kill' options to allow this distinction. 
     * A method to kill this job and any underlying processes, and to remove any 'dangling' associations.
     */

    public static class METHOD_KILLJOB {
        /**
         * Constant for method KillJob
         */
        public final static String NAME = "KillJob";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Success = new javax.cim.UnsignedInteger32(
                "0");

        /**
         * constant for value entry Success (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Success = "Success";

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

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger32(
                "2");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout = new javax.cim.UnsignedInteger32(
                "3");

        /**
         * constant for value entry Timeout (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Timeout = "Timeout";

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
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Access_Denied = new javax.cim.UnsignedInteger32(
                "6");

        /**
         * constant for value entry Access Denied (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Access_Denied = "Access Denied";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger32 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Not_Found = new javax.cim.UnsignedInteger32(
                "7");

        /**
         * constant for value entry Not Found (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Not_Found = "Not Found";

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
         * constant for value entry Vendor Specific (corresponds to mapEntry 32768..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Specific = "Vendor Specific";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@b51c29
        public static javax.cim.UnsignedInteger32 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Success.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Success;
            }

            if (VALUE_ENTRY_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported;
            }

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Timeout.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout;
            }

            if (VALUE_ENTRY_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed;
            }

            if (VALUE_ENTRY_Access_Denied.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Access_Denied;
            }

            if (VALUE_ENTRY_Not_Found.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Not_Found;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Success.intValue()) {
                return VALUE_ENTRY_Success;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported.intValue()) {
                return VALUE_ENTRY_Not_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout.intValue()) {
                return VALUE_ENTRY_Timeout;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed.intValue()) {
                return VALUE_ENTRY_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Access_Denied.intValue()) {
                return VALUE_ENTRY_Access_Denied;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Not_Found.intValue()) {
                return VALUE_ENTRY_Not_Found;
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
         * Value Map for the method KillJob   
         */
        public final static javax.cim.UnsignedInteger32[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Success,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Not_Supported,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Timeout,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Failed,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Access_Denied,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Not_Found };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the method KillJob   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Success,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Unknown, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Failed, VALUE_ENTRY_Access_Denied, VALUE_ENTRY_Not_Found,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Specific };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the method KillJob   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Success,
                VALUE_ENTRY_Not_Supported, VALUE_ENTRY_Unknown, VALUE_ENTRY_Timeout,
                VALUE_ENTRY_Failed, VALUE_ENTRY_Access_Denied, VALUE_ENTRY_Not_Found };

        /**
         * constants for parameter DeleteOnKill
         */
        public static class PARAMETER_DELETEONKILL {
            /*
             * Name of the parameter DeleteOnKill
             */
            public final static String NAME = "DeleteOnKill";

        }
    }

    /**
     * Constants of property DeleteOnCompletion
     * Indicates whether or not the job should be automatically deleted upon completion. Note that the 'completion' of a recurring job is defined by its JobRunTimes or UntilTime properties, or when the Job is terminated by manual intervention. If this property is set to false and the job completes, then the extrinsic method DeleteInstance must be used to delete the job instead of updating this property.
     */
    public static class PROPERTY_DELETEONCOMPLETION {
        /**
         * name of the property DeleteOnCompletion
         */
        public final static String NAME = "DeleteOnCompletion";

    }

    /**
     * Constants of property ElapsedTime
     * The time interval that the Job has been executing or the total execution time if the Job is complete. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run time can be stored in this single-valued property.
     */
    public static class PROPERTY_ELAPSEDTIME {
        /**
         * name of the property ElapsedTime
         */
        public final static String NAME = "ElapsedTime";

    }

    /**
     * Constants of property ErrorCode
     * A vendor-specific error code. The value must be set to zero if the Job completed without error. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run error can be stored in this single-valued property.
     */
    public static class PROPERTY_ERRORCODE {
        /**
         * name of the property ErrorCode
         */
        public final static String NAME = "ErrorCode";

    }

    /**
     * Constants of property ErrorDescription
     * A free-form string that contains the vendor error description. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run error can be stored in this single-valued property.
     */
    public static class PROPERTY_ERRORDESCRIPTION {
        /**
         * name of the property ErrorDescription
         */
        public final static String NAME = "ErrorDescription";

    }

    /**
     * Constants of property JobRunTimes
     * The number of times that the Job should be run. A value of 1 indicates that the Job is not recurring, while any non-zero value indicates a limit to the number of times that the Job will recur. Zero indicates that there is no limit to the number of times that the Job can be processed, but that it is terminated either after the UntilTime or by manual intervention. By default, a Job is processed once.
     */
    public static class PROPERTY_JOBRUNTIMES {
        /**
         * name of the property JobRunTimes
         */
        public final static String NAME = "JobRunTimes";

    }

    /**
     * Constants of property JobStatus
     * A free-form string that represents the status of the job. The primary status is reflected in the inherited OperationalStatus property. JobStatus provides additional, implementation-specific details.
     */
    public static class PROPERTY_JOBSTATUS {
        /**
         * name of the property JobStatus
         */
        public final static String NAME = "JobStatus";

    }

    /**
     * Constants of property LocalOrUtcTime
     * This property indicates whether the times represented in the RunStartInterval and UntilTime properties represent local times or UTC times. Time values are synchronized worldwide by using the enumeration value 2, "UTC Time".
     */
    public static class PROPERTY_LOCALORUTCTIME {
        /**
         * name of the property LocalOrUtcTime
         */
        public final static String NAME = "LocalOrUtcTime";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Local_Time = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Local Time (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Local_Time = "Local Time";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_UTC_Time = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry UTC Time (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_UTC_Time = "UTC Time";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@4bf53e
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Local_Time.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Local_Time;
            }

            if (VALUE_ENTRY_UTC_Time.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_UTC_Time;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Local_Time.intValue()) {
                return VALUE_ENTRY_Local_Time;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_UTC_Time.intValue()) {
                return VALUE_ENTRY_UTC_Time;
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
         * Value Map for the property LocalOrUtcTime   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Local_Time,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_UTC_Time };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property LocalOrUtcTime   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Local_Time, VALUE_ENTRY_UTC_Time };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property LocalOrUtcTime   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Local_Time,
                VALUE_ENTRY_UTC_Time };

    }

    /**
     * Constants of property Notify
     * The User who is to be notified upon the Job completion or failure.
     */
    public static class PROPERTY_NOTIFY {
        /**
         * name of the property Notify
         */
        public final static String NAME = "Notify";

    }

    /**
     * Constants of property OtherRecoveryAction
     * A string describing the recovery action when the RecoveryAction property of the instance is 1 ("Other").
     */
    public static class PROPERTY_OTHERRECOVERYACTION {
        /**
         * name of the property OtherRecoveryAction
         */
        public final static String NAME = "OtherRecoveryAction";

    }

    /**
     * Constants of property Owner
     * The User that submitted the Job, or the Service or method name that caused the job to be created.
     */
    public static class PROPERTY_OWNER {
        /**
         * name of the property Owner
         */
        public final static String NAME = "Owner";

    }

    /**
     * Constants of property PercentComplete
     * The percentage of the job that has completed at the time that this value is requested. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run data can be stored in this single-valued property. 
     * Note that the value 101 is undefined and will be not be allowed in the next major revision of the specification.
     */
    public static class PROPERTY_PERCENTCOMPLETE {
        /**
         * name of the property PercentComplete
         */
        public final static String NAME = "PercentComplete";

    }

    /**
     * Constants of property Priority
     * Indicates the urgency or importance of execution of the Job. The lower the number, the higher the priority. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the setting information that would influence the results of a job.
     */
    public static class PROPERTY_PRIORITY {
        /**
         * name of the property Priority
         */
        public final static String NAME = "Priority";

    }

    /**
     * Constants of property RecoveryAction
     * Describes the recovery action to be taken for an unsuccessfully run Job. The possible values are: 
     * 0 = "Unknown", meaning it is unknown as to what recovery action to take 
     * 1 = "Other", indicating that the recovery action will be specified in the OtherRecoveryAction property 
     * 2 = "Do Not Continue", meaning stop the execution of the job and appropriately update its status 
     * 3 = "Continue With Next Job", meaning continue with the next job in the queue 
     * 4 = "Re-run Job", indicating that the job should be re-run 
     * 5 = "Run Recovery Job", meaning run the Job associated using the RecoveryJob relationship. Note that the recovery Job must already be in the queue from which it will run.
     */
    public static class PROPERTY_RECOVERYACTION {
        /**
         * name of the property RecoveryAction
         */
        public final static String NAME = "RecoveryAction";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Do_Not_Continue = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Do Not Continue (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Do_Not_Continue = "Do Not Continue";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Continue_With_Next_Job = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Continue With Next Job (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Continue_With_Next_Job = "Continue With Next Job";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Re_run_Job = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Re-run Job (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Re_run_Job = "Re-run Job";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Run_Recovery_Job = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Run Recovery Job (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Run_Recovery_Job = "Run Recovery Job";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@d1e7c2
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Do_Not_Continue.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Do_Not_Continue;
            }

            if (VALUE_ENTRY_Continue_With_Next_Job.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Continue_With_Next_Job;
            }

            if (VALUE_ENTRY_Re_run_Job.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Re_run_Job;
            }

            if (VALUE_ENTRY_Run_Recovery_Job.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Run_Recovery_Job;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Do_Not_Continue.intValue()) {
                return VALUE_ENTRY_Do_Not_Continue;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Continue_With_Next_Job.intValue()) {
                return VALUE_ENTRY_Continue_With_Next_Job;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Re_run_Job.intValue()) {
                return VALUE_ENTRY_Re_run_Job;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Run_Recovery_Job.intValue()) {
                return VALUE_ENTRY_Run_Recovery_Job;
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
         * Value Map for the property RecoveryAction   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Do_Not_Continue,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Continue_With_Next_Job,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Re_run_Job,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Run_Recovery_Job };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property RecoveryAction   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Do_Not_Continue, VALUE_ENTRY_Continue_With_Next_Job,
                VALUE_ENTRY_Re_run_Job, VALUE_ENTRY_Run_Recovery_Job };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property RecoveryAction   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Do_Not_Continue, VALUE_ENTRY_Continue_With_Next_Job,
                VALUE_ENTRY_Re_run_Job, VALUE_ENTRY_Run_Recovery_Job };

    }

    /**
     * Constants of property RunDay
     * The day in the month on which the Job should be processed. There are two different interpretations for this property, depending on the value of DayOfWeek. In one case, RunDay defines the day-in-month on which the Job is processed. This interpretation is used when the DayOfWeek is 0. A positive or negative integer indicates whether the RunDay should be calculated from the beginning or end of the month. For example, 5 indicates the fifth day in the RunMonth and -1 indicates the last day in the RunMonth. 
     * 
     * When RunDayOfWeek is not 0, RunDay is the day-in-month on which the Job is processed, defined in conjunction with RunDayOfWeek. For example, if RunDay is 15 and RunDayOfWeek is Saturday, then the Job is processed on the first Saturday on or after the 15th day in the RunMonth (for example, the third Saturday in the month). If RunDay is 20 and RunDayOfWeek is -Saturday, then this indicates the first Saturday on or before the 20th day in the RunMonth. If RunDay is -1 and RunDayOfWeek is -Sunday, then this indicates the last Sunday in the RunMonth.
     */
    public static class PROPERTY_RUNDAY {
        /**
         * name of the property RunDay
         */
        public final static String NAME = "RunDay";

    }

    /**
     * Constants of property RunDayOfWeek
     * A positive or negative integer used in conjunction with RunDay to indicate the day of the week on which the Job is processed. RunDayOfWeek is set to 0 to indicate an exact day of the month, such as March 1. A positive integer (representing Sunday, Monday, ..., Saturday) means that the day of week is found on or after the specified RunDay. A negative integer (representing -Sunday, -Monday, ..., -Saturday) means that the day of week is found on or BEFORE the RunDay.
     */
    public static class PROPERTY_RUNDAYOFWEEK {
        /**
         * name of the property RunDayOfWeek
         */
        public final static String NAME = "RunDayOfWeek";

        /**
         * constant for value map entry -7
         */

        public final static Byte VALUE_MAP_ENTRY__7_FOR_VALUE_ENTRY__Saturday = new Byte("-7");

        /**
         * constant for value entry -Saturday (corresponds to mapEntry -7 )
         */
        public final static String VALUE_ENTRY__Saturday = "-Saturday";

        /**
         * constant for value map entry -6
         */

        public final static Byte VALUE_MAP_ENTRY__6_FOR_VALUE_ENTRY__Friday = new Byte("-6");

        /**
         * constant for value entry -Friday (corresponds to mapEntry -6 )
         */
        public final static String VALUE_ENTRY__Friday = "-Friday";

        /**
         * constant for value map entry -5
         */

        public final static Byte VALUE_MAP_ENTRY__5_FOR_VALUE_ENTRY__Thursday = new Byte("-5");

        /**
         * constant for value entry -Thursday (corresponds to mapEntry -5 )
         */
        public final static String VALUE_ENTRY__Thursday = "-Thursday";

        /**
         * constant for value map entry -4
         */

        public final static Byte VALUE_MAP_ENTRY__4_FOR_VALUE_ENTRY__Wednesday = new Byte("-4");

        /**
         * constant for value entry -Wednesday (corresponds to mapEntry -4 )
         */
        public final static String VALUE_ENTRY__Wednesday = "-Wednesday";

        /**
         * constant for value map entry -3
         */

        public final static Byte VALUE_MAP_ENTRY__3_FOR_VALUE_ENTRY__Tuesday = new Byte("-3");

        /**
         * constant for value entry -Tuesday (corresponds to mapEntry -3 )
         */
        public final static String VALUE_ENTRY__Tuesday = "-Tuesday";

        /**
         * constant for value map entry -2
         */

        public final static Byte VALUE_MAP_ENTRY__2_FOR_VALUE_ENTRY__Monday = new Byte("-2");

        /**
         * constant for value entry -Monday (corresponds to mapEntry -2 )
         */
        public final static String VALUE_ENTRY__Monday = "-Monday";

        /**
         * constant for value map entry -1
         */

        public final static Byte VALUE_MAP_ENTRY__1_FOR_VALUE_ENTRY__Sunday = new Byte("-1");

        /**
         * constant for value entry -Sunday (corresponds to mapEntry -1 )
         */
        public final static String VALUE_ENTRY__Sunday = "-Sunday";

        /**
         * constant for value map entry 0
         */

        public final static Byte VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_ExactDayOfMonth = new Byte("0");

        /**
         * constant for value entry ExactDayOfMonth (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_ExactDayOfMonth = "ExactDayOfMonth";

        /**
         * constant for value map entry 1
         */

        public final static Byte VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Sunday = new Byte("1");

        /**
         * constant for value entry Sunday (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Sunday = "Sunday";

        /**
         * constant for value map entry 2
         */

        public final static Byte VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Monday = new Byte("2");

        /**
         * constant for value entry Monday (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Monday = "Monday";

        /**
         * constant for value map entry 3
         */

        public final static Byte VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Tuesday = new Byte("3");

        /**
         * constant for value entry Tuesday (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Tuesday = "Tuesday";

        /**
         * constant for value map entry 4
         */

        public final static Byte VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Wednesday = new Byte("4");

        /**
         * constant for value entry Wednesday (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Wednesday = "Wednesday";

        /**
         * constant for value map entry 5
         */

        public final static Byte VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Thursday = new Byte("5");

        /**
         * constant for value entry Thursday (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Thursday = "Thursday";

        /**
         * constant for value map entry 6
         */

        public final static Byte VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Friday = new Byte("6");

        /**
         * constant for value entry Friday (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Friday = "Friday";

        /**
         * constant for value map entry 7
         */

        public final static Byte VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Saturday = new Byte("7");

        /**
         * constant for value entry Saturday (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Saturday = "Saturday";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@c68a98
        public static Byte getValueMapEntry(String value) {

            if (VALUE_ENTRY__Saturday.equals(value)) {
                return VALUE_MAP_ENTRY__7_FOR_VALUE_ENTRY__Saturday;
            }

            if (VALUE_ENTRY__Friday.equals(value)) {
                return VALUE_MAP_ENTRY__6_FOR_VALUE_ENTRY__Friday;
            }

            if (VALUE_ENTRY__Thursday.equals(value)) {
                return VALUE_MAP_ENTRY__5_FOR_VALUE_ENTRY__Thursday;
            }

            if (VALUE_ENTRY__Wednesday.equals(value)) {
                return VALUE_MAP_ENTRY__4_FOR_VALUE_ENTRY__Wednesday;
            }

            if (VALUE_ENTRY__Tuesday.equals(value)) {
                return VALUE_MAP_ENTRY__3_FOR_VALUE_ENTRY__Tuesday;
            }

            if (VALUE_ENTRY__Monday.equals(value)) {
                return VALUE_MAP_ENTRY__2_FOR_VALUE_ENTRY__Monday;
            }

            if (VALUE_ENTRY__Sunday.equals(value)) {
                return VALUE_MAP_ENTRY__1_FOR_VALUE_ENTRY__Sunday;
            }

            if (VALUE_ENTRY_ExactDayOfMonth.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_ExactDayOfMonth;
            }

            if (VALUE_ENTRY_Sunday.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Sunday;
            }

            if (VALUE_ENTRY_Monday.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Monday;
            }

            if (VALUE_ENTRY_Tuesday.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Tuesday;
            }

            if (VALUE_ENTRY_Wednesday.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Wednesday;
            }

            if (VALUE_ENTRY_Thursday.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Thursday;
            }

            if (VALUE_ENTRY_Friday.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Friday;
            }

            if (VALUE_ENTRY_Saturday.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Saturday;
            }
            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static Byte getValueMapEntryFromDisplayedValue(Number indexInPulldown) {
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
        public static int getIndexForDisplay(Byte currentValue) {
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

        public static String getValueEntry(Byte value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY__7_FOR_VALUE_ENTRY__Saturday.intValue()) {
                return VALUE_ENTRY__Saturday;
            }

            if (iValue == VALUE_MAP_ENTRY__6_FOR_VALUE_ENTRY__Friday.intValue()) {
                return VALUE_ENTRY__Friday;
            }

            if (iValue == VALUE_MAP_ENTRY__5_FOR_VALUE_ENTRY__Thursday.intValue()) {
                return VALUE_ENTRY__Thursday;
            }

            if (iValue == VALUE_MAP_ENTRY__4_FOR_VALUE_ENTRY__Wednesday.intValue()) {
                return VALUE_ENTRY__Wednesday;
            }

            if (iValue == VALUE_MAP_ENTRY__3_FOR_VALUE_ENTRY__Tuesday.intValue()) {
                return VALUE_ENTRY__Tuesday;
            }

            if (iValue == VALUE_MAP_ENTRY__2_FOR_VALUE_ENTRY__Monday.intValue()) {
                return VALUE_ENTRY__Monday;
            }

            if (iValue == VALUE_MAP_ENTRY__1_FOR_VALUE_ENTRY__Sunday.intValue()) {
                return VALUE_ENTRY__Sunday;
            }

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_ExactDayOfMonth.intValue()) {
                return VALUE_ENTRY_ExactDayOfMonth;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Sunday.intValue()) {
                return VALUE_ENTRY_Sunday;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Monday.intValue()) {
                return VALUE_ENTRY_Monday;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Tuesday.intValue()) {
                return VALUE_ENTRY_Tuesday;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Wednesday.intValue()) {
                return VALUE_ENTRY_Wednesday;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Thursday.intValue()) {
                return VALUE_ENTRY_Thursday;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Friday.intValue()) {
                return VALUE_ENTRY_Friday;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Saturday.intValue()) {
                return VALUE_ENTRY_Saturday;
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
         * Value Map for the property RunDayOfWeek   
         */
        public final static Byte[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY__7_FOR_VALUE_ENTRY__Saturday,
                VALUE_MAP_ENTRY__6_FOR_VALUE_ENTRY__Friday,
                VALUE_MAP_ENTRY__5_FOR_VALUE_ENTRY__Thursday,
                VALUE_MAP_ENTRY__4_FOR_VALUE_ENTRY__Wednesday,
                VALUE_MAP_ENTRY__3_FOR_VALUE_ENTRY__Tuesday,
                VALUE_MAP_ENTRY__2_FOR_VALUE_ENTRY__Monday,
                VALUE_MAP_ENTRY__1_FOR_VALUE_ENTRY__Sunday,
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_ExactDayOfMonth,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Sunday, VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Monday,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Tuesday,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Wednesday,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Thursday,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Friday,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Saturday };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property RunDayOfWeek   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY__Saturday, VALUE_ENTRY__Friday,
                VALUE_ENTRY__Thursday, VALUE_ENTRY__Wednesday, VALUE_ENTRY__Tuesday,
                VALUE_ENTRY__Monday, VALUE_ENTRY__Sunday, VALUE_ENTRY_ExactDayOfMonth,
                VALUE_ENTRY_Sunday, VALUE_ENTRY_Monday, VALUE_ENTRY_Tuesday, VALUE_ENTRY_Wednesday,
                VALUE_ENTRY_Thursday, VALUE_ENTRY_Friday, VALUE_ENTRY_Saturday };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property RunDayOfWeek   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY__Saturday,
                VALUE_ENTRY__Friday, VALUE_ENTRY__Thursday, VALUE_ENTRY__Wednesday,
                VALUE_ENTRY__Tuesday, VALUE_ENTRY__Monday, VALUE_ENTRY__Sunday,
                VALUE_ENTRY_ExactDayOfMonth, VALUE_ENTRY_Sunday, VALUE_ENTRY_Monday,
                VALUE_ENTRY_Tuesday, VALUE_ENTRY_Wednesday, VALUE_ENTRY_Thursday,
                VALUE_ENTRY_Friday, VALUE_ENTRY_Saturday };

    }

    /**
     * Constants of property RunMonth
     * The month during which the Job should be processed. Specify 0 for January, 1 for February, and so on.
     */
    public static class PROPERTY_RUNMONTH {
        /**
         * name of the property RunMonth
         */
        public final static String NAME = "RunMonth";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_January = new javax.cim.UnsignedInteger8(
                "0");

        /**
         * constant for value entry January (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_January = "January";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_February = new javax.cim.UnsignedInteger8(
                "1");

        /**
         * constant for value entry February (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_February = "February";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_March = new javax.cim.UnsignedInteger8(
                "2");

        /**
         * constant for value entry March (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_March = "March";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_April = new javax.cim.UnsignedInteger8(
                "3");

        /**
         * constant for value entry April (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_April = "April";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_May = new javax.cim.UnsignedInteger8(
                "4");

        /**
         * constant for value entry May (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_May = "May";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_June = new javax.cim.UnsignedInteger8(
                "5");

        /**
         * constant for value entry June (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_June = "June";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_July = new javax.cim.UnsignedInteger8(
                "6");

        /**
         * constant for value entry July (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_July = "July";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_August = new javax.cim.UnsignedInteger8(
                "7");

        /**
         * constant for value entry August (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_August = "August";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_September = new javax.cim.UnsignedInteger8(
                "8");

        /**
         * constant for value entry September (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_September = "September";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_October = new javax.cim.UnsignedInteger8(
                "9");

        /**
         * constant for value entry October (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_October = "October";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_November = new javax.cim.UnsignedInteger8(
                "10");

        /**
         * constant for value entry November (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_November = "November";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger8 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_December = new javax.cim.UnsignedInteger8(
                "11");

        /**
         * constant for value entry December (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_December = "December";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@b51404
        public static javax.cim.UnsignedInteger8 getValueMapEntry(String value) {

            if (VALUE_ENTRY_January.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_January;
            }

            if (VALUE_ENTRY_February.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_February;
            }

            if (VALUE_ENTRY_March.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_March;
            }

            if (VALUE_ENTRY_April.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_April;
            }

            if (VALUE_ENTRY_May.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_May;
            }

            if (VALUE_ENTRY_June.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_June;
            }

            if (VALUE_ENTRY_July.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_July;
            }

            if (VALUE_ENTRY_August.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_August;
            }

            if (VALUE_ENTRY_September.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_September;
            }

            if (VALUE_ENTRY_October.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_October;
            }

            if (VALUE_ENTRY_November.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_November;
            }

            if (VALUE_ENTRY_December.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_December;
            }
            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger8 getValueMapEntryFromDisplayedValue(
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
        public static int getIndexForDisplay(javax.cim.UnsignedInteger8 currentValue) {
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

        public static String getValueEntry(javax.cim.UnsignedInteger8 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_January.intValue()) {
                return VALUE_ENTRY_January;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_February.intValue()) {
                return VALUE_ENTRY_February;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_March.intValue()) {
                return VALUE_ENTRY_March;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_April.intValue()) {
                return VALUE_ENTRY_April;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_May.intValue()) {
                return VALUE_ENTRY_May;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_June.intValue()) {
                return VALUE_ENTRY_June;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_July.intValue()) {
                return VALUE_ENTRY_July;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_August.intValue()) {
                return VALUE_ENTRY_August;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_September.intValue()) {
                return VALUE_ENTRY_September;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_October.intValue()) {
                return VALUE_ENTRY_October;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_November.intValue()) {
                return VALUE_ENTRY_November;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_December.intValue()) {
                return VALUE_ENTRY_December;
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
         * Value Map for the property RunMonth   
         */
        public final static javax.cim.UnsignedInteger8[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_January,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_February,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_March, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_April,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_May, VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_June,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_July, VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_August,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_September,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_October,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_November,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_December };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property RunMonth   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_January, VALUE_ENTRY_February,
                VALUE_ENTRY_March, VALUE_ENTRY_April, VALUE_ENTRY_May, VALUE_ENTRY_June,
                VALUE_ENTRY_July, VALUE_ENTRY_August, VALUE_ENTRY_September, VALUE_ENTRY_October,
                VALUE_ENTRY_November, VALUE_ENTRY_December };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property RunMonth   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_January,
                VALUE_ENTRY_February, VALUE_ENTRY_March, VALUE_ENTRY_April, VALUE_ENTRY_May,
                VALUE_ENTRY_June, VALUE_ENTRY_July, VALUE_ENTRY_August, VALUE_ENTRY_September,
                VALUE_ENTRY_October, VALUE_ENTRY_November, VALUE_ENTRY_December };

    }

    /**
     * Constants of property RunStartInterval
     * The time interval after midnight when the Job should be processed. For example, 
     * 00000000020000.000000:000 
     * indicates that the Job should be run on or after two o'clock, local time or UTC time (distinguished using the LocalOrUtcTime property.
     */
    public static class PROPERTY_RUNSTARTINTERVAL {
        /**
         * name of the property RunStartInterval
         */
        public final static String NAME = "RunStartInterval";

    }

    /**
     * Constants of property ScheduledStartTime
     * The time that the current Job is scheduled to start. This time can be represented by the actual date and time, or an interval relative to the time that this property is requested. A value of all zeroes indicates that the Job is already executing. The property is deprecated in lieu of the more expressive scheduling properties, RunMonth, RunDay, RunDayOfWeek, and RunStartInterval.
     */
    public static class PROPERTY_SCHEDULEDSTARTTIME {
        /**
         * name of the property ScheduledStartTime
         */
        public final static String NAME = "ScheduledStartTime";

    }

    /**
     * Constants of property StartTime
     * The time that the Job was actually started. This time can be represented by an actual date and time, or by an interval relative to the time that this property is requested. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run time can be stored in this single-valued property.
     */
    public static class PROPERTY_STARTTIME {
        /**
         * name of the property StartTime
         */
        public final static String NAME = "StartTime";

    }

    /**
     * Constants of property TimeSubmitted
     * The time that the Job was submitted to execute. A value of all zeroes indicates that the owning element is not capable of reporting a date and time. Therefore, the ScheduledStartTime and StartTime are reported as intervals relative to the time their values are requested.
     */
    public static class PROPERTY_TIMESUBMITTED {
        /**
         * name of the property TimeSubmitted
         */
        public final static String NAME = "TimeSubmitted";

    }

    /**
     * Constants of property UntilTime
     * The time after which the Job is invalid or should be stopped. This time can be represented by an actual date and time, or by an interval relative to the time that this property is requested. A value of all nines indicates that the Job can run indefinitely.
     */
    public static class PROPERTY_UNTILTIME {
        /**
         * name of the property UntilTime
         */
        public final static String NAME = "UntilTime";

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
     *   A Job is a LogicalElement that represents an executing unit of work, such as a script or a print job. A Job is distinct from a Process in that a Job can be scheduled or queued, and its execution is not limited to a single system.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    protected CIM_Job(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *   protected because this class should not be created directly because it represents an abstract CIM Class     *   <br>
     *   A Job is a LogicalElement that represents an executing unit of work, such as a script or a print job. A Job is distinct from a Process in that a Job can be scheduled or queued, and its execution is not limited to a single system.
     *   @param cimInstance the instance that is used to create the Object
     */

    protected CIM_Job(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_Job() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("DeleteOnCompletion", new CIMProperty("DeleteOnCompletion",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("ElapsedTime", new CIMProperty("ElapsedTime", CIMDataType.DATETIME_T,
                null));
        propertiesToCheck
                .put("ErrorCode", new CIMProperty("ErrorCode", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ErrorDescription", new CIMProperty("ErrorDescription",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("JobRunTimes", new CIMProperty("JobRunTimes", CIMDataType.UINT32_T,
                null));
        propertiesToCheck
                .put("JobStatus", new CIMProperty("JobStatus", CIMDataType.STRING_T, null));
        propertiesToCheck.put("LocalOrUtcTime", new CIMProperty("LocalOrUtcTime",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Notify", new CIMProperty("Notify", CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherRecoveryAction", new CIMProperty("OtherRecoveryAction",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("Owner", new CIMProperty("Owner", CIMDataType.STRING_T, null));
        propertiesToCheck.put("PercentComplete", new CIMProperty("PercentComplete",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("Priority", new CIMProperty("Priority", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("RecoveryAction", new CIMProperty("RecoveryAction",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("RunDay", new CIMProperty("RunDay", CIMDataType.SINT8_T, null));
        propertiesToCheck.put("RunDayOfWeek", new CIMProperty("RunDayOfWeek", CIMDataType.SINT8_T,
                null));
        propertiesToCheck.put("RunMonth", new CIMProperty("RunMonth", CIMDataType.UINT8_T, null));
        propertiesToCheck.put("RunStartInterval", new CIMProperty("RunStartInterval",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("ScheduledStartTime", new CIMProperty("ScheduledStartTime",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("StartTime", new CIMProperty("StartTime", CIMDataType.DATETIME_T,
                null));
        propertiesToCheck.put("TimeSubmitted", new CIMProperty("TimeSubmitted",
                CIMDataType.DATETIME_T, null));
        propertiesToCheck.put("UntilTime", new CIMProperty("UntilTime", CIMDataType.DATETIME_T,
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
     * Get the property DeleteOnCompletion
     *     * <br>
     * Indicates whether or not the job should be automatically deleted upon completion. Note that the 'completion' of a recurring job is defined by its JobRunTimes or UntilTime properties, or when the Job is terminated by manual intervention. If this property is set to false and the job completes, then the extrinsic method DeleteInstance must be used to delete the job instead of updating this property.
     *     */

    public Boolean get_DeleteOnCompletion() {
        CIMProperty currentProperty = getProperty(PROPERTY_DELETEONCOMPLETION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DELETEONCOMPLETION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property DeleteOnCompletion
     * <br>
     * Indicates whether or not the job should be automatically deleted upon completion. Note that the 'completion' of a recurring job is defined by its JobRunTimes or UntilTime properties, or when the Job is terminated by manual intervention. If this property is set to false and the job completes, then the extrinsic method DeleteInstance must be used to delete the job instead of updating this property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DeleteOnCompletion(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DELETEONCOMPLETION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_DeleteOnCompletion(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DELETEONCOMPLETION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DeleteOnCompletion by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DeleteOnCompletion(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DELETEONCOMPLETION.NAME);
        if (property != null) {
            property = setPropertyValue_DeleteOnCompletion(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DELETEONCOMPLETION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DeleteOnCompletion
     * <br>
     * Indicates whether or not the job should be automatically deleted upon completion. Note that the 'completion' of a recurring job is defined by its JobRunTimes or UntilTime properties, or when the Job is terminated by manual intervention. If this property is set to false and the job completes, then the extrinsic method DeleteInstance must be used to delete the job instead of updating this property.
     */

    private static CIMProperty setPropertyValue_DeleteOnCompletion(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ElapsedTime
     *     * <br>
     * The time interval that the Job has been executing or the total execution time if the Job is complete. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run time can be stored in this single-valued property.
     *     */

    public javax.cim.CIMDateTime get_ElapsedTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_ELAPSEDTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ELAPSEDTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property ElapsedTime
     * <br>
     * The time interval that the Job has been executing or the total execution time if the Job is complete. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run time can be stored in this single-valued property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ElapsedTime(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ELAPSEDTIME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ElapsedTime(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ELAPSEDTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ElapsedTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ElapsedTime(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ELAPSEDTIME.NAME);
        if (property != null) {
            property = setPropertyValue_ElapsedTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ELAPSEDTIME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ElapsedTime
     * <br>
     * The time interval that the Job has been executing or the total execution time if the Job is complete. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run time can be stored in this single-valued property.
     */

    private static CIMProperty setPropertyValue_ElapsedTime(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorCode
     *     * <br>
     * A vendor-specific error code. The value must be set to zero if the Job completed without error. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run error can be stored in this single-valued property.
     *     */

    public javax.cim.UnsignedInteger16 get_ErrorCode() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORCODE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORCODE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ErrorCode
     * <br>
     * A vendor-specific error code. The value must be set to zero if the Job completed without error. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run error can be stored in this single-valued property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorCode(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORCODE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ErrorCode(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORCODE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorCode by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorCode(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORCODE.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorCode(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORCODE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorCode
     * <br>
     * A vendor-specific error code. The value must be set to zero if the Job completed without error. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run error can be stored in this single-valued property.
     */

    private static CIMProperty setPropertyValue_ErrorCode(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorDescription
     *     * <br>
     * A free-form string that contains the vendor error description. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run error can be stored in this single-valued property.
     *     */

    public String get_ErrorDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property ErrorDescription
     * <br>
     * A free-form string that contains the vendor error description. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run error can be stored in this single-valued property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORDESCRIPTION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ErrorDescription(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorDescription
     * <br>
     * A free-form string that contains the vendor error description. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run error can be stored in this single-valued property.
     */

    private static CIMProperty setPropertyValue_ErrorDescription(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property JobRunTimes
     *     * <br>
     * The number of times that the Job should be run. A value of 1 indicates that the Job is not recurring, while any non-zero value indicates a limit to the number of times that the Job will recur. Zero indicates that there is no limit to the number of times that the Job can be processed, but that it is terminated either after the UntilTime or by manual intervention. By default, a Job is processed once.
     *     */

    public javax.cim.UnsignedInteger32 get_JobRunTimes() {
        CIMProperty currentProperty = getProperty(PROPERTY_JOBRUNTIMES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_JOBRUNTIMES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property JobRunTimes
     * <br>
     * The number of times that the Job should be run. A value of 1 indicates that the Job is not recurring, while any non-zero value indicates a limit to the number of times that the Job will recur. Zero indicates that there is no limit to the number of times that the Job can be processed, but that it is terminated either after the UntilTime or by manual intervention. By default, a Job is processed once.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_JobRunTimes(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_JOBRUNTIMES.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_JobRunTimes(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_JOBRUNTIMES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property JobRunTimes by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_JobRunTimes(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_JOBRUNTIMES.NAME);
        if (property != null) {
            property = setPropertyValue_JobRunTimes(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_JOBRUNTIMES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property JobRunTimes
     * <br>
     * The number of times that the Job should be run. A value of 1 indicates that the Job is not recurring, while any non-zero value indicates a limit to the number of times that the Job will recur. Zero indicates that there is no limit to the number of times that the Job can be processed, but that it is terminated either after the UntilTime or by manual intervention. By default, a Job is processed once.
     */

    private static CIMProperty setPropertyValue_JobRunTimes(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property JobStatus
     *     * <br>
     * A free-form string that represents the status of the job. The primary status is reflected in the inherited OperationalStatus property. JobStatus provides additional, implementation-specific details.
     *     */

    public String get_JobStatus() {
        CIMProperty currentProperty = getProperty(PROPERTY_JOBSTATUS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_JOBSTATUS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property JobStatus
     * <br>
     * A free-form string that represents the status of the job. The primary status is reflected in the inherited OperationalStatus property. JobStatus provides additional, implementation-specific details.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_JobStatus(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_JOBSTATUS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_JobStatus(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_JOBSTATUS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property JobStatus by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_JobStatus(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_JOBSTATUS.NAME);
        if (property != null) {
            property = setPropertyValue_JobStatus(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_JOBSTATUS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property JobStatus
     * <br>
     * A free-form string that represents the status of the job. The primary status is reflected in the inherited OperationalStatus property. JobStatus provides additional, implementation-specific details.
     */

    private static CIMProperty setPropertyValue_JobStatus(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LocalOrUtcTime
     *     * <br>
     * This property indicates whether the times represented in the RunStartInterval and UntilTime properties represent local times or UTC times. Time values are synchronized worldwide by using the enumeration value 2, "UTC Time".
     *     */

    public javax.cim.UnsignedInteger16 get_LocalOrUtcTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOCALORUTCTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOCALORUTCTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property LocalOrUtcTime
     * <br>
     * This property indicates whether the times represented in the RunStartInterval and UntilTime properties represent local times or UTC times. Time values are synchronized worldwide by using the enumeration value 2, "UTC Time".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LocalOrUtcTime(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOCALORUTCTIME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_LocalOrUtcTime(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOCALORUTCTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LocalOrUtcTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LocalOrUtcTime(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOCALORUTCTIME.NAME);
        if (property != null) {
            property = setPropertyValue_LocalOrUtcTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOCALORUTCTIME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LocalOrUtcTime
     * <br>
     * This property indicates whether the times represented in the RunStartInterval and UntilTime properties represent local times or UTC times. Time values are synchronized worldwide by using the enumeration value 2, "UTC Time".
     */

    private static CIMProperty setPropertyValue_LocalOrUtcTime(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Notify
     *     * <br>
     * The User who is to be notified upon the Job completion or failure.
     *     */

    public String get_Notify() {
        CIMProperty currentProperty = getProperty(PROPERTY_NOTIFY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NOTIFY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Notify
     * <br>
     * The User who is to be notified upon the Job completion or failure.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Notify(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NOTIFY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Notify(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NOTIFY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Notify by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Notify(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NOTIFY.NAME);
        if (property != null) {
            property = setPropertyValue_Notify(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NOTIFY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Notify
     * <br>
     * The User who is to be notified upon the Job completion or failure.
     */

    private static CIMProperty setPropertyValue_Notify(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherRecoveryAction
     *     * <br>
     * A string describing the recovery action when the RecoveryAction property of the instance is 1 ("Other").
     *     */

    public String get_OtherRecoveryAction() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERRECOVERYACTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERRECOVERYACTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherRecoveryAction
     * <br>
     * A string describing the recovery action when the RecoveryAction property of the instance is 1 ("Other").
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherRecoveryAction(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERRECOVERYACTION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherRecoveryAction(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERRECOVERYACTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherRecoveryAction by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherRecoveryAction(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERRECOVERYACTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherRecoveryAction(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERRECOVERYACTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherRecoveryAction
     * <br>
     * A string describing the recovery action when the RecoveryAction property of the instance is 1 ("Other").
     */

    private static CIMProperty setPropertyValue_OtherRecoveryAction(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Owner
     *     * <br>
     * The User that submitted the Job, or the Service or method name that caused the job to be created.
     *     */

    public String get_Owner() {
        CIMProperty currentProperty = getProperty(PROPERTY_OWNER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OWNER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Owner
     * <br>
     * The User that submitted the Job, or the Service or method name that caused the job to be created.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Owner(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OWNER.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Owner(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OWNER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Owner by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Owner(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OWNER.NAME);
        if (property != null) {
            property = setPropertyValue_Owner(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OWNER.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Owner
     * <br>
     * The User that submitted the Job, or the Service or method name that caused the job to be created.
     */

    private static CIMProperty setPropertyValue_Owner(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PercentComplete
     *     * <br>
     * The percentage of the job that has completed at the time that this value is requested. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run data can be stored in this single-valued property. 
     * Note that the value 101 is undefined and will be not be allowed in the next major revision of the specification.
     *     */

    public javax.cim.UnsignedInteger16 get_PercentComplete() {
        CIMProperty currentProperty = getProperty(PROPERTY_PERCENTCOMPLETE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PERCENTCOMPLETE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PercentComplete
     * <br>
     * The percentage of the job that has completed at the time that this value is requested. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run data can be stored in this single-valued property. 
     * Note that the value 101 is undefined and will be not be allowed in the next major revision of the specification.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PercentComplete(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PERCENTCOMPLETE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PercentComplete(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PERCENTCOMPLETE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PercentComplete by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PercentComplete(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PERCENTCOMPLETE.NAME);
        if (property != null) {
            property = setPropertyValue_PercentComplete(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PERCENTCOMPLETE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PercentComplete
     * <br>
     * The percentage of the job that has completed at the time that this value is requested. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run data can be stored in this single-valued property. 
     * Note that the value 101 is undefined and will be not be allowed in the next major revision of the specification.
     */

    private static CIMProperty setPropertyValue_PercentComplete(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Priority
     *     * <br>
     * Indicates the urgency or importance of execution of the Job. The lower the number, the higher the priority. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the setting information that would influence the results of a job.
     *     */

    public javax.cim.UnsignedInteger32 get_Priority() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIORITY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRIORITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property Priority
     * <br>
     * Indicates the urgency or importance of execution of the Job. The lower the number, the higher the priority. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the setting information that would influence the results of a job.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Priority(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRIORITY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Priority(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRIORITY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Priority by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Priority(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRIORITY.NAME);
        if (property != null) {
            property = setPropertyValue_Priority(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRIORITY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Priority
     * <br>
     * Indicates the urgency or importance of execution of the Job. The lower the number, the higher the priority. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the setting information that would influence the results of a job.
     */

    private static CIMProperty setPropertyValue_Priority(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RecoveryAction
     *     * <br>
     * Describes the recovery action to be taken for an unsuccessfully run Job. The possible values are: 
     * 0 = "Unknown", meaning it is unknown as to what recovery action to take 
     * 1 = "Other", indicating that the recovery action will be specified in the OtherRecoveryAction property 
     * 2 = "Do Not Continue", meaning stop the execution of the job and appropriately update its status 
     * 3 = "Continue With Next Job", meaning continue with the next job in the queue 
     * 4 = "Re-run Job", indicating that the job should be re-run 
     * 5 = "Run Recovery Job", meaning run the Job associated using the RecoveryJob relationship. Note that the recovery Job must already be in the queue from which it will run.
     *     */

    public javax.cim.UnsignedInteger16 get_RecoveryAction() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVERYACTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECOVERYACTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RecoveryAction
     * <br>
     * Describes the recovery action to be taken for an unsuccessfully run Job. The possible values are: 
     * 0 = "Unknown", meaning it is unknown as to what recovery action to take 
     * 1 = "Other", indicating that the recovery action will be specified in the OtherRecoveryAction property 
     * 2 = "Do Not Continue", meaning stop the execution of the job and appropriately update its status 
     * 3 = "Continue With Next Job", meaning continue with the next job in the queue 
     * 4 = "Re-run Job", indicating that the job should be re-run 
     * 5 = "Run Recovery Job", meaning run the Job associated using the RecoveryJob relationship. Note that the recovery Job must already be in the queue from which it will run.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RecoveryAction(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVERYACTION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_RecoveryAction(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVERYACTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RecoveryAction by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RecoveryAction(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECOVERYACTION.NAME);
        if (property != null) {
            property = setPropertyValue_RecoveryAction(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVERYACTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RecoveryAction
     * <br>
     * Describes the recovery action to be taken for an unsuccessfully run Job. The possible values are: 
     * 0 = "Unknown", meaning it is unknown as to what recovery action to take 
     * 1 = "Other", indicating that the recovery action will be specified in the OtherRecoveryAction property 
     * 2 = "Do Not Continue", meaning stop the execution of the job and appropriately update its status 
     * 3 = "Continue With Next Job", meaning continue with the next job in the queue 
     * 4 = "Re-run Job", indicating that the job should be re-run 
     * 5 = "Run Recovery Job", meaning run the Job associated using the RecoveryJob relationship. Note that the recovery Job must already be in the queue from which it will run.
     */

    private static CIMProperty setPropertyValue_RecoveryAction(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RunDay
     *     * <br>
     * The day in the month on which the Job should be processed. There are two different interpretations for this property, depending on the value of DayOfWeek. In one case, RunDay defines the day-in-month on which the Job is processed. This interpretation is used when the DayOfWeek is 0. A positive or negative integer indicates whether the RunDay should be calculated from the beginning or end of the month. For example, 5 indicates the fifth day in the RunMonth and -1 indicates the last day in the RunMonth. 
     * 
     * When RunDayOfWeek is not 0, RunDay is the day-in-month on which the Job is processed, defined in conjunction with RunDayOfWeek. For example, if RunDay is 15 and RunDayOfWeek is Saturday, then the Job is processed on the first Saturday on or after the 15th day in the RunMonth (for example, the third Saturday in the month). If RunDay is 20 and RunDayOfWeek is -Saturday, then this indicates the first Saturday on or before the 20th day in the RunMonth. If RunDay is -1 and RunDayOfWeek is -Sunday, then this indicates the last Sunday in the RunMonth.
     *     */

    public Byte get_RunDay() {
        CIMProperty currentProperty = getProperty(PROPERTY_RUNDAY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RUNDAY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Byte) currentProperty.getValue();

    }

    /**
     * Set the property RunDay
     * <br>
     * The day in the month on which the Job should be processed. There are two different interpretations for this property, depending on the value of DayOfWeek. In one case, RunDay defines the day-in-month on which the Job is processed. This interpretation is used when the DayOfWeek is 0. A positive or negative integer indicates whether the RunDay should be calculated from the beginning or end of the month. For example, 5 indicates the fifth day in the RunMonth and -1 indicates the last day in the RunMonth. 
     * 
     * When RunDayOfWeek is not 0, RunDay is the day-in-month on which the Job is processed, defined in conjunction with RunDayOfWeek. For example, if RunDay is 15 and RunDayOfWeek is Saturday, then the Job is processed on the first Saturday on or after the 15th day in the RunMonth (for example, the third Saturday in the month). If RunDay is 20 and RunDayOfWeek is -Saturday, then this indicates the first Saturday on or before the 20th day in the RunMonth. If RunDay is -1 and RunDayOfWeek is -Sunday, then this indicates the last Sunday in the RunMonth.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RunDay(Byte newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RUNDAY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_RunDay(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RUNDAY.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RunDay by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RunDay(WBEMClient client, String namespace, Byte newValue)
            throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RUNDAY.NAME);
        if (property != null) {
            property = setPropertyValue_RunDay(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RUNDAY.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RunDay
     * <br>
     * The day in the month on which the Job should be processed. There are two different interpretations for this property, depending on the value of DayOfWeek. In one case, RunDay defines the day-in-month on which the Job is processed. This interpretation is used when the DayOfWeek is 0. A positive or negative integer indicates whether the RunDay should be calculated from the beginning or end of the month. For example, 5 indicates the fifth day in the RunMonth and -1 indicates the last day in the RunMonth. 
     * 
     * When RunDayOfWeek is not 0, RunDay is the day-in-month on which the Job is processed, defined in conjunction with RunDayOfWeek. For example, if RunDay is 15 and RunDayOfWeek is Saturday, then the Job is processed on the first Saturday on or after the 15th day in the RunMonth (for example, the third Saturday in the month). If RunDay is 20 and RunDayOfWeek is -Saturday, then this indicates the first Saturday on or before the 20th day in the RunMonth. If RunDay is -1 and RunDayOfWeek is -Sunday, then this indicates the last Sunday in the RunMonth.
     */

    private static CIMProperty setPropertyValue_RunDay(CIMProperty currentProperty, Byte newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RunDayOfWeek
     *     * <br>
     * A positive or negative integer used in conjunction with RunDay to indicate the day of the week on which the Job is processed. RunDayOfWeek is set to 0 to indicate an exact day of the month, such as March 1. A positive integer (representing Sunday, Monday, ..., Saturday) means that the day of week is found on or after the specified RunDay. A negative integer (representing -Sunday, -Monday, ..., -Saturday) means that the day of week is found on or BEFORE the RunDay.
     *     */

    public Byte get_RunDayOfWeek() {
        CIMProperty currentProperty = getProperty(PROPERTY_RUNDAYOFWEEK.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RUNDAYOFWEEK.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Byte) currentProperty.getValue();

    }

    /**
     * Set the property RunDayOfWeek
     * <br>
     * A positive or negative integer used in conjunction with RunDay to indicate the day of the week on which the Job is processed. RunDayOfWeek is set to 0 to indicate an exact day of the month, such as March 1. A positive integer (representing Sunday, Monday, ..., Saturday) means that the day of week is found on or after the specified RunDay. A negative integer (representing -Sunday, -Monday, ..., -Saturday) means that the day of week is found on or BEFORE the RunDay.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RunDayOfWeek(Byte newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RUNDAYOFWEEK.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_RunDayOfWeek(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RUNDAYOFWEEK.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RunDayOfWeek by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RunDayOfWeek(WBEMClient client, String namespace, Byte newValue)
            throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RUNDAYOFWEEK.NAME);
        if (property != null) {
            property = setPropertyValue_RunDayOfWeek(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RUNDAYOFWEEK.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RunDayOfWeek
     * <br>
     * A positive or negative integer used in conjunction with RunDay to indicate the day of the week on which the Job is processed. RunDayOfWeek is set to 0 to indicate an exact day of the month, such as March 1. A positive integer (representing Sunday, Monday, ..., Saturday) means that the day of week is found on or after the specified RunDay. A negative integer (representing -Sunday, -Monday, ..., -Saturday) means that the day of week is found on or BEFORE the RunDay.
     */

    private static CIMProperty setPropertyValue_RunDayOfWeek(CIMProperty currentProperty,
            Byte newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RunMonth
     *     * <br>
     * The month during which the Job should be processed. Specify 0 for January, 1 for February, and so on.
     *     */

    public javax.cim.UnsignedInteger8 get_RunMonth() {
        CIMProperty currentProperty = getProperty(PROPERTY_RUNMONTH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RUNMONTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger8) currentProperty.getValue();

    }

    /**
     * Set the property RunMonth
     * <br>
     * The month during which the Job should be processed. Specify 0 for January, 1 for February, and so on.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RunMonth(javax.cim.UnsignedInteger8 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RUNMONTH.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_RunMonth(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RUNMONTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RunMonth by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RunMonth(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger8 newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RUNMONTH.NAME);
        if (property != null) {
            property = setPropertyValue_RunMonth(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RUNMONTH.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RunMonth
     * <br>
     * The month during which the Job should be processed. Specify 0 for January, 1 for February, and so on.
     */

    private static CIMProperty setPropertyValue_RunMonth(CIMProperty currentProperty,
            javax.cim.UnsignedInteger8 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RunStartInterval
     *     * <br>
     * The time interval after midnight when the Job should be processed. For example, 
     * 00000000020000.000000:000 
     * indicates that the Job should be run on or after two o'clock, local time or UTC time (distinguished using the LocalOrUtcTime property.
     *     */

    public javax.cim.CIMDateTime get_RunStartInterval() {
        CIMProperty currentProperty = getProperty(PROPERTY_RUNSTARTINTERVAL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RUNSTARTINTERVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property RunStartInterval
     * <br>
     * The time interval after midnight when the Job should be processed. For example, 
     * 00000000020000.000000:000 
     * indicates that the Job should be run on or after two o'clock, local time or UTC time (distinguished using the LocalOrUtcTime property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RunStartInterval(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RUNSTARTINTERVAL.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_RunStartInterval(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RUNSTARTINTERVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RunStartInterval by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RunStartInterval(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RUNSTARTINTERVAL.NAME);
        if (property != null) {
            property = setPropertyValue_RunStartInterval(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RUNSTARTINTERVAL.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RunStartInterval
     * <br>
     * The time interval after midnight when the Job should be processed. For example, 
     * 00000000020000.000000:000 
     * indicates that the Job should be run on or after two o'clock, local time or UTC time (distinguished using the LocalOrUtcTime property.
     */

    private static CIMProperty setPropertyValue_RunStartInterval(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ScheduledStartTime
     *     * <br>
     * The time that the current Job is scheduled to start. This time can be represented by the actual date and time, or an interval relative to the time that this property is requested. A value of all zeroes indicates that the Job is already executing. The property is deprecated in lieu of the more expressive scheduling properties, RunMonth, RunDay, RunDayOfWeek, and RunStartInterval.
     *     */

    public javax.cim.CIMDateTime get_ScheduledStartTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_SCHEDULEDSTARTTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SCHEDULEDSTARTTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property ScheduledStartTime
     * <br>
     * The time that the current Job is scheduled to start. This time can be represented by the actual date and time, or an interval relative to the time that this property is requested. A value of all zeroes indicates that the Job is already executing. The property is deprecated in lieu of the more expressive scheduling properties, RunMonth, RunDay, RunDayOfWeek, and RunStartInterval.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ScheduledStartTime(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SCHEDULEDSTARTTIME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ScheduledStartTime(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SCHEDULEDSTARTTIME.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ScheduledStartTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ScheduledStartTime(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SCHEDULEDSTARTTIME.NAME);
        if (property != null) {
            property = setPropertyValue_ScheduledStartTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SCHEDULEDSTARTTIME.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ScheduledStartTime
     * <br>
     * The time that the current Job is scheduled to start. This time can be represented by the actual date and time, or an interval relative to the time that this property is requested. A value of all zeroes indicates that the Job is already executing. The property is deprecated in lieu of the more expressive scheduling properties, RunMonth, RunDay, RunDayOfWeek, and RunStartInterval.
     */

    private static CIMProperty setPropertyValue_ScheduledStartTime(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property StartTime
     *     * <br>
     * The time that the Job was actually started. This time can be represented by an actual date and time, or by an interval relative to the time that this property is requested. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run time can be stored in this single-valued property.
     *     */

    public javax.cim.CIMDateTime get_StartTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_STARTTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property StartTime
     * <br>
     * The time that the Job was actually started. This time can be represented by an actual date and time, or by an interval relative to the time that this property is requested. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run time can be stored in this single-valued property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_StartTime(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_STARTTIME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_StartTime(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_STARTTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property StartTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_StartTime(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_STARTTIME.NAME);
        if (property != null) {
            property = setPropertyValue_StartTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_STARTTIME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property StartTime
     * <br>
     * The time that the Job was actually started. This time can be represented by an actual date and time, or by an interval relative to the time that this property is requested. Note that this property is also present in the JobProcessingStatistics class. This class is necessary to capture the processing information for recurring Jobs, because only the 'last' run time can be stored in this single-valued property.
     */

    private static CIMProperty setPropertyValue_StartTime(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TimeSubmitted
     *     * <br>
     * The time that the Job was submitted to execute. A value of all zeroes indicates that the owning element is not capable of reporting a date and time. Therefore, the ScheduledStartTime and StartTime are reported as intervals relative to the time their values are requested.
     *     */

    public javax.cim.CIMDateTime get_TimeSubmitted() {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMESUBMITTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TIMESUBMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property TimeSubmitted
     * <br>
     * The time that the Job was submitted to execute. A value of all zeroes indicates that the owning element is not capable of reporting a date and time. Therefore, the ScheduledStartTime and StartTime are reported as intervals relative to the time their values are requested.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TimeSubmitted(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMESUBMITTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_TimeSubmitted(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TIMESUBMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TimeSubmitted by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TimeSubmitted(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TIMESUBMITTED.NAME);
        if (property != null) {
            property = setPropertyValue_TimeSubmitted(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TIMESUBMITTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TimeSubmitted
     * <br>
     * The time that the Job was submitted to execute. A value of all zeroes indicates that the owning element is not capable of reporting a date and time. Therefore, the ScheduledStartTime and StartTime are reported as intervals relative to the time their values are requested.
     */

    private static CIMProperty setPropertyValue_TimeSubmitted(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UntilTime
     *     * <br>
     * The time after which the Job is invalid or should be stopped. This time can be represented by an actual date and time, or by an interval relative to the time that this property is requested. A value of all nines indicates that the Job can run indefinitely.
     *     */

    public javax.cim.CIMDateTime get_UntilTime() {
        CIMProperty currentProperty = getProperty(PROPERTY_UNTILTIME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_UNTILTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property UntilTime
     * <br>
     * The time after which the Job is invalid or should be stopped. This time can be represented by an actual date and time, or by an interval relative to the time that this property is requested. A value of all nines indicates that the Job can run indefinitely.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UntilTime(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_UNTILTIME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_UntilTime(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_UNTILTIME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UntilTime by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UntilTime(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_Job fco = new CIM_Job(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_UNTILTIME.NAME);
        if (property != null) {
            property = setPropertyValue_UntilTime(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_UNTILTIME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UntilTime
     * <br>
     * The time after which the Job is invalid or should be stopped. This time can be represented by an actual date and time, or by an interval relative to the time that this property is requested. A value of all nines indicates that the Job can run indefinitely.
     */

    private static CIMProperty setPropertyValue_UntilTime(CIMProperty currentProperty,
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
     * Invokes the Method KillJob
     * <br>
     * @param client the cimclient
     * KillJob is being deprecated because there is no distinction made between an orderly shutdown and an immediate kill. CIM_ConcreteJob.RequestStateChange() provides 'Terminate' and 'Kill' options to allow this distinction. 
     * A method to kill this job and any underlying processes, and to remove any 'dangling' associations.
     *   @param DeleteOnKill Indicates whether or not the Job should be automatically deleted upon termination. This parameter takes precedence over the property, DeleteOnCompletion.
     *
     */

    public KillJobResult invoke_KillJob(WBEMClient cimClient, Boolean DeleteOnKill)
            throws WbemsmtException {

        CIMArgument[] inParameter = new CIMArgument[1];
        CIMArgument[] outParameter = new CIMArgument[0];

        inParameter[0] = new CIMArgument("DeleteOnKill", CIMDataType.BOOLEAN_T, DeleteOnKill);

        javax.cim.UnsignedInteger32 resultObject = null;

        try {
            Object oResult = cimClient.invokeMethod(this.getCimObjectPath(), METHOD_KILLJOB.NAME,
                    inParameter, outParameter);
            if (oResult != null) {

                resultObject = (javax.cim.UnsignedInteger32) oResult;
            }
        }
        catch (WBEMException e) {
            throw new InvokeMethodException(e, new InvokeMethodUserObject(this.getCimObjectPath(),
                    METHOD_KILLJOB.NAME, inParameter, outParameter));
        }

        KillJobResult result = new KillJobResult();
        result.setResultObject(resultObject);

        java.util.HashMap mapOutParameter = new java.util.HashMap();
        for (int i = 0; i < outParameter.length; i++) {
            CIMArgument argument = outParameter[i];
            if (argument != null) {
                mapOutParameter.put(argument.getName(), argument);
            }
        }

        return result;
    }

    /**
     * Result object for the method KillJob
     */
    public static class KillJobResult {
        /**
         * The return value of the method
         */

        javax.cim.UnsignedInteger32 resultObject = null;

        /**
         * Default constructor
         */
        KillJobResult() {
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
        return CIM_Job.CIM_CLASS_NAME;
    }

}