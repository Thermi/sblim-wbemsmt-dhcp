/** 
 * Commands.java
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
 * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/commands.vm
 *
 * Contributors: 
 *   TODO add author by using vm argument -Ddcg.author=<email> during startup 
 *
 * Description: Class containing the mapping between Commands and the Commandlet
 * 
 * generated Class
 */

package org.sblim.wbemsmt.dhcp.cli;

public class Commands extends org.sblim.wbemsmt.tools.cli.Commands {

    public Commands() {

        addCommand("DeleteHostCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.DeleteHostCommand.class);
        addCommand("DeletePoolCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.DeletePoolCommand.class);
        addCommand("DeleteGroupCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.DeleteGroupCommand.class);
        addCommand("DeleteSubnetCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.DeleteSubnetCommand.class);
        addCommand("DeleteSharednetCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.DeleteSharednetCommand.class);
        addCommand("CreateHostCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.CreateHostCommand.class);
        addCommand("CreatePoolCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.CreatePoolCommand.class);
        addCommand("CreateSubnetCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.CreateSubnetCommand.class);
        addCommand("CreateSharednetCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.CreateSharednetCommand.class);
        addCommand("CreateGroupCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.CreateGroupCommand.class);
        addCommand("EditServiceConfCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditServiceConfCommand.class);
        addCommand("EditGlobalOptionsCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditGlobalOptionsCommand.class);
        addCommand("EditGlobalParamsCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditGlobalParamsCommand.class);
        addCommand("EditSubnetCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditSubnetCommand.class);
        addCommand("EditsubnetoptionsCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditsubnetoptionsCommand.class);
        addCommand("EditSubnetParamsCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditSubnetParamsCommand.class);
        addCommand("EditSharednetCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditSharednetCommand.class);
        addCommand("EditSharednetOptionsCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditSharednetOptionsCommand.class);
        addCommand("EditSharednetParamsCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditSharednetParamsCommand.class);
        addCommand("EditGroupCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditGroupCommand.class);
        addCommand("EditGroupOptionsCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditGroupOptionsCommand.class);
        addCommand("EditGroupParamsCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditGroupParamsCommand.class);
        addCommand("EditHostCommand", org.sblim.wbemsmt.dhcp.bl.listener.cli.EditHostCommand.class);
        addCommand("EditHostOptionsCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditHostOptionsCommand.class);
        addCommand("EditHostParamsCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditHostParamsCommand.class);
        addCommand("EditPoolCommand", org.sblim.wbemsmt.dhcp.bl.listener.cli.EditPoolCommand.class);
        addCommand("EditPoolOptionsCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditPoolOptionsCommand.class);
        addCommand("EditPoolParamsCommand",
                org.sblim.wbemsmt.dhcp.bl.listener.cli.EditPoolParamsCommand.class);
    }
}