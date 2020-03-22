package com.jss.jobshoeshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jss.jobshoeshop.model.Customer;
import com.jss.jobshoeshop.service.CustomerService;

@RestController
@RequestMapping("customers")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable Double id) {
		System.out.println("CustomerController: "+ id);
		return customerService.getCustomerById(id);
	}

}
