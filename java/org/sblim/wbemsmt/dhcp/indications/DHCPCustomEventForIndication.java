/** 
 * DHCPCustomEventForIndication.java
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

import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.client.indications.CIMEvent;
import org.sblim.wbemsmt.schema.cim29.CIM_Indication;

public class DHCPCustomEventForIndication extends CIMEvent {

	public DHCPCustomEventForIndication ( CIMInstance arg0 ) {
		super ( arg0 );
	}

	public CIMInstance getIndication(){
		
		iIndication.setAlias ( "Custom Indication" );
		iIndication.setName("Custom Indication");
		
		return iIndication;
	}
}
