package com.javatpoint.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindTheFrequencyOfEachElementInTheArray {
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,4,3,2,3,1,6};
		FindTheFrequency(arr);
		
	}
	public static void FindTheFrequency(int [] arr) {
		Map<Integer, Integer> m=new HashMap<>();
		for(int i:arr) {
			if(m.containsKey(i)) {
				m.put(i, m.get(i)+1);
			}else {
				m.put(i, 1);
			}
		}
		for(Entry<Integer, Integer> i:m.entrySet()) {
			System.out.println("element :"+i.getKey()+" freq :"+i.getValue());
		}
		System.out.print("duplicate element :");
		for(Entry<Integer, Integer> i:m.entrySet()) {
			if(i.getValue()>1)
			System.out.print(i.getKey()+" ");
		}
	}

}
