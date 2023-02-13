package com.customer.controller;

import com.customer.dto.CustomerDto;
import com.customer.service.CustomerMgmtService;
import com.customer.vo.CustomerVO;

public class MainController {
   private CustomerMgmtService service;
   
   public MainController(CustomerMgmtService service) {
	this.service=service;
}
	
	
	public String processCustomer(CustomerVO vo) throws Exception {
		// convert vo to dto
		CustomerDto dto = null;
		String name = vo.getName();
		String address = vo.getAddress();
		float pAmt = Float.parseFloat(vo.getpAmt());
		float rate = Float.parseFloat(vo.getRate());
		float time = Float.parseFloat(vo.getTime());
		
		dto = new CustomerDto();
		dto.setName(name);
		dto.setAddress(address);
		dto.setpAmt(pAmt);
		dto.setRate(rate);
		dto.setTime(time);
		 
		// call the service method
		String status = service.calSI(dto);
		return status;
	}
}
