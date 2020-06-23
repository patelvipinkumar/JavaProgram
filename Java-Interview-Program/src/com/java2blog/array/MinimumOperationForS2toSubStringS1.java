package com.java2blog.array;

public class MinimumOperationForS2toSubStringS1 {

	static int minmumChar(String s1, String s2) {
		int n = s1.length();
		int m = s2.length();
		int ans = Integer.MAX_VALUE;
		for (int i = 0; i < n - m + 1; i++) {
			String temp = s1.substring(0, i) + s2 + s1.substring(i + m);
			int cost = 0;
			for (int j = i; j < i + m; j++) {
				if (s1.charAt(j) != temp.charAt(j)) {
					cost++;
				}
			}
			int z = 0;
			for (int j = 0; j < Math.ceil(n / 2.0); j++) {
				if ((j < i || j >= i + m) && temp.charAt(j) != temp.charAt(n - j - 1)) {
					cost++;
				} else if (temp.charAt(j) != temp.charAt(n - j - 1) && (n - j - 1 < i || n - j - 1 >= i + m)) {
					cost++;
				} else if (temp.charAt(j) != temp.charAt(n - j - 1)) {
					z = 1;
					break;
				}
			}
			if (z == 0) {
				ans = Math.min(ans, cost);
			}
		}
		return ans;
	}

	// Driver Code
	public static void main(String[] args) {
		String S1 = "aaaaa";
		String S2 = "bbb";

		System.out.println(minmumChar(S1, S2));
	}
}