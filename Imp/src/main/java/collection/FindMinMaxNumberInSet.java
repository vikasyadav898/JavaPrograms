package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindMinMaxNumberInSet {

	public static void main(String[] args) {
		Set<Integer>set=new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(45);
		set.add(89);
		set.add(79);
		int min=Collections.min(set); // find min number in set //change into max
		System.out.println(min);
		System.out.println(set);// set will sort Using this 
	}

}
