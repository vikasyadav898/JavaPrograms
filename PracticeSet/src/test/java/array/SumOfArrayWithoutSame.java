package array;

import java.util.HashSet;
import java.util.Set;

public class SumOfArrayWithoutSame {

	public static void main(String[] args) {
		int arr[]= {10,10,12,52,78,96,96,78};
		int sum=0;
		Set<Integer>duplicate=new HashSet<Integer>();
		for(int add:arr) {
			if(!duplicate.add(add)) {
				
				sum=sum+add;
			}
			
		}
		System.out.println(sum);
	}
}
