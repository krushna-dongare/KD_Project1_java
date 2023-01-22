package com.nt.beans;

import java.util.Date;

public class WishMessageGenerator {
// HAS-A property(supporting composition)
	private Date date;

	public WishMessageGenerator() {
		
	System.out.println("WishMessageGenerator:0-param constructor");
	}  
	// Setter method for setter injection

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
  // Business logic
	public String generateMessage(String user) {
		System.out.println("WishMessageGenerator.generateMessage()");
		//current hour of the day
		int hour = date.getHours();//24 hours format 
		// generate wish message
		if(hour<12)
			return "Good Morning:"+user;
		else if(hour<16)
			return "Good Afternoon:"+user;
		else if(hour<20)
			return "Good Evening:"+user;
		else
			return"Good Night:"+user;
	}//method
}//class
