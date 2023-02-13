package com.nt.dao;

import com.nt.bo.CustomerBO;

public interface ICustomerDAO {
  
	public int  insertCustomer(CustomerBO bo) throws Exception;
}
