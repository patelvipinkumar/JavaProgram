package com.blogspot.javahungry;

public class FactorialProgramUsingRecursion {

	public static void main(String[] args) {
		 int i,fact=1;  
		  int number=4;//It is the number to calculate factorial    
		  fact = factorial(number);   
		  System.out.println("Factorial of "+number+" is: "+fact);

	}
	public static int factorial(int num) {
		if(num==0) {
			return 1;
		}else
			return (num*factorial(num-1));
		
	}
}
