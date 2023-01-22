package com.nt.comp;

public class DieselEngine implements Engine {
	
	public DieselEngine() {
		System.out.println("DieselEngine:0-param constructor");
	}

	@Override
	public String cc(int oid) {
		
		return oid+"Vehicle engine is of DieselType type";
		
	}

}
