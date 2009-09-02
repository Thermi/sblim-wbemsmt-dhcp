/** 
 * DhcpGroupObjectList.java
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


package org.sblim.wbemsmt.dhcp.wrapper.list;

import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.ObjectList;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpGroupObject;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.schema.cim221.CIM_ManagedElement;

public class DhcpGroupObjectList extends ObjectList {

	public DhcpGroupObject getDhcpGroupObject(CimObjectKey key) {
		return (DhcpGroupObject) get(key);
	}

	public DhcpGroupObject getDhcpGroupObject(CIMObjectPath path) {
		return getDhcpGroupObject(new CimObjectKey(path));
	}

	public DhcpGroupObject getDhcpGroupObject(CIM_ManagedElement element) {
		return getDhcpGroupObject(new CimObjectKey(element
				.getCimObjectPath()));
	}

	public void addDhcpGroupObject(DhcpGroupObject obj) throws WbemsmtException {
		put(obj);
	}

	public DhcpGroupObject getDhcpGroupObject(int i) throws WbemsmtException {
		return (DhcpGroupObject) getList().get(i);
	}

	public DhcpGroupObject getDhcpGroupObjectByListName(String listName) throws WbemsmtException {
		return (DhcpGroupObject) getObjectsByName().get(listName);
	}

	protected Object getFco(Object value) {
		DhcpGroupObject obj = (DhcpGroupObject) value;
		return obj.getFco();
	}

	protected Object getKey(Object value) {
		DhcpGroupObject obj = (DhcpGroupObject) value;
		return obj.getFco().get_Name();
	}

}
