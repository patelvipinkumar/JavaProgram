package com.java2blog;
import java.util.Iterator;
import java.util.TreeSet;
 
public class Employ implements Comparable<Employ> {
 public String name;


 
 
 public static void main(String args[]) {
  Employ employeeOne = new Employ();
  Employ employeeTwo = new Employ();
  employeeOne.name= "John";
  employeeTwo.name = "Martin";
  TreeSet <Employ>employeeSet = new TreeSet<>();
  employeeSet.add(employeeOne);
  employeeSet.add(employeeTwo);
  
  
  Iterator<Employ> empIt = employeeSet.iterator();
  while (empIt.hasNext()) {
   System.out.println(empIt.next().name);
  }
 }

@Override
public int compareTo(Employ arg0) {
	// TODO Auto-generated method stub
	return 0;
}
}