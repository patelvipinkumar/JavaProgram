package kc.array;

public class CountNumberOfOccurrencesInASortedArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 2, 3, 3, 4, 5, 6 };
		int x = 3;
		// System.out.println("no of occurrences:"+countOccurrences(arr,x));
		int n = arr.length;

		int elementfreq = countOccurrences(arr, n, x);
		System.out.println(elementfreq);
	}

	private static int countOccurrences(int[] arr, int n, int x) {
		int i;
		int j;
		i = leftBinarySearch(arr, 0, n - 1, x, n);

		if (i == -1) {
			return i;
		}
	
		j = rightBinarySearch(arr, i, n - 1, x, n);

		return j - i + 1;

	}

	private static int leftBinarySearch(int[] arr, int l, int r, int x, int n) {
		if (l <= r) {

			int mid = (l + r) / 2;

			if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x) {
				return mid;
			} else if (arr[mid] > x) {
				return leftBinarySearch(arr, l, mid - 1, x, n);
			} else {

				return leftBinarySearch(arr, mid + 1, l, x, n);
			}
		}
		return -1;
	}


	private static int rightBinarySearch(int[] arr, int l, int r, int x, int n) {
		if (l <= r) {

			int mid = (l + r) / 2;

			if ((mid == n - 1 || x < arr[mid + 1]) && arr[mid] == x) {
				return mid;
			} else if (x < arr[mid]) {
				return rightBinarySearch(arr, l, (mid - 1), x, n);
			} else {

				return rightBinarySearch(arr, mid + 1, r, x, n);
			}
		}
		return -1;
	}

	private static int countOccurrences(int[] arr, int x) {
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x) {
				result++;
			}
		}
		return result;
	}
}
