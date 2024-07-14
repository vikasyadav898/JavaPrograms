package collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		Map<String,Integer> hash=new Hashtable<String,Integer>();
		hash.put("vikas",101);
		hash.put("yadav", 102);
		hash.put("pritha", 103);
		hash.put("siddhi", 104);
		for(String str:hash.keySet())
		{
			System.out.println(str+" "+hash.get(str));
		}
		for(int i:hash.values())
		{
			System.out.println(i);
		}
		System.out.println(hash.isEmpty());
		System.out.println(hash.containsKey("vikas"));
		System.out.println(hash.containsValue(103));
		System.out.println(hash.size());
		

	}

}
