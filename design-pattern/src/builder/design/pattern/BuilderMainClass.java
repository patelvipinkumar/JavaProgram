package builder.design.pattern;

public class BuilderMainClass {
	public static void main(String[] args) {
	
	//Phone p=new Phone("os", 4, "processo", 43, 5000);
	Phone p =new PhoneBuilder().setOs("ios").setRam(2).setBattery(3000).getPhone();
	System.out.println(p);
	}
}
