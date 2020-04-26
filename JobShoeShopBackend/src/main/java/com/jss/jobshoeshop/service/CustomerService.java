package com.jss.jobshoeshop.service;

import java.util.List;

import com.jss.jobshoeshop.model.Customer;
import com.jss.jobshoeshop.model.User;

public interface CustomerService {
	Customer getCustomerById(Double customerId);
	List<Customer> getAllCustomer();
	Customer createCustomer(Customer newCustomer);
	User createUser(String username, String password, String customerId);
	boolean authenticateUser(String username, String password);

}
