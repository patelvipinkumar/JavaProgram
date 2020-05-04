package com.blogspot.javahungry;

public class RemoveSpecificCharactersInTheString {

	public static void main(String[] args) {
		String s = "jyoti patel vipin patel";
		String remove = "ytvl";

		lab1: for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < remove.length(); j++) {
				if (s.charAt(i) == remove.charAt(j)) {
					continue lab1;
				}
			}
			System.out.print(s.charAt(i));
		}

	}

}
