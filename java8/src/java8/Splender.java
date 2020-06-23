package java8;

class Bike {
	void run() {
		System.out.println("running");
	}

	void print() {
		System.out.println("print");
	}

}

public class Splender extends Bike {
	void run() {
		System.out.println("running safely with 60km");
	}	
	
	void run21() {
		System.out.println("running ");
	}
	
	

	public static void main(String args[]) {
		Bike b = new Splender();// upcasting
		b.run();
		b.print();
		//b.run21();
		
	}
}
