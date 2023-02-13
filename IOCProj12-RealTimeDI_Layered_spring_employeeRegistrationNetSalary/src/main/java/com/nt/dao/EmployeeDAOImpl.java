package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String INSERT_CUSTOMER_QUERY="INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)";
	// get connection from jdbc connection pool
	private DataSource dataSource;
	public EmployeeDAOImpl(DataSource dataSource) {
		this.dataSource=dataSource;	
	}
	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception  {
		Connection con =dataSource.getConnection();	
		// PreparedStatement is an inteface & has method executeUpdate
		PreparedStatement ps=con.prepareStatement(INSERT_CUSTOMER_QUERY);
	
		ps.setString(1,bo.geteName());
		ps.setString(2,bo.geteDesg());
		ps.setFloat(3,bo.geteBasicSalary());
		ps.setFloat(4,bo.geteGrossSalary());
		ps.setFloat(5,bo.geteNetSalary());
		int rowCount = ps.executeUpdate();
		ps.close();
		return rowCount;
	}
}