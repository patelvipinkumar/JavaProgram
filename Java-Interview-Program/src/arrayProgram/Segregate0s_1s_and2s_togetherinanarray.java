package arrayProgram;

public class Segregate0s_1s_and2s_togetherinanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] ={0,1,0,1,1,2,0,1,0,1};
		int low=0,mid=0,high=arr.length-1,temp;
		while(mid<=high) {
			switch(arr[mid]) {
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
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
		

	}

}
