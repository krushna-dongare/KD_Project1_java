package com.nt.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Student;

public class Application{
	
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
		
		Student student =(Student) context.getBean("stud");
		System.out.println(student);
	}


	}


