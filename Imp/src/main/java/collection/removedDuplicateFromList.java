package collection;
import java.util.*;

public class removedDuplicateFromList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("vikas");
		list.add("prakash");
		list.add("vikas");
		list.add("yadav");
		Set<String>set=new HashSet<String>();
		for(String str:list)
		{
			if(set.add(str)) {
				System.out.println(str);
			}
		}
		
		
		

	}


}
