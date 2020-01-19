package com.jss.jobshoeshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jss.jobshoeshop.data.SneakerRepository;
import com.jss.jobshoeshop.model.Sneaker;

@Service
public class SneakerServiceImpl implements SneakerService{

	@Autowired
	SneakerRepository sneakerRepository;
	
	@Override
	public Sneaker getSneakerById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sneaker> getAllSneakers() {
		return sneakerRepository.getAllSneakers();
	}

	@Override
	public Sneaker insertSneaker(Sneaker sneaker) {
		return sneakerRepository.insertSneaker(sneaker);
	}

}
