package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		
		
		//Locate SpringBean applicationContext.xml file
         FileSystemResource res = new  FileSystemResource ("src/main/java/com/nt/cfgs/applicationContext.xml");
		//create IOC container
         XmlBeanFactory factory= new XmlBeanFactory(res);
		//get Bean(Main Bean)
        Object obj=factory.getBean("wmg");
         //type casting
         WishMessageGenerator generator =(WishMessageGenerator)obj;
         //invoke b.method
         System.out.println("Message:::"+generator.generateMessage("Aman"));
	}

}
