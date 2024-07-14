package six15;

public class LongString {
	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String lstr="";
		String words[]=str.split(" ");
		for(String word:words) {
			if(lstr.length()<word.length()) {
				lstr=word;
				
			}
		}
		System.out.println(lstr);
		
	}

}
