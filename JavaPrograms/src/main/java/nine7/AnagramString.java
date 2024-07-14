package nine7;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str1="vikas";
		String str2="Kasvi";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1,ch2))
		{
			System.out.println("this is anagram String");
		}
		else
		{
			System.out.println("this is not anagram String");
		}
				
	}

}
