package com.jss.jobshoeshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jss.jobshoeshop.data.SneakerStockRepository;
import com.jss.jobshoeshop.model.SneakerStock;

@Service
public class SneakerStockServiceImpl implements SneakerStockService {
	
	@Autowired
	SneakerStockRepository sneakerStockRepository;

	@Override
	public SneakerStock getStockById(String id) {
		return sneakerStockRepository.getStockById(id);
	}

	@Override
	public List<SneakerStock> getAllStock() {
		// TODO Auto-generated method stub
		return sneakerStockRepository.getAllStock();
	}

	@Override
	public SneakerStock insertSneakerStock() {
		// TODO Auto-generated method stub
		return null;
	}

}
