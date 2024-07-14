package string;

import java.util.*;

public class AnagramString {

	public static void main(String[] args) {
		System.out.println(isAnagram("vikas", "vikass"));
		

	}
	public static boolean isAnagram(String str1,String str2) {
		str1=str1.replaceAll(" ","");
		str2=str2.replaceAll(" ","");
		if(str1.length()!=str2.length()) {
			return false;
		}
		else
		{
			char c1[]=str1.toLowerCase().toCharArray();
			char c2[]=str2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			return Arrays.equals(c1, c2);
		}
		
		
		
		
		
	}

}
