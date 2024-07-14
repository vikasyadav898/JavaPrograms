package fiveSix;
import java.util.Map;
import java.util.HashMap;

public class occurenceOfChar {

	public static void main(String[] args) {
		String str="vikasyadav";
		Map<Character,Integer>map=new HashMap<Character,Integer>();
		char arr[]=str.toCharArray();
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{	count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			map.put(arr[i], count);
			
		}
		System.out.println(map);
	}

}
