package com.kleck.TotalBeginner;

import junit.framework.TestCase;

public class BookTest extends TestCase {
	
	public void testBook() {
		Book b1 = new Book("Great Expectations");
		assertEquals("Great Expectations", b1.title);
		assertEquals("unknown author", b1.author);
	}

	public void testGetPerson() {	
		Book b2 = new Book("Tale of Two Cities");
		Person p1 = new Person();
		p1.setName("Elvis");
		b2.setPerson(p1);
		
//		Person testPerson = b2.getPerson();
//		String testName = testPerson.getName();
		String testName = b2.getPerson().getName();
		assertEquals("Elvis", testName);
	}
	
}
