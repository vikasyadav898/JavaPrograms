package collection0507;

import java.util.ArrayList;
import java.util.List;

public class FindMaxLengthWords {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("vikas");
		list.add("yadav");
		list.add("prakash");
		list.add("sid");
		String str="";
		for(String word:list)
		{
			if(str.length()<word.length())
			{
				str=word;
			}
		}
		System.out.println(str);

	}

}
