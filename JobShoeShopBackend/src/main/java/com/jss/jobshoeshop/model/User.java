package com.jss.jobshoeshop.model;

public class User {

	private String username;
	private byte[] saltPassword;
	private byte[] hashPassword;
	
	public User() {
		super();
	}

	public User(String username, byte[] saltPassword, byte[] hashPassword) {
		super();
		this.username = username;
		this.saltPassword = saltPassword;
		this.hashPassword = hashPassword;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public byte[] getSaltPassword() {
		return saltPassword;
	}

	public void setSaltPassword(byte[] saltPassword) {
		this.saltPassword = saltPassword;
	}

	public byte[] getHashPassword() {
		return hashPassword;
	}

	public void setHashPassword(byte[] hashPassword) {
		this.hashPassword = hashPassword;
	}

	
}
