package string;

public class FindVowelInString {

	public static void main(String[] args) {
		String str="vikasyERRadav";
		str=str.toLowerCase().replace(" ", "");
		String str1="aeiou";
		String findVowel="";
		for(int i=0;i<str.length();i++) {
			if(str1.indexOf(str.charAt(i))==-1) {
				findVowel+=str.charAt(i);
			}
		}
		System.out.println(findVowel);

	}

}
