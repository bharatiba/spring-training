package com.bel.training.springcore;

public class Candidate {

	private int id;
	private String name;
	
	private Address address;

	public Candidate() {
		System.out.println("Candidate details -------------------------");
	}

	public Candidate(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println(this.id + " " +this.name + " " + this.address);
	}
	
}
