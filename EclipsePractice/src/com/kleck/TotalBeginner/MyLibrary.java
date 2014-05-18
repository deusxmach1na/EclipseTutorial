package com.kleck.TotalBeginner;

import java.util.ArrayList;

public class MyLibrary {

	public ArrayList<Book> books;
	public ArrayList<Person> persons;
	public String name;

	public MyLibrary(String name) {
		this.name = name;
		this.books = new ArrayList<Book>();
		this.persons = new ArrayList<Person>();
	}

}
