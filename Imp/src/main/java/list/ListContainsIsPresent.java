package list;

import java.util.ArrayList;
import java.util.List;

public class ListContainsIsPresent {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("vikas");
		list.add("kailas");
		list.add("yadav");
		 String sreach="kailas";
		 boolean exsit=list.contains(sreach);
		 if(exsit) {
			 System.out.println("present");
		 }
		 else
		 {
			 System.out.println("not preasent");
		 }
		

	}

}
