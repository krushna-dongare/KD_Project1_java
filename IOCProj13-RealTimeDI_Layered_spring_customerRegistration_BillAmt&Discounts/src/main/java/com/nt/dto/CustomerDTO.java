package com.nt.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {

	
	private String Name;
	private String Items;
	private double BillAmt;
	private double MarketPrice;
	private double Discount;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getItems() {
		return Items;
	}
	public void setItems(String items) {
		Items = items;
	}
	public double getBillAmt() {
		return BillAmt;
	}
	public void setBillAmt(double billAmt) {
		BillAmt = billAmt;
	}
	public double getMarketPrice() {
		return MarketPrice;
	}
	public void setMarketPrice(double marketPrice) {
		MarketPrice = marketPrice;
	}
	public double getDiscount() {
		return Discount;
	}
	public void setDiscount(double discount) {
		Discount = discount;
	}
}

