package com.kleck.TotalBeginner;

import java.util.ArrayList;

import junit.framework.TestCase;

public class MyLibraryTest extends TestCase {
	public void testMyLibrary() {
		MyLibrary ml = new MyLibrary("Test");
		assertEquals("Test", ml.name);

		
		assertTrue(ml.books instanceof ArrayList);
		assertTrue(ml.persons instanceof ArrayList);
		
	}
	

}
