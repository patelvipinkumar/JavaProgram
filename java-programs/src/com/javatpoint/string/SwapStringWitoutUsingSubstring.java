package com.javatpoint.string;

class SwapStringWitoutUsingSubstring{
	public static void main(String [] args){
		
		String a= "vipin";
		String b="patel";
		
		a = a.concat("d" + b);
		b = a.split("d")[0];
		a = a.split("d")[1];
		
		System.out.println(a);
		System.out.println(b);
		
	}	
}