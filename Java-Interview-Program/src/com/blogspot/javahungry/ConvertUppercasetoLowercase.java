package com.blogspot.javahungry;

public class ConvertUppercasetoLowercase {

	public static void main(String[] args) {
		uppercasetoLowercase("ALIVE is awesome ");
		lowercasetoUppercase("ALIVE is awesome ");

	}
	public static void uppercasetoLowercase(String s) {
		for(int i=0;i<s.length();i++) {
			int ch=s.charAt(i);
			if(ch>=65 && ch<=90) {
				ch=ch+32;
				System.out.print((char)ch);
			}
			else 
				System.out.print((char)ch);
			if(ch==32) {
				System.out.print(" ");
			}
			
		}
	}
	public static void lowercasetoUppercase(String s) {
		for(int i=0;i<s.length();i++) {
			int ch=s.charAt(i);
			if(ch>=97 && ch<=122) {
				ch=ch-32;
				System.out.print((char)ch);
			}
			else 
				System.out.print((char)ch);
			if(ch==32) {
				System.out.print(" ");
			}
			
		}
	}

}
