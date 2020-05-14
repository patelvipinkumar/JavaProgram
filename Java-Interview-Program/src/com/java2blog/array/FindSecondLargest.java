package com.java2blog.array;

public class FindSecondLargest {
	public static void main(String[] args) {
		int [] arr= {2,5,7,1,0,9};
		int secondHighest=findSecondLargest(arr);
		System.out.println("Second largest element in the array : "+ secondHighest);
	}
	
	public static int findSecondLargest(int[] arr) {
		
		int high=Integer.MIN_VALUE;
		int secondhigh=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>high) {
				secondhigh=high;
				high=arr[i];
				
			}
			else if(arr[i]>secondhigh &&arr[i]!=high) {
				secondhigh=arr[i];
			}
		}
		
		return secondhigh;
		
	}

}
