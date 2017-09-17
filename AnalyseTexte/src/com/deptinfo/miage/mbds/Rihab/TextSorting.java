package com.deptinfo.miage.mbds.Rihab;

import java.util.Arrays;

/**
 * A class that will provides methods to sort the text, with a primary sort of
 * word length, and a secondary ASCII sort.
 */
public class TextSorting {

	String text;
	String[] sentence;

	/**
	 * Constructor that takes a text as a parameter and transforms a String to
	 * an array of strings
	 */
	public TextSorting(String texte) {
		this.text = texte;
		this.sentence = texte.split(" ");
	}

	/**
	 * ASCII sort
	 */
	public String[] sortASCII() {
		java.util.Arrays.sort(sentence);
		return sentence;

	}

	/**
	 * Sort of word length
	 */
	public String[] sortLength() {
		Arrays.sort(sentence, (a, b) -> Integer.compare(a.length(), b.length()));
		return sentence;

	}

}
