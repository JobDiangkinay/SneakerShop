package com.jss.jobshoeshop.service;

import java.util.List;
import com.jss.jobshoeshop.model.Customer;

public interface CustomerService {
	Customer getCustomerById(double customerId);
	List<Customer> getAllCustomer();
	Customer createCustomer(Customer newCustomer);

}
