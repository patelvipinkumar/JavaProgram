package com.blogspot.javahungry;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no:");
		int n = sc.nextInt();

		int f = 1;

		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		System.out.println("Factorial of " + n + " is :" + f);
	}

}
