package com.blogspot.javahungry;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSettoArrayList {

	public static void main(String[] args) {
		Set<String>s=new HashSet<>();
		s.add("Apple");
		s.add("Amazon");
		s.add("Facebook");
		s.add("Google");
		s.add("IBM");
		s.add("Tesla");
		s.add("Tesla");
		
		for(String str:s) {
			System.out.println(str);
		}
		System.out.println(s);
		List<String>list=new ArrayList<>(s);
		System.out.println(list);
		
		

	}

}
