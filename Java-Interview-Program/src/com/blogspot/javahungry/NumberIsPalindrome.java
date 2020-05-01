package com.blogspot.javahungry;

public class NumberIsPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrom(4334));
	}
	public static boolean isPalindrom(int number) {
		int temp=number;
		int sum=0,remender;
		while(number>0) {
			remender=number%10;
			sum=(sum*10)+remender;
			number=number/10;
		}
		if(sum==temp) {
			return true;
		}
		return false;
		
	}

}
