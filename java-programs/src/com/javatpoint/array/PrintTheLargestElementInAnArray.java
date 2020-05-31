/**
 * 
 */
package com.javatpoint.array;

/**
 * @author Vipin Patel
 *
 */
public class PrintTheLargestElementInAnArray {
	public static void main(String[] args) {
		int arr[]={2,5,6,7,81,3,4,5,6,8};
		int maxElement=findMaxElement(arr);
		System.out.println(maxElement);
		int minElement=findMinElement(arr);
		System.out.println(minElement);
	}

	private static int findMaxElement(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	private static int findMinElement(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
}
