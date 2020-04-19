package com.jss.jobshoeshop.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.jss.jobshoeshop.mapper.SneakerOrderMapper;
import com.jss.jobshoeshop.model.Address;
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
	
	public List<SneakerOrder> getCartSneakerOrders(String customerId){
		String sql = "SELECT sneakerorderid FROM cartcustomersneakerorderref where customerid=?";
		List<SneakerOrder> sneakerOrderList = new ArrayList<SneakerOrder>();
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql,new Object[]{customerId});
		for (Map<String, Object> row : rows) {
			sneakerOrderList.add(getSneakerOrderById((String) row.get("sneakerorderid")));
		}
		return sneakerOrderList;
	}

}
