package com.nt.factory;

import com.nt.comp.PetrolEngine;
import com.nt.comp.Engine;
import com.nt.comp.CNGEngine;
import com.nt.comp.DieselEngine;
import com.nt.comp.Vehicle;

public class VehicleFactory {
	// static factory method supporting Factory Pattern
	public static Vehicle createVehicle(String engineType) {

		// create targrt class object
		Vehicle vehicle = new Vehicle();

		//create dependent class reference
		Engine engine = null;

		//create dependent class object based on given courier type
		// manually we are creating object
		if(engineType.equalsIgnoreCase("diesel"))
			engine= new DieselEngine();
		else if(engineType.equalsIgnoreCase("petrol"))
			engine=new PetrolEngine();
		else if(engineType.equalsIgnoreCase("cng"))
			engine=new CNGEngine();

		else
			throw new IllegalArgumentException("Invalid engine type");
		vehicle .setEngine(engine);
		return vehicle ;
	}
}
