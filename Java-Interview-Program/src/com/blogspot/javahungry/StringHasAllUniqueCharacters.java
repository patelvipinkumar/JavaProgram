package com.blogspot.javahungry;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StringHasAllUniqueCharacters {

	public static void main(String[] args) {

		boolean result=false;
        String inputstring="vipn";
        System.out.println("String method 4 answer 4 "+ getNonRepeatedCharacter(inputstring));
		
	}
	 public static boolean getNonRepeatedCharacter(String str) {
		Map<Character,Integer> charCount=new LinkedHashMap<>();
		char[] orginalChar=str.toCharArray();
		
		for(char c:orginalChar) {
			if(charCount.containsKey(c)) {
				charCount.put(c,charCount.get(c)+1);
			}
			else {
				charCount.put(c,1);
			}
			
			if(charCount.get(c) == 2)
				return false;

		}

		return true;
			
	}

}
