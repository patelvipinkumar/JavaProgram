package java8;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
	public static int minDiff(List<Integer> arr) {

		if (arr.size() < 2) {
			return 0;
		}

		if (arr.size() == 2) {
			return Math.abs(arr.get(0) - arr.get(1));
		}

		Collections.sort(arr);

		int result = 0;
		for (int i = 0; i < arr.size() - 1; i++) {
			result = result + Math.abs(arr.get(i) - arr.get(i + 1));
		}

		return result;
	}

}