package JavaCodingInterviewQuestions;

public class CountDigitsInAnInteger {

	public static void main(String[] args) {
		
		int a=1498899111;
		int c=0,e=0;
		int r;
		
		while(a!=0) {
			
			r=a%10;
			if(r%2==0) {
				e++;
			}
			else
			c++;
			
			a=a/10;
				
		}
		System.out.println(e +":"+c );
		//System.out.println(String.valueOf(a).length());
	}
}
