package com.nt.service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.IEmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	private IEmployeeDAO dao;
	public EmployeeMgmtServiceImpl(IEmployeeDAO dao) {
		this.dao = dao;
	}
	@Override
	public String calNetSalary(EmployeeDTO dto) throws Exception {

		// calculate  the netSalary of marks
		float eGrossSalary=dto.geteBasicSalary()+dto.geteBasicSalary()*0.20f;
		float eNetSalary = eGrossSalary-eGrossSalary*0.10f;
		// prepare EmployeeBO class object having a persistable data
		EmployeeBO bo = new EmployeeBO();
		//bo.seteId(dto.geteId());
		bo.seteName(dto.geteName());
		bo.seteDesg(dto.geteDesg());
		bo.seteBasicSalary(dto.geteBasicSalary());
		bo.seteGrossSalary(dto.geteGrossSalary());
		bo.seteNetSalary(eNetSalary);

		// call the dao method to register to customer
		dao.insertEmployee(bo);
		int rowCount =dao.insertEmployee(bo);
		if(rowCount>0) {
			return "customer saved successfully! netsalary is :"+eNetSalary; 
		}
		else {
			return "Something went wrong! customer is not registered successfully."; 
		}
	}
}
