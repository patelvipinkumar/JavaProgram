package com.blogspot.javahungry;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheMaximumValueInArray {

	public static void main(String[] args) {
		Integer[]arr= {2,4,7,167,9,34};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		List<Integer> list = Arrays.asList(arr);
		System.out.println(Collections.min(list));
	}

}
