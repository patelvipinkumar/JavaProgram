package com.javatpoint.string;
class SwapString{
	public static void main(String [] args){
		
		int arr[] = {2,334,78,45,1,99};
		
		int max1=0;
		int max2=0;
		
		for(int i=0;i<arr.length;i++){
			if(max1< arr[i]){
				max2=max1;
				max1=arr[i];
				
			}
			else if(max2 < arr[i]){
				max2=arr[i];
			}
			
		}
		
		System.out.println("max1 :"+max1);
		System.out.println("max2 :"+max2);
			
		
	}
	
}