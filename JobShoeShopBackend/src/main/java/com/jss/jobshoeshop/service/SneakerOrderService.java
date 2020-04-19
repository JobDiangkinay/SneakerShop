package com.jss.jobshoeshop.service;

import java.util.List;

import com.jss.jobshoeshop.model.SneakerOrder;

public interface SneakerOrderService {
	SneakerOrder getSneakerOrderById(String id);
	SneakerOrder addSneakerOrder(SneakerOrder sneakerOrder);
	List<SneakerOrder> getCustomerCartById(String id);
}
