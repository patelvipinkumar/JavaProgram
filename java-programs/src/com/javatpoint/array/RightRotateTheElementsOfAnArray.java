package com.javatpoint.array;

public class RightRotateTheElementsOfAnArray {
	public static void main(String[] args) {
		int arr[]= {2,4,5,6,8};
		int k=1;
		for(int i=0;i<k;i++) {
			int j,last;
			last=arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		System.out.println();  
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  

	
	}
}
