package six18;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String str1="vikas";
		String str2="kasvi";
		str1=str1.replace(" ", "");
		str2=str2.replace(" ", "");
		
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("this is Ananagram String");
		}
		else
		{
			System.out.println("This is not Ananagram String");
		}
		

	}

}
