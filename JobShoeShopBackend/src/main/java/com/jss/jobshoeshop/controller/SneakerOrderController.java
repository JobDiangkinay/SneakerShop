package com.jss.jobshoeshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jss.jobshoeshop.model.SneakerOrder;
import com.jss.jobshoeshop.service.SneakerOrderService;

@RestController
@RequestMapping("sneakerorders")
public class SneakerOrderController {
	
	@Autowired
	SneakerOrderService sneakerOrderService;
	
	@GetMapping("/{id}")
	public SneakerOrder getSneakerOrderById(@PathVariable String id) {
		return sneakerOrderService.getSneakerOrderById(id);
	}

}
