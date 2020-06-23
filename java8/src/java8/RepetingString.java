package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RepetingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello is is is some is Someone";
		String[] s = str.toLowerCase().split(" ");
		List<String> list = Arrays.asList(s);
		Collections.reverse(list);
		Set<String> set = new LinkedHashSet<>(list);
		List<String> list1 = new ArrayList<>(set);
		Collections.reverse(list1);
		for (String sc : list1) {
			System.out.print(sc + " ");
		}

	}

}
