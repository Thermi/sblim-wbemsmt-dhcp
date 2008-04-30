/** 
 * DhcpErrorCodes.java
 *
 * Copyright IBM Corp. 2008
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


package org.sblim.wbemsmt.dhcp.bl;
import java.util.HashMap;
import java.util.Map;

import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.MessageNumber;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.adapter.MessageDefinition;
import org.sblim.wbemsmt.bl.adapter.MessageInputEvent;
import org.sblim.wbemsmt.bl.adapter.MessageInputHandler;
import org.sblim.wbemsmt.bl.adapter.MessageUtil;

public class DhcpErrorCodes implements MessageInputHandler {

	private static final Map exceptions = new HashMap();	
	
	public final static String COMPONENT = "DIR";
	
	/**
	 * DHCP
	 */
	
	public final static String SUBSYS_DHC = "DHC";

	/**
	 * Messages for DHCP
	 */
	public static final MessageNumber MSG_INDICATION_OCCURRED = new MessageNumber(COMPONENT,SUBSYS_DHC,1);
	public static final MessageNumber MSG_INDICATION_PROCESSED = new MessageNumber(COMPONENT,SUBSYS_DHC,2);

	/**
	 * Message Definitions for DHCP
	 */
	
	public static final MessageDefinition MSGDEF_INDICATION_OCCURRED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_DHC,1),Message.WARNING,"indication.recieved",Message.INPUT_YES_NO);
	public static final MessageDefinition MSGDEF_INDICATION_PROCESSED = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_DHC,2),Message.ERROR,"indication.processed");

	public void handleInput ( MessageInputEvent event ) {
		
		if (event.getAction() == MessageInputEvent.OK) 
        { 
//            MessageUtil.addMessage(DhcpErrorCodes.MSGDEF_INDICATION_PROCESSED , event.); 
            event.setReloadTree(true); 
        } 
		
	}
	
}
