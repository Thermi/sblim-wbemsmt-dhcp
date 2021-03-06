/** 
 * DhcpErrorCodes.java
 *
 * Copyright IBM Corp.  2009,2008
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


package org.sblim.wbemsmt.dhcp.bl;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageDefinition;
import org.sblim.wbemsmt.bl.messages.MessageInputEvent;
import org.sblim.wbemsmt.bl.messages.MessageInputHandler;
import org.sblim.wbemsmt.bl.messages.MessageNumber;


public class DhcpErrorCodes implements MessageInputHandler {

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
