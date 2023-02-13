package com.nt.service;

import com.nt.dto.CustomerDTO;

public interface ICustomerMgmtService{
	public String calBillAmt(CustomerDTO dto) throws Exception;
}