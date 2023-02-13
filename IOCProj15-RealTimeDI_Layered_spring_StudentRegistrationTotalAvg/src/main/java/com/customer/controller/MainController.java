package com.customer.controller;

import com.customer.dto.StudentDto;
import com.customer.service.StudentMgmtService;
import com.customer.vo.StudentVO;

public class MainController {
   private StudentMgmtService service;
   
   public MainController(StudentMgmtService service) {
	this.service=service;
}
	
	
	public String processStudent(StudentVO vo) throws Exception {
		// convert vo to dto
		StudentDto dto = null;
		String name = vo.getName();
		float m1 = Float.parseFloat(vo.getM1());
		float m2 = Float.parseFloat(vo.getM2());
		float m3 = Float.parseFloat(vo.getM3());
		//float total = Float.parseFloat(vo.getTotal());
		//float avg = Float.parseFloat(vo.getAvg());
		
		dto = new StudentDto();
		dto.setName(name);
		dto.setM1(m1);
		dto.setM2(m2);
		dto.setM3(m3);
		//dto.setTotal(total);
	   //  dto.setAvg(avg);
		 
		// call the service method
		String status = service.avg(dto);
		return status;
	}
}
