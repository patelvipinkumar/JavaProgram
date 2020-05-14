package com.java2blog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	int id;
	String name;
	int sal;
	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
}

class EmployeeSortBySalComparatorInDesc implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		if(e1.sal==e2.sal) {	
			return 0;
		}
		else if(e1.sal>e2.sal) {
			return -1;
		}else {
			return 1;
		}
	}
	
}

class EmployeeSortByIdComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		
		if(e1.id==e2.id) {
			return 0;		}
		else if(e1.id>e2.id) {
			return 1;
		}
		else
			return -1;
		
		
	}

}

class EmployeeSortByNameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee) o1;
		Employee e2=(Employee) o2;
		return e1.name.compareTo(e2.name);
	}
	
}
public class EmployeeSort{
	public static void main(String[] args) {
		List<Employee> list= new ArrayList<>();
		list.add(new Employee(1,"vipin4",75000));
		list.add(new Employee(2,"vipin3",75001));
		list.add(new Employee(3,"vipin2",75002));
		list.add(new Employee(4,"vipin1",75003));
		list.add(new Employee(5,"vipin",75004));
		
		System.out.println("sort element by id --------");
		Collections.sort(list,new EmployeeSortByIdComparator());
		for(Employee  emp:list) {
			System.out.println(emp.id +","+emp.name+","+emp.sal);
		}
		
		System.out.println("sorted element by salary on descending order -------");
		Collections.sort(list,new EmployeeSortBySalComparatorInDesc());
		for(Employee emp:list) {
			System.out.println(emp.id +","+emp.name+","+emp.sal);
			}
		
		System.out.println("sorted element by name -------");
		Collections.sort(list,new EmployeeSortByNameComparator());
		for(Employee emp:list) {
			System.out.println(emp.id +","+emp.name+","+emp.sal);
			}
		
	}
}