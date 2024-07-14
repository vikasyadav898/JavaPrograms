package string;

public class LongestString {

	public static void main(String[] args) {
		String str="vikas prakash ya dav";
		String words[]=str.split(" ");
		String rev=words[0];
		for(String word:words)
		{
			if(rev.length()>word.length())
			{
				rev=word;
			}
			
		}
		System.out.println(rev);

	}

}
