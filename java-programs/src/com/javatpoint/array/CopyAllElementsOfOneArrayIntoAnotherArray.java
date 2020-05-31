package com.javatpoint.array;

public class CopyAllElementsOfOneArrayIntoAnotherArray {
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,4,3};
		int brr[]= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			brr[i]=arr[i];
		}
		for(int i=0;i<brr.length;i++) {
			System.out.print(" "+brr[i]);
		}
	}

}
