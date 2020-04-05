package com.jss.jobshoeshop.model;

import java.util.List;

public class FinalOrder {

	private String FinalOrderId;
	private Customer customer;
	private Address orderAddress;
	private List<SneakerOrder> listOfSneakers;
	private String TrackingNumber;
	
	
	
	public FinalOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FinalOrder(String finalOrderId, Customer customer, Address orderAddress, List<SneakerOrder> listOfSneakers,
			String trackingNumber) {
		super();
		FinalOrderId = finalOrderId;
		this.customer = customer;
		this.orderAddress = orderAddress;
		this.listOfSneakers = listOfSneakers;
		TrackingNumber = trackingNumber;
	}

	public String getFinalOrderId() {
		return FinalOrderId;
	}

	public void setFinalOrderId(String finalOrderId) {
		FinalOrderId = finalOrderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Address getOrderAddress() {
		return orderAddress;
	}

	public void setOrderAddress(Address orderAddress) {
		this.orderAddress = orderAddress;
	}

	public List<SneakerOrder> getListOfSneakers() {
		return listOfSneakers;
	}

	public void setListOfSneakers(List<SneakerOrder> listOfSneakers) {
		this.listOfSneakers = listOfSneakers;
	}

	public String getTrackingNumber() {
		return TrackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		TrackingNumber = trackingNumber;
	}
	
}
