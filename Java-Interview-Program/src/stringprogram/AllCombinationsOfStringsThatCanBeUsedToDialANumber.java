package stringprogram;

import java.util.HashMap;
import java.util.Map;

public class AllCombinationsOfStringsThatCanBeUsedToDialANumber {

	public static void main(String[] args) {
		printStringForNumber("23"); 
		
	}
		
		
	static void printStringForNumber(String phNo) 
	    {
		
		Map<Character, String> hm=new HashMap<>();
		hm.put('2', "abc");
		hm.put('3', "def");
		hm.put('4', "ghi");
		hm.put('5', "jkl");
		hm.put('6', "mno");
		hm.put('7', "pqrs");
		hm.put('8', "tuv");
		hm.put('9', "wxyz");
		hm.put('1', "1");
		hm.put('0', "0");
		StringBuilder str=new StringBuilder();
		printString(phNo,0,hm,str);
		
		
	}


	static void printString(String phNo, int i, Map<Character, String> hm, StringBuilder str) {
		// TODO Auto-generated method stub
		
		if(i==phNo.length()) {
			System.out.println(str+" ");
			return;
		}
		String s=hm.get(phNo.charAt(i));
		for(int j=0;j<s.length();j++) {
			str.append(s.charAt(j));
			printString(phNo, i+1, hm, str);
			str.deleteCharAt(str.length()-1);
		}
		
		
		
		
		
		
		
	}

}
