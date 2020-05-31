/**
 * 
 */
package com.javatpoint.array;

/**
 * @author Vipin Patel
 *
 */
public class PrintTheDuplicateElementsOfAnArray {

	public static void main(String[] args) {
		int arr[]= {2,5,6,7,8,3,4,5,6};
		printDuplicate(arr);

	}

	public static void printDuplicate(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+" ");
				}
			}
		}
		
	}

}
