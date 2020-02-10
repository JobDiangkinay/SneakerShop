package com.jss.jobshoeshop.model;

import java.util.Map;

public class SneakerStock {
	private String modelid;
	private Map<String,Integer> stockList;
	
	public SneakerStock() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SneakerStock(String modelid, String modelname, Map<String, Integer> stockList) {
		super();
		this.modelid = modelid;
		this.stockList = stockList;
	}
	
	public String getModelid() {
		return modelid;
	}
	public void setModelid(String modelid) {
		this.modelid = modelid;
	}
	public Map<String, Integer> getStockList() {
		return stockList;
	}
	public void setStockList(Map<String, Integer> stockList) {
		this.stockList = stockList;
	}
	
	
}
