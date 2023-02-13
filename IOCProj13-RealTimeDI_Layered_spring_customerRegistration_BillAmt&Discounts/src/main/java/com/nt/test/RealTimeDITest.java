package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealTimeDITest{
	
	public static void main(String[] args) {
		System.out.println("...Program is ready for execution...");

		String Name,Items,MarketPrice,Discount ;
       
		// reading the input to the vo
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Name of Customer: ");
		Name = sc.next();

	    System.out.println("Enter Itens Purchased by Customer: ");
		Items = sc.next();

		System.out.println("Enter Market Price of item: ");
		MarketPrice= sc.next();
		
		System.out.println("Enter Discount price: ");
		Discount= sc.next();
		
		 // Storing the input to the vo
		CustomerVO vo = new CustomerVO();
		vo.setName(Name);
	    vo.setItems(Items);
		vo.setMarketPrice(MarketPrice);
		vo.setDiscount(Discount);
		
		// ioc container
		
		DefaultListableBeanFactory factory =new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader =new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("applicationContext.xml");
		
		// get the main controller bean object
		MainController controller = factory.getBean("mainController",MainController.class);
		
		try {
			String result=controller.processEmployee(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Internal Error");
		}
	}
}