package six15;

public class CountVowelInString {

	public static void main(String[] args) {
		String str="vikasyadav";
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(isVowel(str.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
		

	}
	private static boolean isVowel(char t) {
		return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
		

	}

}
