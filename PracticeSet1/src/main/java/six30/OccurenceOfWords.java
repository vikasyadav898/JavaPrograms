package six30;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccurenceOfWords {

	public static void main(String[] args) {
	String str="vikas praksh yadav siddhi vikas yadav";
	String words[]=str.split(" ");
	Map<String, Integer> map = new LinkedHashMap<String, Integer>();
	for(String word:words)
	{
		if(map.containsKey(word))
		{
			map.put(word, map.get(word)+1);
		}
		else
		{
			map.put(word,1);
		}
		
	}
	
	System.out.println(map);
	}

}
