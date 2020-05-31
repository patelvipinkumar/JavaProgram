/**
 * 
 */
package com.javatpoint.array;

/**
 * @author Vipin Patel
 *
 */
public class PrintTheElementsOfAnArrayInReverseOrder {
	public static void main(String[] args) {
		int arr[]={2,5,6,7,8,3,4,5,6};
		int rarr[]=reverseArrayElement(arr);
		for(int i=0;i<rarr.length;i++) {
			System.out.print(rarr[i]+" ");
		}
	}

	public static int[] reverseArrayElement(int[] arr) {
		int brr[]=new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			brr[j]=arr[i];
			j++;
		}
		return brr;
	}
}
