package com.javatpoint.array;

public class LeftRotateTheElementsOfAnArray {
	public static void main(String[] args) {
		int arr[] = { 3, 4, 6, 7, 8, 1, 0 };
		int rotatepos = 3;
		leftRotateTheElements(arr, rotatepos);
	}

	public static void leftRotateTheElements(int[] arr, int rotatepos) {
		for(int i=0;i<rotatepos;i++) {
			int j,frist;
			frist=arr[0];
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=frist;
		}
		System.out.println();  
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  

	}
}
