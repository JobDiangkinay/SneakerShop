package com.jss.jobshoeshop.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jss.jobshoeshop.model.Address;

public class AddressMapper implements RowMapper<Address>{

	@Override
	public Address mapRow(ResultSet rs, int rowNum) throws SQLException {
		Address address = new Address();
		address.setAddressId(rs.getDouble("addressId"));
		address.setStreetAddress(rs.getString("streetaddress"));
		address.setAptNo(rs.getString("aptno"));
		address.setCity(rs.getString("city"));
		address.setState(rs.getString("state"));
		address.setZipCode(rs.getString("zipcode"));
		address.setDefault(rs.getBoolean("isdefault"));
		return address;
	}

}
