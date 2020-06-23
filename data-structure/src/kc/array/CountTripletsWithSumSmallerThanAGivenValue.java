package kc.array;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountTripletsWithSumSmallerThanAGivenValue {
	public static void main(String[] args) {
		int arr[]= {-2, 0, 1, 3};
		int sum = 2;
		int noOfTriplet = findTriplet(arr,sum);
		System.out.println(noOfTriplet);
	}

	private static int findTriplet(int[] arr, int sum) {
		int count = 0;
		int n=arr.length;
		for(int i = 0; i <n-2; i++) {
			for(int j = i+1; j <n-1; j++) {
				for(int k = j+1; k <n; k++) {
					if((arr[i]+arr[j]+arr[k])<sum) {
						count++;
						System.out.println(arr[i]+", "+arr[j]+", "+arr[k]);
					}
					
				}
			}
		}
		return count;
	}

}
