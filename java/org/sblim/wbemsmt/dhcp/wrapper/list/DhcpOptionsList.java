/** 
 * DhcpOptionsList.java
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
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpOptionsObject;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

public class DhcpOptionsList extends ObjectList {

	public DhcpOptionsObject getDhcpOptionsObject(CimObjectKey key) {
		return (DhcpOptionsObject)get(key);
	}

	public DhcpOptionsObject getDhcpOptionsObject(CIMObjectPath path) {
		return getDhcpOptionsObject(new CimObjectKey(path));
	}

	public DhcpOptionsObject getDhcpOptionsObject(CIM_ManagedElement element) {
		return getDhcpOptionsObject(new CimObjectKey(element
				.getCimObjectPath()));
	}

	public void addDhcpOptionsObject(DhcpOptionsObject obj) throws WbemsmtException {
		put(obj);
	}

	public DhcpOptionsObject getDhcpOptionsObject(int i) throws WbemsmtException {
		return (DhcpOptionsObject) getList().get(i);
	}

	public DhcpOptionsObject getDhcpOptionsObjectByListName(String listName) throws WbemsmtException {
		return (DhcpOptionsObject) getObjectsByName().get(listName);
	}

	protected Object getFco(Object value) {
		DhcpOptionsObject obj = (DhcpOptionsObject) value;
		return obj.getFco();
	}

	protected Object getKey(Object value) {
		DhcpOptionsObject obj = (DhcpOptionsObject) value;
		return obj.getFco().get_Name();
	}

}
