package com.customer.bo;
// bo class/entity class/domain class/persistence class/model class

public class CustomerBO {
    
    private String name;
    private String address;
    private float pAmt;
    private float interest;
    
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getpAmt() {
		return pAmt;
	}
	public void setpAmt(float pAmt) {
		this.pAmt = pAmt;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
}
