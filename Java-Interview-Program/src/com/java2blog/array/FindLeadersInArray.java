package com.java2blog.array;

public class FindLeadersInArray {
	public static void main(String[] args) {
		int arr[]={14, 12, 70, 15, 99, 90, 65, 21};
		findLeadersInAnArray(arr);
	}

	private static void findLeadersInAnArray(int[] arr) {
		
		int mfr=arr[arr.length-1];
		System.out.print(mfr+" ");
		for(int i=arr.length-2;i>0;i--) {
			if(arr[i]>mfr) {
				System.out.print(arr[i]+" ");
				mfr=arr[i];
			}
		}
		
	}
}
