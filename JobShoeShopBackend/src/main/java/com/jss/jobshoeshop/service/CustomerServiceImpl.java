package com.jss.jobshoeshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jss.jobshoeshop.data.CustomerRepository;
import com.jss.jobshoeshop.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;
	

	@Override
	public Customer getCustomerById(Double customerId) {
		return customerRepository.getCustomerById(customerId);
	}

	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer createCustomer(Customer newCustomer) {
		// TODO Auto-generated method stub
		return null;
	}

}
