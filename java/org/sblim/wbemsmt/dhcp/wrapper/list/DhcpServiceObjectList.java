/** 
 * DhcpServiceObjectList.java
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
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpServiceObject;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

public class DhcpServiceObjectList extends ObjectList {

	public DhcpServiceObject getDhcpServiceObject(CimObjectKey key) {
		return (DhcpServiceObject) get(key);
	}

	public DhcpServiceObject getDhcpServiceObject(CIMObjectPath path) {
		return getDhcpServiceObject(new CimObjectKey(path));
	}

	public DhcpServiceObject getDhcpServiceObject(CIM_ManagedElement element) {
		return getDhcpServiceObject(new CimObjectKey(element
				.getCimObjectPath()));
	}

	public void addDhcpServiceObject(DhcpServiceObject obj) throws WbemsmtException {
		put(obj);
	}

	public DhcpServiceObject getDhcpServiceObject(int i) throws WbemsmtException {
		return (DhcpServiceObject) getList().get(i);
	}

	public DhcpServiceObject getDhcpServiceObjectByListName(String listName) throws WbemsmtException {
		return (DhcpServiceObject) getObjectsByName().get(listName);
	}

	protected Object getFco(Object value) {
		DhcpServiceObject obj = (DhcpServiceObject) value;
		return obj.getFco();
	}

	protected Object getKey(Object value) {
		DhcpServiceObject obj = (DhcpServiceObject) value;
		return obj.getFco().get_Name();
	}
}
