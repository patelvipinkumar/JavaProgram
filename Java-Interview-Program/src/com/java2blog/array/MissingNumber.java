package com.java2blog.array;

public class MissingNumber {
	public static void main(String[] args) {
		int [] arr= {1,2,3,5,6,7,8};
		System.out.println("missing no is :"+ findTheMissingNumber(arr));
	}
	public static int findTheMissingNumber(int [] arr) {
		
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		
		int restsum=0;
		for(int i=0;i<arr.length;i++) {
			restsum=restsum+arr[i];
		}
		return (sum-restsum);
		
	}

}
