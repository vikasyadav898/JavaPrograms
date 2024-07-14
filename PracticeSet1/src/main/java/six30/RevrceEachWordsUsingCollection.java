package six30;

import java.util.ArrayList;
import java.util.List;

public class RevrceEachWordsUsingCollection {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String words[]=str.split(" ");
		String rev="";
		List<String>list=new ArrayList<String>();
		
		for(String word:words)
		{
			list.add(word);
		}
		//String str1=list.get(0);
		for(String str2:list)
		{
			String newstr="";
			for(int i=str2.length()-1;i>=0;i--)
			{
				newstr=newstr+str2.charAt(i);
			}
			rev=rev+newstr+" ";
		}
		System.out.println(rev);
		
	}

}
