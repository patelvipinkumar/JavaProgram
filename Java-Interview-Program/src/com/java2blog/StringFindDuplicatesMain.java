package com.java2blog;
 
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
 
public class StringFindDuplicatesMain {
 
 public static void main(String[] args) {
  String str = "java2blog.com ";
  
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
  for (Character c : charCount.keySet()) {
   if (charCount.get(c) > 1)
    System.out.println("duplicate character : " + c + " ====== " + " count : " + charCount.get(c));
 
  }
 
 }
 
}