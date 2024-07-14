package list;

import java.util.ArrayList;
import java.util.List;

public class CreateListAndRemove {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>();
		list.add(9);
		list.add(10);
		list.add(8);
		//System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(2));
	}

}
