package six14;

public class LongestString {

	public static void main(String[] args) {
		String str="vikas yadav prakash";
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
