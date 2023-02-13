package com.customer.service;

import com.customer.bo.CustomerBO;
import com.customer.dao.CustomerDao;
import com.customer.dao.CustomerDaoImpl;
import com.customer.dto.CustomerDto;

public class CustomerMgmtServiceImpl implements CustomerMgmtService {

	private CustomerDao dao;
	public CustomerMgmtServiceImpl(CustomerDao dao) {
		this.dao=dao;
	}
	@Override
	public String calSI(CustomerDto dto) throws Exception {
		// calculate  the Simple Interest
		float si = 0.0f;
		si=(dto.getpAmt()*dto.getRate()*dto.getTime())/100.0f;
		
		
		CustomerBO bo = new CustomerBO();
		bo.setName(dto.getName());
		bo.setAddress(dto.getAddress());
		bo.setpAmt(dto.getpAmt());
		bo.setInterest(si);
		// call the dao method to register to customer
		dao.registerCustomer(bo);
		int rowCount =dao.registerCustomer(bo);
		if(rowCount>0) {
			return "customer saved successfully! Interest is :"+si; 
		}
		else {
			return "Something went wrong! customer is not registered successfully."; 
		}
	}
}
