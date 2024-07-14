package array;

import java.util.TreeSet;

public class FindSecondHigh {

	public static void main(String[] args) {
		int arr[]= {4,2,3,4,5,5,5,5,5,5,6};
		TreeSet<Integer>set=new TreeSet<Integer>();
		for(int num:arr)
		{
			set.add(num);
		}
		set.pollLast();
		int num1=set.pollLast();
		System.out.println(num1);

	}

}
