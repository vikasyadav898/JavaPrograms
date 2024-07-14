package string;

import java.util.Scanner;

public class RevrceString1 {

	public static void main(String[] args) {
	String str="vikas yadav";
	String words[]=str.split(" ");
	String rev="";
	for(String word:words)
	{
		String newstr="";
		for(int i=0;i<word.length();i++)
		{
			if(i==0)
			{
				newstr+=word.toUpperCase().charAt(i);
			}
			else
			{
				newstr+=word.charAt(i);
			}
		}
		rev+=newstr+" ";
	}
	System.out.println(rev);
	
	
	}

}
