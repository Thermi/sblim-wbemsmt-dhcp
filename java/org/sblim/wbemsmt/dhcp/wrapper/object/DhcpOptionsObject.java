/** 
 * DhcpOptionsObject.java
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


package org.sblim.wbemsmt.dhcp.wrapper.object;

import java.util.Iterator;
import java.util.List;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.bl.wrapper.WbemsmtBusinessObject;
import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednerOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptions;
import org.sblim.wbemsmt.exception.ErrorCode;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;

public class DhcpOptionsObject extends WbemsmtBusinessObject{

	private Linux_DHCPOptions fco = null;
	private DhcpCimAdapter adapter = null;
	
	
	public DhcpOptionsObject(final Linux_DHCPOptions fco,final DhcpCimAdapter adapter) {
		super(adapter);
		this.fco= fco;
		this.adapter = adapter;
	}

	public Linux_DHCPOptions getFco() {
		return fco;
	}

	public CimObjectKey getCimObjectKey() {
		return new CimObjectKey(fco.getCimObjectPath());
	}

	public MessageList save ( DHCPSubnetOptionsContainer container, Object object ) throws WbemsmtException {

		if (adapter.isBooleanOp ( fco.get_Name () ))
			fco.set_values ( object.toString () );
		else
			fco.set_values ( (String) object );
		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );

		return null;

	}

	public MessageList save ( DHCPSharednerOptionsContainer container, Object object ) throws WbemsmtException {

		if (adapter.isBooleanOp ( fco.get_Name () ))
			fco.set_values ( object.toString () );
		else
			fco.set_values ( (String) object );
		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );

		return null;

	}

	public MessageList save ( DHCPGroupOptionsContainer container, Object object ) throws WbemsmtException {

		if (adapter.isBooleanOp ( fco.get_Name () ))
			fco.set_values ( object.toString () );
		else
			fco.set_values ( (String) object );
		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );

		return null;

	}

	public MessageList save ( DHCPHostOptionsContainer container, Object object ) throws WbemsmtException {

		if (adapter.isBooleanOp ( fco.get_Name () ))
			fco.set_values ( object.toString () );
		else
			fco.set_values ( (String) object );
		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );

		return null;

	}

	public MessageList save ( DHCPPoolOptionsContainer container, Object object ) throws WbemsmtException {

		if (adapter.isBooleanOp ( fco.get_Name () ))
			fco.set_values ( object.toString () );
		else
			fco.set_values ( (String) object );
		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );

		return null;

	}

	public MessageList save ( DHCPGlobalOptionsContainer container, Object object ) throws WbemsmtException {

		if (adapter.isBooleanOp ( fco.get_Name () ))
			fco.set_values ( object.toString () );
		else
			fco.set_values ( (String) object );
		adapter.getFcoHelper ().save ( fco, adapter.getCimClient () );

		return null;

	}

	
	public void updateControls(DHCPSubnetOptionsContainer container) {
		
		List<LabeledBaseInputComponentIf> fields = container.getFields();
		
		for (Iterator<LabeledBaseInputComponentIf> iter = fields.iterator (); iter.hasNext ();){
			LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter.next();
			
			if(fld.getLabelText ().equals(fco.get_Name())){//.replace("-","")
				
				if( adapter.isBooleanOp ( fco.get_Name() ) )
					fld.setControlValue ( new Boolean(fco.get_values ()) );
				else
					fld.setControlValue ( fco.get_values ());
				break;
				}
					
		}	
		
	}

	public void updateControls(DHCPSharednerOptionsContainer container) {
		
		List<LabeledBaseInputComponentIf> fields = container.getFields();
		
		for (Iterator<LabeledBaseInputComponentIf> iter = fields.iterator (); iter.hasNext ();){
			LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter.next();
			
			if(fld.getLabelText ().equals(fco.get_Name())){//.replace("-","")
				
				if( adapter.isBooleanOp ( fco.get_Name() ) )
					fld.setControlValue ( new Boolean(fco.get_values ()) );
				else
					fld.setControlValue ( fco.get_values ());
				break;
				}
					
		}	
		
	}

	public void updateControls(DHCPPoolOptionsContainer container) {
		
		List<LabeledBaseInputComponentIf> fields = container.getFields();
		
		for (Iterator<LabeledBaseInputComponentIf> iter = fields.iterator (); iter.hasNext ();){
			LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter.next();
			
			if(fld.getLabelText ().equals(fco.get_Name())){//.replace("-","")
				
				if( adapter.isBooleanOp ( fco.get_Name() ) )
					fld.setControlValue ( new Boolean(fco.get_values ()) );
				else
					fld.setControlValue ( fco.get_values ());
				break;
				}
					
		}	
		
	}

	public void updateControls(DHCPGroupOptionsContainer container) {
		
		List<LabeledBaseInputComponentIf> fields = container.getFields();
		
		for (Iterator<LabeledBaseInputComponentIf> iter = fields.iterator (); iter.hasNext ();){
			LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter.next();
			
			if(fld.getLabelText ().equals(fco.get_Name())){//.replace("-","")
				
				if( adapter.isBooleanOp ( fco.get_Name() ) )
					fld.setControlValue ( new Boolean(fco.get_values ()) );
				else
					fld.setControlValue ( fco.get_values ());
				break;
				}
					
		}	
		
	}

	public void updateControls(DHCPHostOptionsContainer container) {
		
		List<LabeledBaseInputComponentIf> fields = container.getFields();
		
		for (Iterator<LabeledBaseInputComponentIf> iter = fields.iterator (); iter.hasNext ();){
			LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter.next();
			
			if(fld.getLabelText ().equals(fco.get_Name())){//.replace("-","")
				
				if( adapter.isBooleanOp ( fco.get_Name() ) )
					fld.setControlValue ( new Boolean(fco.get_values ()) );
				else
					fld.setControlValue ( fco.get_values ());
				break;
				}
					
		}	
		
	}

	public void updateControls(DHCPGlobalOptionsContainer container) {
		
		List<LabeledBaseInputComponentIf> fields = container.getFields();
		
		for (Iterator<LabeledBaseInputComponentIf> iter = fields.iterator (); iter.hasNext ();){
			LabeledBaseInputComponentIf fld = (LabeledBaseInputComponentIf)iter.next();
			
			if(fld.getLabelText ().equals(fco.get_Name())){//.replace("-","")
				
				if( adapter.isBooleanOp ( fco.get_Name() ) )
					fld.setControlValue ( new Boolean(fco.get_values ()) );
				else
					fld.setControlValue ( fco.get_values ());
				break;
				}
					
		}	
		
	}

	
	public MessageList revert ( DHCPSubnetOptionsContainer container ) throws WbemsmtException {
		try {
			adapter.getFcoHelper ().reload ( fco, adapter.getCimClient () );
		} catch (WbemsmtException e) {
			throw new WbemsmtException ( (ErrorCode)e.getErrorCode (),e );
		}
		return null;
	}
	
}
