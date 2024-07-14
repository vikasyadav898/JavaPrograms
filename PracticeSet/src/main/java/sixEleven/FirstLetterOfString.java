package sixEleven;

public class FirstLetterOfString {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String word[]=str.split(" ");
		for(int i=0;i<word.length;i++) {
			String s=word[i];
			System.out.println(s.charAt(0));
		}
		

	}
	
}
