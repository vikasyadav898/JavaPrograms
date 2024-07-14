package six30;

public class RemovedPelindromeChar {

	public static void main(String[] args) {
		String str="vikasyadav";
		String newstr="";
		for(int i=0;i<str.length();i++)
		{
			if(!isVowel(str.charAt(i)))
			{
				newstr+=str.charAt(i);
			}
		}
		System.out.println(newstr);
		

	}
	public static boolean isVowel(char t)
	{
		return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
	}

}
