/**
 * 
 */
package com.javatpoint.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Vipin Patel
 *
 */
public class RemoveDuplicateElementInAnArray {
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
		
		System.out.print(" remove duplicate element :");
		for(Entry<Integer, Integer> i:m.entrySet()) 
		
			System.out.print(i.getKey()+" ");
		
	}
}
