package singleton.design.pattern;

public class SingleClass {
	
	private static SingleClass s=null;

	private SingleClass() {
		}
	
	public static SingleClass getInstance() {
		if(s==null) {
			s=new SingleClass();
		}
		return s;
		
	}
	public void showMessage(){
	      System.out.println("Hello World!");
	   }
}
