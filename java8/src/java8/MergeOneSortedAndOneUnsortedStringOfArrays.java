package java8;

class MergeOneSortedAndOneUnsortedStringOfArrays {

	public static void sortedMerge(String str1[], String str2[], String res[], int n, int m) {
		
		sort(str2, 0, str2.length - 1);

		int i = 0, j = 0, k = 0;
		while (i < n && j < m) {
			if (str1[i].compareTo(str2[j]) != 1) {
				res[k] = str1[i];
				i += 1;
				k += 1;
			} else {
				res[k] = str2[j];
				j += 1;
				k += 1;
			}
		}

		while (i < n) {
			res[k] = str1[i];
			i += 1;
			k += 1;
		}
		while (j < m) {
			res[k] = str2[j];
			j += 1;
			k += 1;
		}
	}

	static void merge(String arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		String L[] = new String[n1];
		String R[] = new String[n2];
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];
		int i = 0, j = 0;
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i].compareTo(R[j]) < 0) {
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

	static void sort(String arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);
			merge(arr, l, m, r);
		}
	}

	public static void main(String[] args) {
		String str1[] = { "a", "c", "d", "f", "g" };
		String str2[] = { "e", "b", "h" };
		int n = str1.length;
		int m = str2.length;

		String res[] = new String[n + m];
		sortedMerge(str1, str2, res, n, m);

		System.out.print("Final array to be printed -> ");
		for (int i = 0; i < n + m; i++)
			System.out.print(" " + res[i]);
	}
}