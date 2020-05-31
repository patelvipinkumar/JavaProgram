package com.javatpoint.array;

public class FindSecondLargestNumberInAnArray {
	public static void main(String[] args) {
		int arr[] = {12, 35, 1, 10, 34, 1}; 
        int n = arr.length; 
        print2largest(arr, n); 
        System.out.println();
        print3largest(arr, n); 
        
        System.out.println();
        print2smallest(arr, n);
	}

	public static void print2largest(int[] arr, int n) {
		int first,second;
		first=second=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>first) {
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second && arr[i] !=first) {
				second=arr[i];
			}
		}
		if (second == Integer.MIN_VALUE) 
            System.out.print("There is no second largest :"+ 
                                " element\n"); 
       else
            System.out.print("The second largest element"+ 
                                     " is "+ second);
		
	}
	
	public static void print2smallest(int[] arr, int n) {
		int first,second;
		first=second=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i]<first) {
				second=first;
				first=arr[i];
			}
			else if(arr[i]<second && arr[i] !=first) {
				second=arr[i];
			}
		}
		if (second == Integer.MIN_VALUE) 
            System.out.print("There is no second largest :"+ 
                                " element\n"); 
       else
            System.out.print("The second smallest element"+ 
                                     " is "+ second);
		
	}
	
	public static void print3largest(int[] arr, int n) {
		int first,second,third;
		first=arr[0];
		second=third=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(arr[i]>first) {
				third=second;
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second) {
				third=second;
				second=arr[i];
			}
			else if(arr[i]>third) {
				third=arr[i];
			}
		}
		if (second == Integer.MIN_VALUE) 
            System.out.print("There is no second largest :"+ 
                                " element\n"); 
       else
            System.out.print("The 3rd largest element"+ 
                                     " is "+ third);
		
	}
}
