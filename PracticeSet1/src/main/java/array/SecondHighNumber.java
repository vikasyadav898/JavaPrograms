package array;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondHighNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,5,9,6,3,5,-7,6,4,-1};
		Set<Object>set=new TreeSet<Object>();
		for(int num:arr)
		{
			set.add(num);
			
		}
		System.out.println(set);
		
		

	}

}
