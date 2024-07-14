package test;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfChar {

	public static void main(String[] args) {
	String str="INNTERRRVVIEW";
	Map<Character,Integer>map=new HashMap<Character,Integer>();
	for(char w:str.toCharArray())
	{
		if(map.containsKey(w))
		{
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
