package collection0507;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List<Integer>str=new ArrayList<Integer>();
		str.add(10);
		str.add(11);
		str.add(9);
		str.add(78);
		Collections.sort(str);
		System.out.println(str);

	}

}
