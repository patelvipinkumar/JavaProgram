package java8.test;
import java.util.HashMap;
import java.util.Map;

public class MapTest {
	private int value;
	 
	MapTest (int val) {
		value = val;
	}
 
	public void setValue(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
    @Override
    public int hashCode(){
    	int result = 0;
		result = (int) (value/ 11);
		return result;
    }
    @Override
    public boolean equals(Object te){
        return false;
    }
    public static void main(String[] args) {
        MapTest obj = new MapTest(3);
        MapTest obj1 = new MapTest(4);
        obj.setValue(3);
        obj1.setValue(4);
        Map<MapTest,Integer> test = new HashMap<MapTest,Integer>(); 
        test.put(obj, 1000);
        test.put(obj1, 2000);
       // test.put(new MapTest(), 4000);
        System.out.println(test.get(obj)+" :"+obj.hashCode()); //1000
        System.out.println(test.get(obj1)+" :"+obj1.hashCode());//2000
        System.out.println(test);//Null
        System.out.println(test.size());//3
    }

}