package string;
import java.util.*;

public class OccurenceOfCharWithMap {

	public static void main(String[] args) {
		String str="vikasydav";
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(char w:str.toCharArray()) {
			if(map.containsKey(w)) {
				map.put(w, map.get(w)+1);
			}
			map.put(w, 1);
			
		}
		System.out.println(map);

	}

}
