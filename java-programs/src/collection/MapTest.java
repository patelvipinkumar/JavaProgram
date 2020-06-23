package collection;

import java.util.HashMap;

import java.util.Map;
import java.util.*;

class Emp{
	int id;
	String name;
	public Emp() {
		
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class MapTest {
	public static void main(String[] args) {
		Emp e1=new Emp(1, "raj");
		Emp e2=new Emp(1, "raj");
		Emp e3=e1;
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		Map<Emp, String> map = new HashMap<>();
		map.put(e1, "Mango");
		map.put(e2, "Apple");
		map.put(e3, "Banana");
		//map.put(2, "Grapes");
		System.out.println(map);
		HashSet<String> h=new LinkedHashSet<>();
		h.add("mango");
		h.add("mango1");
		h.add("mango");
		h.add("mango3");
		System.out.println(h);
		
	}
}
