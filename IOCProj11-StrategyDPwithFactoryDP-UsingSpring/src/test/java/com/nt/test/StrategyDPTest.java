package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.comp.FlipKart;

public class StrategyDPTest {

	public static void main(String[] args) {
		try {
			System.out.println("StrategyDPTest.main():::start of main method");
			// create the IOC Container
			DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
			XmlBeanDefinitionReader  reader = new XmlBeanDefinitionReader(factory);
			reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
			//get target class object from IOC container
			FlipKart fpkt = factory.getBean("fpkt",FlipKart.class);
			//invoke the b.method
			String result=fpkt.shopping(new String[] {"TV", "LAPTOP","CRETA","SHOES"},new float[] {65000.0f,58000.1f,10.0000f,4000.0f});
			System.out.println(result);	
			System.out.println("StrategyDPTest.main():::end of main method");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
