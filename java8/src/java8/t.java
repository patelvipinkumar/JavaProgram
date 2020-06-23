package java8;

class A{
	 int i=10;
	public void m1() {
		System.out.println("m1"+i);
	}
	public void m2() {
		System.out.println("m2");
	}
}
public class t {
	
	public static void main(String[] args) {
		A a=new A() ;
			a.m2();
			Integer a1=10;  
			Integer b=10;  
			//byte c=a+b;//Compile Time Error: because a+b=20 will be int  
			Integer c=(a1+b);  
			System.out.println(c);
		

	}
	

}
