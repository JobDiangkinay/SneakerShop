package com.jss.jobshoeshop.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jss.jobshoeshop.data.SneakerOrderRepository;
import com.jss.jobshoeshop.model.SneakerOrder;
import com.jss.jobshoeshop.service.SneakerOrderService;

@Service
public class SneakerOrderServiceImpl implements SneakerOrderService{
	
	@Autowired
	SneakerOrderRepository sneakerOrderRepository;

	@Override
	public SneakerOrder getSneakerOrderById(String id) {
		return sneakerOrderRepository.getSneakerOrderById(id);
	}
	
	@Override
	public List<SneakerOrder> getCustomerCartById(String id) {
		return sneakerOrderRepository.getCartSneakerOrders(id);
	}

	@Override
	public SneakerOrder addSneakerOrder(SneakerOrder sneakerOrder) {
		// TODO Auto-generated method stub
		return null;
	}

}
