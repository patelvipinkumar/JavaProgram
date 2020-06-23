package java8;

interface Inf1{
	static void m1() {
		System.out.println("inf1");
	}
	default void m2() {
		System.out.println("inf1 m2");
	}
}

interface Inf2{
	static void m1() {
		System.out.println("inf2");
	}
	default void m2() {
		System.out.println("inf 2 m2");
	}
}


public class StaticMethodTest implements Inf1,Inf2 {
	public static void main(String[] args) {
		StaticMethodTest t=new StaticMethodTest();
		Inf2.m1();
		t.m2();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		Inf2.super.m2();
	}
}
