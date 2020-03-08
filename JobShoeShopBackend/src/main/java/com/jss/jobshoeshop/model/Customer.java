package com.jss.jobshoeshop.model;

import java.util.List;

public class Customer {
	private double customerId;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String phoneNumber;
	private List<Address> addressList;
	
	public Customer() {
		super();
	}

	public Customer(double customerId, String firstName, String lastName, String emailAddress, String phoneNumber,
			List<Address> addressList) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
		this.addressList = addressList;
	}

	public double getCustomerId() {
		return customerId;
	}

	public void setCustomerId(double customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	
}
