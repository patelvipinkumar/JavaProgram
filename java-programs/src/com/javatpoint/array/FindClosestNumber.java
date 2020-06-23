package com.javatpoint.array;

import java.util.*;
import java.lang.*;
import java.io.*;

class FindClosestNumber {
	public static int findClosest(int arr[], int n) {
		
		if (0 <= arr[0])
			return arr[0];
		if (0 >= arr[n - 1])
			return arr[n - 1];

		int i = 0, j = n, mid = 0;
		while (i < j) {
			mid = (i + j) / 2;

			if (arr[mid] == 0)
				return arr[mid];
			if (0 < arr[mid]) {
				if (mid > 0 && 0 > arr[mid - 1])
					return getClosest(arr[mid - 1], arr[mid], 0);
				j = mid;
			} else {
				if (mid < n - 1 && 0 < arr[mid + 1])
					return getClosest(arr[mid], arr[mid + 1], 0);
				i = mid + 1;
			}
		}
		return arr[mid];
	}

	public static int getClosest(int val1, int val2,int x) {
		if (x - val1 >= val2 - x)
			return val2;
		else
			return val1;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		
		System.out.println(findClosest(arr , n));
	}
}