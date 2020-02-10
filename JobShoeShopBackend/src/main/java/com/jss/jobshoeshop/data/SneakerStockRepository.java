package com.jss.jobshoeshop.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.jss.jobshoeshop.model.SneakerStock;

@Repository
public class SneakerStockRepository extends JdbcDaoSupport {
	@Autowired
	DataSource dataSource;

	@PostConstruct
	private void initialize() {
		setDataSource(dataSource);
	}

	public List<SneakerStock> getAllStock() {
		String sql = "SELECT * FROM shoestock";

		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		List<SneakerStock> result = new ArrayList<SneakerStock>();
		String Stringsize = "size";
		String halfSize = "_5";

		for (Map<String, Object> row : rows) {
			SneakerStock sneakerStock = new SneakerStock();
			sneakerStock.setModelid((String) row.get("modelid"));
			Map<String, Integer> size = new HashMap<>();

			for (int i = 7; i <= 13; i++) {
				size.put(Stringsize.concat(Integer.toString(i)),
						(Integer) row.get(Stringsize.concat(Integer.toString(i))));
				if (i < 13) {
					size.put(Stringsize.concat(Integer.toString(i)).concat(halfSize),
							(Integer) row.get(Stringsize.concat(Integer.toString(i).concat(halfSize))));
				}

			}
			sneakerStock.setStockList(size);
			result.add(sneakerStock);
		}
		return result;

	}
}
