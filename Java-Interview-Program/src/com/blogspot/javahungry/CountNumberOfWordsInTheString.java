package com.blogspot.javahungry;


public class CountNumberOfWordsInTheString {

	public static void main(String[] args) {
		String orginalString="vipin Patel";
		char[]arr=new char[orginalString.length()];
		int c=0,i;
		for(i=0;i<orginalString.length();i++) {
			arr[i]=orginalString.charAt(i);
			if (((i>0)&&(arr[i]!=' ')&&(arr[i-1]==' '))||((arr[0]!=' ')&&(i==0)))
				c++;
			
		}
		
		System.out.println(c);
	}

}
