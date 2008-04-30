/** 
 * DhcpCimAdapter.java
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

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.logging.Logger;

import org.sblim.wbem.cim.CIMClass;
import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.indications.CIMListener;
import org.sblim.wbemsmt.bl.MessageNumber;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.CountDelegatee;
import org.sblim.wbemsmt.bl.adapter.CreateDelegatee;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DeleteDelegatee;
import org.sblim.wbemsmt.bl.adapter.InitContainerDelegatee;
import org.sblim.wbemsmt.bl.adapter.InitWizardDelegatee;
import org.sblim.wbemsmt.bl.adapter.InstallValidatorsDelegatee;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.adapter.MessageInputHandler;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.bl.adapter.MessageUtil;
import org.sblim.wbemsmt.bl.adapter.RevertDelegatee;
import org.sblim.wbemsmt.bl.adapter.SaveDelegatee;
import org.sblim.wbemsmt.bl.adapter.SelectionHierarchy;
import org.sblim.wbemsmt.bl.adapter.UpdateControlsDelegatee;
import org.sblim.wbemsmt.bl.adapter.UpdateModelDelegatee;
import org.sblim.wbemsmt.bl.fco.FcoHelperIf;
import org.sblim.wbemsmt.bl.tree.ICIMInstanceNode;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.dhcp.bl.DhcpErrorCodes;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsListContainer;
import org.sblim.wbemsmt.dhcp.bl.container.edit.DHCPGlobalOptionsListItemContainer;
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
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPEntity;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGlobal;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPGroup;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPHost;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPOptions;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPParams;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPPool;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPRegisteredProfileHelper;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPService;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPServiceConfiguration;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSharednet;
import org.sblim.wbemsmt.dhcp.bl.fco.Linux_DHCPSubnet;
import org.sblim.wbemsmt.dhcp.indications.DHCPChangeIndicationListener;
import org.sblim.wbemsmt.dhcp.indications.DHCPCustomEventForIndication;
import org.sblim.wbemsmt.dhcp.wizard.NewGroupWizardContainer;
import org.sblim.wbemsmt.dhcp.wizard.NewHostWizardContainer;
import org.sblim.wbemsmt.dhcp.wizard.NewPoolWizardContainer;
import org.sblim.wbemsmt.dhcp.wizard.NewSharednetWizardContainer;
import org.sblim.wbemsmt.dhcp.wizard.NewSubnetWizardContainer;
import org.sblim.wbemsmt.dhcp.wizard.WizardContainer1;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpOptionsList;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpParamsList;
import org.sblim.wbemsmt.dhcp.wrapper.list.DhcpServiceObjectList;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpEntityObject;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpGroupObject;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpHostObject;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpOptionsObject;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpParamsObject;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpPoolObject;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpServiceConfigurationObject;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpServiceObject;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpSharednetObject;
import org.sblim.wbemsmt.dhcp.wrapper.object.DhcpSubnetObject;
import org.sblim.wbemsmt.dhcp.wrapper.wizard.NewGroupWizard;
import org.sblim.wbemsmt.dhcp.wrapper.wizard.NewHostWizard;
import org.sblim.wbemsmt.dhcp.wrapper.wizard.NewPoolWizard;
import org.sblim.wbemsmt.dhcp.wrapper.wizard.NewSharednetWizard;
import org.sblim.wbemsmt.dhcp.wrapper.wizard.NewSubnetWizard;
import org.sblim.wbemsmt.exception.CountException;
import org.sblim.wbemsmt.exception.IndicationPreparationException;
import org.sblim.wbemsmt.exception.InitContainerException;
import org.sblim.wbemsmt.exception.InitWizardException;
import org.sblim.wbemsmt.exception.LoginException;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ModelUpdateException;
import org.sblim.wbemsmt.exception.ObjectCreationException;
import org.sblim.wbemsmt.exception.ObjectDeletionException;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;
import org.sblim.wbemsmt.exception.ObjectRevertException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.schema.cim29.CIM_Collection;
import org.sblim.wbemsmt.schema.cim29.CIM_IndicationFilter;
import org.sblim.wbemsmt.schema.cim29.CIM_IndicationFilterHelper;
import org.sblim.wbemsmt.schema.cim29.CIM_IndicationSubscription;
import org.sblim.wbemsmt.schema.cim29.CIM_IndicationSubscriptionHelper;
import org.sblim.wbemsmt.schema.cim29.CIM_ListenerDestination;
import org.sblim.wbemsmt.schema.cim29.CIM_ListenerDestinationCIMXML;
import org.sblim.wbemsmt.schema.cim29.CIM_ListenerDestinationHelper;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;
import org.sblim.wbemsmt.schema.cim29.CIM_RegisteredProfile;
import org.sblim.wbemsmt.schema.cim29.tools.FcoHelper;
import org.sblim.wbemsmt.session.WbemsmtSession;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.cim.indication.*;

import sun.security.action.GetLongAction;

public class DhcpCimAdapter extends AbstractBaseCimAdapter{

	private static final String[] BUNDLES = { "messages", "messagesDhcp" };

	private static Set booleanOps = new HashSet();
	
	private static boolean DummyMode = false;
	
	Logger logger = Logger.getLogger ( this.getClass ().getName () );

	DhcpSelectionHeirarchy selectionHierarchy = null;

	private CountDelegatee countDelegatee;

	private CreateDelegatee createDelegatee;

	private DeleteDelegatee deleteDelegatee;

	private InitContainerDelegatee initContainerDelegatee;

	private InitWizardDelegatee initWizardDelegatee;

	private InstallValidatorsDelegatee installValidatorsDelegatee;

	private RevertDelegatee revertDelegatee;

	private SaveDelegatee saveDelegatee;

	private UpdateControlsDelegatee updateControlsDelegatee;

	private UpdateModelDelegatee updateModelDelegatee;

	private DhcpServiceObject DhcpServiceObj;

	private DhcpServiceConfigurationObject DhcpServiceConfigurationObj;

	private DhcpServiceObjectList dhcpserviceobjlist = null;

	private DhcpOptionsList dhcpglobalopslist = null;
	
	private DhcpParamsList dhcpglobalparamslist = null;
	
	private DhcpEntityObject DhcpEntityObj = null;
	private DhcpHostObject DhcpHostObj = null;
	private DhcpPoolObject DhcpPoolObj = null;
	private DhcpSubnetObject DhcpSubnetObj = null;
	private DhcpSharednetObject DhcpSharednetObj = null;
	private DhcpGroupObject DhcpGroupObj = null;
	
	private NewHostWizard newhostwizard = null;
	private NewPoolWizard newpoolwizard = null;
	private NewGroupWizard newgroupwizard = null;
	private NewSubnetWizard newsubnetwizard = null;
	private NewSharednetWizard newsharednetwizard = null;
	
	private Linux_DHCPEntity selectedEntity = null;
	
	private CIMClient slpNamespaceCimClient = null;
	private CIM_ListenerDestinationCIMXML dest = null;
	
	private boolean indcOccurred = false;
	private boolean subscribed = false;
	IndicationDestination indcDest = null;
	private int indcPort = 0;
	
	public static class DhcpSelectionHeirarchy extends SelectionHierarchy {

		private final DhcpCimAdapter adapter;

		public DhcpSelectionHeirarchy ( DhcpCimAdapter adapter ) {
			this.adapter = adapter;
		}

		public void addService ( DhcpServiceObject obj ) {
			clear ();
			adapter.setDhcpServiceConfigurationObj ( null );
			adapter.setDhcpglobalopslist ( null );
			adapter.setDhcpglobalparamslist ( null );
			adapter.setDhcpEntityObj ( null );
			adapter.setDhcpGroupObj ( null );
			adapter.setDhcpPoolObj ( null );
			adapter.setDhcpHostObj ( null );
			adapter.setDhcpSubnetObj ( null );
			adapter.setDhcpSharednetObj ( null );
			push ( obj.getFco () );
		}

		public void addServiceConfiguration ( DhcpServiceConfigurationObject obj ) {
//			cleanup ( 1 );
			adapter.setDhcpServiceConfigurationObj ( obj );
			push ( obj.getFco () );
		}

		public void addGlobalOptionsList ( DhcpOptionsList obj ) {
//			cleanup ( 1 );
			adapter.setDhcpglobalopslist ( obj );
//			push ( obj.getFCOs () );
		}

		public void addGlobalParamsList ( DhcpParamsList obj ) {
//			cleanup ( 1 );
			adapter.setDhcpglobalparamslist ( obj );
//			push ( obj.getFCOs () );
		}

		public void addEntity(DhcpEntityObject obj){
			cleanup(1);
			adapter.setDhcpEntityObj ( obj );
			push(obj.getFco());
		}

		public void addHost(DhcpHostObject obj){
			cleanup(1);
			adapter.setDhcpHostObj ( obj );
			push(obj.getFco());
		}

		public void addPool(DhcpPoolObject obj){
			cleanup(1);
			adapter.setDhcpPoolObj ( obj );
			push(obj.getFco());
		}

		public void addGroup(DhcpGroupObject obj){
			cleanup(1);
			adapter.setDhcpGroupObj ( obj );
			push(obj.getFco());
		}

		public void addSubnet(DhcpSubnetObject obj){
			cleanup(1);
			adapter.setDhcpSubnetObj ( obj );
			push(obj.getFco());
		}

		public void addSharednet(DhcpSharednetObject obj){
			cleanup(1);
			adapter.setDhcpSharednetObj ( obj );
			push(obj.getFco());
		}
		
		private void cleanup ( int currentLevel ) {
			while (size () > currentLevel) {
				pop ();
			}
		}

	}

	public DhcpCimAdapter () {
		super ();
	}

	public DhcpCimAdapter ( Locale locale ) {
		super ( locale );
		selectionHierarchy = new DhcpSelectionHeirarchy ( this );
		init ( ResourceBundleManager.getResourceBundle ( BUNDLES, locale ), selectionHierarchy, new FcoHelper () );

		updateControlsDelegatee = new DhcpCimAdapterUpdateControlsDelegatee ( this );
		saveDelegatee = new DhcpCimAdapterSaveDelegatee ( this );
		deleteDelegatee = new DhcpCimAdpaterDeleteDelegatee ( this);
		createDelegatee = new DhcpCimAdapterCreateDelegatee ( this );
		installValidatorsDelegatee = new DhcpCimAdapterInstallValidatorsDelegatee( this);
		initWizardDelegatee = new DhcpCimAdapterInitWizardDelegatee ( this);
		initContainerDelegatee = new DhcpCimAdapterInitContainerDelegatee (this);
		updateModelDelegatee = new DhcpCimAdapterUpdateModelDelegatee(this);
		countDelegatee = new DhcpCimAdpaterCountDelegatee (this);
		revertDelegatee = new DhcpCimAdapterRevertDelegatee (this);
		
		booleanOps.add("ip-forwarding");
		booleanOps.add("non-local-source-routing");
		booleanOps.add("trailer-encapsulation");
		booleanOps.add("get-lease-hostnames");
		booleanOps.add("use-host-decl-names");
		
		newhostwizard = new NewHostWizard(this);
		newpoolwizard = new NewPoolWizard(this);
		newgroupwizard = new NewGroupWizard(this);
		newsubnetwizard = new NewSubnetWizard(this);
		newsharednetwizard = new NewSharednetWizard(this);

		DHCPChangeIndicationListener indcListener = new DHCPChangeIndicationListener(this);
//		IndicationDestination indcDest =  null;

		
		IndicationDestinationManager indcmanager = IndicationDestinationManager.getCurrent ();
		try {
			indcDest = indcmanager.getIndicationDestination ( "preset1" );
			HttpServerConnectionManager.getInstance ().addListener ( indcListener,  indcDest.getPort ());
			indcPort = indcDest.getPort ();
		} catch (IndicationPreparationException e) {
			e.printStackTrace();
		} catch (IOException e) {
			try {
				throw new WbemSmtException("Cannot add CIMListener",e);
			} catch (WbemSmtException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

	public String[] getResourceBundleNames () {
		return BUNDLES;
	}

	public void load ( CIMClient cimClient ) throws ModelLoadException {
		
			if (loaded == true)
				return;
			this.cimClient = rootNode.getCimClient ();

			this.dhcpserviceobjlist = new DhcpServiceObjectList ();

			setDhcpServiceObj ( getDhcpServiceObj () );
			dhcpserviceobjlist.addDhcpServiceObject ( getDhcpServiceObj () );
		

			getDhcpServiceObj ().setServiceconf ( getDhcpServiceConfigurationObj () );
			setDhcpServiceConfigurationObj ( getDhcpServiceConfigurationObj () );

			setDhcpglobalopslist ( getDhcpglobalopslist () );
				
			setDhcpglobalparamslist ( getDhcpglobalparamslist () );
				
			setDhcpEntityObj ( getDhcpEntityObj () );
		
	}

	public void load ( ITaskLauncherTreeNode rootNode ) throws ModelLoadException {
		if (loaded == true)
			return;
		this.cimClient = rootNode.getCimClient ();

		this.rootNode = rootNode;

		this.dhcpserviceobjlist = new DhcpServiceObjectList ();

		// Subscribe for Indications

		CIM_ListenerDestinationCIMXML ourDest;
		
//		IndicationDestinationManager indcmanager = IndicationDestinationManager.getCurrent ();

		try {
//			IndicationDestination indcDest = indcmanager.getIndicationDestination ( "preset1" );
			ourDest = getDestination ( this.getFcoHelper (), getCimClient(), null, indcDest );
			createSubscriptions ( ourDest);
			setSubscribed ( true );
		} catch (WbemSmtException e) {
			e.printStackTrace();
		}
		
		// ----

			setDhcpServiceObj ( getDhcpServiceObj () );
			dhcpserviceobjlist.addDhcpServiceObject ( getDhcpServiceObj () );
		

			getDhcpServiceObj ().setServiceconf ( getDhcpServiceConfigurationObj () );
			setDhcpServiceConfigurationObj ( getDhcpServiceConfigurationObj () );

			setDhcpglobalopslist ( getDhcpglobalopslist () );
				
			setDhcpglobalparamslist ( getDhcpglobalparamslist () );
				
			setDhcpEntityObj ( getDhcpEntityObj () );

	}

//	private CIM_RegisteredProfile getRegProfile () {
//		
//		CIM_RegisteredProfile regProfile = null;
//		
//		List regProfilesList = Linux_DHCPRegisteredProfileHelper.enumerateInstances(getCimClientForInteropNamespace (),true); 
//			
////			getDhcpServiceObj ().getFco ().getAssociated_CIM_RegisteredProfile_CIM_ElementConformsToProfiles ( cimClient, true, true, null);
//
//		if (regProfilesList.isEmpty ())
//			try {
//				throw new WbemSmtException("No Registered Profile found for the Service.");
//			} catch (WbemSmtException e) {
//				e.printStackTrace();
//			}
//		
//		for (Iterator iterator2 = regProfilesList.iterator(); iterator2.hasNext();)
//			regProfile = (CIM_RegisteredProfile) iterator2.next();
//		
//		return regProfile;
//	}

	public void loadInitial ( CIMClient cimClient ) throws ModelLoadException {
		// TODO Auto-generated method stub

	}

	public void reLoad ( CIMClient cimClient ) throws ModelLoadException {
		// TODO Auto-generated method stub

	}

	public void reLoad ( ITaskLauncherTreeNode rootNode ) throws ModelLoadException {
		loaded = false;
		load ( rootNode );

	}


	public CountDelegatee getCountDelegatee () {
		return countDelegatee;
	}

	public CreateDelegatee getCreateDelegatee () {
		return createDelegatee;
	}

	public DeleteDelegatee getDeleteDelegatee () {
		return deleteDelegatee;
	}

	public InitContainerDelegatee getInitContainerDelegatee () {
		return initContainerDelegatee;
	}

	public InitWizardDelegatee getInitWizardDelegatee () {
		return initWizardDelegatee;
	}

	public InstallValidatorsDelegatee getInstallValidatorsDelegatee () {
		return installValidatorsDelegatee;
	}

	public RevertDelegatee getRevertDelegatee () {
		return revertDelegatee;
	}

	public SaveDelegatee getSaveDelegatee () {
		return saveDelegatee;
	}

	public UpdateControlsDelegatee getUpdateControlsDelegatee () {
		return updateControlsDelegatee;
	}

	public UpdateModelDelegatee getUpdateModelDelegatee () {
		return updateModelDelegatee;
	}

	/**
	 * @return the dhcpServiceObj
	 */
	public DhcpServiceObject getDhcpServiceObj (){

		try{
		if(DhcpServiceObj == null){
			List listWithServiceNodes = rootNode.findInstanceNodes ( Linux_DHCPService.CIM_CLASS_NAME );
			for (Iterator iterServiceNodes = listWithServiceNodes.iterator (); iterServiceNodes.hasNext ();) {
				ICIMInstanceNode serviceNode = (ICIMInstanceNode) iterServiceNodes.next ();

				// set the service object
				Linux_DHCPService aFco = new Linux_DHCPService ( serviceNode.getCimInstance ().getObjectPath (),
						serviceNode.getCimInstance () );

				DhcpServiceObject dhcpServiceObject = new DhcpServiceObject ( aFco, this );

				setDhcpServiceObj ( dhcpServiceObject);
		}
		}	
		} catch (WbemSmtException e) {
			try {
				throw new ModelLoadException ( e );
			} catch (ModelLoadException e1) {
				e1.printStackTrace();
			}
		}

		return DhcpServiceObj;
	}

	/**
	 * @param dhcpServiceObj
	 *            the dhcpServiceObj to set
	 */
	public void setDhcpServiceObj ( DhcpServiceObject dhcpServiceObj ) {
		DhcpServiceObj = dhcpServiceObj;
	}

	/**
	 * @return the dhcpServiceConfigurationObj
	 */
	public DhcpServiceConfigurationObject getDhcpServiceConfigurationObj (){

		DhcpServiceConfigurationObject serviceconfobj = null;
		
		if(DhcpServiceConfigurationObj == null){
				ArrayList serviceconfArrayList = getDhcpServiceObj ().getFco ()
				.getAssociated_Linux_DHCPServiceConfiguration_Linux_DHCPServiceConfigurationForServices (
						cimClient, false, false, null );
	
		for (Iterator iter = serviceconfArrayList.iterator (); iter.hasNext ();) {
			Linux_DHCPServiceConfiguration settingFco = (Linux_DHCPServiceConfiguration) iter.next ();
			serviceconfobj = new DhcpServiceConfigurationObject ( settingFco, this );
		}

		setDhcpServiceConfigurationObj ( serviceconfobj);
		}

		return DhcpServiceConfigurationObj;
	}

	/**
	 * @param dhcpServiceConfigurationObj
	 *            the dhcpServiceConfigurationObj to set
	 */
	public void setDhcpServiceConfigurationObj ( DhcpServiceConfigurationObject dhcpServiceConfigurationObj ) {
		DhcpServiceConfigurationObj = dhcpServiceConfigurationObj;
	}

	public CimObjectKey getKeyByTreeNode ( ITaskLauncherTreeNode treeNode ) throws ObjectNotFoundException {

		List nodes = new ArrayList();
		ITaskLauncherTreeNode Node = treeNode;
		
		while(Node instanceof ICIMInstanceNode){
			nodes.add ( Node );
			Node = Node.getParent ();
		}
	
		CimObjectKey key = null;
		
		for(int i=nodes.size ()-1;i>=0;i--){
			CimObjectKey child = new CimObjectKey((ICIMInstanceNode)nodes.get ( i ));
			if(key != null){
				key.setNextKey ( child );
			}
			key = child;
		}
		
		if (treeNode.getName ().equals ( "Childs")){
			key = new CimObjectKey(new CIMObjectPath("Childs"));
		}
		
		if (treeNode.getName ().equals ( "Subnets" )) {
			key = new CimObjectKey ( new CIMObjectPath ( "Subnets" ) );
		}
		if (treeNode.getName ().equals ( "Sharednets" )) {
			key = new CimObjectKey ( new CIMObjectPath ( "Sharednets" ) );
		}
		if (treeNode.getName ().equals ( "Pools" )) {
			key = new CimObjectKey ( new CIMObjectPath ( "Pools" ) );
		}
		if (treeNode.getName ().equals ( "Hosts" )) {
			key = new CimObjectKey ( new CIMObjectPath ( "Hosts" ) );
		}
		if (treeNode.getName ().equals ( "Groups" )) {
			key = new CimObjectKey ( new CIMObjectPath ( "Groups" ) );
		}

		if(treeNode.getParent () instanceof ICIMInstanceNode)
			key.setNextKey ( new CimObjectKey((ICIMInstanceNode) treeNode.getParent ()));
		else
			if(!treeNode.getParent ().getName ().equals("treedhcp"))
				key.setNextKey ( new CimObjectKey ( new CIMObjectPath ( treeNode.getParent ().getName () ) ) );
	
		return key; 
	}

	public void selectByKey ( CimObjectKey key ) throws ObjectNotFoundException {
	
		String fconame = key.getObjectPath ().getObjectName ();

		if(fconame.equals (Linux_DHCPHost.CIM_CLASS_NAME)){
			Linux_DHCPHost fco = new Linux_DHCPHost(key.getObjectPath (), getCimClient ().getInstance ( key.getObjectPath () ));
			selectionHierarchy.addHost ( new DhcpHostObject(fco,this) );
			setSelectedEntity ( fco );
		}
		else if(fconame.equals (Linux_DHCPGroup.CIM_CLASS_NAME)){
			Linux_DHCPGroup fco = new Linux_DHCPGroup(key.getObjectPath (), getCimClient ().getInstance ( key.getObjectPath () ));
			selectionHierarchy.addGroup ( new DhcpGroupObject(fco,this) );
			setSelectedEntity ( fco );
		}
		else if(fconame.equals (Linux_DHCPSubnet.CIM_CLASS_NAME)){
			Linux_DHCPSubnet fco = new Linux_DHCPSubnet(key.getObjectPath (), getCimClient ().getInstance ( key.getObjectPath () ));
			selectionHierarchy.addSubnet ( new DhcpSubnetObject(fco,this) );
			setSelectedEntity ( fco );
		}
		else if(fconame.equals (Linux_DHCPSharednet.CIM_CLASS_NAME)){
			Linux_DHCPSharednet fco = new Linux_DHCPSharednet(key.getObjectPath (), getCimClient ().getInstance ( key.getObjectPath () ));
			selectionHierarchy.addSharednet ( new DhcpSharednetObject(fco,this) );
			setSelectedEntity ( fco );
		}
		else if(fconame.equals (Linux_DHCPPool.CIM_CLASS_NAME)){
			Linux_DHCPPool fco = new Linux_DHCPPool(key.getObjectPath (), getCimClient ().getInstance ( key.getObjectPath () ));
			selectionHierarchy.addPool ( new DhcpPoolObject(fco,this) );
			setSelectedEntity ( fco );
		}
		else if(fconame.equals ("Childs")){
			setSelectedEntity(getDhcpEntityObj ().getFco ());
		}
		else if(fconame.equals ( "Subnets" ) || fconame.equals ( "Sharednets" ) || fconame.equals ( "Pools" ) || fconame.equals ( "Groups" ) || fconame.equals ( "Hosts" ))
			selectByKey ( key.getNextKey () );
		else
		{
			throw new ObjectNotFoundException("Cannot select with key " + key.toString());
		}
	}
	
	public boolean select_0_Linux_DHCPService ( CimObjectKey key ) {

		DhcpServiceConfigurationObject serviceconfobj = null;
		DhcpServiceObject service = null;

		if (dhcpserviceobjlist != null && dhcpserviceobjlist.getDhcpServiceObject ( key ) != null) {
			service = dhcpserviceobjlist.getDhcpServiceObject ( key );
			serviceconfobj = service.getServiceconf ();
		} else{
			dhcpserviceobjlist = new DhcpServiceObjectList ();
			dhcpglobalopslist = new DhcpOptionsList();
			dhcpglobalparamslist = new DhcpParamsList();
		}

		if (service == null) {
			
				// service obj
				setDhcpServiceObj ( getDhcpServiceObj () );
				DhcpServiceObj.setServiceconf ( serviceconfobj );
				setDhcpServiceConfigurationObj ( serviceconfobj );
				setDhcpEntityObj ( getDhcpEntityObj () );// sets the globalobject.
				// --

				if (getDhcpServiceObj ().getFco () != null) {

					dhcpserviceobjlist.addDhcpServiceObject ( getDhcpServiceObj () );
					selectionHierarchy.addService (getDhcpServiceObj () );
					selectionHierarchy.addServiceConfiguration ( getDhcpServiceConfigurationObj () );
					selectionHierarchy.addEntity (getDhcpEntityObj ());
					selectionHierarchy.addGlobalOptionsList ( getDhcpglobalopslist () );
					selectionHierarchy.addGlobalParamsList ( getDhcpglobalparamslist () );
					return true;
				}
			return false;
		} else {
			selectionHierarchy.addService ( service );
			selectionHierarchy.addServiceConfiguration ( getDhcpServiceConfigurationObj () );
			selectionHierarchy.addEntity ( getDhcpEntityObj () );
			selectionHierarchy.addGlobalOptionsList ( getDhcpglobalopslist () );
			selectionHierarchy.addGlobalParamsList ( getDhcpglobalparamslist () );

		}
		
		return true;
	}

	public int countImpl_DHCPGlobalOptionsListContainer () throws CountException {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteImpl ( Linux_DHCPHost fco ) throws ObjectDeletionException {
		// TODO Auto-generated method stub

	}

	public void deleteImpl ( Linux_DHCPOptions fco ) throws ObjectDeletionException {
		// TODO Auto-generated method stub

	}

	public void deleteImpl ( Linux_DHCPParams fco ) throws ObjectDeletionException {
		// TODO Auto-generated method stub

	}

	public void deleteImpl ( Linux_DHCPPool fco ) throws ObjectDeletionException {
		// TODO Auto-generated method stub

	}

	public void deleteImpl ( Linux_DHCPSharednet fco ) throws ObjectDeletionException {
		// TODO Auto-generated method stub

	}

	public void deleteImpl ( Linux_DHCPSubnet fco ) throws ObjectDeletionException {
		// TODO Auto-generated method stub

	}

	public void installValidatorsImpl ( DHCPGlobalOptionsListContainer container ) {
		// TODO Auto-generated method stub

	}

	public void installValidatorsImpl ( DHCPGlobalOptionsListItemContainer container ) {
		// TODO Auto-generated method stub

	}

	public void updateControlsImpl ( DHCPGlobalOptionsListContainer container ) throws UpdateControlsException {
		// TODO Auto-generated method stub

	}

	public void updateControlsImpl ( DHCPGlobalOptionsListItemContainer container ) throws UpdateControlsException {
		// TODO Auto-generated method stub

	}

	public void updateControlsImpl ( DHCPGlobalOptionsListContainer container, Linux_DHCPOptions fco )
			throws UpdateControlsException {
		// TODO Auto-generated method stub

	}

	public void initContainerImpl ( DHCPGlobalOptionsListContainer container ) throws InitContainerException {
		// TODO Auto-generated method stub

	}

	public void initContainerImpl ( DHCPGlobalOptionsListItemContainer container ) throws InitContainerException {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the dummyMode
	 */
	public static boolean isDummyMode () {
		return DummyMode;
	}

	/**
	 * @param dummyMode
	 *            the dummyMode to set
	 */
	public static void setDummyMode ( boolean dummyMode ) {
		DummyMode = dummyMode;
	}

	public int countImpl_DHCPGlobalOptionsListItemContainer () throws CountException {
		// TODO Auto-generated method stub
		return 0;
	}

	public void installValidatorsImpl ( DHCPGlobalOptionsContainer container ) {
		// TODO Auto-generated method stub

	}

	public void installValidatorsImpl ( DHCPGlobalParamsContainer container ) {
		// TODO Auto-generated method stub

	}

	public MessageList revertImpl ( DHCPGlobalOptionsContainer container ) throws ObjectRevertException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( DHCPGlobalParamsContainer container ) throws ObjectRevertException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList saveImpl ( DHCPGlobalOptionsContainer container ) throws ObjectSaveException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList saveImpl ( DHCPGlobalParamsContainer container ) throws ObjectSaveException {
		// TODO Auto-generated method stub
		return null;
	}

	public void updateControlsImpl ( DHCPGlobalOptionsContainer container ) throws UpdateControlsException {
		// TODO Auto-generated method stub

	}

	public void updateControlsImpl ( DHCPGlobalParamsContainer container ) throws UpdateControlsException {
		// TODO Auto-generated method stub

	}

	public void updateControlsImpl ( DHCPGlobalOptionsListItemContainer container, Linux_DHCPOptions fco )
			throws UpdateControlsException {
		// TODO Auto-generated method stub

	}

	public void initContainerImpl ( DHCPGlobalOptionsContainer container ) throws InitContainerException {
		// TODO Auto-generated method stub

	}

	public void initContainerImpl ( DHCPGlobalParamsContainer container ) throws InitContainerException {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the dhcpglobalopslist
	 */
	public DhcpOptionsList getDhcpglobalopslist () {
		
		if(dhcpglobalopslist == null){
			
			DhcpOptionsList globalopslist = null;
			Linux_DHCPOptions globalopsFco = null;
			
				ArrayList globalOpsArrayList = getDhcpEntityObj ().getFco ()
						.getAssociated_Linux_DHCPOptions_Linux_DHCPOptionsForEntitys ( cimClient, false, false,
								null );
				if (globalOpsArrayList.size () > 0) {
					globalopslist = new DhcpOptionsList ();
					for (Iterator iter = globalOpsArrayList.iterator (); iter.hasNext ();) {
						globalopsFco = (Linux_DHCPOptions) iter.next ();
						globalopslist
								.addDhcpOptionsObject ( new DhcpOptionsObject ( globalopsFco, this ) );
					}
					setDhcpglobalopslist ( globalopslist );
				}
		}
		
		return dhcpglobalopslist;
	}

	/**
	 * @param dhcpglobalopslist
	 *            the dhcpglobalopslist to set
	 */
	public void setDhcpglobalopslist ( DhcpOptionsList dhcpglobalopslist ) {
		this.dhcpglobalopslist = dhcpglobalopslist;
	}

	public boolean isBooleanOp(String option){
		return booleanOps.contains(option); 
	}

	/**
	 * @return the dhcpglobalparamslist
	 */
	public DhcpParamsList getDhcpglobalparamslist ()  {
		
		if(dhcpglobalparamslist == null){
			
			DhcpParamsList globalparamslist = null;
			Linux_DHCPParams globalparamsFco = null;

			ArrayList globalParamsArrayList = getDhcpEntityObj ().getFco ()
					.getAssociated_Linux_DHCPParams_Linux_DHCPParamsForEntitys ( cimClient, false, false, null );
			if (globalParamsArrayList.size () > 0) {
				globalparamslist = new DhcpParamsList ();
				for (Iterator iter = globalParamsArrayList.iterator (); iter.hasNext ();) {
					globalparamsFco = (Linux_DHCPParams) iter.next ();
					globalparamslist.addDhcpParamsObject ( new DhcpParamsObject ( globalparamsFco,
							this ) );
				}
				setDhcpglobalparamslist ( globalparamslist );
			}
		}
		
		return dhcpglobalparamslist;
	}

	/**
	 * @param dhcpglobalparamslist the dhcpglobalparamslist to set
	 */
	public void setDhcpglobalparamslist ( DhcpParamsList dhcpglobalparamslist ) {
		this.dhcpglobalparamslist = dhcpglobalparamslist;
	}

	/**
	 * @return the dhcpEntityObj
	 */
	public DhcpEntityObject getDhcpEntityObj ()  {
		
		Linux_DHCPGlobal globalFco = null;
		
		if(DhcpEntityObj == null){
		ArrayList globalEntityArrayList = getDhcpServiceObj ().getFco ().getAssociated_Linux_DHCPGlobal_Linux_DHCPGlobalForServices (
				cimClient, false, false, null );
		for (Iterator iter = globalEntityArrayList.iterator (); iter.hasNext ();) {
			globalFco = (Linux_DHCPGlobal) iter.next ();
		}

		this.DhcpEntityObj = new DhcpEntityObject(globalFco,this);
		}

		return DhcpEntityObj;
	}

	/**
	 * @param dhcpEntityObj the dhcpEntityObj to set
	 */
	public void setDhcpEntityObj ( DhcpEntityObject dhcpEntityObj ) {
		DhcpEntityObj = dhcpEntityObj;
	}

	/**
	 * @return the dhcpGroupObj
	 */
	public DhcpGroupObject getDhcpGroupObj () {
		return DhcpGroupObj;
	}

	/**
	 * @param dhcpGroupObj the dhcpGroupObj to set
	 */
	public void setDhcpGroupObj ( DhcpGroupObject dhcpGroupObj ) {
		DhcpGroupObj = dhcpGroupObj;
	}

	/**
	 * @return the dhcpHostObj
	 */
	public DhcpHostObject getDhcpHostObj () {
		return DhcpHostObj;
	}

	/**
	 * @param dhcpHostObj the dhcpHostObj to set
	 */
	public void setDhcpHostObj ( DhcpHostObject dhcpHostObj ) {
		DhcpHostObj = dhcpHostObj;
	}

	/**
	 * @return the dhcpPoolObj
	 */
	public DhcpPoolObject getDhcpPoolObj () {
		return DhcpPoolObj;
	}

	/**
	 * @param dhcpPoolObj the dhcpPoolObj to set
	 */
	public void setDhcpPoolObj ( DhcpPoolObject dhcpPoolObj ) {
		DhcpPoolObj = dhcpPoolObj;
	}

	/**
	 * @return the dhcpSharednetObj
	 */
	public DhcpSharednetObject getDhcpSharednetObj () {
		return DhcpSharednetObj;
	}

	/**
	 * @param dhcpSharednetObj the dhcpSharednetObj to set
	 */
	public void setDhcpSharednetObj ( DhcpSharednetObject dhcpSharednetObj ) {
		DhcpSharednetObj = dhcpSharednetObj;
	}

	/**
	 * @return the dhcpSubnetObj
	 */
	public DhcpSubnetObject getDhcpSubnetObj () {
		return DhcpSubnetObj;
	}

	/**
	 * @param dhcpSubnetObj the dhcpSubnetObj to set
	 */
	public void setDhcpSubnetObj ( DhcpSubnetObject dhcpSubnetObj ) {
		DhcpSubnetObj = dhcpSubnetObj;
	}


	public MessageList revertImpl ( DHCPGroupOptionsContainer container ) throws ObjectRevertException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( DHCPGroupParamsContainer container ) throws ObjectRevertException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( DHCPHostOptionsContainer container ) throws ObjectRevertException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( DHCPHostParamsContainer container ) throws ObjectRevertException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( DHCPPoolOptionsContainer container ) throws ObjectRevertException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( DHCPPoolParamsContainer container ) throws ObjectRevertException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( DHCPSharednerOptionsContainer container ) throws ObjectRevertException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( DHCPSharednetParamsContainer container ) throws ObjectRevertException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( DHCPSubnetOptionsContainer container ) throws ObjectRevertException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList revertImpl ( DHCPSubnetParamsContainer container ) throws ObjectRevertException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList saveImpl ( DHCPGroupOptionsContainer container ) throws ObjectSaveException {
		// TODO Auto-generated method stub
		return null;
	}

	public MessageList saveImpl ( DHCPGroupParamsContainer container ) throws ObjectSaveException {
		// TODO Auto-generated method stub
		return null;
	}

	public NewHostWizard getNewhostwizard () {
		return newhostwizard;
	}

	public void setNewhostwizard ( NewHostWizard newhostwizard ) {
		this.newhostwizard = newhostwizard;
	}

	public Linux_DHCPEntity getSelectedEntity () {
		return selectedEntity;
	}

	public void setSelectedEntity ( Linux_DHCPEntity selectedEntity ) {
		this.selectedEntity = selectedEntity;
	}

	public NewGroupWizard getNewgroupwizard () {
		return newgroupwizard;
	}

	public void setNewgroupwizard ( NewGroupWizard newgroupwizard ) {
		this.newgroupwizard = newgroupwizard;
	}

	public NewPoolWizard getNewpoolwizard () {
		return newpoolwizard;
	}

	public void setNewpoolwizard ( NewPoolWizard newpoolwizard ) {
		this.newpoolwizard = newpoolwizard;
	}

	public NewSharednetWizard getNewsharednetwizard () {
		return newsharednetwizard;
	}

	public void setNewsharednetwizard ( NewSharednetWizard newsharednetwizard ) {
		this.newsharednetwizard = newsharednetwizard;
	}

	public NewSubnetWizard getNewsubnetwizard () {
		return newsubnetwizard;
	}

	public void setNewsubnetwizard ( NewSubnetWizard newsubnetwizard ) {
		this.newsubnetwizard = newsubnetwizard;
	}

	public void deleteImpl ( Linux_DHCPGroup fco ) throws ObjectDeletionException {
		// TODO Auto-generated method stub
	}
	
	public void WriteToValues(){
		
	}

	public void updateModelImpl ( DhcpServiceConfContainer container ) throws ModelUpdateException {
		getDhcpServiceConfigurationObj ().updateModel ( container );
	}

	/**
	 * get the Destination
	 * @param fcoHelper
	 * @param cimClient
	 * @param interOpNamespace
	 * @param indicationDestination the destination which contains the URL to search for
	 * @return
	 * @throws WbemsmtException
	 */
	public CIM_ListenerDestinationCIMXML getDestination(FcoHelperIf fcoHelper, CIMClient cimClient, String interOpNamespace, IndicationDestination indicationDestination) throws WbemSmtException {
		//create the subscriptions
		
		if(dest != null)
			return dest;
		
		CIM_ListenerDestinationCIMXML ourDestination = null;
        
        List destinations = CIM_ListenerDestinationHelper.enumerateInstances(cimClient,true);
        for (Iterator iterator = destinations.iterator(); iterator.hasNext() && ourDestination == null;) {
        	CIM_ListenerDestination destination = (CIM_ListenerDestination) iterator.next();
        	if (destination instanceof CIM_ListenerDestinationCIMXML) {
        		CIM_ListenerDestinationCIMXML xmlDestination = (CIM_ListenerDestinationCIMXML) destination;
        		if (xmlDestination.get_Destination().equals(indicationDestination.getCalculatedUrlString()))
        		{
        			dest =  xmlDestination;
        		}
        		
        	}
        }
        if (dest == null)
        {
        	dest = new CIM_ListenerDestinationCIMXML();
        	dest.set_Name("DHCP Indication Handler for " + indicationDestination.getCalculatedUrlString () );
        	dest.set_PersistenceType(new UnsignedInt16(CIM_ListenerDestinationCIMXML.PERSISTENCETYPE_TRANSIENT));
        	dest.set_Destination(indicationDestination.getCalculatedUrlString());
        	dest = (CIM_ListenerDestinationCIMXML) fcoHelper.create(dest, cimClient);
        }
        
        return dest;
	}
	
	
	/**
	 * Create Subscriptions
	 * @param ourDestination 
	 * @param profile the registered profile to which the indications belonging
	 * @throws WbemsmtException
	 */
	protected void createSubscriptions ( CIM_ListenerDestinationCIMXML ourDestination)
			throws WbemSmtException {

		if(this.isSubscribed ())
			return;
			
		boolean subscribed = false;
		
		CIM_IndicationFilter filter = null;
		CIM_IndicationSubscription sub = null;
		CIMValue host,filt = null;


		List filterslist = CIM_IndicationFilterHelper.enumerateInstances ( getCimClient(), true );
		for (Iterator iterator = filterslist.iterator (); iterator.hasNext ();){
			filter = (CIM_IndicationFilter) iterator.next ();
			if(filter.get_Name ().equals("HostIndication") || filter.get_Name ().equals("SubnetIndication") || filter.get_Name ().equals("SharednetIndication") || filter.get_Name ().equals("GroupIndication") || filter.get_Name ().equals("PoolIndication") || filter.get_Name ().equals("OptionsIndication") || filter.get_Name ().equals("ParamsIndication")){

				List sublist = CIM_IndicationSubscriptionHelper.enumerateInstances(getCimClient(),true);
				for (Iterator iterator1 = sublist.iterator (); iterator1.hasNext ();){
					sub = (CIM_IndicationSubscription) iterator1.next ();
					if(sub.get_CIM_ListenerDestination () != null && sub.get_CIM_IndicationFilter () != null){
						host = sub.get_CIM_ListenerDestination ().getKey("Name").getValue ();
						filt = sub.get_CIM_IndicationFilter ().getKey("Name").getValue ();
						}
					else
						continue;
					
					if(((String)host.getValue()).equals ("DHCP Indication Handler for " + indcDest.getCalculatedUrlString ()) && ((String)filt.getValue ()).equalsIgnoreCase ( filter.get_Name () )){
							subscribed = true;
							logger.info ( "Subsriptions already exist ..!" );
							break;
					}
				}

				if(!subscribed){
				CIMClass cimindcsub = getCimClient().getClass ( new CIMObjectPath ( "CIM_IndicationSubscription" ), true,
						true, true, null );
				CIMInstance ci = cimindcsub.newInstance ();
				ci.setProperty ( "Filter", new CIMValue ( filter.getCimObjectPath () ) );
				ci.setProperty ( "Handler", new CIMValue ( ourDestination.getCimObjectPath () ) );
				ci.setProperty ("SubscriptionState", new CIMValue(new UnsignedInt16(2)));

				CIMObjectPath indcsub = getCimClient ().createInstance ( new CIMObjectPath (), ci );

				logger.info ( "Subsription Created Succesfully ..!" );
				}
				else
					logger.info ( "No suitable Subsriptions exist ..!" );

			}
			else
				logger.severe ( "No suitable Filters found for Subsription." );
		}
	}
	
	public CIMClient getCimClientForInteropNamespace()
	{
		
		if(slpNamespaceCimClient == null){
		try {
			slpNamespaceCimClient = WbemsmtSession.getSession().getCIMClientPool(cimClient.getNameSpace().getHost()).getCIMClient("root/pg_interop");
		} catch (LoginException e) {
			e.printStackTrace();
		} 
		}
		return slpNamespaceCimClient;
	}

	/**
	 * @return the indcOccurred
	 */
	public boolean isIndcOccurred () {
		return indcOccurred;
	}

	/**
	 * @param indcOccurred the indcOccurred to set
	 */
	public void setIndcOccurred ( boolean indcOccurred ) {
		this.indcOccurred = indcOccurred;
	}

	public void save(DataContainer dataContainer) throws ObjectSaveException{
		if(isIndcOccurred ()){
			MessageUtil.addMessage(DhcpErrorCodes.MSGDEF_INDICATION_OCCURRED,new DhcpErrorCodes() , this.getResourceBundleNames (),null);
//			this.setMarkedForReload ();
			this.setIndcOccurred ( false );
		} else{
				super.save(dataContainer);
				for(int i=0;i<20;i++);
				this.setIndcOccurred ( false );}
	}
	
	public void updateControls(DataContainer dataContainer) throws UpdateControlsException{
		
		if(isIndcOccurred ()){
			MessageUtil.addMessage(DhcpErrorCodes.MSGDEF_INDICATION_OCCURRED,new DhcpErrorCodes() , this.getResourceBundleNames (),null);
//			this.setMarkedForReload ();
			this.setIndcOccurred ( false );
		} else{
				super.updateControls(dataContainer);
				for(int i=0;i<20;i++);
				this.setIndcOccurred ( false );}
	}
	
	public void create(DataContainer dataContainer) throws ObjectCreationException{
		
		if(isIndcOccurred ()){
			MessageUtil.addMessage(DhcpErrorCodes.MSGDEF_INDICATION_OCCURRED,new DhcpErrorCodes() , this.getResourceBundleNames (),null);
//			this.setMarkedForReload ();
			this.setIndcOccurred ( false );
		} else{
				super.create(dataContainer);
				for(int i=0;i<20;i++);
				this.setIndcOccurred ( false );}
	}
	
	public void delete() throws ObjectDeletionException{

		if(isIndcOccurred ()){
			MessageUtil.addMessage(DhcpErrorCodes.MSGDEF_INDICATION_OCCURRED,new DhcpErrorCodes() , this.getResourceBundleNames (),null);
//			this.setMarkedForReload ();
			this.setIndcOccurred ( false );
		} else{
				super.delete();
				for(int i=0;i<20;i++);
				this.setIndcOccurred ( false );}
	}
	
	
//	class tempThread extends Thread{
//
//		private DhcpCimAdapter adapter;
//		
//		public tempThread ( DhcpCimAdapter adapter ) {
//			super ();
//			this.adapter = adapter;
//		}
//
//		public void run () {
//			try {
//				this.sleep(20000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			DHCPCustomEventForIndication listener = new DHCPCustomEventForIndication(new CIMInstance());
//			adapter.getIndcListener ().indicationOccured ( listener );
//			}
//		}

	/**
	 * @return the subscribed
	 */
	public boolean isSubscribed () {
		return subscribed;
	}

	/**
	 * @param subscribed the subscribed to set
	 */
	public void setSubscribed ( boolean subscribed ) {
		this.subscribed = subscribed;
	}

//	public void cleanup(){
//		try {
//			removeSubscriptions ( getDestination ( this.getFcoHelper (), getCimClient(), null, indcDest ));
//		} catch (WbemSmtException e) {
//			e.printStackTrace();
//		}
//		indcDest.getPresets ().freePort(indcPort);
//		logger.info("Port " + indcPort + " freed ...!");
//		indcDest = null;
//		dest = null;
//	}
	
	protected void removeSubscriptions(CIM_ListenerDestinationCIMXML ourDestination){

		CIM_IndicationFilter filter = null;
		CIM_IndicationSubscription sub = null;
		CIMValue host,filt = null;


		List filterslist = CIM_IndicationFilterHelper.enumerateInstances ( getCimClient(), true );
		for (Iterator iterator = filterslist.iterator (); iterator.hasNext ();){
			filter = (CIM_IndicationFilter) iterator.next ();
			if(filter.get_Name ().equals("HostIndication") || filter.get_Name ().equals("SubnetIndication") || filter.get_Name ().equals("SharednetIndication") || filter.get_Name ().equals("GroupIndication") || filter.get_Name ().equals("PoolIndication") || filter.get_Name ().equals("OptionsIndication") || filter.get_Name ().equals("ParamsIndication")){

				List sublist = CIM_IndicationSubscriptionHelper.enumerateInstances(getCimClient(),true);
				for (Iterator iterator1 = sublist.iterator (); iterator1.hasNext ();){
					sub = (CIM_IndicationSubscription) iterator1.next ();
					if(sub.get_CIM_ListenerDestination () != null && sub.get_CIM_IndicationFilter () != null){
						host = sub.get_CIM_ListenerDestination ().getKey("Name").getValue ();
						filt = sub.get_CIM_IndicationFilter ().getKey("Name").getValue ();
						}
					else
						continue;
					
					if(((String)host.getValue()).equals ("DHCP Indication Handler for " + indcDest.getCalculatedUrlString ()) && ((String)filt.getValue ()).equalsIgnoreCase ( filter.get_Name () )){
							getCimClient().deleteInstance ( sub.getCimObjectPath () );
							break;
					}
				}
			}

		}

		logger.info("Subscriptions and Handlers for the host " + ourDestination.get_Destination () + " deleted ...!");
		
		getCimClient().deleteInstance ( ourDestination.getCimObjectPath () );

	}
	
}
