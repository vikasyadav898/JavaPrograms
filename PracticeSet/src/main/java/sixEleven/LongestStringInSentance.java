package sixEleven;

public class LongestStringInSentance {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String lword="";
		String words[]=str.split(" ");
		for(String word:words) {
			if(word.length()>lword.length()) {
				lword=word;
			}
		}
		System.out.println(lword);

	}

}
