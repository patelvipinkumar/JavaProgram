package arrayProgram;

public class RemoveDuplicatesFromSortedArray {
	
	public static void main(String[] args) {
		
		int [] arr= {1,2,2,3,3,4,4,4,5};
		//int [] temp = new int [8];
		
		int i,j=0;
		for(i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]) {
				//temp[j]=arr[i];
				arr[j]=arr[i];
				j++;
				
			
			}
		
			
		}
		arr[j]=arr[arr.length-1];
		
		for(int k=0;k<arr.length-1;k++) {
			System.out.println(arr[k]);
			
		}
	}

}
