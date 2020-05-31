/**
 * 
 */
package com.javatpoint.array;

/**
 * @author Vipin Patel
 *
 */
public class PrintTheElementsOfAnArrayPresentOnEvenPosition {
	public static void main(String[] args) {
		
		int arr[]={2,5,6,7,8,3,4,5,6,8,0};
		
		System.out.print("even pos element in array:");
		int rarr[]=evenPresentPositionArrayElement(arr);
		for(int i=0;i<rarr.length;i++) {
			System.out.print(rarr[i]+" ");
		}
		System.out.println();
		System.out.print("odd pos element in array:");
		int rarr2[]=oddPresentPositionArrayElement(arr);
		for(int i=0;i<rarr2.length;i++) {
			System.out.print(rarr2[i]+" ");
		}
	}

	public static int[] evenPresentPositionArrayElement(int[] arr) {
		int brr[]=new int[(arr.length/2)+1];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if((i+1)%2==0) {
				brr[j]=arr[i];
				j++;
			}
		}
				
		return brr;
	}
	public static int[] oddPresentPositionArrayElement(int[] arr) {
		int brr[]=new int[(arr.length/2)+1];
		int j=0;
		for(int i=0;i<arr.length;i=i+2) {
			
				brr[j]=arr[i];
				j++;
			
		}
				
		return brr;
	}
}
