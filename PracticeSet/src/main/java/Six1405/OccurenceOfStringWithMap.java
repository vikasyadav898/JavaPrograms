package Six1405;


import java.util.*;

public class OccurenceOfStringWithMap {

	public static void main(String[] args) {
		String str="vikasyadav";
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(char w:str.toCharArray())
		{
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
