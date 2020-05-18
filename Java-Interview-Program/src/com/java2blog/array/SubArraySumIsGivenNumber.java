package com.java2blog.array;

import java.util.HashMap;

public class SubArraySumIsGivenNumber {
	public static void main(String[] args) {
		int arr[] = { 10, 2, -2, -20, 10 };
		int sum = -10;
		System.out.println(findSubarraySum(arr, sum));
	}

	public static int findSubarraySum(int arr[], int sum) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int res = 0;
		int n = arr.length;
		int currsum = 0;
		for (int i = 0; i < n; i++) {
			currsum =currsum + arr[i];
			if (currsum == sum) {
				res++;
			}
			if (map.containsKey(currsum - sum)) {
				res = res + map.get(currsum - sum);
			}
			Integer count = map.get(currsum);
			if (count == null) {
				map.put(currsum, 1);
			} else {
				map.put(currsum, count + 1);
			}
		}
		return res;
	}
}
