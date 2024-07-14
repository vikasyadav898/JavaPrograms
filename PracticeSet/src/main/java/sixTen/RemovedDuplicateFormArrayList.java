package sixTen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemovedDuplicateFormArrayList {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("mango");
		list.add("mango");
		list.add("banana");
		list.add("cherry");
		System.out.println(list);
		List<String>listwithout=new ArrayList<String>();
		for(String str:list) {
			if(!listwithout.contains(str)) {
				listwithout.add(str);
				
			}
		}
		System.out.println(listwithout);
		
		

	}

}
