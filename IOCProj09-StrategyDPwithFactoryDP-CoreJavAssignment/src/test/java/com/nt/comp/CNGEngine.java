package com.nt.comp;

public class CNGEngine implements Engine {
	
	public CNGEngine() {
		System.out.println("CNGEngine:0-param constructor");
	}

	@Override
	public String cc(int oid) {
		
		return oid+"Vehicle engine is of CNGType type";
		
	}

}
