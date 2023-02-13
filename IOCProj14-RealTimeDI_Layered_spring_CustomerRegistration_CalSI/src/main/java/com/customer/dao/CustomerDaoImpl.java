package com.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.customer.bo.CustomerBO;

public class CustomerDaoImpl implements CustomerDao {
	private static final String INSERT_CUSTOMER_QUERY="INSERT INTO CUSTOMER VALUES(CUSTOMER_ID_SEQUENCE.NEXTVAL,?,?,?,?)";
	// get connection from jdbc connection pool
	private DataSource dataSource;
	public CustomerDaoImpl(DataSource dataSource) {
	this.dataSource=dataSource;	
	}
	@Override
	public int registerCustomer(CustomerBO bo) throws Exception {
	Connection con =dataSource.getConnection();	
	// PreparedStatement is an inteface & has method executeUpdate
	PreparedStatement ps=con.prepareStatement(INSERT_CUSTOMER_QUERY);
	ps.setString(1, bo.getName());
	ps.setString(2,bo.getAddress());
	ps.setFloat(3,bo.getpAmt());
	ps.setFloat(4,bo.getInterest());
	int rowCount = ps.executeUpdate();
	ps.close();
	return rowCount;
	}

	

}
