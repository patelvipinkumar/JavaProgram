package com.java2blog.Numbers;

public class PrimeNumber {
	
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.out.println(prime(30));
	}
	
	static boolean prime(int n) {
		
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
