/** 
 * DHCPChangeIndicationListener.java
 *
 * © Copyright IBM Corp. 2008
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
 * Contributors: 
 * 
 * Description: 
 * 
 */


package org.sblim.wbemsmt.dhcp.indications;

import java.util.HashMap;
import java.util.Vector;
import java.util.logging.Logger;

import org.sblim.wbem.client.indications.CIMEvent;
import org.sblim.wbem.client.indications.CIMListener;
import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.schema.cim29.CIM_ProcessIndication;

public class DHCPChangeIndicationListener implements CIMListener {

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

}
