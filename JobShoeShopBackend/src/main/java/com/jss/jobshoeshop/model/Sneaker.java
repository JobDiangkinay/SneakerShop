package com.jss.jobshoeshop.model;

public class Sneaker {

	private String ModelID;
	private String ModelName;
	private String Brand;

	public Sneaker() {

	}

	public Sneaker(String modelID, String modelName, String brand) {
		super();
		ModelID = modelID;
		ModelName = modelName;
		Brand = brand;
	}

	public String getModelID() {
		return ModelID;
	}

	public void setModelID(String modelID) {
		ModelID = modelID;
	}

	public String getModelName() {
		return ModelName;
	}

	public void setModelName(String modelName) {
		ModelName = modelName;
	}

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

}
