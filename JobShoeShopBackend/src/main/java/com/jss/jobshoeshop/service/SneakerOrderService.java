package com.jss.jobshoeshop.service;

import com.jss.jobshoeshop.model.SneakerOrder;

public interface SneakerOrderService {
	SneakerOrder getSneakerOrderById(String id);
	SneakerOrder addSneakerOrder(SneakerOrder sneakerOrder);
}
