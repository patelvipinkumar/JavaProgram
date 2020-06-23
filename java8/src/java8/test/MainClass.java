package java8.test;

public class MainClass {
	public static void main(String[] args) {
		int arr[]= {0,1,1,0,2,0,1};
		int low=0,mid=0,high=arr.length-1,temp;
		while(mid<=high) {
			switch (arr[mid]) {
			case 0:
				temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
				
				break;

			case 1:
				mid++;
				break;
			case 2:
				temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				high--;
				
				break;	
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}


}
