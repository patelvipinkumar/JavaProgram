package com.java2blog.array;

public class Separate0s1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,0,1,0,0,0,1,1,0};
		arr=separate0s1sSolution2(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int [] separate0s1sSolution1(int [] arr) {
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				c++;
			}
		}
		for(int i=0;i<c;i++) {
			arr[i]=0;
		}
		for(int i=c;i<arr.length;i++) {
			arr[i]=1;
		}
		return arr;
		
	}
	public static int [] separate0s1sSolution2(int arr []) {
		
		int low=0,mid=0,high=arr.length-1,temp;
		while(mid<=high) {
			switch(arr[mid]) {
			case 0:
				temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			}
			
			
		}
		return arr;
		
	}
	public static int [] separate0s1sSolution3(int arr []) {
		
		
		for(int i=0;i<arr.length;i++) {
			int l=0;
			int mid=0,temp;
			int h=arr.length-1;;
			while(arr[l]==0) {
				l++;
			}
			while(arr[h]==1) {
				h--;
			}
			if(l<h) {
				temp=arr[l];
				arr[l]=arr[h];
				arr[h]=temp;
			}
		}
		
		return arr;
		
	}
}
