package com.nt.factory;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.FlipKart;

public class FlipKartFactory {
	// static factory method supporting Factory Pattern
	public static FlipKart createFlipKart(String courierType) {

		// create targrt class object
		FlipKart fpkt = new FlipKart();

		//create dependent class reference
		Courier courier = null;

		//create dependent class object based on given courier type
		// manually we are creating object
		if(courierType.equalsIgnoreCase("dtdc"))
			courier= new DTDC();
		else if(courierType.equalsIgnoreCase("blueDart"))
			courier=new BlueDart();
		else
			throw new IllegalArgumentException("Invalid courier type");
		fpkt.setCourier(courier);
		return fpkt;
	}
}
