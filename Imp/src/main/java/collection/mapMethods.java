package collection;

import java.util.HashMap;
import java.util.Map;

public class mapMethods {

	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(101,"vikas");// put method use the add values in map
		map.put(102, "yadav");
		map.put(103, "prakash");
		System.out.println(map);
		//map.remove(101);// removed the 101 recoeds with key and values
		System.out.println(map);
		System.out.println(map.get(102)); //retuen the value
		System.out.println(map.containsKey(103));// return type is boolean
		System.out.println(map.containsValue("vikas"));// return type is boolean it will check the value is present or not
		System.out.println(map.size());// check the size of map
		//map.clear();// this method clear the value
		System.out.println(map);
		System.out.println(map.isEmpty());// return the boolean type value
		System.out.println(map.keySet());//give the set of key [101, 102, 103]
		for(Object i:map.keySet()) {
			System.out.println(i+" "+map.get(i));// give u the all values from collection
			
		}
		System.out.println(map.values());//give the values set of value [vikas, yadav, prakash]
		for(Object i: map.values()) {
			System.out.println(i); //it will give all value
		}
		
		

	}

}
