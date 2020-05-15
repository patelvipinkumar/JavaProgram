package com.java2blog.Numbers;

public class JavaisNumericMain {
 
	public static void main(String args[])
	{
		System.out.println("223 is numeric :"+isNumeric("223"));
		System.out.println("27.8 is numeric : "+isNumeric("27.8"));
		System.out.println("4.2d is numeric : "+isNumeric("4.2d"));
		System.out.println("abc is numeric : "+isNumeric("abc"));
		System.out.println("-123 is numeric : "+isNumeric("-123"));
	}
 
	public static boolean isNumeric(String str) {
 
		if (str == null || str.length() == 0) {
			return false;
		}
 
		try {
			Double.parseDouble(str);
			return true;
 
		} catch (NumberFormatException e) {
			return false;
		}
 
	}
}