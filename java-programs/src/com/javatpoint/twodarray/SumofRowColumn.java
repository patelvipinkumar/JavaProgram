package com.javatpoint.twodarray;

public class SumofRowColumn {
	public static void main(String[] args) {
		int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		int sumrow, sumcol;

		for (int i = 0; i < a.length; i++) {
			sumrow = 0;
			for (int j = 0; j < a[0].length; j++) {

				sumrow = sumrow + a[i][j];

			}
			System.out.println("Sum of " + (i + 1) + " row: " + sumrow);

		}
		for (int i = 0; i < a[0].length; i++) {
			sumcol = 0;
			for (int j = 0; j < a.length; j++) {

				sumcol = sumcol + a[j][i];

			}
			System.out.println("Sum of " + (i + 1) + " col: " + sumcol);

		}

	}
}
