/** 
 * DhcpSubnetObjectList.java
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
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpSubnetObject;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

public class DhcpSubnetObjectList extends ObjectList {

	public DhcpSubnetObject getDhcpSubnetObject(CimObjectKey key) {
		return (DhcpSubnetObject) get(key);
	}

	public DhcpSubnetObject getDhcpSubnetObject(CIMObjectPath path) {
		return getDhcpSubnetObject(new CimObjectKey(path));
	}

	public DhcpSubnetObject getDhcpSubnetObject(CIM_ManagedElement element) {
		return getDhcpSubnetObject(new CimObjectKey(element
				.getCimObjectPath()));
	}

	public void addDhcpSubnetObject(DhcpSubnetObject obj) throws WbemsmtException {
		put(obj);
	}

	public DhcpSubnetObject getDhcpSubnetObject(int i) throws WbemsmtException {
		return (DhcpSubnetObject) getList().get(i);
	}

	public DhcpSubnetObject getDhcpSubnetObjectByListName(String listName) throws WbemsmtException {
		return (DhcpSubnetObject) getObjectsByName().get(listName);
	}

	protected Object getFco(Object value) {
		DhcpSubnetObject obj = (DhcpSubnetObject) value;
		return obj.getFco();
	}

	protected Object getKey(Object value) {
		DhcpSubnetObject obj = (DhcpSubnetObject) value;
		return obj.getFco().get_Name();
	}

}
