package com.blogspot.javahungry;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] a = { 3, 8, 5, 7, 4 };
		int[] b = revrese(a);
		for (int n : b) {
			System.out.println(n);
		}

		String st = "vipin kumar patel";
		String[] sb = revrese(st);
		for (String d : sb) {
			System.out.println(d);
		}

	}

	public static int[] revrese(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		int temp;
		for (s = 0; s < e; s++, e--) {
			temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;

		}
		return arr;

	}

	public static String[] revrese(String arr) {

		String[] str = arr.split(" ");
		int s = 0;
		int e = str.length - 1;
		String temp;
		for (s = 0; s < e; s++, e--) {
			temp = str[s];
			str[s] = str[e];
			str[e] = temp;

		}
		return str;

	}

}
