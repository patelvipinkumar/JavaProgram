package com.blogspot.javahungry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("Amazon");
		list.add("Facebook");
		list.add("Google");
		list.add("IBM");
		list.add("Tesla");
		list.add("sdt");
		
		List<String>l=new LinkedList<>(list);
		System.out.println(l);
		System.out.println(list);
		list.remove(6);
		System.out.println(list.get(4));
		for(String s:list) {
			System.out.println(s);
		}
		
		Collections.reverse(list);
		System.out.println(list);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		System.out.println(list.size());

	}

}
