package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	private ICustomerDAO dao;
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		this.dao = dao;
	}
	@Override
	public String calBillAmt(CustomerDTO dto) throws Exception {

		// calculate  the netSalary of marks
		double Discount=(dto.getDiscount())/100d*dto.getMarketPrice();
		double BillAmt = dto.getMarketPrice()-Discount;
		// prepare EmployeeBO class object having a persistable data
		CustomerBO bo = new CustomerBO();

		//bo.seteNo(dto.geteNo());
		bo.setName(dto.getName());
		bo.setItems(dto.getItems());
		bo.setDiscount(dto.getDiscount());
		bo.setMarketPrice(dto.getMarketPrice());
		bo.setBillAmt(BillAmt);

		// call the dao method to register to customer
		dao.insertCustomer(bo);
		int rowCount =dao.insertCustomer(bo);
		if(rowCount>0) {
			return "customer saved successfully! Bill Amount is :"+BillAmt; 
		}
		else {
			return "Something went wrong! customer is not registered successfully."; 
		}
	}
}
