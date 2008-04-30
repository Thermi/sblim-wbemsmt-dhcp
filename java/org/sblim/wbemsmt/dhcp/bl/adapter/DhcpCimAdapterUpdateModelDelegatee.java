package org.sblim.wbemsmt.dhcp.bl.adapter;

import org.sblim.wbemsmt.dhcp.bl.container.edit.DhcpServiceConfContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewHostContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewPoolContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSharednetContainer;
import org.sblim.wbemsmt.dhcp.bl.container.wizard.NewSubnetContainer;
import org.sblim.wbemsmt.exception.ModelUpdateException;

public class DhcpCimAdapterUpdateModelDelegatee implements DhcpCimAdapterUpdateModelIf {

	private DhcpCimAdapter adapter = null;
	
	public DhcpCimAdapterUpdateModelDelegatee ( DhcpCimAdapter adapter ) {
		this.adapter = adapter;
	}

	public void updateModelImpl ( DhcpServiceConfContainer container ) throws ModelUpdateException {
		// TODO Auto-generated method stub

	}

	public void updateModelImpl ( NewHostContainer container ) throws ModelUpdateException {
		// TODO Auto-generated method stub

	}

	public void updateModelImpl ( NewPoolContainer container ) throws ModelUpdateException {
		// TODO Auto-generated method stub

	}

	public void updateModelImpl ( NewSharednetContainer container ) throws ModelUpdateException {
		// TODO Auto-generated method stub

	}

	public void updateModelImpl ( NewSubnetContainer container ) throws ModelUpdateException {
		// TODO Auto-generated method stub

	}

}
