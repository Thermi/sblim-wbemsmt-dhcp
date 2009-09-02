/**
 * GlobalArguments.java Â© Copyright IBM Corp.  2009,2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/globalArguments.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: Class for creating objects generated Class
 */

package org.sblim.wbemsmt.dhcp.cli;

import org.sblim.wbemsmt.tools.cli.*;

public class GlobalArguments {

    /**
     * 
     */
    public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition(null,
            "serviceName", "dhcpd", "serviceName.argValue", false, false,
            "serviceName.argDescription");
    /**
     * 
     */
    public static final OptionDefinition KEY_GLOBAL_listEntities = new OptionDefinition(null,
            "listEntities", null, "listEntities.argValue", false, false,
            "listEntities.argDescription");
    /**
     * 
     */
    public static final OptionDefinition KEY_GLOBAL_httpProtocolType = new OptionDefinition(
            "httpProtocolType", "httpProtocolType", null, "httpProtocolType.argValue", false,
            false, "httpProtocolType.argDescription");

}