package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindMaxNumberInArray {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(78);
		list.add(3);
		list.add(20);
		int max=list.get(0);
		for(int num:list)
		{
			if(num<max) {
				max=num;
			}
		}
		System.out.println(max);

	}

}
