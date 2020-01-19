package com.jss.jobshoeshop.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.jss.jobshoeshop.model.Sneaker;

@Repository
public class SneakerRepository extends JdbcDaoSupport {

	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	public List<Sneaker> getAllSneakers(){
		String sql = "SELECT * FROM shoemodel";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<Sneaker> result = new ArrayList<Sneaker>();
		for(Map<String, Object> row:rows){
			Sneaker sneaker = new Sneaker();
			sneaker.setModelID((String)row.get("modelid"));
			sneaker.setModelName((String)row.get("modelname"));
			sneaker.setBrand((String)row.get("brandname"));
			System.out.println(sneaker.getModelName());
			result.add(sneaker);
		}
		
		return result;
	}
}
