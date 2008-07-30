/** 
 * DhcpParamsList.java
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
 * Contributors: 
 * 
 * Description: 
 * 
 */



package org.sblim.wbemsmt.dhcp.wrapper.list;


import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.ObjectList;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpParamsObject;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

public class DhcpParamsList extends ObjectList {

	public DhcpParamsObject getDhcpParamsObject(CimObjectKey key) {
		return (DhcpParamsObject)get(key);
	}

	public DhcpParamsObject getDhcpParamsObject(CIMObjectPath path) {
		return getDhcpParamsObject(new CimObjectKey(path));
	}

	public DhcpParamsObject getDhcpParamsObject(CIM_ManagedElement element) {
		return getDhcpParamsObject(new CimObjectKey(element
				.getCimObjectPath()));
	}

	public void addDhcpParamsObject(DhcpParamsObject obj) throws WbemsmtException {
		put(obj);
	}

	public DhcpParamsObject getDhcpParamsObject(int i) throws WbemsmtException {
		return (DhcpParamsObject) getList().get(i);
	}

	public DhcpParamsObject getDhcpParamsObjectByListName(String listName) throws WbemsmtException {
		return (DhcpParamsObject) getObjectsByName().get(listName);
	}

	protected Object getFco(Object value) {
		DhcpParamsObject obj = (DhcpParamsObject) value;
		return obj.getFco();
	}

	protected Object getKey(Object value) {
		DhcpParamsObject obj = (DhcpParamsObject) value;
		return obj.getFco().get_Name();
	}

}
