package com.java2blog.array;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SortedSentenceAccordingToGivenWord {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter sentence:"); //enter sentence: i am java java, i hava java , i am vipin 
		String sentence = sc.nextLine();
		String[] strArray = sentence.split(",");
		System.out.println("enter word :");
		String word=sc.nextLine();
		System.out.println("Sorted Sentence :");			
		sort(strArray, word);
		     //Sorted Sentence :
			//i am vipin
			//i hava java
			//i am java java	
	
	}

	public static void sort(String[] strArray, String word) {
		Map<String, Integer> m = new HashMap<>();

		for (int i = 0; i < strArray.length; i++) {
			int count = 0;
			if (strArray[i].equals(word)) {
				String[] st = strArray[i].split(" ");
				for (int k = 0; k < st.length; k++) {
					if (st[k].equals(word)) {
						count = count + 1;
					}

				}
				m.put(strArray[i], count);
			} else {
				m.put(strArray[i], 0);
			}

		}
		Map<String, Integer> mp = sortByValues(m);
		for (Entry<String, Integer> en : mp.entrySet()) {

			System.out.println(en.getKey().trim());

		}
	}

	public static Map<String, Integer> sortByValues(Map<String, Integer> map) {
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;

	}
}