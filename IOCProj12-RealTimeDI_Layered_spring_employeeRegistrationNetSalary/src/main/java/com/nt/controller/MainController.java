package com.nt.controller;
import com.nt.service.EmployeeMgmtServiceImpl;
import com.nt.dto.EmployeeDTO;
import com.nt.vo.EmployeeVO;

public class MainController {
	private EmployeeMgmtServiceImpl service;

	public MainController(EmployeeMgmtServiceImpl service) {
		this.service=service;
	}
	public String processEmployee(EmployeeVO vo) throws Exception {
		// convert vo to dto
		EmployeeDTO dto = null;

		String eName = vo.geteName();
		String eDesg = vo.geteDesg();
		float eBasicSalary = Float.parseFloat(vo.geteBasicSalary());
        float eGrossSalary = Float.parseFloat(vo.geteGrossSalary());
		dto = new 	EmployeeDTO();

		dto.seteName(eName);

		dto.seteDesg(eDesg);
		dto.seteBasicSalary(eBasicSalary);
		dto.seteGrossSalary(eGrossSalary);
		// call the service method
		String status = service.calNetSalary(dto);
		return status;
	}
}
