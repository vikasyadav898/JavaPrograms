package six12;

public class LogestWordInString {

	public static void main(String[] args) {
		String str="vikas yada prakash";
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
