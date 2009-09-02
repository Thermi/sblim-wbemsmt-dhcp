/** 
  * DHCPGlobalOptionsListContainer.java
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
  * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
  * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm
  *
  * Contributors: Prashanth Karnam <prkarnam@in.ibm.com>
  * 
  * Description: 
  * 
  * generated Class
  */

package org.sblim.wbemsmt.dhcp.bl.container.edit;

public interface DHCPGlobalOptionsListContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer
{
	/** 
	 * Constants for Fields and Roles
	 **/
				public static final String ROLE_ITEMS = "items";
	
	
	/** 
	 * Defined Fields
	 **/
	
	
	/** 
	 * Linked DataContainers
	 **/
	 
	
			
		/**
		* 
		* linked container DHCPGlobalOptionsListItemContainer
		*/

		public java.util.List<DHCPGlobalOptionsListItemContainer> getItems();

	
}