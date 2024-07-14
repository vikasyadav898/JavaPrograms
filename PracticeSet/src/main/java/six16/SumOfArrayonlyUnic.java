package six16;

import java.util.HashSet;
import java.util.Set;

public class SumOfArrayonlyUnic {

	public static void main(String[] args) {
		int arr[]= {2,5,8,9,7,5,8,6,2};
		int sum=0;
		Set<Integer>set=new HashSet<Integer>();
		for(int num:arr)
		{
			if(set.add(num))
			{
				sum=sum+num;
			}
		}
		System.out.println(sum);
	}

}
