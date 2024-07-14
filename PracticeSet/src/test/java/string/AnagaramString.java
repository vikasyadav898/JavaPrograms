package string;

import java.util.Arrays;

public class AnagaramString {

	public static void main(String[] args) {
		String str1="listen";
		String str2="Si lent   ";
		str1=str1.replace(" ", "");
		str2=str2.replace(" ","");
		
		char ch1[]=str1.toLowerCase().toCharArray();
		char ch2[]=str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean status=Arrays.equals(ch1, ch2);
		if(status==true) {
			System.out.println("this is anagram string");
		}
		else
		{
			System.out.println("This is not anagram string");
		}
		
		

	}

}
