package com.jss.jobshoeshop.service;

import java.util.List;

import com.jss.jobshoeshop.model.SneakerStock;

public interface SneakerStockService {
	
	SneakerStock getStockById(String id);
	List<SneakerStock> getAllStock();
	SneakerStock insertSneakerStock();

}
