package com.blogspot.javahungry;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayToTreeSet {
	public static void main(String[] args) {
		Integer [] arr= {1,3,4,5,6,7,8,2,1};
		List<Integer> list=Arrays.asList(arr);
		Set<Integer> set=new HashSet<>(list);
		for(Integer i:arr) {
			System.out.println(i);
		}
		Integer [] input=new Integer[set.size()];
		set.toArray(input);
		for(Integer in:input) {
			System.out.println(in);
		}
	}

}
