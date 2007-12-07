/** 
  * EditGlobalParamsCommand.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/cmd/editCommand.vm
  *
  * Contributors: Prashanth Karnam <prkarnam@in.ibm.com>
  * 
  * Description: Class for editing objects
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.listener.cli;

import org.apache.commons.cli.*;
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.bl.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.cli.*;

public class EditGlobalParamsCommand extends CimCommand {

	
 
 
	//All Options that are local and defined for this command
			/**
   		 *  --range
		 */
		public static final OptionDefinition KEY_range = new OptionDefinition(null,"range",null,"DHCPGlobalParamsContainer.range.argValue",false,false,"DHCPGlobalParamsContainer.range.argDescription");
			/**
   		 *  --usehostdeclnames
		 */
		public static final OptionDefinition KEY_usehostdeclnames = new OptionDefinition(null,"usehostdeclnames",null,"DHCPGlobalParamsContainer.usehostdeclnames.argValue",false,false,"DHCPGlobalParamsContainer.usehostdeclnames.argDescription");
			/**
   		 *  --hardware
		 */
		public static final OptionDefinition KEY_hardware = new OptionDefinition(null,"hardware",null,"DHCPGlobalParamsContainer.hardware.argValue",false,false,"DHCPGlobalParamsContainer.hardware.argDescription");
			/**
   		 *  --servername
		 */
		public static final OptionDefinition KEY_servername = new OptionDefinition(null,"servername",null,"DHCPGlobalParamsContainer.servername.argValue",false,false,"DHCPGlobalParamsContainer.servername.argDescription");
			/**
   		 *  --nextserver
		 */
		public static final OptionDefinition KEY_nextserver = new OptionDefinition(null,"nextserver",null,"DHCPGlobalParamsContainer.nextserver.argValue",false,false,"DHCPGlobalParamsContainer.nextserver.argDescription");
			/**
   		 *  --fixedaddress
		 */
		public static final OptionDefinition KEY_fixedaddress = new OptionDefinition(null,"fixedaddress",null,"DHCPGlobalParamsContainer.fixedaddress.argValue",false,false,"DHCPGlobalParamsContainer.fixedaddress.argDescription");
			/**
   		 *  --ddnsupdatestyle
		 */
		public static final OptionDefinition KEY_ddnsupdatestyle = new OptionDefinition(null,"ddnsupdatestyle",null,"DHCPGlobalParamsContainer.ddnsupdatestyle.argValue",false,false,"DHCPGlobalParamsContainer.ddnsupdatestyle.argDescription");
			/**
   		 *  --serveridentifier
		 */
		public static final OptionDefinition KEY_serveridentifier = new OptionDefinition(null,"serveridentifier",null,"DHCPGlobalParamsContainer.serveridentifier.argValue",false,false,"DHCPGlobalParamsContainer.serveridentifier.argDescription");
			/**
   		 *  --allow
		 */
		public static final OptionDefinition KEY_allow = new OptionDefinition(null,"allow",null,"DHCPGlobalParamsContainer.allow.argValue",false,false,"DHCPGlobalParamsContainer.allow.argDescription");
			/**
   		 *  --allowmembersof
		 */
		public static final OptionDefinition KEY_allowmembersof = new OptionDefinition(null,"allowmembersof",null,"DHCPGlobalParamsContainer.allowmembersof.argValue",false,false,"DHCPGlobalParamsContainer.allowmembersof.argDescription");
			/**
   		 *  --deny
		 */
		public static final OptionDefinition KEY_deny = new OptionDefinition(null,"deny",null,"DHCPGlobalParamsContainer.deny.argValue",false,false,"DHCPGlobalParamsContainer.deny.argDescription");
			/**
   		 *  --denymembersof
		 */
		public static final OptionDefinition KEY_denymembersof = new OptionDefinition(null,"denymembersof",null,"DHCPGlobalParamsContainer.denymembersof.argValue",false,false,"DHCPGlobalParamsContainer.denymembersof.argDescription");
			/**
   		 *  --defaultleasetime
		 */
		public static final OptionDefinition KEY_defaultleasetime = new OptionDefinition(null,"defaultleasetime",null,"DHCPGlobalParamsContainer.defaultleasetime.argValue",false,false,"DHCPGlobalParamsContainer.defaultleasetime.argDescription");
			/**
   		 *  --maxleasetime
		 */
		public static final OptionDefinition KEY_maxleasetime = new OptionDefinition(null,"maxleasetime",null,"DHCPGlobalParamsContainer.maxleasetime.argValue",false,false,"DHCPGlobalParamsContainer.maxleasetime.argDescription");
			/**
   		 *  --getleasehostnames
		 */
		public static final OptionDefinition KEY_getleasehostnames = new OptionDefinition(null,"getleasehostnames",null,"DHCPGlobalParamsContainer.getleasehostnames.argValue",false,false,"DHCPGlobalParamsContainer.getleasehostnames.argDescription");
			/**
   		 *  --dynamicbootpleaselength
		 */
		public static final OptionDefinition KEY_dynamicbootpleaselength = new OptionDefinition(null,"dynamicbootpleaselength",null,"DHCPGlobalParamsContainer.dynamicbootpleaselength.argValue",false,false,"DHCPGlobalParamsContainer.dynamicbootpleaselength.argDescription");
			/**
   		 *  --bootunknownclients
		 */
		public static final OptionDefinition KEY_bootunknownclients = new OptionDefinition(null,"bootunknownclients",null,"DHCPGlobalParamsContainer.bootunknownclients.argValue",false,false,"DHCPGlobalParamsContainer.bootunknownclients.argDescription");
			/**
   		 *  --leaselimit
		 */
		public static final OptionDefinition KEY_leaselimit = new OptionDefinition(null,"leaselimit",null,"DHCPGlobalParamsContainer.leaselimit.argValue",false,false,"DHCPGlobalParamsContainer.leaselimit.argDescription");
		
	//All Options that are global and task-related
			/**
   		 * used for selection:  --serviceName, default: dhcpd
		 */
		public static final OptionDefinition KEY_GLOBAL_serviceName = new OptionDefinition(null,"serviceName","dhcpd","serviceName.argValue",false,false,"serviceName.argDescription");
			/**
   		 *  --listEntities
		 */
		public static final OptionDefinition KEY_GLOBAL_listEntities = new OptionDefinition(null,"listEntities",null,"listEntities.argValue",false,false,"listEntities.argDescription");
	
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
   		 * used for selection:  --privatekeyfile, default: none
		 */
		public static final OptionDefinition KEY_GLOBAL_privatekeyfile = new OptionDefinition(null,"privatekeyfile","none","privatekeyfile.argValue",false,false,"privatekeyfile.argDescription");
	
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
    	    	KEY_range,
    	    	KEY_usehostdeclnames,
    	    	KEY_hardware,
    	    	KEY_servername,
    	    	KEY_nextserver,
    	    	KEY_fixedaddress,
    	    	KEY_ddnsupdatestyle,
    	    	KEY_serveridentifier,
    	    	KEY_allow,
    	    	KEY_allowmembersof,
    	    	KEY_deny,
    	    	KEY_denymembersof,
    	    	KEY_defaultleasetime,
    	    	KEY_maxleasetime,
    	    	KEY_getleasehostnames,
    	    	KEY_dynamicbootpleaselength,
    	    	KEY_bootunknownclients,
    	    	KEY_leaselimit,
    		};

	private static final OptionDefinition[] GLOBAL_TASK_OPTIONS = new OptionDefinition []
	{
    	    	KEY_GLOBAL_serviceName,
    	    	KEY_GLOBAL_listEntities,
    		};

	private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMUNICATION_OPTIONS = new OptionDefinition []
	{
    	    	KEY_GLOBAL_hostname,
    	    	KEY_GLOBAL_port,
    	    	KEY_GLOBAL_namespace,
    	    	KEY_GLOBAL_user,
    	    	KEY_GLOBAL_password,
    	    	KEY_GLOBAL_publickeyfile,
    	    	KEY_GLOBAL_privatekeyfile,
    		};

	private static final OptionDefinition[] GLOBAL_WBEMSMT_COMMON_OPTIONS = new OptionDefinition []
	{
    	    	KEY_GLOBAL_locale,
    	    	KEY_GLOBAL_help,
    	    	KEY_GLOBAL_QUESTION_MARK_,
    		};

		
 
 CommandLine cmd = null;
	AbstractBaseCimAdapter adapter = null;

	
	public EditGlobalParamsCommand(java.util.Locale locale)
	{
		super("EditGlobalParamsCommand", new String[]{"messages","messagesDhcp"},locale);
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
					(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter)CimAdapterFactory.getInstance()
					.getAdapter(org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter.class,this);
			adapter.setBundle(bundle);
			adapter.setCimClient(values.getCimClient());
				
			adapter.loadInitial(adapter.getCimClient());
			
			values.getOut().println("\n" + bundle.getString("editing",new Object[]{bundle.getString("DHCPGlobalParamsContainer.caption")}));

        	CliDataLoader loader = new EditGlobalParamsCommandLoader();
			loader.load(bundle,adapter, commandValues);
			
			org.sblim.wbemsmt.dhcp.bl.container.edit.cli.DHCPGlobalParamsContainerImpl dc = new org.sblim.wbemsmt.dhcp.bl.container.edit.cli.DHCPGlobalParamsContainerImpl(adapter);
						
        				
			setKeyValues(cmd,adapter,dc);

			adapter.updateControls(dc);
			adapter.setActiveModule(AbstractBaseCimAdapter.ACTIVE_EDIT);
			
			values.getOut().println("\n" + bundle.getString("before.edit"));
			dc.trace(values.getOut());

			setValues(cmd,adapter,dc);
			
			MessageList result = MessageList.init(dc);

			if (result.hasErrors())
			{
				Message caption = Message.create(ErrCodes.MSG_SAVE_ERROR, Message.ERROR,bundle, "save.error");
				traceMessages(caption,result);
				return;
			}
			else
			{
				Message caption = Message.create(ErrCodes.MSG_ADDITIONAL_MESSAGES, Message.ERROR,bundle, "additional.messages");
				traceMessages(caption,result);
				result.clear();
			}
							

			adapter.validateValues(dc);
			result = dc.getMessagesList();
			if (!result.hasErrors())
			{
				adapter.save(dc);
				//Get the infos afte storing the values
				result = dc.getMessagesList();
				if (result.hasErrors())
				{
					Message caption = Message.create(ErrCodes.MSG_SAVE_ERROR, Message.ERROR,bundle, "save.error");
					traceMessages(caption,result);
				}
				else if (result.hasWarning())
				{
					Message caption = Message.create(ErrCodes.MSG_SAVE_WARNING, Message.ERROR,bundle, "save.warning");
					traceMessages(caption,result);
				}
				else if (result.hasInfo())
				{
					Message caption = Message.create(ErrCodes.MSG_SAVE_INFO, Message.ERROR,bundle, "save.info");
					traceMessages(caption,result);
				}
			}
			else
			{
					Message caption = Message.create(ErrCodes.MSG_VALIDATION_ERROR, Message.ERROR,bundle, "validation.error");
					traceMessages(caption,result);
					return;
			}
			values.getOut().println("\n" + bundle.getString("edited", new Object[]{bundle.getString("DHCPGlobalParamsContainer.caption")}));

			adapter.updateControls(dc);

			values.getOut().println("\n" + bundle.getString("after.edit"));
			dc.trace(values.getOut());
		
		}
		catch (Exception e)
		{
			super.handleException(e,values.getArgs(),values.getOptions(),KEY_GLOBAL_password);
		}
		finally
		{
			if (adapter != null) adapter.cleanup();
		}
	}
	
	/**
	 * Set all Values that are needed for selecting the right objects. This fields are used even if they are read-only
	 **/
	private void setKeyValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalParamsContainer dc) throws WbemSmtException {
    	    				    				    				    				    				    				    				    				    				    				    				    				    				    				    				    				    				    					}	
	
	/**
	 * Set all Values that are not read-Only
	 **/
	private void setValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalParamsContainer dc) throws WbemSmtException {
    										setValue(cmd,dc.get_usr_Range(),KEY_range);
																									setCheckboxValue(cmd,dc.get_usr_Usehostdeclnames(),KEY_usehostdeclnames);
																			setValue(cmd,dc.get_usr_Hardware(),KEY_hardware);
																						setValue(cmd,dc.get_usr_Servername(),KEY_servername);
																						setValue(cmd,dc.get_usr_Nextserver(),KEY_nextserver);
																						setValue(cmd,dc.get_usr_Fixedaddress(),KEY_fixedaddress);
																						setValue(cmd,dc.get_usr_Ddnsupdatestyle(),KEY_ddnsupdatestyle);
																						setValue(cmd,dc.get_usr_Serveridentifier(),KEY_serveridentifier);
																						setValue(cmd,dc.get_usr_Allow(),KEY_allow);
																						setValue(cmd,dc.get_usr_Allowmembersof(),KEY_allowmembersof);
																						setValue(cmd,dc.get_usr_Deny(),KEY_deny);
																						setValue(cmd,dc.get_usr_Denymembersof(),KEY_denymembersof);
																						setValue(cmd,dc.get_usr_Defaultleasetime(),KEY_defaultleasetime);
																						setValue(cmd,dc.get_usr_Maxleasetime(),KEY_maxleasetime);
																									setCheckboxValue(cmd,dc.get_usr_Getleasehostnames(),KEY_getleasehostnames);
																			setValue(cmd,dc.get_usr_Dynamicbootpleaselength(),KEY_dynamicbootpleaselength);
																						setValue(cmd,dc.get_usr_Bootunknownclients(),KEY_bootunknownclients);
																						setValue(cmd,dc.get_usr_Leaselimit(),KEY_leaselimit);
															
		//The Buttons
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
				KEY_GLOBAL_privatekeyfile);
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