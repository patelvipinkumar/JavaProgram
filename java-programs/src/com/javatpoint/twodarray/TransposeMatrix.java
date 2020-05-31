package com.javatpoint.twodarray;

public class TransposeMatrix {
	public static void main(String[] args) {
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    

		int c[][]=new int[3][3];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				c[i][j]=a[j][i];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
