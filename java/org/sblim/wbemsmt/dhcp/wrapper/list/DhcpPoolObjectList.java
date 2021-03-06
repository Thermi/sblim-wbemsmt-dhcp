/** 
 * DhcpPoolObjectList.java
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
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpPoolObject;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.schema.cim221.CIM_ManagedElement;

public class DhcpPoolObjectList extends ObjectList {

	public DhcpPoolObject getDhcpPoolObject(CimObjectKey key) {
		return (DhcpPoolObject) get(key);
	}

	public DhcpPoolObject getDhcpPoolObject(CIMObjectPath path) {
		return getDhcpPoolObject(new CimObjectKey(path));
	}

	public DhcpPoolObject getDhcpPoolObject(CIM_ManagedElement element) {
		return getDhcpPoolObject(new CimObjectKey(element
				.getCimObjectPath()));
	}

	public void addDhcpPoolObject(DhcpPoolObject obj) throws WbemsmtException {
		put(obj);
	}

	public DhcpPoolObject getDhcpPoolObject(int i) throws WbemsmtException {
		return (DhcpPoolObject) getList().get(i);
	}

	public DhcpPoolObject getDhcpPoolObjectByListName(String listName) throws WbemsmtException {
		return (DhcpPoolObject) getObjectsByName().get(listName);
	}

	protected Object getFco(Object value) {
		DhcpPoolObject obj = (DhcpPoolObject) value;
		return obj.getFco();
	}

	protected Object getKey(Object value) {
		DhcpPoolObject obj = (DhcpPoolObject) value;
		return obj.getFco().get_Name();
	}

}
