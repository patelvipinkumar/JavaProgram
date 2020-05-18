package com.java2blog.array;

public class SortAnArrayOfStringsAccordingToStringLengths {

	public static void main(String[] args) {
		String[] str={"GeeksforGeeks", "I", "from", "am"}; 
		sortAnArrayAccordingToLength(str);
	}

	public static void sortAnArrayAccordingToLength(String[] str) {
		System.out.println(str.length);
		String temp;
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].length()>str[j].length()) {
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		for (String s:str) {
			System.out.print(s+" ");
		}
		
	}

}
