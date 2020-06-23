package JavaTrickyProgram;

class AB {
	AB(){
		System.out.println("AB cost");
		new AB();
	}
	

}
public class BC{
	public static void main(String[] args) {
		AB a=new AB();
	}
}
