package list;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateListAddRemove {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("vikas");
		list.add("pritha");
		list.add("siddhi");
		list.add("vikas");
		Set<String>set=new HashSet<String>();
		for(String str:list) {
			if(!set.add(str))
			{
				System.out.println(str);
			}
		}

	}

}
