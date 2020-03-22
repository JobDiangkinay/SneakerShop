package com.jss.jobshoeshop.model;

public class Address {
	private double addressId;
	private String streetAddress;
	private String aptNo;
	private String state;
	private String zipCode;
	private String city;
	private boolean isDefault = false;
	
	public Address() {
	}
	
	

	public Address(double addressId, String streetAddress, String aptNo, String state, String zipCode, String city,
			boolean isDefault) {
		super();
		this.addressId = addressId;
		this.streetAddress = streetAddress;
		this.aptNo = aptNo;
		this.state = state;
		this.zipCode = zipCode;
		this.city = city;
		this.isDefault = isDefault;
	}

	public double getAddressId() {
		return addressId;
	}

	public void setAddressId(double addressId) {
		this.addressId = addressId;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getAptNo() {
		return aptNo;
	}

	public void setAptNo(String aptNo) {
		this.aptNo = aptNo;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}
	
}
