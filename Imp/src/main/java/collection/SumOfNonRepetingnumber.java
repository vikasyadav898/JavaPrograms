package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SumOfNonRepetingnumber {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(78);
		list.add(96);
		list.add(85);
		list.add(10);
		Set<Integer>set=new HashSet<Integer>(list);
		int sum=0;
		for(int num:set)
		{
			sum+=num;
		
		}
		System.out.println(sum);

	}

}
