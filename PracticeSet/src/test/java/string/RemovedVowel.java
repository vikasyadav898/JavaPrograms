package string;

public class RemovedVowel {

	public static void main(String[] args) {
		String str="vikasyadav";
		String withoutVowel="";
		for(int i=0;i<str.length();i++) {
			if(isVowel(str.charAt(i))) {
				withoutVowel+=str.charAt(i);
			}
			
		}
		System.out.println(withoutVowel);

	}
	public static boolean isVowel(char t) {
		return t=='a'||t=='e'||t=='i'||t=='o'||t=='u'||t=='A'||t=='E'||t=='I'||t=='O'||t=='U';
	}

}
