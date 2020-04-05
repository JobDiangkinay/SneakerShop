package com.jss.jobshoeshop.model;

public class SneakerOrder {

	private String SneakerOrderId;
	private Sneaker Sneaker;
	private int Quantity;
	private String SneakerSize;
	
	public SneakerOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getSneakerOrderId() {
		return SneakerOrderId;
	}

	public void setSneakerOrderId(String sneakerOrderId) {
		SneakerOrderId = sneakerOrderId;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getSneakerSize() {
		return SneakerSize;
	}

	public void setSneakerSize(String sneakerSize) {
		SneakerSize = sneakerSize;
	}


	public Sneaker getSneaker() {
		return Sneaker;
	}



	public void setSneaker(Sneaker sneaker) {
		Sneaker = sneaker;
	}


	public SneakerOrder(String sneakerOrderId, com.jss.jobshoeshop.model.Sneaker sneaker, int quantity,
			String sneakerSize) {
		super();
		SneakerOrderId = sneakerOrderId;
		Sneaker = sneaker;
		Quantity = quantity;
		SneakerSize = sneakerSize;
	}
	
}
