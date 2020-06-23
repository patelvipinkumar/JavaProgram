/**
 * 
 */
package com.javatpoint.string;

/**
 * @author Vipin Patel
 *
 */
public class AllSubsets {

	public static void main(String[] args) {
		String s="fun";
		int len=s.length();
		String arr[]=new String[(len*(len+1)/2)];
		int temp=0;
		
		for(int i=0; i<len; i++) {
			for(int j=i; j<len; j++) {
				arr[temp]=s.substring(i, j+1);
				temp++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
