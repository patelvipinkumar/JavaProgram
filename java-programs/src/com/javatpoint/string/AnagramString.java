package com.javatpoint.string;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		isAnagram("Keep", "Peek");
		isAnagram("Mother In Law", "Hitler Woman");
	}

	public static void isAnagram(String str11, String str12) {
		String str1 = str11.replace(" ", "");
		String str2 = str12.replace(" ", "");
		if (str1.length() != str2.length()) {
			System.out.println("not anagaram");
		} else {

			char[] s1 = str1.toLowerCase().toCharArray();
			char[] s2 = str2.toLowerCase().toCharArray();
			Arrays.sort(s1);
			Arrays.sort(s2);

			if (Arrays.equals(s1, s2)) {
				System.out.println("anagram");
			} else {
				System.out.println("not anagram");
			}
		}
	}

}
