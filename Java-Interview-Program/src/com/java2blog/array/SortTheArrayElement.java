package com.java2blog.array;

public class SortTheArrayElement {
	public static void main(String[] args) {
		int arr[]= {9,3,5,6,2,1};
		arraySort(arr);
	}

	public static void arraySort(int[] arr) {
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}
}
