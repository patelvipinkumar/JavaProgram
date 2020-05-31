/**
 * 
 */
package com.javatpoint.array;

/**
 * @author Vipin Patel
 *
 */
public class PrintTheElementsOfAnArraysortOnDesc {
	public static void main(String[] args) {
		int arr[] = { 9, 3, 4, 6, 1, 5 };

		System.out.println("sort the array on asc :");
		int sortarr[] = arraysortOnAsc(arr);
		for (int i = 0; i < sortarr.length; i++) {
			System.out.print(sortarr[i] + " ");
		}
		System.out.println();
		System.out.println("sort the array on Desc:");
		int sortarrDesc[] = arraysortOnDesc(arr);
		for (int i = 0; i < sortarrDesc.length; i++) {
			System.out.print(sortarrDesc[i] + " ");
		}
	}

	public static int[] arraysortOnAsc(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		return arr;
	}

	public static int[] arraysortOnDesc(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		return arr;
	}
}
