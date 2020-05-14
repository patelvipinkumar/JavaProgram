package com.blogspot.javahungry;

public class StringConcatenation {

	public static void main(String[] args) {
		String s1="1234";
		String s2="5678";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append(s1).append(s2));
		StringBuffer buff=new StringBuffer();
		System.out.println(sb.append(s1).append(s2));
	}

}
