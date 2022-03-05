package com.bel.training.springcore;

public class Employee {

	private int id;
	private String name, city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	void display() {
		System.out.println("Employee details ---------------------");
		System.out.println(id + " " + name + " " + city);
	}
	
}
