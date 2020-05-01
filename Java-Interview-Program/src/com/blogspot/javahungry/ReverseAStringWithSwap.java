package com.blogspot.javahungry;

public class ReverseAStringWithSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String orginalString ="vipin patel";
		char[]tempary =orginalString.toCharArray();
		int left,right=0;
		right=tempary.length-1;
		
		for(left=0;left<right;left++,right--) {
			char temp=tempary[left];
			tempary[left]=tempary[right];
			tempary[right]=temp;
		}
		for(char c:tempary) {
			System.out.print(c);
		}

	}

}
