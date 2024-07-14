package nine7;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateWords {

	public static void main(String[] args) {
		String str="vikas praksh yadav vikas prakash siddhi vikas yadav pritha vikas yadav";
		String words[]=str.split(" ");
		Map<String,Integer>map=new HashMap<String,Integer>();
		for(String word:words)
		{
			if(map.containsKey(word))
			{
				map.put(word, map.get(word)+1);
			}
			else
			{
				map.put(word, 1);
			}
		}
		for(Map.Entry<String,Integer>entry:map.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			
		}
		

	}

}
