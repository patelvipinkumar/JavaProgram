package com.javatpoint.string;

public class ReverseEachWordOfAString {
	public static void main(String[] args) {
		 System.out.println(reverseWord("my name is khan"));  
	}
	public static String reverseWord(String str){
		
		String[] word=str.split(" ");
		String reverseWord="";
		
		for(String wd:word) {
			
			String reverse="";
			//char []c=wd.toCharArray();	
			for(int i=wd.length()-1;i>=0;i--) {
				reverse=reverse+wd.charAt(i);
			}
			String first=reverse.substring(0,1);  
	        String afterfirst=reverse.substring(1);  
	        reverseWord+=first.toLowerCase()+afterfirst.toUpperCase()+" ";  
			//reverseWord=reverseWord+reverse.toString()+" ";
		
		}
		
		
		return reverseWord;
		
	}
}
