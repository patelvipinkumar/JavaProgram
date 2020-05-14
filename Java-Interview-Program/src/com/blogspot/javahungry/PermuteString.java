package com.blogspot.javahungry;

public class PermuteString {
	
	public static String swapString(String a, int i, int j) {
		char[] b=a.toCharArray();
		char ch;
		ch=b[i];
		b[i]=b[j];
		b[j]=ch;
		
		return String.valueOf(b);
		
	}
	public static void main(String[] args) {
		String str="ABC";
		int len=str.length();
		System.out.println("All the permutations of the string are: ");
		generatePermutaion(str,0,len);
	}
	public static void generatePermutaion(String str, int start, int end) {
		// TODO Auto-generated method stub
		if(start==end-1) {
			System.out.println(str);
		}
		else {
			for(int i=start;i<end;i++) {
				str=swapString(str, start, i);
				generatePermutaion(str, start+1, end);
				str=swapString(str, start, i);
				
			}
			
		}
	}

}
