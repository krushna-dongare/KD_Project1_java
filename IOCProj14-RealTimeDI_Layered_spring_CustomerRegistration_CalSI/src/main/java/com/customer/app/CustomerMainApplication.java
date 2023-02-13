package com.customer.app;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.customer.controller.MainController;
import com.customer.vo.CustomerVO;

public class CustomerMainApplication {

	public static void main(String[] args) {
		System.out.println("...Program Ready for Execution...");

		String name,address,pAmt,rate,time= null;
       // reading the input to the vo
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of customer: ");
		name = sc.next();

		System.out.println("Enter address: ");
		address = sc.next();

		System.out.println("Enter principal Amount: ");
		pAmt = sc.next();

		System.out.println("Enter rate: ");
		rate= sc.next();
		
		System.out.println("Enter time: ");
		time= sc.next();
		
		 // Storing the input to the vo
		CustomerVO vo = new CustomerVO();
		vo.setName(name);
		vo.setAddress(address);
		vo.setpAmt(pAmt);
		vo.setRate(rate);
		vo.setTime(time);
		
		// ioc container
		
		DefaultListableBeanFactory factory =new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader =new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("applicationContext.xml");
		
		// get the main controller bean object
		MainController controller = factory.getBean("mainController",MainController.class);
		
		try {
			String result=controller.processCustomer(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Internal Error");
		}
	}
}
