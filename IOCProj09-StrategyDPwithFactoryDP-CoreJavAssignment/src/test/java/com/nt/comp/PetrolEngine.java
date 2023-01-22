package com.nt.comp;

public class PetrolEngine implements Engine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine:0-param constructor");
	}

	@Override
	public String cc(int oid) {
		
		return oid+"Vehicle engine is of PetrolType type";
		
	}

}
