package kc.array;

public class CountStrictlyIncreasingSubarrays {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 3 };
		int n = arr.length;

		int count = countIncreasingSubarray(arr, n);
		System.out.println(count);
		
		int countEfc = countIncreasingSubarrayEfficent(arr, n);
		System.out.println(countEfc);
	}

	private static int countIncreasingSubarray(int[] arr, int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[j] > arr[j - 1]) {
					count++;
					//System.out.println("subaray :"+arr[j-1]+", "+arr[j]);
				} else {
					break;
				}
			}
		}
		return count;
	}

	private static int countIncreasingSubarrayEfficent(int[] arr, int n) {
		int count = 0;
		int len = 1;
		for (int i = 0; i < n-1; i++) {
			if(arr[i+1]>arr[i]) {
				//System.out.println("subaray efc :"+arr[i]+", "+arr[i+1]);
				len++;
			}else {
				count = count + (((len-1)*len)/2);
				len=1;
			}
		}
		if(len > 1) {
			count = count + (((len-1)*len)/2);
		}
		return count;
	}

}
