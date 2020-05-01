
package com.blogspot.javahungry;

public class RemoveAllTheWhiteSpaces {

	public static void main(String[] args) {
		String orgString=" Vipin patel ";
		
		for(int i=0;i<orgString.length();i++) {
			if(orgString.charAt(i)!=' ') {
				System.out.print(orgString.charAt(i));
			}
		}
		

	}

}
