package com.javatpoint.twodarray;

public class OddEven {
	public static void main(String[] args) {
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    

		int c[][]=new int[3][3];
		int evencount=0,oddcount=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j]%2==0) {
					evencount++;
				}
				
				else
					oddcount++;
			}
			
		}
		System.out.println("evencount: "+evencount);
		System.out.println("oddcount: " +oddcount);
	}
}
