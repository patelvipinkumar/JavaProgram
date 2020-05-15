package com.java2blog.array;

public class SeparateOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 5, 9, 6, 20,24, 89, 34, 73, 54 };
		ar = separateOddEvenSolution2(ar);
		for (int i : ar) {
			System.out.print(i + " ");
		}

	}

	public static int[] separateOddEvenSolution1(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int l = 0;
			int h = arr.length - 1, temp;

			while (arr[l] % 2 == 0) {
				l++;

			}
			while (arr[h] % 2 == 1) {
				h--;

			}
			if (l < h) {
				temp = arr[l];
				arr[l] = arr[h];
				arr[h] = temp;
			}
		}
		return arr;

	}

	public static int[] separateOddEvenSolution2(int[] arr) {

		int j = -1,temp; 
		int n=arr.length;
	      
        // quick sort method 
        for (int i = 0; i < n; i++) { 
      
            // if array of element 
            // is odd then swap 
        	
        	//5, 9, 6, 20,24, 89, 34, 73, 54 
        	//6, 20, 24, 34,54, 89, 9, 73, 5
            if (arr[i] % 2 == 0) { 
      
                // increment j by one 
                j++; 
      
                // swap the element 
                temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        }
		return arr;

	}
}
