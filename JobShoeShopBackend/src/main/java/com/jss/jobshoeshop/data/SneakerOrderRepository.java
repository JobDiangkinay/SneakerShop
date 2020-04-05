package com.jss.jobshoeshop.data;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.jss.jobshoeshop.mapper.SneakerOrderMapper;
import com.jss.jobshoeshop.model.SneakerOrder;

@Repository
public class SneakerOrderRepository extends JdbcDaoSupport{
	@Autowired
	DataSource dataSource;
	
	@Autowired
	SneakerOrderMapper sneakerOrderMapper;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}
	
	public SneakerOrder getSneakerOrderById(String sneakerOrderId) {
		String sql = "select * from sneakerorder where sneakerorderid = ?";
		Integer id = Integer.parseInt(sneakerOrderId);
		SneakerOrder sneakerOrder = (SneakerOrder) getJdbcTemplate().queryForObject(sql, new Object[] { id }, sneakerOrderMapper);
		return sneakerOrder;
	}

}
