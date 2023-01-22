package com.nt.comp;

public class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("DTDC:0-param constructor");
	}

	@Override
	public String deliver(int oid) {
		
		return oid+"Order id order is deliverd by BlueDart Service";
	}

}
