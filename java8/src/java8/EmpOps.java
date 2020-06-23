package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

class Employee {
	private String name;
	private int age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
        public String toString()
	{
		return "Employee Name: "+name+" age: "+age;
	}
}

public class EmpOps{
	public static void main(String[] args) {
		List <Employee> employeeList=new ArrayList<>();
		Employee e1=new Employee("John",21);
		Employee e2=new Employee("Martin",19);
		Employee e3=new Employee("Mary",31);
		Employee e4=new Employee("Stephan",18);
		Employee e5=new Employee("Gary",26);
 
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		
		List<String> employeeFilteredList=employeeList.stream().filter(e->e.getAge()>20).map(Employee::getName)
				.collect(Collectors.toList());
		employeeFilteredList.forEach((name)->System.out.println(name));
		
		long c=employeeList.stream().filter(e->e.getAge()>25).count();
		System.out.println(c);
		
		OptionalInt maxage=employeeList.stream().mapToInt(Employee::getAge).max();
		System.out.println(maxage);
		
		List<Employee> empsort=employeeList.stream().sorted((e11,e21)->e11.getAge()-e21.getAge()).collect(Collectors.toList());
		empsort.forEach(System.out::println);
		
		List<String> employeeNames=employeeList.stream().map(Employee::getName).collect(Collectors.toList());
		String employeeNamesStr=String.join(",", employeeNames);
		System.out.println("Employees are: "+employeeNamesStr);
		
		
		Employee name = employeeList.stream()
				.filter(s-> s.getName().equalsIgnoreCase("john") )
				.findAny().orElse(null);
				System.out.println("Male students are :"+name);
		
		
		
		Integer[] arr=new Integer[]{1,2,3,4,3,2,4,2};
		List<Integer> listWithDuplicates = Arrays.asList(arr);
		List<Integer> listWithoutDups = listWithDuplicates.stream().distinct().collect(Collectors.toList());
		listWithoutDups.forEach((i)->System.out.print(" "+i));
	}
	
}