package six15;

import java.util.HashMap;
import java.util.Map;

public class OccurenceWithMap {

	public static void main(String[] args) {
		String str="vikasyadav";
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(char s:str.toCharArray()) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)+1);
			}
			else
			{
				map.put(s, 1);
			}
			
		}
		System.out.println(map);
		

	}

}
