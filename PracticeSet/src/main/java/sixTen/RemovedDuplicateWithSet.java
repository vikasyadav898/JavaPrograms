package sixTen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovedDuplicateWithSet {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("Banana");
		list.add("Mango");
		list.add("Banana");
		list.add("Cherry");
		Set<String>set=new HashSet<String>();
		Set<String>set1=new HashSet<String>();
		for(String str:list) {
			if(!set.add(str)) {
				set1.add(str);
			}
		}
		for(String str:set1) {
			System.out.println(str);
			
		}
		

	}

}
