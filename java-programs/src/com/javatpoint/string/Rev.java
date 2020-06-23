package com.javatpoint.string;

public class Rev {
	public static void main(String[] args) {
		String s ="1 2 3";
		//String[] c=s.split("");
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
				
	}

}
