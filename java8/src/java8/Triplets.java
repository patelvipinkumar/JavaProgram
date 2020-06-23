package java8;

class Triplets {

	static void findTriplets(int arr[], int n, int N) {
		boolean found = false;
		sort(arr, 0, arr.length - 1);
		for (int k = 0; k < n - 1; k++) {

			int l = k + 1;
			int r = n - 1;
			int x = arr[k];
			while (l < r) {
				if (x + arr[l] + arr[r] == N) {

					System.out.print(x + " ");
					System.out.print(arr[l] + " ");
					System.out.print(arr[r] + " ");
					
					System.out.println(x + arr[l] + arr[r]+ " ");

					l++;
					r--;
					found = true;
				}

				else if (x + arr[l] + arr[r] < N)
					l++;
				else
					r--;
			}
		}

		if (found == false)
			System.out.println(" No Triplet Found");
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

	public static void main(String[] args) {

		int arr[] = {2,4,1,5,6,3,7,8};
		int n = arr.length;
		int N = 9;
		findTriplets(arr, n, N);
	}

}