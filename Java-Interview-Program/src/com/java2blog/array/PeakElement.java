package com.java2blog.array;

public class PeakElement {
	public static void main(String[] args) {
		int [] arr = {10, 5, 3,2, 6, 13, 16, 7};
		System.out.println("peak element is: " + findPeakElement(arr,0,arr.length));
	}

	public static int findPeakElement(int[] arr,int start,int end) {
		
		int mid = (start + end) / 2;
		 
		// if the mid element is not the corner element and it is greater 
                // than or equal to its neighbours
		if ((mid > 0 && mid < arr.length - 1) && (arr[mid] >= 
                     arr[mid + 1] && arr[mid] >= arr[mid - 1])) {
			return mid;
		}
 
		// if the mid element is left corner element and it is greater  
                //than or equal to its right neighbour.
 
		else if (mid == 0 && mid!= arr.length-1 && arr[mid] >= 
                         arr[mid + 1])
        {
			return mid;
		}
 
		// if the mid element is right corner element and it is greater 
                // than or equalto its left neighbour.
 
		else if (mid == arr.length - 1 && mid!= 0 && 
                         arr[mid - 1] <= arr[mid]) 
        {
			return mid;
		}
 
		// if mid element is smaller than its left neighbour, 
                // then peak element will be in left side for sure.
 
		else if (mid != 0 && arr[mid - 1] > arr[mid]) 
        {
			return findPeakElement(arr, start, mid - 1);
		} 
        else 
        {
			if(mid + 1 <= arr.length-1)
            {
			   return findPeakElement(arr, mid + 1, end);
            }
		}
		// in case the array has only one element then than is the 
                //peak element
		return 0;
	}
}