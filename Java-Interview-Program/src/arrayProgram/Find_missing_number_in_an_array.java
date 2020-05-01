package arrayProgram;

public class Find_missing_number_in_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,5,6,7,8,9};
		int n=9,sum = 0;
		int a= n*(n+1)/2;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println(a-sum);
	}

}
