package java8.test;

public class ArrayRotation {
	public static void main(String[] args) {
		int []arr= {2,3,4,5,6,7,8};
		int n=3;
		int[] brr=findArrayRotation(arr,n);
		for(int i=0;i<brr.length;i++) {
			System.out.print(brr[i]+" ");
		}
	}

	private static int[] findArrayRotation(int[] arr, int n) {
		
		for(int i=0;i<n;i++) {
			int f=arr[0];
			 int j;
			for( j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=f;
		}
		return arr;
		
		
		
	}

}
