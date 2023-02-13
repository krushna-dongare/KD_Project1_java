package com.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.customer.bo.StudentBO;

public class StudentDaoImpl implements StudentDao {
	private static final String INSERT_STUDENT_QUERY="INSERT INTO STUDENT1 VALUES(?,?,?,?,?,?)";
	// get connection from jdbc connection pool
	private DataSource dataSource;
	public StudentDaoImpl(DataSource dataSource) {
		this.dataSource=dataSource;	
	}
	@Override
	public int registerStudent(StudentBO bo) throws Exception {
		Connection con =dataSource.getConnection();	
		// PreparedStatement is an inteface & has method executeUpdate
		PreparedStatement ps=con.prepareStatement(INSERT_STUDENT_QUERY);
		ps.setString(1,bo.getName());
		ps.setFloat(2,bo.getM1());
		ps.setFloat(3,bo.getM2());
		ps.setFloat(4,bo.getM3());
		ps.setFloat(5,bo.getTotal());
		ps.setFloat(6, bo.getAvg());
		int rowCount=0;
		rowCount = ps.executeUpdate();
		return rowCount;
	}
}
