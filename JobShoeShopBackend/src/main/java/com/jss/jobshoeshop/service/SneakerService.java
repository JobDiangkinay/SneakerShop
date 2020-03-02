package com.jss.jobshoeshop.service;

import java.util.List;

import com.jss.jobshoeshop.model.Sneaker;

public interface SneakerService {

	Sneaker getSneakerById(String id);
	List<Sneaker> getAllSneakers();
	List<Sneaker> getSneakersByBrand(String brandName);
	Sneaker insertSneaker(Sneaker sneaker);
}
