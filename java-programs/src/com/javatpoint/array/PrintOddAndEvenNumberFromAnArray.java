package com.javatpoint.array;

public class PrintOddAndEvenNumberFromAnArray {
	public static void main(String[] args) {

		int arr[] = { 2, 4, 3, 5, 7, 9, 5 };
		
		System.out.println("even :");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.println("odd:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
}