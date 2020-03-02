package com.jss.jobshoeshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jss.jobshoeshop.model.Sneaker;
import com.jss.jobshoeshop.service.SneakerService;

@RestController
@RequestMapping("sneakers")
public class SneakerController {
	
	@Autowired
	SneakerService sneakerService;

	@GetMapping("/{id}")
	public Sneaker getSneakerByID(@PathVariable String id) {
		return sneakerService.getSneakerById(id);
	}
	
	@GetMapping("/StringTester")
	public String getStringTester() {
		return "TestSuccessful";
	}
	
	@GetMapping("/all")
	public List<Sneaker> getAllSneakers(){
		return sneakerService.getAllSneakers();
	}
	
	@GetMapping("/brand/{brandName}")
	public List<Sneaker> getSneakerByBrandName(@PathVariable String brandName){
		return sneakerService.getSneakersByBrand(brandName);
	}
	
	
	@PostMapping("/insert")
	public Sneaker insertSneaker(@RequestBody Sneaker sneaker) {
		return sneakerService.insertSneaker(sneaker);
	}
}
