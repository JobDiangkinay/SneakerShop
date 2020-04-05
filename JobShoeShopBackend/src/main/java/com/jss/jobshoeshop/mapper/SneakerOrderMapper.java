package com.jss.jobshoeshop.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jss.jobshoeshop.model.SneakerOrder;
import com.jss.jobshoeshop.service.SneakerService;

@Component
public class SneakerOrderMapper implements RowMapper<SneakerOrder>{
	
	@Autowired
	SneakerService sneakerService;

	@Override
	public SneakerOrder mapRow(ResultSet rs, int rowNum) throws SQLException {
		SneakerOrder sneakerOrder = new SneakerOrder();
		sneakerOrder.setSneakerOrderId(rs.getString("sneakerorderid"));
		System.out.println(sneakerService.getSneakerById(rs.getString("sneakerid")));
		sneakerOrder.setSneaker(sneakerService.getSneakerById(rs.getString("sneakerid")));
		sneakerOrder.setQuantity(rs.getInt("quantity"));
		sneakerOrder.setSneakerSize(rs.getString("size"));
		return sneakerOrder;
	}

}
