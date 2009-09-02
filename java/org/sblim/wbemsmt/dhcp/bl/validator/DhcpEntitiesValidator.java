/** 
 * DhcpEntitiesValidator.java
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

import java.util.ArrayList;
import java.util.Iterator;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.bl.messages.MessageNumber;
import org.sblim.wbemsmt.dhcp.bl.adapter.DhcpCimAdapter;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGroup;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGroupHelper;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPHost;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPHostHelper;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParams;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPPool;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPPoolHelper;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSharednet;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSharednetHelper;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSubnet;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSubnetHelper;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpParamsList;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpEntityObject;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpGroupObject;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpHostObject;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpPoolObject;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpSharednetObject;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpSubnetObject;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.validator.Validator;
import org.sblim.wbemsmt.util.StringTokenizer;

public class DhcpEntitiesValidator extends Validator {

	private DhcpCimAdapter adapter = null;
	private DhcpEntityObject entity = null;
	private LabeledBaseInputComponentIf field = null;
	private int flag=0;
	
	public DhcpEntitiesValidator (DhcpEntityObject entity , LabeledBaseInputComponentIf field,  AbstractBaseCimAdapter adapter ) {
		super ( adapter );
		this.adapter = (DhcpCimAdapter) adapter;
		this.field = field;
		this.entity = entity;
	}

	protected LabeledBaseInputComponentIf[] getComponents () {
		return new LabeledBaseInputComponentIf[] { field };
	}

	public void validateElement ( MessageList result ) throws WbemsmtException {
		 
		String value = (String) field.getConvertedControlValue ();

		switch(getFlag ()){
		
		case VALIDATE_POOL:
			ValidatePool ( value , result);
			break;
			
		default:
			break;
		}
		
	}

	private void ValidatePool(String Value , MessageList result) throws WbemsmtException{
		
		DhcpPoolObject pool = (DhcpPoolObject)entity;
		DhcpSubnetObject parent = (DhcpSubnetObject) createParentObj ( pool );
		Linux_DHCPSubnet parentfco = (Linux_DHCPSubnet)parent.getFco ();
		DhcpParamsList poolparamslist = null;		
		
		if(parent != null && parent.getFco ().getObjectName().equals("Linux_DHCPSubnet")){
			
			poolparamslist = ((DhcpSubnetObject)parent).getSubnetparamslist ();
	
			ArrayList<Object> paramslist = (ArrayList<Object>) poolparamslist.getFCOs ();
			
			for(Iterator<Object> iter = paramslist.iterator ();iter.hasNext ();){
				Linux_DHCPParams fco = (Linux_DHCPParams)iter.next ();
				if(fco.get_Name ().equals ( "range" )){
					String val = fco.get_values ();
					if(!val.equals ( "" )){
						StringTokenizer tk = new StringTokenizer(val," ");
						String ip1 = tk.nextToken ();String ip2 = tk.nextToken ();String iptocheck = getIPtoCheckFromNetmask (parentfco.get_Netmask () , parentfco.get_Name ()  );
						if(tk.countTokens ()>0 && compareIP( ip1 , iptocheck) && compareIP ( ip2 , iptocheck ) && compareIP ( ip2, ip1 ))
							return;
						else{
							Message err = Message.create ( new MessageNumber ( this.field.getLabelText (), "The range entered for the pool does not fall in the parent Subnet " + parentfco.get_Name () + "range", 5 ),
									Message.ERROR, adapter.getBundle (), Value );
							result.addMessage ( err );
							return;
						}
					}
				}
			}
		}
	}
	
	private DhcpEntityObject createParentObj(DhcpEntityObject source ) throws WbemsmtException{
	
		String parentID = source.getFco ().get_ParentID ();
		String parentType = getClass(parentID);
		
		if(parentType.equals(Linux_DHCPSubnet.CIM_CLASS_NAME)){
			Linux_DHCPSubnet fco = Linux_DHCPSubnetHelper.getInstance(adapter.getCimClient (),new CIMObjectPath(parentID));
			return new DhcpSubnetObject(fco,adapter);
		}

		if(parentType.equals(Linux_DHCPPool.CIM_CLASS_NAME)){
			Linux_DHCPPool fco = Linux_DHCPPoolHelper.getInstance(adapter.getCimClient (),new CIMObjectPath(parentID));
			return new DhcpPoolObject(fco,adapter);
		}

		if(parentType.equals(Linux_DHCPSharednet.CIM_CLASS_NAME)){
			Linux_DHCPSharednet fco = Linux_DHCPSharednetHelper.getInstance(adapter.getCimClient (),new CIMObjectPath(parentID));
			return new DhcpSharednetObject(fco,adapter);
		}

		if(parentType.equals(Linux_DHCPHost.CIM_CLASS_NAME)){
			Linux_DHCPHost fco = Linux_DHCPHostHelper.getInstance(adapter.getCimClient (),new CIMObjectPath(parentID));
			return new DhcpHostObject(fco,adapter);
		}


		if(parentType.equals(Linux_DHCPGroup.CIM_CLASS_NAME)){
			Linux_DHCPGroup fco = Linux_DHCPGroupHelper.getInstance(adapter.getCimClient (),new CIMObjectPath(parentID));
			return new DhcpGroupObject(fco,adapter);
		}

		return null;
		
	}
	
	private String getClass(String str){
		
	     StringTokenizer st1 = new StringTokenizer(str,":");
	     
	     for(;st1.hasMoreTokens();) {
	    	 String s1 = st1.nextToken();
	         if(s1.equals("WBEM-SMT")) continue;
	         if(s1.substring(0,5).equals("Linux")) return s1;
	     }

	     return "";
	}
	
	private boolean compareIP(String SourceIP, String DestIP){

	     StringTokenizer st1 = new StringTokenizer(SourceIP,".");
	     StringTokenizer st2 = new StringTokenizer(DestIP,".");
	     
	     if(st1.countTokens () != st2.countTokens ())
	    	 return false;
	    	 
	     for(;st1.hasMoreTokens() && st2.hasMoreTokens();) {
	    	 String s1 = st1.nextToken();
	    	 String s2 = st2.nextToken();
	         
	    	 if(Integer.parseInt ( s1 ) >= Integer.parseInt ( s2 )) continue;
	         else return false;
	     }
		
		return true;
	}
	
	private String getIPtoCheckFromNetmask(String netmask , String IP){
		
		if(netmask.equals ( "" ))
			return null;
		
		StringTokenizer str1 = new StringTokenizer(netmask , ".");
		StringTokenizer str2 = new StringTokenizer(IP , ".");
		String s1,s2,s3,s4 = null;
		String d1,d2,d3 = null;
		
		s1 = str1.nextToken ();s2 = str1.nextToken ();s3 = str1.nextToken ();s4 = str1.nextToken ();
		d1 = str2.nextToken ();d2 = str2.nextToken ();d3 = str2.nextToken ();
		
		if(s1.equals ( "255" ) && s2.equals ( "0" ) && s3.equals ( "0" ) && s4.equals ( "0" )) return d1+".255.255.255";
		if(s1.equals ( "255" ) && s2.equals ( "255" ) && s3.equals ( "0" ) && s4.equals ( "0" )) return d1+d2+".255.255";
		if(s1.equals ( "255" ) && s2.equals ( "255" ) && s3.equals ( "255" ) && s4.equals ( "0" )) return d1+d2+d3+".255";
		
		return null;
	}
	
	private static final int VALIDATE_POOL = 1;
//	private static final int VALIDATE_HOST = 2;
//	private static final int VALIDATE_GROUP = 3;
//	private static final int VALIDATE_SUBNET = 4;
//	private static final int VALIDATE_SHAREDNET = 5;

	private int getFlag () {
		return flag;
	}

	public void setFlag ( int flag ) {
		this.flag = flag;
	}

	
}
