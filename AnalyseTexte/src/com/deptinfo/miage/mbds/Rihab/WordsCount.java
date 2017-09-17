package com.deptinfo.miage.mbds.Rihab;

import java.util.ArrayList;

/**
 * A class that will provides methods to create a report that shows a count of
 * how many times each word occurs in the text.
 */

public class WordsCount {

	String[] phrase;

	/**
	 * Constructor
	 */
	public WordsCount(String[] phrase) {
		this.phrase = phrase;
	}

	/**
	 * A methods which counts how many times each word occurs in the text.
	 */
	public ArrayList<String> repeat() {
		ArrayList<String> resultats = new ArrayList<String>();
		for (int i = 0; i < phrase.length; i++) {
			int compte = 0;
			for (int j = 0; j < phrase.length; j++) {
				if (phrase[i].equals(phrase[j])) {
					++compte;
				}
			}
			resultats.add(compte + " " + phrase[i]);
		}
		return resultats;
	}

	/**
	 * A methods which deletes duplicates in the result.
	 */
	public ArrayList<String> deleteDupplicate() {
		ArrayList<String> resultats = this.repeat();
		for (int i = 0; i < resultats.size(); i++) {
			int compt = 0;
			for (int j = 0; j < resultats.size(); j++) {
				if (resultats.get(i).equals(resultats.get(j))) {
					compt = compt + 1;
					if (compt > 1) {
						resultats.remove(j);
					}
				}

			}
		}
		return resultats;

	}

}
