package java8;
class NoOfTriplets {
	static void printTriplets(int arr[], int n, int sum) {
		sort(arr, 0, arr.length - 1);

		int t = 0;
		for (int i = 0; i < n - 2; i++) {

			int j = i + 1, k = n - 1;

			while (j < k) {

				if (arr[i] + arr[j] + arr[k] >= sum)
					k--;

				else {
					for (int x = j + 1; x <= k; x++) {
						t++;
					}
					j++;
				}
			}
		}
		System.out.println(t);
	}

	static void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	static void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	public static void main(String args[]) {
		int arr[] = { 2, 4, 1, 5, 6, 3, 7, 8 };
		int n = arr.length;
		int sum = 9;
		printTriplets(arr, n, sum);
	}
}
