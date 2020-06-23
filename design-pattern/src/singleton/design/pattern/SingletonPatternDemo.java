package singleton.design.pattern;

public class SingletonPatternDemo {
	public static void main(String[] args) {

		// illegal construct
		// Compile Time Error: The constructor SingleObject() is not visible
		//SingleObject object = new SingleObject();
		SingleClass s = SingleClass.getInstance();
		s.showMessage();
	}
}
