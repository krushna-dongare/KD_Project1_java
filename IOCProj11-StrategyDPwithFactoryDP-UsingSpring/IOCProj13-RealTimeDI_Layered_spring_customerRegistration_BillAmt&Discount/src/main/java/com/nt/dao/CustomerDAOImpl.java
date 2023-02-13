package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class CustomerDAOImpl implements ICustomerDAO {
	private static final String INSERT_CUSTOMER_QUERY="INSERT INTO BILLAMOUNT VALUES(CUSTOMER_ID_SEQUENCE.NEXTVAL,?,?,?,?,?)";
	// get connection from jdbc connection pool
	private DataSource dataSource;
	public CustomerDAOImpl(DataSource dataSource) {
		this.dataSource=dataSource;	
	}
	@Override
	public int insertCustomer(CustomerBO bo) throws Exception  {
		Connection con =dataSource.getConnection();	
		// PreparedStatement is an inteface & has method executeUpdate
		PreparedStatement ps=con.prepareStatement(INSERT_CUSTOMER_QUERY);
		//ps.setInt(1,bo.geteNo());
		ps.setString(1,bo.getName());
		ps.setString(2,bo.getItems());
		ps.setDouble(3,bo.getMarketPrice());
		ps.setDouble(4,bo.getDiscount());
		ps.setDouble(5,bo.getBillAmt());
		int rowCount = ps.executeUpdate();
		ps.close();
		return rowCount;
	}
}