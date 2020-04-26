package com.jss.jobshoeshop.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jss.jobshoeshop.model.User;
import com.jss.jobshoeshop.service.CustomerService;

@RestController
@RequestMapping("login")
public class LogInController {
	
	@Autowired
	CustomerService customerService;

	@GetMapping("{username}/{password}")
	public User login(@PathVariable("username") String Username, @PathVariable("password") String Password, HttpSession session) {
		System.out.println(customerService.authenticateUser(Username, Password));
		
		return null;
	}
	
}
