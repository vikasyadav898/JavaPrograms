package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindMaxNumberInSet {

	public static void main(String[] args) {
		Set<Integer>set=new HashSet<Integer>();
		set.add(0);
		set.add(10);
		set.add(12);
		set.add(85);
		set.add(96);
		int max=Collections.min(set);
		System.out.println(max);
		

	}

}
