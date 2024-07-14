package test1;

import java.util.Arrays;

public class AnagramString {
	
	public static boolean anagrams(String str1,String str2)
	{
		str1=str1.replaceAll("\\s", "").toLowerCase();
		str2=str2.replaceAll("\\s", "").toLowerCase();
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[] charArray1=str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		Arrays.equals(charArray1, charArray2);
		
		return true;
		
	}

	public static void main(String[] args) {
		String str1="Mother In Law";
		String str2="Hitler Woman";
		if(anagrams(str1,str2))
		{
			System.out.println(str1 +" and "+str2+ " is anagram");
		}
		else
		{
			System.out.println(str1 +" and "+str2+ " not anagram");
		}
		

	}

}
