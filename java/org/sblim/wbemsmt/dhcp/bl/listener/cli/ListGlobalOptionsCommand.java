/** 
  * ListGlobalOptionsCommand.java
  *

 
  * © Copyright IBM Corp. 2007
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
  *
  * @author: org.sblim.wbemsmt.dcg.generator.cmd.CMDPresentationLayerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/cmd/listCommand.vm
  *
  * Contributors: Prashanth Karnam <prkarnam@in.ibm.com>
  * 
  * Description: Class for listing objects
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.listener.cli;

import org.apache.commons.cli.*;
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.cli.*;

public class ListGlobalOptionsCommand extends CimCommand {

	
 
 
	//All Options that are local and defined for this command
			/**
   		 * used for selection:  --list
		 */
		public static final OptionDefinition KEY_list = new OptionDefinition(null,"list",null,"ListGlobalOptionsCommand.list.argValue",false,false,"ListGlobalOptionsCommand.list.argDescription");
		
	//All Options that are global and task-related
	
	// Global Communication Options
			/**
   		 * required, used for selection:  --hostname
		 */
		public static final OptionDefinition KEY_GLOBAL_hostname = new OptionDefinition(null,"hostname",null,"hostname.argValue",true,false,"hostname.argDescription");
			/**
   		 * used for selection:  --port, default: 5988
		 */
		public static final OptionDefinition KEY_GLOBAL_port = new OptionDefinition(null,"port","5988","port.argValue",false,false,"port.argDescription");
			/**
   		 * used for selection:  --namespace, default: /root/cimv2
		 */
		public static final OptionDefinition KEY_GLOBAL_namespace = new OptionDefinition(null,"namespace","/root/cimv2","namespace.argValue",false,false,"namespace.argDescription");
			/**
   		 * used for selection:  --user, default: none
		 */
		public static final OptionDefinition KEY_GLOBAL_user = new OptionDefinition(null,"user","none","user.argValue",false,false,"user.argDescription");
			/**
   		 * used for selection:  --password, default: none
		 */
		public static final OptionDefinition KEY_GLOBAL_password = new OptionDefinition(null,"password","none","password.argValue",false,false,"password.argDescription");
			/**
   		 * used for selection:  --publickeyfile, default: none
		 */
		public static final OptionDefinition KEY_GLOBAL_publickeyfile = new OptionDefinition(null,"publickeyfile","none","publickeyfile.argValue",false,false,"publickeyfile.argDescription");
			/**
   		 * used for selection:  --publickeyfile, default: none
		 */
	
	// Global Common Options
			/**
   		 *  -L --locale, default: none
		 */
		public static final OptionDefinition KEY_GLOBAL_locale = new OptionDefinition("L","locale","none","locale.argValue",false,false,"locale.argDescription");
			/**
   		 *  -h --help, default: none
		 */
		public static final OptionDefinition KEY_GLOBAL_help = new OptionDefinition("h","help","none","help.argValue",false,false,"help.argDescription");
			/**
   		 *  -?, default: none
		 */
		public static final OptionDefinition KEY_GLOBAL_QUESTION_MARK_ = new OptionDefinition("?",null,"none","?.argValue",false,false,"?.argDescription");
	
	private static final OptionDefinition[] LOCAL_OPTIONS = new OptionDefinition []
	{
    	    	KEY_list,
    		};

	private static final OptionDefinition[] GLOBAL_TASK_OPTIONS = new OptionDefinition []
	{
    		};

	private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS = new OptionDefinition []
	{
    	    	KEY_GLOBAL_hostname,
    	    	KEY_GLOBAL_port,
    	    	KEY_GLOBAL_namespace,
    	    	KEY_GLOBAL_user,
    	    	KEY_GLOBAL_password,
    	    	KEY_GLOBAL_publickeyfile,
    	    	KEY_GLOBAL_publickeyfile,
    		};

	private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMON_OPTIONS = new OptionDefinition []
	{
    	    	KEY_GLOBAL_locale,
    	    	KEY_GLOBAL_help,
    	    	KEY_GLOBAL_QUESTION_MARK_,
    		};

		
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public ListGlobalOptionsCommand(java.util.Locale locale)
	{
		super("ListGlobalOptionsCommand", new String[]{"messages","messagesDhcp"},locale);
	}

	public void execute(CimCommandValues values) throws WbemSmtException {
		
	
		//do the real processing
		try {
			
 
			commandValues = values;
			cmd = values.getCommandLine();

			Options options = values.getOptions();
			
			//first handle the help options and then the parseException
			//if the user wants help parsing the args will fail (due to missing required args)
			//and so the helpOptions should be handled first
			
    		if (   hasOption(values.getArgs(), "-" + KEY_GLOBAL_QUESTION_MARK_.getShortKey())
			    || hasOption(values.getArgs(), "-" + KEY_GLOBAL_help.getShortKey()) )
    		{
    			showUsage(values.getOut(), options);
    			return;
    		}			
    		else if ( hasOption(values.getArgs(), "--" + KEY_GLOBAL_help.getLongKey()) )
    		{
				//TODO add extendedHelp by loading a manpage or sth else
    			showUsage(values.getOut(), options);
    			return;
    		}			

			else if (values.getParseException() != null)
			{
				handleParseException(values,KEY_GLOBAL_password);
				return;
			}
			adapter = 
					CimAdapterFactory.getInstance()
					.getAdapter(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter.class,this);
			adapter.setBundle(bundle);
			adapter.setCimClient(values.getCimClient());
				
			adapter.loadInitial(adapter.getCimClient());
			
			values.getOut().println("\n" + bundle.getString("listing", new Object[]{bundle.getString("DHCPGlobalOptionsListContainer.caption")}));
			
			CliDataLoader loader = new ListGlobalOptionsCommandLoader();
			loader.load(bundle,adapter, values);
			
			org.sblim.wbemsmt.dhcp.bl.container.edit.cli.DHCPGlobalOptionsListContainerImpl dc = new org.sblim.wbemsmt.dhcp.bl.container.edit.cli.DHCPGlobalOptionsListContainerImpl(adapter);
			
			
        	    					int 
						count = adapter.count(org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsListItemContainer.class);
			dc.getItems().clear();
			for (int i=0; i < count; i++) {
				org.sblim.wbemsmt.dhcp.bl.container.edit.cli.DHCPGlobalOptionsListItemContainerImpl child = new org.sblim.wbemsmt.dhcp.bl.container.edit.cli.DHCPGlobalOptionsListItemContainerImpl(adapter);
				dc.getItems().add(child);
			}
        				
			setKeyValues(cmd,adapter,dc);
			adapter.updateControls(dc);
			
			String listOption = getOptionValue(cmd,KEY_list);

			if (BaseDataContainer.listOptionIsValid(listOption))
			{
									dc.trace(values.getOut(),listOption);
							}
			else
			{
				values.getErr().println(bundle.getString("listingOptionNotValid"));
    			showUsage(values.getOut(), values.getOptions());
    			return;
			}

		}
		catch (Exception e)
		{
			super.handleException(e,values.getArgs(),values.getOptions(),KEY_GLOBAL_password);
		}
	}
	
	/**
	 * Set all Values that are needed for selecting the right objects. This fields are used even if they are read-only
	 **/
	private void setKeyValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsListContainer dc) throws WbemSmtException {
    		}	
	
	
 
			
	protected LoginOptionValues getLoginOptions() {
		return new LoginOptionValues(KEY_GLOBAL_hostname,KEY_GLOBAL_user,KEY_GLOBAL_password);
	}

	protected CimClientOptionValues getCimClientOptions() {
		
		return new CimClientOptionValues(KEY_GLOBAL_hostname,
				KEY_GLOBAL_port,
				KEY_GLOBAL_namespace,
				KEY_GLOBAL_user,
				KEY_GLOBAL_password,
				KEY_GLOBAL_publickeyfile,
				KEY_GLOBAL_publickeyfile);
	}
	
	public Options getOptions() throws WbemSmtException {
		Options options = super.createOptions(LOCAL_OPTIONS, bundle);
		super.createOptions(options, GLOBAL_TASK_OPTIONS, bundle);
		super.createOptions(options, GLOBAL_WBEMSMT_COMMON_OPTIONS, bundle);
		super.createOptions(options, GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS, bundle);
		return options;
	}
	
	public Options getLocalOptions() throws WbemSmtException {
		Options options = super.createOptions(LOCAL_OPTIONS, bundle);
		return options;
	}

	public Options getGlobalWbemsmtCommonOptions() throws WbemSmtException {
		Options options = super.createOptions(GLOBAL_WBEMSMT_COMMON_OPTIONS, bundle);
		return options;
	}

	public Options getGlobalWbemsmtCommunicationOptions() throws WbemSmtException {
		Options options = super.createOptions(GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS, bundle);
		return options;
	}

	public Options getGlobalTaskOptions() throws WbemSmtException {
		Options options = super.createOptions(GLOBAL_TASK_OPTIONS, bundle);
		return options;
	}
		
}