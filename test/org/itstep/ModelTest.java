package org.itstep;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ModelTest {

	@Test
	public void testInputWordByScanerWord1() {
		
		Model model = new Model();
		String word = "Mariia";
		String result = model.inputWordByScanerWord1(word);
		assertEquals("Mariia", result);
		
	}
	
	@Test
	public void testInputWordByScanerWord11() {
		
		Model model = new Model();
		String word = "Mariia";
		String result = model.inputWordByScanerWord1(word);
		assertNotNull(result);
		
	}

	@Test
	public void testInputWordByScanerWord12() {
		
		Model model = new Model();
		String word = "Vova";
		String result = model.inputWordByScanerWord1(word);
		assertNull(result);
		
	}
	
	@Test
	public void testInputWordByScanerWord2() {
		
		Model model = new Model();
		String word = "Lichman";
		String result = model.inputWordByScanerWord2(word);
		assertEquals("Lichman", result);
	}
	
	@Test
	public void testInputWordByScanerWord21() {
		
		Model model = new Model();
		String word = "Lichman";
		String result = model.inputWordByScanerWord2(word);
		assertNotNull(result);
	}

	@Test
	public void testInputWordByScanerWord22() {
		
		Model model = new Model();
		String word = "Ponchik";
		String result = model.inputWordByScanerWord2(word);
		assertNull(result);
	}
	
	
	@Test
		public void testInputWordByScanerNumber() { 
		
		Model model = new Model();
		int number = 8;
		int result = model.inputWordByScanerNumber(number);
		assertEquals(8, result);
		
	}
	
		@Test
	public void testInputWordByScanerNumber1() {  
		
		Model model = new Model();
		int number = 1;
		int result = model.inputWordByScanerNumber(number);
		assertNotNull(result);
		
	}
	
	@Test
	public void testInputWordByScanerNumber2() { 
		
		Model model = new Model();
		int number = 7;
		int result = model.inputWordByScanerNumber(number);
		assertEquals(0, result);
		
	}

	@Test
	public void testInputWordByScanerNumber3() { 
		
		Model model = new Model();
		int number = 9;
		int result = model.inputWordByScanerNumber(number);
		assertEquals(0, result);
		
	}
	
	@Test
	public void testWriteSentence() {
		
		Model model = new Model();
		String word1 = "Mariia";
		String word2 = "Lichman";
		int number = 8;
		String result = model.writeSentence(word1, word2, number);
		assertEquals("Mariia Lichman " + 8, result);
		
	}

}
