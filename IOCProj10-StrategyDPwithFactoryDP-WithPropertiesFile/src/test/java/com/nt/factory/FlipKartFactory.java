package com.nt.factory;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

import javax.imageio.stream.FileImageInputStream;

import com.nt.comp.BlueDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.FlipKart;

public class FlipKartFactory {

	private static Properties props;
	static {
		System.out.println("FlipkartFactory::StaticBlock()");
		try {
			//load the proprties file
			FileInputStream fis = new FileInputStream("src/test/java/com/nt/commons/info.properties");
            // load Properties file content into java.util.properties class obj
			props = new Properties();
			props.load(fis);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}
	// static factory method supporting factrory pattern
	public static FlipKart createFlipKart(String CourierType) throws Exception {
		//create target class object
		FlipKart fpkt =new FlipKart();
		//load dependent class
		Class c =Class.forName(props.getProperty("dependent.comp"));
		//create object using reflection api(newInstance())
		Constructor[] cons = c.getDeclaredConstructors();
		//create object
		Object obj = cons[0].newInstance();
		//type casting
		Courier courier = (Courier)obj;
		//set dependent class obj to target class obj(FlipKart)
		fpkt.setCourier(courier);
		return fpkt;
	}
}
