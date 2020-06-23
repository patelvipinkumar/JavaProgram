package java8.test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Emp implements Comparable<Emp>{
	int id;
	String name;
	
	
	public Emp() {
		
	}
		
	public Emp(int id, String name) {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Emp e) {
		if(this.id==e.id)  
		      return 0;  
		   else if(this.id>e.id)  
		      return 1;  
		   else  
		      return -1; 
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

	/*@Override
	public int compare(Emp o1, Emp o2) {
		Emp s1 = (Emp) o1;
		Emp s2 = (Emp) o2;

		if (s1.id == s2.id)
			return 0;
		else if (s1.id > s2.id)
			return 1;
		else
			return -1;
	}*/
	


}


public class Re{
	
	
	public static void main(String[] args) {
		Emp e1=new Emp(1,"a");
		Emp e2=new Emp(4,"a");
		
		Map<Emp, Integer> m=new TreeMap<Emp, Integer>();
		m.put(e1, 1);
		m.put(e2, 2);
		System.out.println(m);
		
	}

}
