/** 
B * DhcpValidator.java
 *
 * © Copyright IBM Corp.  2009,2007
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


package org.sblim.wbemsmt.dhcp.bl.validator;


import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.bl.messages.MessageNumber;
import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.validator.Validator;

public class DhcpValidator extends Validator {

	private DhcpCimAdapter adapter = null;

	private LabeledBaseInputComponentIf field = null;

	private int check = 0;

	public DhcpValidator ( LabeledBaseInputComponentIf field, AbstractBaseCimAdapter adapter ) {
		super ( adapter );
		this.adapter = (DhcpCimAdapter) adapter;
		this.field = field;
	}

	protected LabeledBaseInputComponentIf[] getComponents () {
		return new LabeledBaseInputComponentIf[] { field };
	}

	public void validateElement ( MessageList result ) throws WbemsmtException {

		String value = (String) field.getConvertedControlValue ();

		switch (check) {

		case CHECK_EMPTY:
			checkIfEmpty ( value, result );
			break;
		case CHECK_IPFORMAT:
			checkIfValidIPFormat ( value, result );
			break;
		case CHECK_MACFORMAT:
			checkIfValidMACFormat ( value, result );
			break;
		case CHECK_NUMBER:
			checkNumber ( value, result );
			break;
		case CHECK_RANGE_PARAM:
			checkRangeParam ( value, result );
			break;
		case CHECK_ON_OFF:
			checkOnOff ( value, result );
			break;
		case CHECK_HARDWARE:
			checkHardware ( value, result );
			break;
		case CHECK_DDNS_UPDATE_STYLE:
			checkDdnsUpdateStyle ( value, result );
			break;
			
			
		default:
			break;
		}
	}

	private void checkIfEmpty ( String value, MessageList result ) {

		if (value==null || value.equals ( "" )) {
			Message err = Message.create ( new MessageNumber ( this.field.getLabelText (), " Value Not Set", 5 ),
					Message.ERROR, adapter.getBundle (), value );
			result.addMessage ( err );
		}
	}

	private void checkIfValidIPFormat ( String value, MessageList result ) {

		if (value==null || value.equals ( "" ))
			return;

		if (value.matches ( "[[0-9]+[0-9]*[0-9]*.[0-9]+[0-9]*[0-9]*.[0-9]+[0-9]*[0-9]*.[0-9]+[0-9]*[0-9]*]*" ) == false) {
			Message err = Message.create ( new MessageNumber ( this.field.getLabelText (),
					" Wrong IP format. Should be xxx.xxx.xxx.xxx", 5 ), Message.ERROR, adapter.getBundle (), value );
			result.addMessage ( err );
		}

	}

	private void checkIfValidMACFormat ( String value, MessageList result ) {

		if (value==null || value.equals ( "" ))
			return;

		if (value.matches ( "[0-9a-fA-F]+[0-9a-fA-F]*:[0-9a-fA-F]+[0-9a-fA-F]*:[0-9a-fA-F]+[0-9a-fA-F]*:[0-9a-fA-F]+[0-9a-fA-F]*:[0-9a-fA-F]+[0-9a-fA-F]*:[0-9a-fA-F]+[0-9a-fA-F]*" ) == false) {
			Message err = Message.create ( new MessageNumber ( this.field.getLabelText (),
					" Wrong MAC Address format. Should be xx:xx:xx:xx:xx:xx", 5 ), Message.ERROR, adapter.getBundle (),
					value );
			result.addMessage ( err );
		}

	}

	private void checkRangeParam ( String value, MessageList result ) {

		if (value==null || value.equals ( "" ))
			return;

		if (value.matches ( "(dynamic-bootp)*[ ]*[0-9]+[0-9]*[0-9]*.[0-9]+[0-9]*[0-9]*.[0-9]+[0-9]*[0-9]*.[0-9]+[0-9]*[0-9]*[ ][0-9]+[0-9]*[0-9]*.[0-9]+[0-9]*[0-9]*.[0-9]+[0-9]*[0-9]*.[0-9]+[0-9]*[0-9]*" ) == false) {
			Message err = Message
					.create (
							new MessageNumber (
									this.field.getLabelText (),
									" Wrong Delimeter or IP format. ex. [dynamic-bootp] xxx.xxx.xxx.xxx xxx.xxx.xxx.xx",
									5 ), Message.ERROR, adapter.getBundle (), value );
			result.addMessage ( err );
		}

	}

	private void checkNumber ( String value, MessageList result ) {

		if (value==null || value.equals ( "" ))
			return;

		if (value.matches ( "[0-9]+" ) == false) {
			Message err = Message.create ( new MessageNumber ( this.field.getLabelText (), " Not a valid Number.", 5 ),
					Message.ERROR, adapter.getBundle (), value );
			result.addMessage ( err );
		}

	}

	private void checkOnOff ( String value, MessageList result ) {

		if (value==null || value.equals ( "" ))
			return;

		if (value.matches ( "(ON|OFF)" ) == false) {
			Message err = Message.create ( new MessageNumber ( this.field.getLabelText (), " Not a valid Value. Should be ON or OFF", 5 ),
					Message.ERROR, adapter.getBundle (), value );
			result.addMessage ( err );
		}

	}

	private void checkHardware ( String value, MessageList result ) {

		if (value==null || value.equals ( "" ))
			return;

		if (value.matches ( "(ethernet|token-ring)? (([0-9a-fA-F]?[0-9a-fA-F]:){5}[0-9a-fA-F]?[0-9a-fA-F])" ) == false) {
//		if (value.matches ( "(ethernet|token-ring)*[:space:]*[0-9a-fA-F]{1,2}:[0-9a-fA-F]{1,2}:[0-9a-fA-F]{1,2}:[0-9a-fA-F]{1,2}:[0-9a-fA-F]{1,2}:[0-9a-fA-F]{1,2}" ) == false) {
			Message err = Message.create ( new MessageNumber ( this.field.getLabelText (), " Not a valid Value. hardware-type: [ethernet|token-ring] hardware-address : [hex octet]", 5 ),
					Message.ERROR, adapter.getBundle (), value );
			result.addMessage ( err );
		}

	}

	private void checkDdnsUpdateStyle ( String value, MessageList result ) {

		if (value==null || value.equals ( "" ))
			return;

		if (value.matches ( "(ad-hoc|interim|none)" ) == false) {
			Message err = Message.create ( new MessageNumber ( this.field.getLabelText (), " Not a valid Value. Should be one of ad-hoc,interim,none", 5 ),
					Message.ERROR, adapter.getBundle (), value );
			result.addMessage ( err );
		}

	}
	
	public void setFlags ( int Flag ) {
		check = Flag;
	}

	public static final int CHECK_EMPTY = 0;

	public static final int CHECK_IPFORMAT = 1;

	public static final int CHECK_MACFORMAT = 2;

	public static final int CHECK_RANGE_PARAM = 3;

	public static final int CHECK_NUMBER = 4;

	public static final int CHECK_ON_OFF = 5;
	
	public static final int CHECK_HARDWARE = 6;
	
	public static final int CHECK_DDNS_UPDATE_STYLE = 7;
}
