package com.blogspot.javahungry;

public class ChangeCaseOfAllCharactersInString {

	public static void main(String[] args) {
		System.out.println("Original String is : ");
        System.out.println("Alive is awesome ");
       changecase("Alive is awesome ");
	}
	public static void changecase(String s) {
		for(int i=0;i<s.length();i++) {
			int ch=s.charAt(i);
			if(ch>=65 && ch<=90) {
				ch=ch+32;
				System.out.print((char)ch);
			}
			if(ch>=97 && ch<=122) {
				ch=ch-32;
				System.out.print((char)ch);
			}
			if (ch==32) {
				System.out.print(" ");
			}
		}
	}

}
