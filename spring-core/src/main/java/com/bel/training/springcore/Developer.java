package com.bel.training.springcore;

import java.util.List;

public class Developer {

	private int empId;
	private String name;
	private List<String> technologies;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	
	void display() {
		System.out.println("Developer info---------------------");
		System.out.println(this.empId + " " + this.name + " " +this.getTechnologies());
		
		
		
	}
	
}
