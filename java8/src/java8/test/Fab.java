package java8.test;

public class Fab {
	public static void main(String[] args) {
		int arr[]= {3,4,5,6,1,2};
		int n=arr.length;
		System.out.println(findMinIndex(arr,0,n-1));
		
		System.out.println(findMinIndex(arr));
	}
	
	public static int findMinIndex(int []arr) {
		int min=arr[0];
		int i,j = 0;
		for( i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				j=i;
			}
		}
		return j;
		
		
		
	}
	
	public static int findMinIndex(int []arr, int low,int high) {
		
		if(high<low) {
			return 0;
		}
		if(high==low) {
			return low;
		}
		int mid=(low+high)/2;
		if(mid<high && arr[mid+1]<arr[mid]) {
			return mid+1;
		}
		if(mid>low && arr[mid+1]<arr[mid-1]) {
			return mid;
		}
		
		
		if(arr[high]>arr[mid]) {
			return findMinIndex(arr,low,mid-1);
		}
		
		return findMinIndex(arr, mid+1, high);
		
		
		
	}

}
