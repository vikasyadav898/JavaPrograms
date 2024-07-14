package six18;

public class FindLargestWord {

	public static void main(String[] args) {
		String str="Vikas Prakash Ya";
		String words[]=str.split(" ");
		String lstr=words[0];
		for(String word:words) {
			if(lstr.length()<word.length()) {
				lstr=word;
			}
		}
		System.out.println(lstr);
	}

}
