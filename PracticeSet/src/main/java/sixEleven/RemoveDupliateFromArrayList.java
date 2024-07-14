package sixEleven;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupliateFromArrayList {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("banana");
		list.add("cherry");
		list.add("banana");
		list.add("mango");
		//System.out.println(list);
		Set<String>set=new HashSet<String>();
		Set<String>duplicate=new HashSet<String>();
		for(String str:list) {
			if(!set.add(str)) {
				duplicate.add(str);
			}
			
		}
		for(String str:duplicate) {
			System.out.println(str);
		}
		
		
	}

}
