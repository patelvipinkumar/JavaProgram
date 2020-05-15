package com.java2blog.array;

public class FindPairClosestToZero {
	public static void main(String[] args) {
		 int arr[] = {1, 60, -10, 70, -80, 85}; 
	        minAbsSumPair(arr, 6);
	}

	 static void minAbsSumPair(int[] arr, int n) {
		int inv_count=0;
		int l,r,min_sum,sum,min_l,min_r;
		
		if(n<2) {
			System.out.println("Invalid Input");
			return;
		}
		min_l=0;
		min_r=0;
		min_sum=arr[0]+arr[1];
		
		for(l=0;l<n-1;l++) {
			for(r=l+1;r<n;r++) {
				sum=arr[l]+arr[r];
				if(Math.abs(min_sum)>Math.abs(sum)) {
					min_sum=sum;
					min_l=l;
					min_r=r;
				}
			}
		}
		 System.out.println(" The two elements whose "+ 
                 "sum is minimum are "+ 
           arr[min_l]+ " and "+arr[min_r]);
	}
}
