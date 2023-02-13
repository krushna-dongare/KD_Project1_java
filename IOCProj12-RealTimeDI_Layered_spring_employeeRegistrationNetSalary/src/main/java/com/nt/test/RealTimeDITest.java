package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class RealTimeDITest{
	
	public static void main(String[] args) {
		System.out.println("...Ready for program Execution...");

		String eName,eDesg,eBasicSalary,eGrossSalary;
       
		// reading the input to the vo
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Name of employee: ");
		eName = sc.next();

	    System.out.println("Enter employee Designation: ");
		eDesg = sc.next();

		System.out.println("Enter employee BasicSalary: ");
		eBasicSalary= sc.next();
		
		System.out.println("Enter employee Gross Salary: ");
		eGrossSalary= sc.next();
		
		 // Storing the input to the vo
		EmployeeVO vo = new EmployeeVO();
		vo.seteName(eName);
		//vo.seteId(eId);
		vo.seteDesg(eDesg);
		vo.seteBasicSalary(eBasicSalary);
		vo.seteGrossSalary(eGrossSalary);
		
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