package com.jss.jobshoeshop.data;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.jss.jobshoeshop.mapper.AddressMapper;
import com.jss.jobshoeshop.model.Address;

@Repository
public class AddressRepository extends JdbcDaoSupport {
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	public List<Address> getAddressByCustomerId(Double customerId) {
		String sql = "SELECT * FROM address where customerid=?";
		List<Address> addresses = (List<Address>) getJdbcTemplate().query(sql,new Object[]{customerId}, new AddressMapper());
		return addresses;
	}

}
