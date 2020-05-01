package com.blogspot.javahungry;

public class IntersectionOfTwoArrays {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5, 7 };
		int brr[] = { 2, 3, 5, 7 };

		intersectionOfArray(arr, brr);

	}

	public static void intersectionOfArray(int fristAttay[], int secondArray[]) {

		int intersectionArray[] = new int[fristAttay.length];
		int c = 0;

		for (int i = 0; i < fristAttay.length; i++) {
			for (int j = 0; j < secondArray.length; j++) {
				if (fristAttay[i] == secondArray[j]) {
					intersectionArray[c] = fristAttay[i];
					c++;
				}
			}

		}

		for (int k = 0; k < c; k++) {
			System.out.print(" "+intersectionArray[k]+" ");
			if(k<c-1) {
				System.out.print(",");
			}
		}

	}

}
