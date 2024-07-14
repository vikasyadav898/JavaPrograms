package collection;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("vikas");
		list.add("yadav");
		list.add("prakash");
		list.add("vikas");
		list.add(0, "siddhi");
		//System.out.println(list);
		//list.remove(1);
		//System.out.println(list);
		
		System.out.println(list.contains("vikas"));
		System.out.println(list);
		System.out.println(list.get(0));
		list.set(1, "pritha");
		System.out.println(list);

	}

}
