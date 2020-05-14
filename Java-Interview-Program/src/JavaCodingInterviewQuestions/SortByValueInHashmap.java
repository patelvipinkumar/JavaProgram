package JavaCodingInterviewQuestions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortByValueInHashmap {
	public static void main(String[] args) {
		
	Map<String, Integer> map=new HashMap<String, Integer>();
	map.put("Apple", 65000);  
	map.put("HP", 20000);  
	map.put("Dell", 32000);  
	map.put("Asus", 21478);  
	map.put("Samsung", 36546);  
	map.put("Lenovo", 19990); 
	 Map<String, Integer> hm1 = sortByValue(map); 
	  
     // print the sorted hashmap 
     for (Map.Entry<String, Integer> en : hm1.entrySet()) { 
         System.out.println("Key = " + en.getKey() +  
                       ", Value = " + en.getValue()); 
	

	}
	}
	
	 public static HashMap<String, Integer> sortByValue(Map<String, Integer> map) 
	    { 
	        // Create a list from elements of HashMap 
	        List<Map.Entry<String, Integer> > list = 
	               new LinkedList<Map.Entry<String, Integer> >(map.entrySet()); 
	  
	        // Sort the list 
	        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() { 
	            public int compare(Map.Entry<String, Integer> o1,  
	                               Map.Entry<String, Integer> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            } 
	        }); 
	          
	        // put data from sorted list to hashmap  
	        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>(); 
	        for (Map.Entry<String, Integer> aa : list) { 
	            temp.put(aa.getKey(), aa.getValue()); 
	        } 
	        return temp; 
	    } 

}
