package com.customer.dao;

import com.customer.bo.StudentBO;

// Always code to interfaces never code to concrete classes

public interface StudentDao {
	/*
	 * persistence method konse customer ko hume register krna hai? public int
	 * registerCustomer(String name,int pamt); bjay iske hum parameter me java beans
	 * pass krenge,kyuki 3 se jyada value hai
	 */
	/*
	 * database ke table me ,entity data jata hai(realtime) ie,(BO class)
	 */
	public int registerStudent(StudentBO bo) throws Exception;
		
	
}
