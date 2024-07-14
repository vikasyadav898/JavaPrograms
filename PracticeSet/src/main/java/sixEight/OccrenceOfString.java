package sixEight;

import java.util.HashMap;
import java.util.Map;

public class OccrenceOfString {

	public static void main(String[] args) {
		String str="vikas  yadav";
		str=str.replaceAll(" ", "");
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(Character c:str.toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
			
		}
		System.out.println(map);
	}

}
