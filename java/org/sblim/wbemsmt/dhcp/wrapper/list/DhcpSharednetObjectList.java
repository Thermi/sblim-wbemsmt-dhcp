/** 
 * DhcpSharednetObjectList.java
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
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpSharednetObject;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

public class DhcpSharednetObjectList extends ObjectList {

	public DhcpSharednetObject getDhcpSharednetObject(CimObjectKey key) {
		return (DhcpSharednetObject) get(key);
	}

	public DhcpSharednetObject getDhcpSharednetObject(CIMObjectPath path) {
		return getDhcpSharednetObject(new CimObjectKey(path));
	}

	public DhcpSharednetObject getDhcpSharednetObject(CIM_ManagedElement element) {
		return getDhcpSharednetObject(new CimObjectKey(element
				.getCimObjectPath()));
	}

	public void addDhcpSharednetObject(DhcpSharednetObject obj) throws WbemsmtException {
		put(obj);
	}

	public DhcpSharednetObject getDhcpSharednetObject(int i) throws WbemsmtException {
		return (DhcpSharednetObject) getList().get(i);
	}

	public DhcpSharednetObject getDhcpSharednetObjectByListName(String listName) throws WbemsmtException {
		return (DhcpSharednetObject) getObjectsByName().get(listName);
	}

	protected Object getFco(Object value) {
		DhcpSharednetObject obj = (DhcpSharednetObject) value;
		return obj.getFco();
	}

	protected Object getKey(Object value) {
		DhcpSharednetObject obj = (DhcpSharednetObject) value;
		return obj.getFco().get_Name();
	}

}
