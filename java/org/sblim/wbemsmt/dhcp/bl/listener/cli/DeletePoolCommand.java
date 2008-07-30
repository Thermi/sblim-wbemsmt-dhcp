/** 
 * DeletePoolCommand.java
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
 * @template: org/sblim/wbemsmt/dcg/templates/cmd/deleteCommand.vm
 *
 * Contributors: 
 *   TODO add author by using vm argument -Ddcg.author=<email> during startup
 * 
 * Description: Class for  deleteting objects
 * 
 * generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.listener.cli;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Options;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimAdapterFactory;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.cli.CimClientOptionValues;
import org.sblim.wbemsmt.tools.cli.CimCommand;
import org.sblim.wbemsmt.tools.cli.CimCommandValues;
import org.sblim.wbemsmt.tools.cli.CliDataLoader;
import org.sblim.wbemsmt.tools.cli.LoginOptionValues;
import org.sblim.wbemsmt.tools.cli.OptionDefinition;

public class DeletePoolCommand extends CimCommand {

    //All Options that are local and defined for this command

    //All Options that are global and task-related
    /**
     * used for selection:  --serviceName, default: dhcpd
     */
    public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition(null,
            "serviceName", "dhcpd", "serviceName.argValue", false, false,
            "serviceName.argDescription");
    
    public static final OptionDefinition KEY_GLOBAL_listEntities = new OptionDefinition(null,
            "listEntities", "", "listEntities.argValue", false, false,
            "listEntities.argDescription");
    /**
     * used for selection:  -httpProtocolType --httpProtocolType
     */
    public static final OptionDefinition KEY_GLOBAL_httpProtocolType = new OptionDefinition(
            "httpProtocolType", "httpProtocolType", null, "httpProtocolType.argValue", false,
            false, "httpProtocolType.argDescription");

    // Global Communication Options
    /**
     * required, used for selection:  --hostname
     */
    public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition(null,
            "hostname", null, "hostname.argValue", true, false, "hostname.argDescription");
    /**
     * used for selection:  --port, default: 5988
     */
    public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition(null, "port",
            "5988", "port.argValue", false, false, "port.argDescription");
    /**
     * used for selection:  --namespace, default: /root/cimv2
     */
    public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition(null,
            "namespace", "/root/cimv2", "namespace.argValue", false, false,
            "namespace.argDescription");
    /**
     * used for selection:  --user, default: none
     */
    public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition(null, "user",
            "none", "user.argValue", false, false, "user.argDescription");
    /**
     * used for selection:  --password, default: none
     */
    public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition(null,
            "password", "none", "password.argValue", false, false, "password.argDescription");
    /**
     * used for selection:  --publickeyfile, default: none
     */
    public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition(null,
            "publickeyfile", "none", "publickeyfile.argValue", false, false,
            "publickeyfile.argDescription");
    /**
     * used for selection:  --privatekeyfile, default: none
     */
    public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition(null,
            "privatekeyfile", "none", "privatekeyfile.argValue", false, false,
            "privatekeyfile.argDescription");

    // Global Common Options
    /**
     *  -L --locale, default: none
     */
    public static final OptionDefinition KEY_GLOBAL_locale = new OptionDefinition("L", "locale",
            "none", "locale.argValue", false, false, "locale.argDescription");
    /**
     *  -h --help, default: none
     */
    public static final OptionDefinition KEY_GLOBAL_help = new OptionDefinition("h", "help",
            "none", "help.argValue", false, false, "help.argDescription");
    /**
     *  -?, default: none
     */
    public static final OptionDefinition KEY_GLOBAL_QUESTION_MARK_ = new OptionDefinition("?",
            null, "none", "?.argValue", false, false, "?.argDescription");

    private static final OptionDefinition[] LOCAL_OPTIONS = new OptionDefinition[] {};

    private static final OptionDefinition[] GLOBAL_TASK_OPTIONS = new OptionDefinition[] {
            KEY_GLOBAL_serviceName, KEY_GLOBAL_httpProtocolType, };

    private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS = new OptionDefinition[] {
            KEY_GLOBAL_hostname, KEY_GLOBAL_port, KEY_GLOBAL_namespace, KEY_GLOBAL_user,
            KEY_GLOBAL_password, KEY_GLOBAL_publickeyfile, KEY_GLOBAL_privatekeyfile, };

    private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMON_OPTIONS = new OptionDefinition[] {
            KEY_GLOBAL_locale, KEY_GLOBAL_help, KEY_GLOBAL_QUESTION_MARK_, };

    CommandLine cmd = null;
    AbstractBaseCimAdapter adapter = null;

    public DeletePoolCommand(java.util.Locale locale) {
        super("DeletePoolCommand", new String[] { "messages", "messagesDhcp" }, locale);
    }

    public void execute(CimCommandValues values) throws WbemsmtException {

        //do the real processing
        try {

            commandValues = values;
            cmd = values.getCommandLine();

            Options options = values.getOptions();

            //first handle the help options and then the parseException
            //if the user wants help parsing the args will fail (due to missing required args)
            //and so the helpOptions should be handled first

            if (hasOption(values.getArgs(), "-" + KEY_GLOBAL_QUESTION_MARK_.getShortKey())
                    || hasOption(values.getArgs(), "-" + KEY_GLOBAL_help.getShortKey())) {
                showUsage(values.getOut(), options);
                return;
            }
            else if (hasOption(values.getArgs(), "--" + KEY_GLOBAL_help.getLongKey())) {
                //TODO add extendedHelp by loading a manpage or sth else
                showUsage(values.getOut(), options);
                return;
            }

            else if (values.getParseException() != null) {
                handleParseException(values, KEY_GLOBAL_password);
                return;
            }
            adapter = (org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter) CimAdapterFactory
                    .getInstance().getAdapter(
                            org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter.class, this);
            adapter.setBundle(bundle);
            adapter.setCimClient(values.getCimClient());

            adapter.loadInitial(adapter.getCimClient());

            values.getOut().println(
                    "\n"
                            + bundle.getString("deleting", new Object[] { bundle
                                    .getString("DHCPPoolsContainer.caption") }));

            CliDataLoader loader = new DeletePoolCommandLoader();
            loader.load(bundle, adapter, commandValues);

            org.sblim.wbemsmt.dhcp.bl.container.edit.cli.DHCPPoolsContainerImpl dc = new org.sblim.wbemsmt.dhcp.bl.container.edit.cli.DHCPPoolsContainerImpl(
                    adapter);

            adapter.updateControls(dc);

            dc.trace(values.getOut());

            if (getConfirmation()) {
                adapter.delete();
                values.getOut().println(
                        "\n"
                                + bundle.getString("deleted", new Object[] { bundle
                                        .getString("DHCPPoolsContainer.caption") }));
            }
            else {
                values.getOut().println(
                        "\n"
                                + bundle.getString("not.deleted", new Object[] { bundle
                                        .getString("DHCPPoolsContainer.caption") }));
            }

        }
        catch (Exception e) {
            super.handleException(e, values.getArgs(), values.getOptions(), KEY_GLOBAL_password);
        }
        finally {
            if (adapter != null)
                adapter.cleanup();
        }
    }

    protected LoginOptionValues getLoginOptions() {
        return new LoginOptionValues(KEY_GLOBAL_hostname, KEY_GLOBAL_user, KEY_GLOBAL_password);
    }

    protected CimClientOptionValues getCimClientOptions() {

        return new CimClientOptionValues(KEY_GLOBAL_httpProtocolType, KEY_GLOBAL_hostname,
                KEY_GLOBAL_port, KEY_GLOBAL_namespace, KEY_GLOBAL_user, KEY_GLOBAL_password,
                KEY_GLOBAL_publickeyfile, KEY_GLOBAL_privatekeyfile);
    }

    public Options getOptions() throws WbemsmtException {
        Options options = super.createOptions(LOCAL_OPTIONS, bundle);
        super.createOptions(options, GLOBAL_TASK_OPTIONS, bundle);
        super.createOptions(options, GLOBAL_WBEMSMT_COMMON_OPTIONS, bundle);
        super.createOptions(options, GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS, bundle);
        return options;
    }

    public Options getLocalOptions() throws WbemsmtException {
        Options options = super.createOptions(LOCAL_OPTIONS, bundle);
        return options;
    }

    public Options getGlobalWbemsmtCommonOptions() throws WbemsmtException {
        Options options = super.createOptions(GLOBAL_WBEMSMT_COMMON_OPTIONS, bundle);
        return options;
    }

    public Options getGlobalWbemsmtCommunicationOptions() throws WbemsmtException {
        Options options = super.createOptions(GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS, bundle);
        return options;
    }

    public Options getGlobalTaskOptions() throws WbemsmtException {
        Options options = super.createOptions(GLOBAL_TASK_OPTIONS, bundle);
        return options;
    }
}