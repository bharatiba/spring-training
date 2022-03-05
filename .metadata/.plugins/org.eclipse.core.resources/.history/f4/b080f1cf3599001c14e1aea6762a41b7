package com.bel.training.springcore;

public class Book {

	private int bookId;
	private String bookName;
	private Long price;
	
	public Book() {
		// TODO Auto-generated constructor stub
		System.out.println("DI using constructor injection");
	}

	public Book(int bookId, String bookName, Long price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	
	
	
	public Book(int bookId) {
		super();
		this.bookId = bookId;
	}
	

	public Book(String bookName) {
		super();
		this.bookName = bookName;
	}
	

	public Book(Long price) {
		super();
		this.price = price;
	}

	void display() {
		System.out.println("Book details -------------------------------");
		System.out.println(this.bookId + " " + this.bookName + " " + this.price);
	}
	
}
