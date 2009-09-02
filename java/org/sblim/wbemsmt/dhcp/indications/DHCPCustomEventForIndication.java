/** 
 * DHCPCustomEventForIndication.java
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

import javax.cim.CIMInstance;

import org.sblim.cimclient.internal.wbem.indications.CIMEvent;

public class DHCPCustomEventForIndication extends CIMEvent {

	public DHCPCustomEventForIndication ( CIMInstance arg0 ) {
		super ( arg0 );
	}

	public CIMInstance getIndication(){
		
//		iIndication.setAlias ( "Custom Indication" );
//		iIndication.setName("Custom Indication");
		
		return iIndication;
	}
}
