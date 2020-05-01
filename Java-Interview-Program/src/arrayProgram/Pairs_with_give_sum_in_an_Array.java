package arrayProgram;

public class Pairs_with_give_sum_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int gs=11;
		int l=0,r=arr.length-1;
		
		while(l<r) {
			if(arr[l]+arr[r]>gs) {
				r--;
			}
			else if(arr[l]+arr[r]<gs) {
				l++;
			}
			else 
			{
				System.out.println(arr[l]+" ,"+arr[r]);
				l++;
			}
		}

	}

}
