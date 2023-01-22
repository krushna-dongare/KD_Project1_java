package com.nt.test;

import com.nt.comp.Vehicle;
import com.nt.factory.VehicleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		try {
			System.out.println("StrategyDPTest.main():::start of main method");
			// get target class object from factory class
			Vehicle vehicle=VehicleFactory.createVehicle("diesel");
			//invoke the b.method
			String result=vehicle.shopping(new String[] {"BMW", "i20","Ferrari","Nexon"},new float[] {40000.0f,50000.1f,60000.0f,70000.0f});
			System.out.println(result);	
			System.out.println("StrategyDPTest.main():::end of main method");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
