package collection0507;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SorrtArrayAccending {

	public static void main(String[] args) {
		Integer arr[]= {10,2,36,52,85,96,78,12,96,96};
		List<Integer>list=Arrays.asList(arr);
		Collections.sort(list);
		Set<Integer>set=new TreeSet<Integer>(list);
		System.out.println(set);
		
		
		
		

	}

}
