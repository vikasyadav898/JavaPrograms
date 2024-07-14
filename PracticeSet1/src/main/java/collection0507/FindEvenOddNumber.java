package collection0507;

import java.util.ArrayList;
import java.util.List;

public class FindEvenOddNumber {

	public static void main(String[] args) {
		int arr[]={2,1,5,2,5,6,8,5,9,8,6,4,7,2,9,5,7};
		List<Integer>even=new ArrayList<Integer>();
		List<Integer>odd=new ArrayList<Integer>();
		for(int num:arr)
		{
			if(num%2==0)
			{
				even.add(num);
			}
			else
			{
				odd.add(num);
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
