package nine7;

import java.util.HashMap;
import java.util.Map;

public class FindDupicateOccurenceWithMap {

	public static void main(String[] args) {
		String str="vikasyadav";
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(char ch:str.toCharArray())
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		for(Map.Entry<Character,Integer>entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}

	}

}
