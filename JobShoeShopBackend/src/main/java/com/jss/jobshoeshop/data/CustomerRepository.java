package com.jss.jobshoeshop.data;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.jss.jobshoeshop.mapper.CustomerMapper;
import com.jss.jobshoeshop.model.Address;
import com.jss.jobshoeshop.model.Customer;

@Repository
public class CustomerRepository extends JdbcDaoSupport{
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	AddressRepository addressRepository;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	public Customer getCustomerById(Double id) {
		String sql = "SELECT * FROM customer WHERE customerid=?";
		System.out.println("CustRepository: "+id);
		Customer customer = (Customer)getJdbcTemplate().queryForObject(sql,new Object[]{id}, new CustomerMapper());
		List<Address> listAddress = addressRepository.getAddressByCustomerId(id);
		customer.setAddressList(listAddress);
		return customer;
	}

}
