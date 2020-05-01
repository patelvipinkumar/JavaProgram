package com.blogspot.javahungry;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int number = 153;
		System.out.println(isArmstrongNumber(1503));
	}

	public static boolean isArmstrongNumber(int num) {
		int temp = num;
		int remender;
		int sum = 0;
		while (num > 0) {
			remender = num % 10;
			sum = sum + (remender * remender * remender);
			num = num / 10;
		}
		if (temp == sum) {
			return true;
		}
		return false;

	}

}
