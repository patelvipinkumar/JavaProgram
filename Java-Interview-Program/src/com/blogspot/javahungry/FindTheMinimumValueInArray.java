package com.blogspot.javahungry;

public class FindTheMinimumValueInArray {
	public static void main(String[] args) {
		int[]arr= {2,4,7,1,167,9,34};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}
