package six14;

import java.util.*;

public class FindDuplicateFromList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("cat");
		list.add("rat");
		list.add("cat");
		list.add("dog");
		list.add(1,"dog");
		Set<String>set=new HashSet<String>();
		for(String s:list) {
			if(!set.add(s)) {
				System.out.println(s);
			}
			
		}

	}

}
