package kc.array;

import java.util.HashSet;
import java.util.Set;

public class FindThePairOfArrayWhoseSumIsX {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 45, 6, 6, 10, 10, 8 };
		int sum = 16;
		int noOfPairs = printPairs(arr, sum);
		System.out.println("no of pairs:"+noOfPairs);
	}

	private static int printPairs(int[] arr, int sum) {
		Set<Integer> s = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int temp = sum - arr[i];
			
			if (s.contains(temp)) {
				System.out.println("pair of sum :" + arr[i] + " ," + temp);
				count++;
			}
			s.add(arr[i]);

		}
		return count;
	}
}
