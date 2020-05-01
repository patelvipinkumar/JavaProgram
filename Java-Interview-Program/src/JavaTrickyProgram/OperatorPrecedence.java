package JavaTrickyProgram;

public class OperatorPrecedence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="one"+1*2+"two"+"three"+3+4+"four"+"five"+5;
		System.out.println(s);
		
		int i=10 + + 11 - - 12 + + 13;
		System.out.println(i);

	}

}
