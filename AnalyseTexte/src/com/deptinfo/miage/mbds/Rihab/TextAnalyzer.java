package com.deptinfo.miage.mbds.Rihab;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Text analyzer that processes text and provides information about its word
 * contents. It support the ability to create a report that shows a count of how
 * many times each word occurs in the text. The report is sorted, with a primary
 * sort of word length, and a secondary ASCII sort.
 */

public class TextAnalyzer {

	/**
	 * Input Text
	 */
	public String text;

	/**
	 * Constructor that takes an user input.
	 */
	public TextAnalyzer() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a text: ");
		this.text = reader.nextLine();

	}

	/**
	 * Constructor that takes a string as a parameter.
	 */
	public TextAnalyzer(String string) {
		this.text = string;
	}

	/**
	 * Method that analyzes the text.
	 * 
	 */
	public String analyze() {
		TextSorting t = new TextSorting(text);
		t.sortASCII();
		String[] res = t.sortLength();
		WordsCount c = new WordsCount(res);
		c.repeat();
		ArrayList<String> phrase = c.deleteDupplicate();
		String str = "";

		for (String s : phrase) {
			str += s + "\n";
		}

		return str;

	}

	public static void main(String[] args) {
		TextAnalyzer ta = new TextAnalyzer();
		String str = ta.analyze();
		System.out.println(str);
	}

}
