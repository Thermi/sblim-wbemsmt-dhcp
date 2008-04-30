package org.sblim.wbemsmt.dhcp.bl.adapter;

public class DhcpCimAdpaterCountDelegatee implements DhcpCimAdapterCountIf {

	private DhcpCimAdapter adapter = null;
	
	public DhcpCimAdpaterCountDelegatee ( DhcpCimAdapter adapter ) {
		this.adapter = adapter;
	}

}
