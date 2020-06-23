package factory.design.pattern;

public class OperatingSystemFactory {
	public OS getInstance( String str) {
		if(str.equals("open")) {
			return new Linux();
		}
		else if(str.equals("closed")) {
			return new IOS();
		}
		else {
			return new Windows();
		}
		
	}

}
