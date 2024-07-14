package six18;

import java.util.HashSet;
import java.util.Set;

public class SumOfUnicElements {

	public static void main(String[] args) {
		int arr[]= {5,1,8,4,9,1,5};
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
