package com.customer.service;

import com.customer.bo.StudentBO;
import com.customer.dao.StudentDao;
import com.customer.dao.StudentDao;
import com.customer.dto.StudentDto;

public class StudentMgmtServiceImpl implements StudentMgmtService {

	private StudentDao dao;
	public StudentMgmtServiceImpl(StudentDao dao) {
		this.dao=dao;
	}
	@Override
	public String avg(StudentDto dto) throws Exception {
		// calculate  the average of marks
		float total=dto.getM1()+dto.getM2()+dto.getM3();
		float avg = 0.0f;
		
		avg=(total)/3.0f;
		
		
		StudentBO bo = new StudentBO();
		bo.setName(dto.getName());
		bo.setM1(dto.getM1());
		bo.setM2(dto.getM2());
		bo.setM3(dto.getM3());
		bo.setTotal(dto.getTotal());
		bo.setAvg(avg);
		// call the dao method to register to student
		dao.registerStudent(bo);
		int rowCount =dao.registerStudent(bo);
		if(rowCount>0) {
			return "student saved successfully! Average of three marks is :"+avg; 
		}
		else {
			return "Something went wrong! student is not registered successfully."; 
		}
	}
}
