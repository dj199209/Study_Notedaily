package com.dj.domain;

public class Person {
	private String username;
	private String password;
	
	public Person() {
		System.out.println("空参构造器");
	}
	public Person(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public void eat() {
		System.out.println("会吃");
	}
	public String getUsername() {
		return username; 
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
