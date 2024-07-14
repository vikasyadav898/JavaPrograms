package collection0507;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxNumber {

	public static void main(String[] args) {
		List<Integer>str=new ArrayList<Integer>();
		str.add(10);
		str.add(11);
		str.add(12);
		str.add(78);
		int min=Collections.min(str);
		System.out.println(min);

	}

}
