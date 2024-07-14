package string;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWord {

	public static void main(String[] args) {
		String str="vikas yadav vikas yadav i am vikas";
		String words[]=str.split(" ");
		Map<String,Integer>map=new HashMap<String,Integer>();
		for(String word:words)
		{
			if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}
			else
			{
				map.put(word, 1);
			}
			
		}
		System.out.println(map);
		
	}

}
