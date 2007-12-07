/** 
  * CreateHostCommand.java
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
  * @template: org/sblim/wbemsmt/dcg/templates/cmd/createCommand.vm
  *
  * Contributors: Prashanth Karnam <prkarnam@in.ibm.com>
  * 
  * Description: Class for creating objects
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.listener.cli;

import org.apache.commons.cli.*;
import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.bl.*;
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tools.cli.*;
import org.sblim.wbemsmt.tools.wizard.cli.*;

public class CreateHostCommand extends CimCommand implements ContainerUpdater {

	
 
 
	//All Options that are local and defined for this command
			/**
   		 * required,  --CreateIn
		 */
		public static final OptionDefinition KEY_CreateIn = new OptionDefinition(null,"CreateIn",null,"CreateHostCommand.CreateIn.argValue",true,false,"CreateHostCommand.CreateIn.argDescription");
			/**
   		 * required,  --name
		 */
		public static final OptionDefinition KEY_name = new OptionDefinition(null,"name",null,"NewHostContainer.Name.argValue",true,false,"NewHostContainer.Name.argDescription");
			/**
   		 * required,  --mACAddr
		 */
		public static final OptionDefinition KEY_mACAddr = new OptionDefinition(null,"mACAddr",null,"NewHostContainer.MACAddr.argValue",true,false,"NewHostContainer.MACAddr.argDescription");
			/**
   		 *  --iPAddr
		 */
		public static final OptionDefinition KEY_iPAddr = new OptionDefinition(null,"iPAddr",null,"NewHostContainer.IPAddr.argValue",false,false,"NewHostContainer.IPAddr.argDescription");
		
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
    	    	KEY_CreateIn,
    	    	KEY_name,
    	    	KEY_mACAddr,
    	    	KEY_iPAddr,
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

	
	public CreateHostCommand(java.util.Locale locale)
	{
		super("CreateHostCommand", new String[]{"messages","messagesDhcp"},locale);
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
			
			values.getOut().println("\n" + bundle.getString("NewHostWizard.create.start"));
			
			CliDataLoader loader = new CreateHostCommandLoader();
			loader.load(bundle,adapter, commandValues);
			
			org.sblim.wbemsmt.dhcp.bl.container.wizard.cli.NewHostWizard wizard = new org.sblim.wbemsmt.dhcp.bl.container.wizard.cli.NewHostWizard((org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter) adapter);
			if (!wizard.canBeExecuted())
			{
				traceErrors("error.while.execution",wizard.getMessageList());
				return;
			}
			wizard.startWizard();
			
			while (!wizard.getContainer().isLast(wizard.getContainer().getCurrentPageName()))
			{
				BaseDataContainer dataContainer = wizard.getCurrentPanel();
				if (true == false);
								else if (dataContainer instanceof org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer)dataContainer);
								else if (dataContainer instanceof org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer) setCommandLineValues(cmd,adapter,(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer)dataContainer);
								else {
					logger.severe(dataContainer.getClass().getName() + " cannot be handled from command class "  + this.getClass().getName());
										throw new WbemSmtException(bundle.getString("internal.error"));
				}

				MessageList result = MessageList.init(dataContainer);					
				if (result.hasErrors())
				{
    					traceErrors(result);
    					return;
				}
				else
				{
					Message caption = Message.create(ErrCodes.MSG_ADDITIONAL_MESSAGES, Message.ERROR,bundle, "additional.messages");
					traceMessages(caption,result);
					result.clear();
				}
				
				wizard.next(this);
				result = wizard.getCurrentPanel().getMessagesList();

				if (result != null)
				{
					if (result.hasErrors())
					{
						Message caption = Message.create(ErrCodes.MSG_VALIDATION_ERROR, Message.ERROR,bundle, "validation.error");
    					traceMessages(caption,result);
    					return;
					}
					else
					{
						Message caption = Message.create(ErrCodes.MSG_ADDITIONAL_MESSAGES, Message.ERROR,bundle, "additional.messages");
						traceMessages(caption,result);
						dataContainer.getMessagesList().clear();
					}
				}
			}			
			
			BaseDataContainer lastPanel = wizard.getCurrentPanel();
			
			MessageList result = wizard.finish();
			String wizardName = ClassUtils.getShortClassName(wizard.getClass());
			if (result != null && result.hasErrors())
			{
				result.addMessage(new Message(ErrCodes.MSG_CREATE_FAILED,Message.ERROR,bundle.getString(wizardName + ".create.failed")));        
			}
			else
			{
				result.addMessage(new Message(ErrCodes.MSG_CREATE_SUCCESS,Message.SUCCESS,bundle.getString(wizardName + ".create.success")));        
			}
			traceErrors(result);
			
			if (true == false);
						else if (lastPanel instanceof org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer) ((CreateHostCommandLoader)loader).loadTracingObject(bundle,adapter,(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer)lastPanel);
						else {
				logger.severe("Cannot loadTracingObject for " + lastPanel.getClass().getName());
				throw new WbemSmtException(bundle.getString("internal.error"));
			}
			
			org.sblim.wbemsmt.dhcp.bl.container.wizard.cli.NewHostContainerImpl dc = new org.sblim.wbemsmt.dhcp.bl.container.wizard.cli.NewHostContainerImpl(adapter);

						
        				
			adapter.updateControls(dc);
			values.getOut().println("\n" + bundle.getString("createdObject") + ":\n");
			dc.trace(values.getOut());
			
   		    //values.getOut().println("\n" + bundle.getString("NewHostWizard.create.success"));
		
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
    
	public void prepareForUpdateControls(DataContainer dataContainer) throws UpdateControlsException
	{
		if (true == false);
				else if (dataContainer instanceof org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer)dataContainer);
				else if (dataContainer instanceof org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer) updateContainerChilds(cmd,adapter,(org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer)dataContainer);
				else {

				logger.severe("Cannot setValues for Container " + dataContainer.getClass().getName());
				throw new UpdateControlsException("Cannot setValues for Container " + dataContainer.getClass().getName());
		}
	}
	
			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
			    		
        			}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer dc) throws WbemSmtException {
		//set the values
											setValue(cmd,dc.get_Name(),KEY_name);
																						setValue(cmd,dc.get_MACAddr(),KEY_mACAddr);
																						setValue(cmd,dc.get_IPAddr(),KEY_iPAddr);
															
		//The Buttons
    																														
	}	

			
	private void updateContainerChilds(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer dc) throws UpdateControlsException {
		
		try
		{
    		//update the child-containers
    		
			    		
        			}
		catch (Exception e)
		{
				throw new UpdateControlsException(bundle.getString("internal.error"),e);
		}
		
		
	}
	
	private void setCommandLineValues(CommandLine cmd,AbstractBaseCimAdapter adapter, org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer dc) throws WbemSmtException {
		//set the values
				
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