package com.javatpoint.string;

public class StringFormatter {
	public static String capitalizeWord(String str) {
		String words[] = str.split("\\s");
		String capitalizeWord = "";
		for (String w : words) {
			String first = w.substring(0, 1);
			//System.out.println(first);
			String afterfirst = w.substring(1);
			//System.out.println(afterfirst);
			capitalizeWord += first.toLowerCase() + afterfirst.toUpperCase() + " ";
		}
		return capitalizeWord.trim();
	}

	public static void main(String[] args) {
		System.out.println(StringFormatter.capitalizeWord("reverse each word of a string"));
		System.out.println(StringFormatter.capitalizeWord("I am sonoo jaiswal"));
	}
}