package com.yrgo.isbntools;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateISBNTest {
	/*
	@Test
	void test() {
		//fail("Not yet implemented");
	}
	*/
	
	@Test
	public void checkValid10DigitISBN() {
		//fail();
		ValidateISBN validator = new ValidateISBN();
		//boolean result = validator.checkISBN("0140441492");
		boolean result = validator.checkISBN("0140449116");
		assertTrue(result, "First value");
		result = validator.checkISBN("0596009658");
		assertTrue(result, "Second value");
	}
	
	@Test
	public void checkValid13DigitISBN() {
		//fail();
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("9780691176543");
		assertTrue(result, "First value");
		result = validator.checkISBN("9780596009656");
		assertTrue(result, "Second value");
		
	}
	
	@Test
	public void ISBNEndXIsValid() {
		//fail();
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("069117654X");
		assertTrue(result);
	}

	@Test
	public void checkInvalid10DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("0140441493");
		assertFalse(result);
	}
	
	@Test
	public void checkInvalid13DigitISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN("9780691176544");
		assertFalse(result);
	}
	
	
	@Test
	public void nineDigitNotAllowed() {
		ValidateISBN validator = new ValidateISBN();
		assertThrows(NumberFormatException.class, () -> {validator.checkISBN("123456789");});
	}
	
	//exercise 2
	@Test
	public void nonNumericNotAllowed() {
		ValidateISBN validator = new ValidateISBN();
		assertThrows(NumberFormatException.class, () -> {validator.checkISBN("ISBNnumber");});
	}
	
}
//9780691176543
//9780596009656
