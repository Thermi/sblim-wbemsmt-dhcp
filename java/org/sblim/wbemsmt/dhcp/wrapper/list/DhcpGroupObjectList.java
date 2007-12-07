/** 
 * DhcpGroupObjectList.java
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

import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.wrapper.ObjectList;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpGroupObject;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

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

	public void addDhcpGroupObject(DhcpGroupObject obj) {
		put(obj);
	}

	public DhcpGroupObject getDhcpGroupObject(int i) {
		return (DhcpGroupObject) getList().get(i);
	}

	public DhcpGroupObject getDhcpGroupObjectByListName(String listName) {
		return (DhcpGroupObject) getObjectsByName().get(listName);
	}

	protected Object getFco(Object value) {
		DhcpGroupObject obj = (DhcpGroupObject) value;
		return obj.getFco();
	}

	protected Object getKey(Object value) {
		DhcpGroupObject obj = (DhcpGroupObject) value;
		return obj.getFco().get_ElementName();
	}

}
