package string;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfStringWithMap {

	public static void main(String[] args) {
		String str[]= {"vikas","kailsh","yadav","andhlkar","vikas"};
		Map<String,Integer>map=new HashMap<String,Integer>();
		for(String w:str) {
			if(map.containsKey(w)) {
				map.put(w, map.get(w)+1);
			}
			else
			{
				map.put(w, 1);
			}
		}
		System.out.println(map);

	}

}
