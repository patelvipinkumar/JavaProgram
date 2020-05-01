package JavaTrickyProgram;

import java.util.HashSet;
import java.util.Set;

public class DoubleBrace {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>() {{
			add("dev");
			add("re");
			
		}};
		System.out.println(s);
		
		
	}
}
