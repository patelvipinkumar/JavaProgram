package com.blogspot.javahungry;

import java.util.Arrays;

public class AnagramProgram {
	public static void main(String[] args) {
		
		if(isAnagram("now","own")) {
			System.out.println("Anagram");
		}else
			System.out.println("not Anagram");
	}
	
	public static boolean isAnagram(String str1,String str2) {
		str1=str1.replaceAll("\\s", "").toLowerCase();
		str2=str2.replaceAll("\\s", "").toLowerCase();
		if (str1.length() != str2.length())
	        return false;
		char[] c1=str1.toCharArray();
		Arrays.sort(c1);
		char[] c2=str2.toCharArray();
		Arrays.sort(c2);
		 
		 if(Arrays.equals(c1, c2)) {
			 return true;
		 }
		
		return false;
		
	}
}
