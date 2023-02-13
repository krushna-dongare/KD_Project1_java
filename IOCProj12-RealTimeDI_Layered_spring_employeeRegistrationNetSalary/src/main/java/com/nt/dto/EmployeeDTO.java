package com.nt.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {

	
	private String eName;
	private String eDesg;
	private float eBasicSalary;
	private float eGrossSalary;
	private float eNetSalary;
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDesg() {
		return eDesg;
	}
	public void seteDesg(String eDesg) {
		this.eDesg = eDesg;
	}
	public float geteBasicSalary() {
		return eBasicSalary;
	}
	public void seteBasicSalary(float eBasicSalary) {
		this.eBasicSalary = eBasicSalary;
	}
	public float geteGrossSalary() {
		return eGrossSalary;
	}
	public void seteGrossSalary(float eGrossSalary) {
		this.eGrossSalary = eGrossSalary;
	}
	public float geteNetSalary() {
		return eNetSalary;
	}
	public void seteNetSalary(float eNetSalary) {
		this.eNetSalary = eNetSalary;
	}
}
