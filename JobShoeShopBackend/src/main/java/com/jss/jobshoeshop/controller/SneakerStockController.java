package com.jss.jobshoeshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jss.jobshoeshop.model.SneakerStock;
import com.jss.jobshoeshop.service.SneakerStockService;

@RestController
@RequestMapping("sneakerstocks")
public class SneakerStockController {
	
	@Autowired
	SneakerStockService sneakerStockService;
	
	@GetMapping("/{id}")
	public SneakerStock getSneakerByID(@PathVariable String id) {
		return sneakerStockService.getStockById(id);
	}
	
	@GetMapping("/all")
	public List<SneakerStock> getAllStock(){
		return sneakerStockService.getAllStock();
	}

}
