package com.blogspot.javahungry;

import java.util.logging.Logger;

public class CalculateTotalNumberOfVowelsInString {

	public static void main(String[] args) {
		String orginalString="vipin patel";
		int count=0;
		
		for(int i=0;i<orginalString.length();i++) {
			char c=orginalString.charAt(i);
			if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')) {
				count++;
			}
		}
		System.out.println(count);
	}

}
