package collection;

import java.util.ArrayList;
import java.util.List;

public class AddAllNumberInList {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(10);
		list.add(85);
		list.add(78);
		int sum=0;
		for(int num:list)
		{
			sum=sum+num;
		}
		System.out.println(sum);
		

	}

}
