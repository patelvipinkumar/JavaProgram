package com.blogspot.javahungry;

public class CalculateTotalNumberOfCharactersInTheString {

	public static void main(String[] args) {
		String s="vipin";
		char[] ch=s.toCharArray();
		int count=0;
		for(char c:ch) {
			count++;
		}
		System.out.println(count);

	}

}
