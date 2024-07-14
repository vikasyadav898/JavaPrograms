package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMinNumberInList {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(41);
		list.add(6);
		list.add(20);
		list.add(96);
		int max=Collections.min(list);
		System.out.println(max);

	}

}
