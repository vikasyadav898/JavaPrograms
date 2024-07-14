package collection0507;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinNumberInArray {

	public static void main(String[] args) {
		Integer arr[]= {10,2,36,52,85,96,78,12,96};
		List<Integer>str=Arrays.asList(arr);
		int num=Collections.min(str);
		System.out.println(num);
		

	}

}
