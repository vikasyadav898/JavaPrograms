package six24;

public class LongestString {

	public static void main(String[] args) {
		String str="vi praksh yadav11";
		String words[]=str.split(" ");
		String lstr=words[0];
		for(String word:words)
		{
			if(lstr.length()<word.length()) {
				lstr=word;
			}
		}
		System.out.println(lstr);

	}

}
