package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecondHighNumber {

	public static void main(String[] args) {
		Integer arr[]= {2,5,3,2,5,2,4,1,2,7,9,8,3};
		List<Integer>list=Arrays.asList(arr);
		Collections.sort(list);
		System.out.println(list.get(list.size()-2));

	}

}
