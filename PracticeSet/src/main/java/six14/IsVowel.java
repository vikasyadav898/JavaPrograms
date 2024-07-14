package six14;

public class IsVowel {

	public static void main(String[] args) {
		String str="vikasprakshyadav";
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(isVowel(str.charAt(i))) {
				
			}
			else
			{
				str1+=str.charAt(i);
			}
			
		}
		System.out.println(str1);

	}
	public static boolean isVowel(char t) {
		return t=='a' ||t=='e'|| t=='i' ||t=='o' ||t=='u' ||t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
		
	}

}
