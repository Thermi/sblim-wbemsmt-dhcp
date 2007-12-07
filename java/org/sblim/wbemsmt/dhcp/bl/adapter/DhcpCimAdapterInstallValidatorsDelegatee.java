/** 
 * DhcpCimAdapterInstallValidatorsDelegatee.java
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


package org.sblim.wbemsmt.dhcp.bl.adapter;

import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGroupsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPHostsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPPoolsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednerOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSharednetsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetParamsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPSubnetsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DhcpServiceConfContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.WelcomeContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewGroupContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostSummaryContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolSummaryContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetSummaryContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetSummaryContainer;
import org.sblim.wbemsmt.dhcp.bl.validator.DhcpValidator;
import org.sblim.wbemsmt.tools.validator.RequiredFieldValidator;

public class DhcpCimAdapterInstallValidatorsDelegatee implements DhcpCimAdapterInstallValidatorsIf {

	private DhcpCimAdapter adapter = null;
	
	public DhcpCimAdapterInstallValidatorsDelegatee ( DhcpCimAdapter adapter ) {
		this.adapter = adapter;
	}

	public void installValidatorsImpl ( DHCPGlobalOptionsContainer container ) {

		DhcpValidator dhcpvalidator = new DhcpValidator(container.get_usr_Broadcastaddress (),adapter);
		DhcpValidator dhcpvalidator1 = new DhcpValidator(container.get_usr_Timeoffset (),adapter); 
		DhcpValidator dhcpvalidator2 = new DhcpValidator(container.get_usr_Defaultipttl (),adapter);
		DhcpValidator dhcpvalidator3 = new DhcpValidator(container.get_usr_Defaulttcpttl (),adapter);
		DhcpValidator dhcpvalidator4 = new DhcpValidator(container.get_usr_Routers (),adapter);
		DhcpValidator dhcpvalidator5 = new DhcpValidator(container.get_usr_Interfacemtu (),adapter);

		dhcpvalidator.setFlags ( DhcpValidator.CHECK_IPFORMAT);
		dhcpvalidator4.setFlags ( DhcpValidator.CHECK_IPFORMAT);
		dhcpvalidator.addChild ( dhcpvalidator4 );
		adapter.addValidator ( container, dhcpvalidator );

		dhcpvalidator1.setFlags ( DhcpValidator.CHECK_NUMBER);
		dhcpvalidator2.setFlags ( DhcpValidator.CHECK_NUMBER);
		dhcpvalidator3.setFlags ( DhcpValidator.CHECK_NUMBER);
		dhcpvalidator5.setFlags ( DhcpValidator.CHECK_NUMBER);
		dhcpvalidator1.addChild ( dhcpvalidator2 );
		dhcpvalidator1.addChild ( dhcpvalidator3 );
		dhcpvalidator1.addChild ( dhcpvalidator5 );
		adapter.addValidator ( container, dhcpvalidator1 );

	}

	public void installValidatorsImpl ( DHCPGlobalParamsContainer container ) {

		DhcpValidator dhcpvalidator = new DhcpValidator(container.get_usr_Range (),adapter);
		DhcpValidator dhcpvalidator1 = new DhcpValidator(container.get_usr_Maxleasetime (),adapter);
		DhcpValidator dhcpvalidator2 = new DhcpValidator(container.get_usr_Leaselimit (),adapter);
		DhcpValidator dhcpvalidator3 = new DhcpValidator(container.get_usr_Dynamicbootpleaselength (),adapter);
		DhcpValidator dhcpvalidator4 = new DhcpValidator(container.get_usr_Bootunknownclients (),adapter);
		DhcpValidator dhcpvalidator5 = new DhcpValidator(container.get_usr_Ddnsupdatestyle (),adapter);
		DhcpValidator dhcpvalidator6 = new DhcpValidator(container.get_usr_Hardware (),adapter);
		

		dhcpvalidator.setFlags ( DhcpValidator.CHECK_RANGE_PARAM);
		adapter.addValidator ( container, dhcpvalidator );

		dhcpvalidator1.setFlags ( DhcpValidator.CHECK_NUMBER);
		dhcpvalidator2.setFlags ( DhcpValidator.CHECK_NUMBER);
		dhcpvalidator3.setFlags ( DhcpValidator.CHECK_NUMBER);
		dhcpvalidator1.addChild ( dhcpvalidator2 );
		dhcpvalidator1.addChild ( dhcpvalidator3 );
		adapter.addValidator ( container, dhcpvalidator1 );
		
		dhcpvalidator4.setFlags ( DhcpValidator.CHECK_ON_OFF);
		adapter.addValidator ( container, dhcpvalidator4 );

		dhcpvalidator5.setFlags ( DhcpValidator.CHECK_DDNS_UPDATE_STYLE);
		adapter.addValidator ( container, dhcpvalidator5 );

		dhcpvalidator6.setFlags ( DhcpValidator.CHECK_HARDWARE);
		adapter.addValidator ( container, dhcpvalidator6 );

	}

	public void installValidatorsImpl ( DHCPGroupOptionsContainer container ) {

		DhcpValidator dhcpvalidator = new DhcpValidator(container.get_usr_Routers (),adapter);
		dhcpvalidator.setFlags ( DhcpValidator.CHECK_IPFORMAT );
		adapter.addValidator ( container, dhcpvalidator );

	}

	public void installValidatorsImpl ( DHCPGroupParamsContainer container ) {

		DhcpValidator dhcpvalidator = new DhcpValidator(container.get_usr_Defaultleasetime (),adapter);
		DhcpValidator dhcpvalidator1 = new DhcpValidator(container.get_usr_Maxleasetime (),adapter); 
		dhcpvalidator.setFlags ( DhcpValidator.CHECK_NUMBER);
		dhcpvalidator1.setFlags ( DhcpValidator.CHECK_NUMBER);
		dhcpvalidator.addChild ( dhcpvalidator1 );
		adapter.addValidator ( container, dhcpvalidator );

	}

	public void installValidatorsImpl ( DHCPGroupsContainer container ) {
		// TODO Auto-generated method stub

	}

	public void installValidatorsImpl ( DHCPHostOptionsContainer container ) {

	}

	public void installValidatorsImpl ( DHCPHostParamsContainer container ) {
		DhcpValidator dhcpvalidator = new DhcpValidator(container.get_usr_Fixedaddress (),adapter);
		dhcpvalidator.setFlags ( DhcpValidator.CHECK_IPFORMAT );
		adapter.addValidator ( container, dhcpvalidator );

		DhcpValidator dhcpvalidator1 = new DhcpValidator(container.get_usr_Range (),adapter);
		dhcpvalidator1.setFlags ( DhcpValidator.CHECK_RANGE_PARAM );
		adapter.addValidator ( container, dhcpvalidator1 );
		
		DhcpValidator dhcpvalidator2 = new DhcpValidator(container.get_usr_Hardware (),adapter);
		dhcpvalidator2.setFlags ( DhcpValidator.CHECK_HARDWARE );
		adapter.addValidator ( container, dhcpvalidator2 );

	}

	public void installValidatorsImpl ( DHCPHostsContainer container ) {
//		RequiredFieldValidator reqField = new RequiredFieldValidator(container.get_Name (),adapter);
//		reqField.addChild ( new DhcpValidator(container.get_Name (),adapter) );
		adapter.addValidator ( container, new RequiredFieldValidator(container.get_Name (),adapter) );
//		adapter.addValidator ( container, new RequiredFieldValidator(container.get_MACAddr (),adapter) );
//		adapter.addValidator ( container, new RequiredFieldValidator(container.get_IPAddr (),adapter) );
		DhcpValidator dhcpvalidator = new DhcpValidator(container.get_IPAddr (),adapter);
		dhcpvalidator.setFlags ( DhcpValidator.CHECK_IPFORMAT );
		adapter.addValidator ( container, dhcpvalidator );
	}

	public void installValidatorsImpl ( DHCPOptionsContainer container ) {
		// TODO Auto-generated method stub

	}

	public void installValidatorsImpl ( DHCPParamsContainer container ) {
		// TODO Auto-generated method stub

	}

	public void installValidatorsImpl ( DHCPPoolOptionsContainer container ) {

	}

	public void installValidatorsImpl ( DHCPPoolParamsContainer container ) {

		DhcpValidator dhcpvalidator = new DhcpValidator(container.get_usr_Maxleasetime (),adapter);
		dhcpvalidator.setFlags ( DhcpValidator.CHECK_NUMBER);
		adapter.addValidator ( container, dhcpvalidator );

		DhcpValidator dhcpvalidator1 = new DhcpValidator(container.get_usr_Range (),adapter);
		dhcpvalidator1.setFlags ( DhcpValidator.CHECK_RANGE_PARAM );
		adapter.addValidator ( container, dhcpvalidator1 );

	}

	public void installValidatorsImpl ( DHCPPoolsContainer container ) {

	}

	public void installValidatorsImpl ( DHCPSharednerOptionsContainer container ) {

	}

	public void installValidatorsImpl ( DHCPSharednetParamsContainer container ) {

		DhcpValidator dhcpvalidator = new DhcpValidator(container.get_usr_Maxleasetime (),adapter);
		dhcpvalidator.setFlags ( DhcpValidator.CHECK_NUMBER);
		adapter.addValidator ( container, dhcpvalidator );
	}

	public void installValidatorsImpl ( DHCPSharednetsContainer container ) {
		adapter.addValidator ( container, new RequiredFieldValidator(container.get_Name (),adapter) );
	}

	public void installValidatorsImpl ( DHCPSubnetOptionsContainer container ) {

		DhcpValidator dhcpvalidator = new DhcpValidator(container.get_usr_Broadcastaddress (),adapter);
		DhcpValidator dhcpvalidator1 = new DhcpValidator(container.get_usr_Routers (),adapter);
		DhcpValidator dhcpvalidator2 = new DhcpValidator(container.get_usr_Subnetmask (),adapter);
		
		dhcpvalidator.setFlags ( DhcpValidator.CHECK_IPFORMAT );
		dhcpvalidator1.setFlags ( DhcpValidator.CHECK_IPFORMAT );
		dhcpvalidator2.setFlags ( DhcpValidator.CHECK_IPFORMAT );
		
		dhcpvalidator.addChild ( dhcpvalidator1 );
		dhcpvalidator.addChild ( dhcpvalidator2 );

		adapter.addValidator ( container, dhcpvalidator );

	}

	public void installValidatorsImpl ( DHCPSubnetParamsContainer container ) {

		DhcpValidator dhcpvalidator = new DhcpValidator(container.get_usr_Defaultleasetime (),adapter);
		DhcpValidator dhcpvalidator1 = new DhcpValidator(container.get_usr_Maxleasetime (),adapter);
		DhcpValidator dhcpvalidator2 = new DhcpValidator(container.get_usr_Range (),adapter);
		
		dhcpvalidator.setFlags ( DhcpValidator.CHECK_NUMBER);
		dhcpvalidator1.setFlags ( DhcpValidator.CHECK_NUMBER);
		dhcpvalidator.addChild ( dhcpvalidator1 );

		adapter.addValidator ( container, dhcpvalidator );
		
		
		dhcpvalidator2.setFlags ( DhcpValidator.CHECK_RANGE_PARAM );
		adapter.addValidator ( container, dhcpvalidator2 );

	}

	public void installValidatorsImpl ( DHCPSubnetsContainer container ) {

		adapter.addValidator ( container, new RequiredFieldValidator(container.get_Name (),adapter) );
		adapter.addValidator ( container, new RequiredFieldValidator(container.get_Netmask (),adapter) );
		
		DhcpValidator dhcpvalidator = new DhcpValidator(container.get_Name(),adapter);
		DhcpValidator dhcpvalidator1 = new DhcpValidator(container.get_Netmask (),adapter);
		dhcpvalidator.setFlags ( DhcpValidator.CHECK_IPFORMAT);
		dhcpvalidator.addChild ( dhcpvalidator1 );
		adapter.addValidator ( container, dhcpvalidator );
		
	}

	public void installValidatorsImpl ( DhcpServiceConfContainer container ) {
//		adapter.addValidator ( container, new RequiredFieldValidator(container.get_ConfigurationFile (),adapter) );
	}

	public void installValidatorsImpl ( NewGroupContainer container ) {

	}

	public void installValidatorsImpl ( NewHostContainer container ) {
		
//		adapter.addValidator ( container, new RequiredFieldValidator(container.get_MACAddr (),adapter) );
		adapter.addValidator ( container, new RequiredFieldValidator(container.get_Name (),adapter) );
	
		DhcpValidator dhcpvalidator = new DhcpValidator(container.get_MACAddr (),adapter);
		dhcpvalidator.setFlags ( DhcpValidator.CHECK_MACFORMAT);
		adapter.addValidator ( container, dhcpvalidator );
		
		DhcpValidator dhcpvalidator1 = new DhcpValidator(container.get_IPAddr (),adapter);
		dhcpvalidator1.setFlags ( DhcpValidator.CHECK_IPFORMAT);
		adapter.addValidator ( container, dhcpvalidator1 );
		
	}

	public void installValidatorsImpl ( NewHostSummaryContainer container ) {
		// TODO Auto-generated method stub

	}

	public void installValidatorsImpl ( NewPoolContainer container ) {
		
		adapter.addValidator ( container, new RequiredFieldValidator(container.get_usr_Range (),adapter) );
		adapter.addValidator ( container, new RequiredFieldValidator(container.get_Name (),adapter) );

		DhcpValidator dhcpvalidator = new DhcpValidator(container.get_usr_Range (),adapter);
		dhcpvalidator.setFlags ( DhcpValidator.CHECK_RANGE_PARAM);
		adapter.addValidator ( container, dhcpvalidator );
		
	}

	public void installValidatorsImpl ( NewPoolSummaryContainer container ) {
		// TODO Auto-generated method stub

	}

	public void installValidatorsImpl ( NewSharednetContainer container ) {
		adapter.addValidator ( container, new RequiredFieldValidator(container.get_Name (),adapter) );
	}

	public void installValidatorsImpl ( NewSharednetSummaryContainer container ) {
		// TODO Auto-generated method stub

	}

	public void installValidatorsImpl ( NewSubnetContainer container ) {
		adapter.addValidator ( container, new RequiredFieldValidator(container.get_Name (),adapter) );
		
		DhcpValidator dhcpvalidator = new DhcpValidator(container.get_Name(),adapter);
		dhcpvalidator.setFlags ( DhcpValidator.CHECK_IPFORMAT);
		adapter.addValidator ( container, dhcpvalidator );

	}

	public void installValidatorsImpl ( NewSubnetSummaryContainer container ) {
		// TODO Auto-generated method stub

	}

	public void installValidatorsImpl ( WelcomeContainer container ) {

	}

}
