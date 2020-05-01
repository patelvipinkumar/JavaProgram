package arrayProgram;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,3,4,5,6,7,8,9,10};
		int key=7;
		int first=0;
		int last=arr.length-1;
		binarySearch(arr,key,first,last);

	}

	static void binarySearch(int[] arr, int key, int first, int last) {
		// TODO Auto-generated method stub
		int mid=(first+last)/2;
		
		while(first<=mid) {
			if(arr[mid]<key) {
				first=mid+1;
			}else if(arr[mid]==key){
				System.out.println("Element is found at index: " + mid);
				break;
				
			}else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		
		if (first>last) {
			System.out.println("ele not found");
		}
		
	}

}
