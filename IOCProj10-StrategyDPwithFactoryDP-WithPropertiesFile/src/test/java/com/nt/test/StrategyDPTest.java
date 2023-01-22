package com.nt.test;

import com.nt.comp.FlipKart;
import com.nt.factory.FlipKartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		try {
			System.out.println("StrategyDPTest.main():::start of main method");
			// get target class object from factory class
			FlipKart fpkt=FlipKartFactory.createFlipKart("dtdc");
			//invoke the b.method
			String result=fpkt.shopping(new String[] {"TV", "LAPTOP","CRETA","SHOES"},new float[] {65000.0f,58000.1f,10.0000f,4000.0f});
			System.out.println(result);	
			System.out.println("StrategyDPTest.main():::end of main method");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
