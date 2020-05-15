package com.java2blog.Numbers;

public class PrintPrimeNumberMain {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(prime(i)) {
				System.out.println(" "+i);
			}
		}
		
	}
	
public static boolean prime(int n) {
		
		if(n==0||n==1) {
			return false;
		}
		for(int i=2;i<Math.sqrt(n);i++) {
			
			if(n%i==0) {
				return false;
			}
		}
		return true;
			
	}

}
