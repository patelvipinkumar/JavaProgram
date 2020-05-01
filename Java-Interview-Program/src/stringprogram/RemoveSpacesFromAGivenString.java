package stringprogram;

public class RemoveSpacesFromAGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] s="a b c".toCharArray();
		int i=removeSpace(s);
		System.out.println(String.valueOf(s).subSequence(0, i));

	}

	static int removeSpace(char[] s) {
		// TODO Auto-generated method stub
		
		int count =0;
		for(int i=0;i<s.length;i++) {
			if(s[i]!=' ') {
				s[count++]=s[i];
				//count++;
				
			}
		}
		
		return count;
	}

}
