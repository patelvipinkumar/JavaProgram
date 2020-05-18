package com.java2blog.array;

import java.util.Scanner;

public class TargetSumSubarr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int [sc.nextInt()];
		int target =sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		solve(arr,target);
	}

	private static void solve(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			int currsum=0;
			
			for(int j=i;j<arr.length;j++) {
				currsum=currsum+arr[j];
				if(currsum==target) {
					System.out.println("starting Index :"+i +","+"Ending index :"+j);
				}
			}
		}
		
	}
}
