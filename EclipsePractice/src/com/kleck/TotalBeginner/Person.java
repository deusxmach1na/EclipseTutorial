package com.kleck.TotalBeginner;

public class Person {
	private String name;
	private int maximumBooks;
	
	public Person() {
		this.name = "unknown";
		this.maximumBooks = 3;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaximumBooks() {
		return maximumBooks;
	}
	public void setMaximumBooks(int maximumBooks) {
		this.maximumBooks = maximumBooks;
	}
	
	public String toString() {
		return this.getName() + " (" + this.getMaximumBooks() + " books)";
	}
	
	
}
