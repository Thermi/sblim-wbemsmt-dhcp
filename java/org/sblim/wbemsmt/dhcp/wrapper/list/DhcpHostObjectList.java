/** 
 * DhcpHostObjectList.java
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
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpHostObject;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

public class DhcpHostObjectList extends ObjectList {

	public DhcpHostObject getDhcpHostObject(CimObjectKey key) {
		return (DhcpHostObject) get(key);
	}

	public DhcpHostObject getDhcpHostObject(CIMObjectPath path) {
		return getDhcpHostObject(new CimObjectKey(path));
	}

	public DhcpHostObject getDhcpHostObject(CIM_ManagedElement element) {
		return getDhcpHostObject(new CimObjectKey(element
				.getCimObjectPath()));
	}

	public void addDhcpHostObject(DhcpHostObject obj) throws WbemsmtException {
		put(obj);
	}

	public DhcpHostObject getDhcpHostObject(int i) throws WbemsmtException {
		return (DhcpHostObject) getList().get(i);
	}

	public DhcpHostObject getDhcpHostObjectByListName(String listName) throws WbemsmtException {
		return (DhcpHostObject) getObjectsByName().get(listName);
	}

	protected Object getFco(Object value) {
		DhcpHostObject obj = (DhcpHostObject) value;
		return obj.getFco();
	}

	protected Object getKey(Object value) {
		DhcpHostObject obj = (DhcpHostObject) value;
		return obj.getFco().get_Name();
	}

}
