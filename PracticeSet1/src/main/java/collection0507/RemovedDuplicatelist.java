package collection0507;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovedDuplicatelist {

	public static void main(String[] args) {
		List<String>str=new ArrayList<String>();
		str.add("vikas");
		str.add("pritha");
		str.add("yadav");
		str.add("siddhi");
		str.add("yadav");
		Set<String>set=new HashSet<String>();
		for(String s:str)
		{
			if(!set.add(s))
			{
				System.out.println(s);
			}
		}

		
	}

}
