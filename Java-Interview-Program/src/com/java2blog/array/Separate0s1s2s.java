package com.java2blog.array;

public class Separate0s1s2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={0,1,0,1,1,2,0,1,0,2};
		arr=separate0s1sSolution2(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}
public static int [] separate0s1sSolution2(int arr []) {
		
		int low=0,mid=0,high=arr.length-1,temp;
		
		while(mid<=high) {
			switch(arr[mid]) {
			case 0:
				
				temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				mid++;
				low++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp=arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
				break;
			}
		}
		return arr;
		
}

}
