package string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovedDplicate {

	public static void main(String[] args) {
		String str="hi am am vikas yadav vikas";
		String word[]=str.split(" ");
		Set<String>set=new LinkedHashSet<String>();
		for(String s:word)
		{
			set.add(s);
		}
		for(String ss:set)
		{
			System.out.println(ss);
		}
		
	}
	
}
