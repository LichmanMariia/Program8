package org.itstep;

import java.util.Scanner;

public class Model {
	private String word1; // вызвали из класса AppRunner
	private String word2;// вызвали из класса AppRunner
	private int number; // вызвали из класса AppRunner

	public int getNumber() { // ?????
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getWord1() { // гетттер
		return word1;
	}

	public void setWord1(String word1) { //сеттер
		this.word1 = word1;
	}
	
	public String getWord2() { // гетттер
		return word2;
	}

	public void setWord2(String word2) { //сеттер
		this.word2 = word2;
	}

	public Model(String word1, String word2, byte number) { // конструктор
		super();
		this.word1 = word1;
		this.word2 = word2;
		this.number = number;
	}

	public Model() {
		super();
	}

	public String inputWordByScanerWord1(String word1) { // test
		if (word1.equals("Mariia")) { // Имя студента
			String correctWord = word1;
			return correctWord;
		} else {
			return null;
		}
	}
	
	public String inputWordByScanerWord2(String word2) { // test
		if (word2.equals("Lichman")) { // Фамилия студента
			String correctWord = word2;
			return correctWord;
		} else {
			return null;
		}
	}

	public int inputWordByScanerNumber(int number) { // test
		if (number == 8) {
			int correctNumber = number;
			return correctNumber;
		} else {
			return 0;
		}
	}

	public String writeSentence(String word1, String word2, int number) { // test
		return word1 + " " + word2 + " " + number;
	}
}
