package collection;

import java.util.ArrayList;
import java.util.List;

public class FindMaxStringInList {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("vikas");
		list.add("prithayadav");
		list.add("yadav");
		list.add("sid");
		String lstr="";
		for(String str1:list)
		{
			if(str1.length()>lstr.length())
			{
				lstr=str1;
			}
		}
		System.out.println(lstr);

	}

}
