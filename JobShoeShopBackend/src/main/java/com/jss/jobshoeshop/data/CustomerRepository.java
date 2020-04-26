package com.jss.jobshoeshop.data;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.jss.jobshoeshop.mapper.CustomerMapper;
import com.jss.jobshoeshop.mapper.UserMapper;
import com.jss.jobshoeshop.model.Address;
import com.jss.jobshoeshop.model.Customer;
import com.jss.jobshoeshop.model.User;

@Repository
public class CustomerRepository extends JdbcDaoSupport {

	@Autowired
	DataSource dataSource;

	@Autowired
	AddressRepository addressRepository;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	public Customer getCustomerById(Double id) {
		String sql = "SELECT * FROM customer WHERE customerid=?";
		Customer customer = (Customer) getJdbcTemplate().queryForObject(sql, new Object[] { id }, new CustomerMapper());
		List<Address> listAddress = addressRepository.getAddressByCustomerId(id);
		customer.setAddressList(listAddress);
		return customer;
	}

	public Customer insertCustomer(Customer customer) {
		String sql = "INSERT INTO customer (firstname, lastname, emailaddress, phonenumber) VALUES (?, ?, ?, ?)";
		getJdbcTemplate().update(sql, new Object[] { customer.getFirstName(), customer.getLastName(),
				customer.getEmailAddress(), customer.getPhoneNumber() });
		return customer;
	}
	
	public User insertUser(User user, String customerId) {
		String sql = "INSERT INTO users (username,customerid,saltpassword,hashpassword) values (?,?,?,?)";
		getJdbcTemplate().update(sql, new Object[] {user.getUsername(),customerId,user.getSaltPassword(),user.getHashPassword()});
		return user;
	}
	
	public User getUserByUsername(String username) {
		String sql = "SELECT * FROM users WHERE username=?";
		User user = (User) getJdbcTemplate().queryForObject(sql, new Object[] { username }, new UserMapper());
		return user;
	}

}
