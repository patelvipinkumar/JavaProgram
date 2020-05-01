package com.blogspot.javahungry;

public class PalindromeAString {

	public static void main(String[] args) {
		String str = "geeg"; 
		  
        if (isPalindrome(str)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
	}

	public static boolean isPalindromeReverseString(String str) {
		String orginalString = str;

		String reverse = "";
		for (int i = 0; i < str.length(); i++) {

			reverse = reverse + str.charAt(i);
		}
		if (reverse == orginalString) {
			return true;
		}
		return false;

	}

	public static boolean isPalindrome(String str) {
		String orginalString = str;

		String reverse = "";
		int j = str.length() - 1;
		for (int i = 0; i < str.length(); i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}

		}

		return true;

	}

}
