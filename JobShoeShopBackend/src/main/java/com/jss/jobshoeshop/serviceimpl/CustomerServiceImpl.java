package com.jss.jobshoeshop.serviceimpl;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jss.jobshoeshop.data.CustomerRepository;
import com.jss.jobshoeshop.model.Customer;
import com.jss.jobshoeshop.model.User;
import com.jss.jobshoeshop.service.CustomerService;

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
		return customerRepository.insertCustomer(newCustomer);
	}

	@Override
	public User createUser(String username, String password, String customerId) {
		User newUser = new User();
		newUser.setUsername(username);
		SecureRandom random = new SecureRandom();
		byte[] salt = new byte[16];
		random.nextBytes(salt);
		newUser.setSaltPassword(salt);

		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-512");
			md.update(salt);

			// This is stored in database in user
			byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
			newUser.setHashPassword(hashedPassword);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(newUser.toString());
		return customerRepository.insertUser(newUser, customerId);
	}

	@Override
	public boolean authenticateUser(String username, String password) {
		User user = customerRepository.getUserByUsername(username);
		byte[] hashPassword = user.getHashPassword();
		byte[] hashSalt = user.getSaltPassword();
		try {
			MessageDigest md;
			md = MessageDigest.getInstance("SHA-512");
			md.update(hashSalt);
			byte[] hashedPassword = md.digest(password.getBytes(StandardCharsets.UTF_8));
			if (Arrays.equals(hashedPassword, hashPassword)) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
