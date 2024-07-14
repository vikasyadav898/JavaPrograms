package nine7;
import java.util.*;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		Integer arr[]= {10,20,30,40,50,60,10};
		List<Integer>list=Arrays.asList(arr);
		Set<Integer>set=new LinkedHashSet<Integer>(list);
		System.out.println(set);
		int sum=0;
		for(int num:set)
		{
			sum+=num;
		}
		System.out.println(sum);
		

	}

}
