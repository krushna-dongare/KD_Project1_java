package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Vehicle {
	// Has  Mapping prpoerty of type interface

	private Engine engine;

	public Vehicle() {
		System.out.println("Vehicle::0-param constructor");
	}

	// setter method for Setter Injection
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	// B.logic
	public String shopping(String items[],float prices[]) {
		// calculate bill amount
		float billAmt=0.0f;
		for(int i=0;i<items.length;i++)
			billAmt = billAmt+prices[i];
		
		// generate random order id
		Random random = new Random();
		int oid =random.nextInt(10000);
		
		// use courier injected object to call dependent class method
		String status=engine.cc(oid);
		String finalMsg = Arrays.toString(items)+"you have purchased with the prices"+Arrays.toString(prices)+"The generated bill Amount is::"+billAmt;
		return finalMsg+":::"+status;
	}
}