package com.blogspot.javahungry;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountOccurrencesOfEachCharacter {
	public static void main(String[] args) {
		countCharacter("hi java");
	}
	
	 public static void countCharacter(String str) {
			Map<Character,Integer> charCount=new LinkedHashMap<>();
			char[] orginalChar=str.toCharArray();
			
			for(char c:orginalChar) {
				if(charCount.containsKey(c)) {
					charCount.put(c,charCount.get(c)+1);
				}
				else {
					charCount.put(c,1);
				}
				
			}
			System.out.println(charCount);
			for(Entry<Character, Integer> m:charCount.entrySet()) {
				System.out.println(m.getKey()+":"+m.getValue());
					
			}
			
				
		

	}

}
