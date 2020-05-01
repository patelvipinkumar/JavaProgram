package arrayProgram;

public class Rearrange_positive_and_negative_numbers {
	public static void main(String[] args) {
		int arr[]= {-3,8,-6,3,-7,9};
		int i=0,temp;
		int j=arr.length-1;
		for(int k=0;k<arr.length;k++) {
			while(arr[i]<0 && i<j) {
				i++;
			}
			while(arr[j]>0 && i<j) {
				j--;
			}
			if(i<j) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}else
				break;
		}
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]);
		}
	}

}
