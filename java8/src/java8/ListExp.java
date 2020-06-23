package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


class Student{
	 int id;
	 String name;
	 int age;
	public Student(int id, String name,int age) {
		
		this.id = id;
		this.name = name;
		this.age=age;
	}
	
}
class IdComp  implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student) o1;
		Student s2=(Student) o2;
		
		if(s1.id==s2.id) {
			return 0;
			
		}
		else if(s1.id>s2.id){
			return 1;
		}
		else
		return -1;
	}
	
}
public class ListExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al=new ArrayList<>();
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21)); 
		al.add(new Student(105,"Jai",21)); 
		al.add(new Student(105,"Jai",21)); 
		Set<Integer> s=new HashSet<>();
		
		
		
		Collections.sort(al,new IdComp());  
		for(Student st:al) {
			System.out.println(st.id+" "+st.name+" "+st.age);  
			
			s.add(st.id);
		}
		System.out.println(s);
		

	
	}
	
}
