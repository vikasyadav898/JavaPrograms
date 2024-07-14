package string;

import java.util.HashMap;
import java.util.Map;

public class OccurenceUsingMap1 {

	public static void main(String[] args) {
		String str="vikas yadav";
		int count=0;
		char arr[]=str.toCharArray();
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		for(int i=0;i<arr.length;i++) {
			count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				else {
					map.put(arr[i], count);
				}
			}
			
		}
		System.out.println(map);
		

	}

}
