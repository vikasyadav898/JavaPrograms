package six15;

public class PrintVowels {

	public static void main(String[] args) {
		String str="vikasyadav";
		String newstr="";
		for(int i=0;i<str.length();i++) {
			if(isVowel(str.charAt(i))) {
				
			}
			else
			{
				newstr=newstr+str.charAt(i);
			}
		}
		System.out.println(newstr);
		

	}
	private static boolean isVowel(char t) {
		return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
		

	}

}
