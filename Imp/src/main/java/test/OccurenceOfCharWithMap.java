package test;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharWithMap {

	public static void main(String[] args) {
		String str="vikasyadav";
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(char c:str.toCharArray()) {
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			map.put(c, 1);
			
		}
		System.out.println(map);

	}

}
