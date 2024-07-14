package six24;

public class RemvedVowelFromString {

	public static void main(String[] args) {
		String str="vikasyadav";
		String nstr="";
		for(int i=0;i<str.length();i++)
		{
			if(!isVowel(str.charAt(i)))
			{
				nstr=nstr+str.charAt(i);
			}
			
		}
		System.out.println(nstr);
		

	}
	public static boolean isVowel(char t)
	{
		return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
	}

}
