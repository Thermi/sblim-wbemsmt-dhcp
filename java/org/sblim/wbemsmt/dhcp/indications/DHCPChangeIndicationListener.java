/** 
 * DHCPChangeIndicationListener.java
 *
 * © Copyright IBM Corp.  2009,2008
 *
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Eclipse Public License from
 * http://www.opensource.org/licenses/eclipse-1.0.php
 *
 * @author: Prashanth Karnam <prkarnam@in.ibm.com>
 *
 * Contributors: 
 * 
 * Description: 
 * 
 */


package org.sblim.wbemsmt.dhcp.indications;

import java.util.logging.Logger;

import javax.cim.CIMInstance;
import javax.wbem.listener.IndicationListener;

import org.sblim.cimclient.internal.wbem.indications.CIMEvent;
import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;

public class DHCPChangeIndicationListener implements IndicationListener {

	private DhcpCimAdapter adapter;
	Logger logger = Logger.getLogger ( this.getClass ().getName () );
	
	public DHCPChangeIndicationListener ( DhcpCimAdapter adapter ) {
		super ();
		this.adapter = adapter;
	}

	public void indicationOccured ( CIMEvent arg0 ) {
		logger.info("Indication on class " + (arg0.getIndication ().getProperty ("IndicationIdentifier").getValue().toString ()) + " recieved and processing it.");
		adapter.setIndcOccurred ( true );
	}

	public void indicationOccured ( String arg0, CIMInstance arg1 ) {
		logger.info(arg0);
		adapter.setIndcOccurred ( true );
	}

}
