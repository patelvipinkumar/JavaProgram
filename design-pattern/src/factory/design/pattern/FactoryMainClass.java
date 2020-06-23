package factory.design.pattern;

public class FactoryMainClass {
	public static void main(String[] args) {
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS obj=osf.getInstance("open");
		obj.spec();
		
	}
}
