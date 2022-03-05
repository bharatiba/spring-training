package com.bel.training.springcore;

public class Student {
	
	private String name;

	public void display() {
		System.out.println("Hello world from spring by " + name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
