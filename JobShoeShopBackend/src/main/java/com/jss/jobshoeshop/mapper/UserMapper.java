package com.jss.jobshoeshop.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.jss.jobshoeshop.model.User;

public class UserMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setUsername(rs.getString("username"));
		user.setHashPassword(rs.getBytes("hashpassword"));
		user.setSaltPassword(rs.getBytes("saltpassword"));
		return user;
	}

}
