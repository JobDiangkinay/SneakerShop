package com.jss.jobshoeshop.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
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
			result.add(sneaker);
		}
		
		return result;
	}
	
	public List<Sneaker> getSneakersByBrand(String brandName){
		String sql = "SELECT * FROM shoemodel where brandname = ?";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql,new Object[]{brandName});
		
		List<Sneaker> result = new ArrayList<Sneaker>();
		for(Map<String, Object> row:rows){
			Sneaker sneaker = new Sneaker();
			sneaker.setModelID((String)row.get("modelid"));
			sneaker.setModelName((String)row.get("modelname"));
			sneaker.setBrand((String)row.get("brandname"));
			result.add(sneaker);
		}
		
		return result;
	}
	
	public Sneaker getSneakerById(String id) {
		String sql = "SELECT * FROM shoemodel WHERE modelid = ?";
		return (Sneaker)getJdbcTemplate().queryForObject(sql, new Object[]{id}, new RowMapper<Sneaker>(){
			@Override
			public Sneaker mapRow(ResultSet rs, int rwNumber) throws SQLException {
				Sneaker sneaker = new Sneaker();
				sneaker.setModelID(rs.getString("modelid"));
				sneaker.setModelName(rs.getString("modelname"));
				sneaker.setBrand(rs.getString("brandname"));
				return sneaker;
			}
		});
	}
	
	public Sneaker insertSneaker(Sneaker sneaker) {
		String sql = "INSERT INTO shoemodel (modelid, modelname, brandname) VALUES (?, ?, ?)" ;
		getJdbcTemplate().update(sql, new Object[]{
				sneaker.getModelID(), sneaker.getModelName(), sneaker.getBrand()
		});
		return sneaker;
	}
	
}
