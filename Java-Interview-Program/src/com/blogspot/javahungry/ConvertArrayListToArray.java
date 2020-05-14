package com.blogspot.javahungry;

import java.util.ArrayList;
import java.util.List;

public class ConvertArrayListToArray {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Apple");
		list.add("Amazon");
		list.add("Facebook");
		list.add("Google");
		list.add("IBM");
		list.add("Tesla");
		
		String [] str=new String[list.size()];
		
		for(int i=0;i<str.length;i++) {
			str[i]=list.get(i);
		}
		for(String s:str) {
			System.out.println(s);
		}
		//method 2
		String []st=list.toArray(new String[list.size()]);
		
		for(String sf:st) {
			System.out.println(sf);
		}

	}

}
