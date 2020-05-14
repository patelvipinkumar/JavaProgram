package com.blogspot.javahungry;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortHashMap {
	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		 
	    // Adding Key and Value pairs to HashMap
		hashmap.put(33,"Value5");
	    hashmap.put(44,"Value3");
	    hashmap.put(55,"Value4");
	    hashmap.put(66,"Value6");
		hashmap.put(11,"Value1");
	    hashmap.put(22,"Value2");
	    
	    for(Entry<Integer, String> s:hashmap.entrySet()) {
	    	System.out.println(s.getKey()+":"+s.getValue());
	    	
	    }
	    System.out.println("After Sorted element ---------------");
	    Map <Integer,String> m=new TreeMap<>(hashmap);
	    for(Entry<Integer, String> e:m.entrySet()) {
	    	System.out.println(e.getKey()+":"+e.getValue());
	    }
	    
	    Map<Integer, String> mp = sortByValues(hashmap); 
	    for (Entry<Integer, String> en : mp.entrySet()) { 
	         System.out.println("Key = " + en.getKey() +  
	                       ", Value = " + en.getValue()); 
		

		}
	}
	
	 public static HashMap sortByValues(Map map) {
		 List<Map.Entry<Integer, String> > list = 
	               new LinkedList<Map.Entry<Integer, String> >(map.entrySet()); 
	  
	        // Sort the list 
	        Collections.sort(list, new Comparator<Map.Entry<Integer, String> >() { 
	            public int compare(Map.Entry<Integer, String> o1,  
	                               Map.Entry<Integer, String> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            } 
	        });
	        HashMap<Integer, String> temp = new LinkedHashMap<Integer, String>(); 
	        for (Map.Entry<Integer, String> aa : list) { 
	            temp.put(aa.getKey(), aa.getValue()); 
	        } 
	        return temp; 
		 
	 }

}
