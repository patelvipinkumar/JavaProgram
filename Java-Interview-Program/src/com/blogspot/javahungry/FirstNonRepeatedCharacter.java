package com.blogspot.javahungry;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		System.out.println("First non repeated character for String analogy is : " + getNonRepeatedCharacter("analogy"));
	  System.out.println("First non repeated character for String easiest is : " + getNonRepeatedCharacter("easiest"));
		
	}
	 public static Character getNonRepeatedCharacter(String str) {
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
		for(Entry<Character, Integer> m:charCount.entrySet()) {

			if(m.getValue()==1) {
				return m.getKey();
			}
			
				
		}
		return null;
			
	}

}
