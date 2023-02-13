package com.customer.app;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.customer.controller.MainController;
import com.customer.vo.StudentVO;

public class CustomerMainApplication {

	public static void main(String[] args) {
		System.out.println("...Welcome to my app...");

		String name,m1,m2,m3;
		// reading the input to the vo
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of student: ");
		name = sc.next();

		System.out.println("enter the marks of three subjects: ");
		m1 = sc.next();
		m2 = sc.next();
		m3= sc.next();

		// Storing the input to the vo
		StudentVO vo = new StudentVO();
		vo.setName(name);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);

		// ioc container

		DefaultListableBeanFactory factory =new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader =new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("applicationContext.xml");

		// get the main controller bean object
		MainController controller = factory.getBean("mainController",MainController.class);

		try {
			String result=controller.processStudent(vo);
			System.out.println(result);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Internal Error");
		}
	}
}
