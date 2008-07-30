/** 
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
  * @author: Prashanth Karnam <prkarnam@in.ibm.com>
  * 
  * Description: Class for listing objects
  * 
  */

package org.sblim.wbemsmt.dhcp.bl.listener.cli;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.cim.CIMObjectPath;
import javax.cim.CIMValuedElement;
import javax.wbem.WBEMException;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGroup;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGroupHelper;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPHost;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPHostHelper;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPPool;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPPoolHelper;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPService;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPServiceHelper;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSharednet;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSharednetHelper;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSubnet;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSubnetHelper;
import org.sblim.wbemsmt.exception.ErrorCode;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.cli.CimCommandValues;
import org.sblim.wbemsmt.tools.cli.CliUtil;
import org.sblim.wbemsmt.tools.cli.OptionDefinition;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

/**
 * @author Prashanth Karnam
 *
 */
public abstract class DhcpServiceLoader extends DhcpLoader {

	protected CimCommandValues cmd;

	public DhcpServiceLoader () {
		super ();
	}

	public void load ( WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, CimCommandValues cmd )
			throws WbemsmtException {
		this.cmd = cmd;
		if (getEntityType ().equals (Linux_DHCPService.CIM_CLASS_NAME )) {
			String serviceName = CliUtil.getOption ( cmd, getServiceNameKey () );
			selectService ( bundle, adapter, serviceName );
			return;
		}
		try {
			selectEntity ( bundle, adapter, getEntityType () );
		} catch (WBEMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void selectEntity ( WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, String entityName )
			throws WbemsmtException, WBEMException {
		try {
			CIMObjectPath pathEntity = getPathOfEntity ( adapter, entityName );
			if (pathEntity != null) {
				CimObjectKey key = new CimObjectKey ( pathEntity );
				((DhcpCimAdapter) adapter).selectByKey ( key );
				return;
			} else {
				if (CliUtil.getOption ( cmd.getCommandLine (), getServiceNameKey () ) == null)
					throw new WbemsmtException ( null, bundle.getString ( "Entity.not.found",
							new Object[] { entityName } ) );
				if (CliUtil.getOption ( cmd.getCommandLine (), getServiceNameKey () ).equals ( "True" ))
					return;
			}
		} catch (WbemsmtException e) {
			throw new WbemsmtException ((ErrorCode)e.getErrorCode (), bundle.getString ( "Entity.not.found", new Object[] { entityName } ), e );
		}

	}

	private CIMObjectPath getPathOfEntity ( AbstractBaseCimAdapter adapter, String entityName ) throws WbemsmtException {

		Reader in = cmd.getIn ();
		PrintWriter out = cmd.getOut ();
		List list = null;
		CIMObjectPath paths[] = null;
		String msg= new String("Listing Entities ...");
		int option = 0;

		if (getEntityType ().startsWith ( "CreateIn-" )){
			adapter.getBundle ().getString ( getEntityType () );
//			entityName = getCreateIn ( getEntityType ().substring ( 9 ) );
			msg = "in " + entityName.substring ( 10 ) + " ...";
		}

		if (entityName.equals ( HOST ))
			list = Linux_DHCPHostHelper.enumerateInstanceNames ( adapter.getCimClient() , adapter.getNamespace() , false);

		if (entityName.equals ( POOL ))
			list = Linux_DHCPPoolHelper.enumerateInstanceNames ( adapter.getCimClient() , adapter.getNamespace() , false);

		if (entityName.equals ( SUBNET ))
			list = Linux_DHCPSubnetHelper.enumerateInstanceNames ( adapter.getCimClient() , adapter.getNamespace() , false);

		if (entityName.equals ( SHAREDNET ))
			list = Linux_DHCPSharednetHelper.enumerateInstanceNames ( adapter.getCimClient() , adapter.getNamespace() , false);

		if (entityName.equals ( GROUP ))
			list = Linux_DHCPGroupHelper.enumerateInstanceNames ( adapter.getCimClient() , adapter.getNamespace() , false);

		int i = 0;
		paths = new CIMObjectPath[list.size ()];
		for (Iterator iter = list.iterator (); iter.hasNext ();) {
			CIMObjectPath path = (CIMObjectPath) iter.next ();
			paths[i] = path;i++;
		}

		if (CliUtil.getOption ( cmd.getCommandLine (), getServiceNameKey () ) == null) {
			out.println ( msg );
			out.println ( "===================================================\n" );
			for(int j=0 ; j<i ; j++)
				out.println ( j + ". " + paths[j].toString () );
			out.println ( "\n===================================================\n" );
			out.println ( "Enter the Object to be selected [0.." + (i-1) + "] :" );
			try {
				option = in.read ();
				if (option < 48 || option > 48 + i)
					return null;
			} catch (IOException e) {
				e.printStackTrace ();
			}

			return paths[option - 48];
		} else {
			if (CliUtil.getOption ( cmd.getCommandLine (), getServiceNameKey () ).toUpperCase ().equals ( "TRUE" )) {

				out.println ( msg );
				out.println ( "===================================================\n" );
				for(int j=0 ; j<i ; j++)
					out.println ( j + ". " + paths[j].toString () );
				out.println ( "\n===================================================\n" );
				out.println ( "Enter the Entity number as an arguement and run again.\n" );
				return null;
			}

			return paths[new Integer ( CliUtil.getOption ( cmd.getCommandLine (), getServiceNameKey () ) ).intValue ()];
		}
	}

//	/**
//	 * The Entity in which the new entity is to be created.
//	 * 
//	 * @return
//	 */
//	private String getCreateIn ( String str ) {
//
//		if (str.toUpperCase ().equals ( GROUP.substring ( 10 ).toUpperCase () ))
//			return "Linux_DHCPGroup";
//		if (str.toUpperCase ().equals ( POOL.substring ( 10 ).toUpperCase () ))
//			return "Linux_DHCPPool";
//		if (str.toUpperCase ().equals ( HOST.substring ( 10 ).toUpperCase () ))
//			return "Linux_DHCPHost";
//		if (str.toUpperCase ().equals ( SUBNET.substring ( 10 ).toUpperCase () ))
//			return "Linux_DHCPSubnet";
//		if (str.toUpperCase ().equals ( SHAREDNET.substring ( 10 ).toUpperCase () ))
//			return "Linux_DHCPSharednet";
//
//		return null;
//	}

	/**
	 * used to return the ServiceName option definition. This is used in the
	 * entity classes to return the listEntities OptionDefinition.
	 * 
	 * @return
	 */
	protected abstract OptionDefinition getServiceNameKey ();

	/**
	 * used to return the Type of the Entity when Edit and Delete commands but 
	 * used for CreateIn option when its a create command.
	 * 
	 * @return
	 */
	protected abstract String getEntityType ();

	protected void selectService ( WbemSmtResourceBundle bundle, AbstractBaseCimAdapter adapter, String serviceName )
			throws WbemsmtException {
		try {
			CIMObjectPath pathService = getPathOfService ( adapter, serviceName );
			if (pathService != null) {
				CimObjectKey key = new CimObjectKey ( pathService );
				adapter.select ( key );
				return;
			} else {
				throw new WbemsmtException ( null, bundle.getString ( "service.not.found",
						new Object[] { serviceName } ) );
			}
		} catch (WbemsmtException e) {
			throw new WbemsmtException ( (ErrorCode)e.getErrorCode (),bundle.getString ( "service.not.found", new Object[] { serviceName } ),
					e );
		}
	}

	protected CIMObjectPath getPathOfService ( AbstractBaseCimAdapter adapter, String serviceName ) throws WbemsmtException {
		List list = Linux_DHCPServiceHelper.enumerateInstanceNames ( adapter.getCimClient() , adapter.getNamespace() , false);
		CIMObjectPath pathService = null;
		for (Iterator iter = list.iterator (); iter.hasNext ();) {
			Object o = iter.next ();
			CIMObjectPath path = (CIMObjectPath) o;
			if (((CIMValuedElement) path.getKey ( "Name" ).getValue ()).getValue ().equals ( serviceName )) {
				pathService = path;
			}
		}
		return pathService;
	}

	private static String HOST = Linux_DHCPHost.CIM_CLASS_NAME;
	private static String POOL = Linux_DHCPPool.CIM_CLASS_NAME;
	private static String GROUP = Linux_DHCPGroup.CIM_CLASS_NAME;
	private static String SUBNET = Linux_DHCPSubnet.CIM_CLASS_NAME;
	private static String SHAREDNET = Linux_DHCPSharednet.CIM_CLASS_NAME;
	
}
