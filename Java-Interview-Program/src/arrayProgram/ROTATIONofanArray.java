package arrayProgram;

import java.time.format.ResolverStyle;

public class ROTATIONofanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inp = { 1, 2, 3, 4, 5 };
		int n = inp.length;
		int r=2;
		
		

		int[] a = new int[(n-r)];
		int[] b = new int[r];

		for (int i = 0; i < n; i++)
		{
			if (i < a.length)
				a[i] = inp[i];
			else
				b[i - a.length] = inp[i];
		}
		for (int i = 0; i < n; i++)
		{
			if (i < a.length) {
				reverse(a);
				 inp[i]=a[i];
			}
			else {
				reverse(b);
				inp[i]=b[i - a.length];
				//System.out.println(inp[i]);
			}
		}
		
				
		

	}
	
	static int[] reverse(int arr[]){
		int first=0,temp;
		int last =arr.length-1;
		
		while(first<=last) {
			temp=arr[first];
			arr[first]=arr[last];
			arr[last]=temp;
			first+=1;
			last-=1;
			
			
		}
		return arr;
		
	}

}
