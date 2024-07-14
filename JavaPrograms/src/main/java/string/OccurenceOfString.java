package string;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfString {

	public static void main(String[] args) {
		String str="vikas prakash yadav vikas siddhi vikas yadav";
		String words[]=str.split(" ");
		Map<String,Integer>map=new HashMap<String,Integer>();
		for(int i=0;i<words.length;i++)
		{
			if(map.containsKey(words[i]))
			{
				map.put(words[i], map.get(words[i])+1);
			}
			else
				
			{
				map.put(words[i],1);
			}
			
		}
		System.out.println(map);

	}

}
