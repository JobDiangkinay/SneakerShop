package com.jss.jobshoeshop.model;

public class Address {
	private String streetAddress;
	private String aptNo;
	private String state;
	private String zipCode;
	private String city;
	private boolean isDefault = false;
	
	public Address() {
	}
	
	public Address(String streetAddress, String aptNo, String state, String zipCode, String city, boolean isDefault) {
		super();
		this.streetAddress = streetAddress;
		this.aptNo = aptNo;
		this.state = state;
		this.zipCode = zipCode;
		this.city = city;
		this.isDefault = isDefault;
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
