package com.jss.jobshoeshop.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jss.jobshoeshop.model.Customer;

public class CustomerMapper implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setCustomerId(rs.getDouble("customerid"));
		customer.setFirstName(rs.getString("firstname"));
		customer.setLastName(rs.getString("lastname"));
		customer.setEmailAddress(rs.getString("emailaddress"));
		customer.setPhoneNumber(rs.getString("phonenumber"));
		return customer;
	}

}
