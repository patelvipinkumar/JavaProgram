package java8.test;

import java.util.*; 
  
class Geek  
{ 
	String name; 
    int id; 
      
    Geek(String name, int id) 
    { 
          
        this.name = name; 
        this.id = id; 
    } 
      
    @Override
    public boolean equals(Object obj) 
    {
		return true;
        /*
        // if both the object references are  
        // referring to the same object. 
        if(this == obj) 
                return true; 
              
            // it checks if the argument is of the  
            // type Geek by comparing the classes  
            // of the passed argument and this object. 
            // if(!(obj instanceof Geek)) return false; ---> avoid. 
            if(obj == null || obj.getClass()!= this.getClass()) 
                return false; 
              
            // type casting of the argument.  
            Geek geek = (Geek) obj; 
              
            // comparing the state of argument with  
            // the state of 'this' Object. 
            return (geek.name.equals(this.name)  && geek.id == this.id); */
        } 
      
    @Override
    public int hashCode() 
    { 
          
        // We are returning the Geek_id  
        // as a hashcode value. 
        // we can also return some  
        // other calculated value or may 
        // be memory address of the  
        // Object on which it is invoked.  
        // it depends on how you implement  
        // hashCode() method. 
        return this.id; 
    } 
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "id:"+id+" name :"+name;
    }
      
} 
  
// Driver code 
public class GFG  
{ 
    public static void main (String[] args)  
    { 
          
        // creating two Objects with  
        // same state 
        Geek g1 = new Geek("vip", 1); 
        Geek g2 = new Geek("vipin", 1); 
        
          
        Map<Geek, String> map = new HashMap<Geek, String>(); 
        
        map.put(g1, "CSE"); 
        map.put(g2, "IT"); 
        
        System.out.println(g1+","+g2);
        Set<Geek> map1=new HashSet<>();
        map1.add(g2);
        map1.add(g1);
        
        System.out.println(map1);
        System.out.println(map);
          
        /*for(Geek geek : map.keySet()) 
        { 
            System.out.println(map.get(geek).toString()+":"+ geek.name); 
            
        }*/ 
  
    } 
} 