/** 
 * DHCPOptionsContainer.java
 *
 * 
 * © Copyright IBM Corp. 2006,2007
 *
 * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author: org.sblim.wbemsmt.dcg.generator.DataContainerGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/containerClass.vm
 *
 * Contributors: 
 *   TODO add author by using vm argument -Ddcg.author=<email> during startup
 * 
 * Description: 
 * 
 * generated Class
 */

package org.sblim.wbemsmt.dhcp.bl.container.edit;

public interface DHCPOptionsContainer extends org.sblim.wbemsmt.bl.adapter.DataContainer {
    /** 
     * Constants for Fields and Roles
     **/
    public static final String FIELD_VALUES = "Values";
    public static final String FIELD_NAME = "Name";

    /** 
     * Defined Fields
     **/

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_DHCPOptions.get_Values<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Values();

    /**
     * <br>
     * DataType STRING<br>
     * UIType TEXTFIELD<br>
     * Relation to FCO: Linux_DHCPOptions.get_Name<br>
     */
    public org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf get_Name();

    /** 
     * Linked DataContainers
     **/

}