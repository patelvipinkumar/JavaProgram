package com.java2blog.Numbers;

public class SwapingTwoNumbers {
	public static void main(String[] args) {
		int a=10,b=50;
		
		System.out.println("First way");
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swaping a:"+a +" b:"+b);
		
		 System.out.println("second way");
		 a=a*b;
		 b=a/b;
		 a=a/b;
		 System.out.println("after swaping a:"+a +" b:"+b);
	}
}
