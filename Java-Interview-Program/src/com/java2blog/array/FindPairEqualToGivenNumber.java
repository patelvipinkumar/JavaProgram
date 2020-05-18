package com.java2blog.array;

import java.util.HashMap;
import java.util.Map;

public class FindPairEqualToGivenNumber {
	public static void main(String[] args) {
		int array[] = { -40, -5, 1, 3, 6, 7, 8, 20 };
		findPairsWithSumEqualsToXBruteForce(array, 15);
		findPairsEqualsToXUsingHashing(array, 15);
	}

	public static void findPairsWithSumEqualsToXBruteForce(int[] arr, int n) {
		
		if(arr.length<2) {
			return;
		}
		System.out.println("The pair whose sum is closest to 15 using brute force method: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int tempSum=arr[i]+arr[j];
				if(tempSum==n) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
			
		}
		
	}
	
	public static void findPairsEqualsToXUsingHashing(int arr[], int X) {
		
		HashMap<Integer, Integer> elementIndexMap = new HashMap<Integer, Integer>();
		System.out.println("The pair whose sum is closest to 15 : ");
		for (int i = 0; i < arr.length; i++) {
			elementIndexMap.put(arr[i], i);
		}
		for (int i = 0; i < arr.length; i++) {
			// we have used elementIndexMap.get(X-arr[i])!=i to avoid using same
			// element twice
			if (elementIndexMap.get(X - arr[i]) != null && elementIndexMap.get(X - arr[i]) != i) //
			{
				System.out.println(arr[i] + " " + (X - arr[i]));
			}
		}
	}
	
}
