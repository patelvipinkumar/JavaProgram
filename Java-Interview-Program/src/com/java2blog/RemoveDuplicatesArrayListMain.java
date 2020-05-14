package com.java2blog;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesArrayListMain {
	public static void main(String[] args) {
		ArrayList<String> employeeNameList = new ArrayList<>();
		employeeNameList.add("John");
		employeeNameList.add("Ankit");
		employeeNameList.add("Rohan");
		employeeNameList.add("John");
		employeeNameList.add("Amit");
		employeeNameList.add("Ankit");
		System.out.println("Removing duplicates from list:");
		
		List <String> uniqueElements=new ArrayList<>();
		for(String empName : employeeNameList) {
			if(!uniqueElements.contains(empName)) {
				uniqueElements.add(empName);
			}
		}
		System.out.println(uniqueElements);
		
	}

}
