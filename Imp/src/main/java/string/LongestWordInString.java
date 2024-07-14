package string;

public class LongestWordInString {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String lword="";
		String words[]=str.split(" ");
		for(String word:words) {
			if(lword.length()<word.length()) {
				lword=word;
			}
		}
		System.out.println(lword);
		
		
	}

}
