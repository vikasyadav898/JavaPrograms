package string;

public class FindLongestString {

	public static void main(String[] args) {
		String str="vikas prakash ya dav";
		String words[]=str.split(" ");
		String newstr=words[0];
		for(String word:words)
		{
			if(newstr.length()>word.length())
			{
				newstr=word;
			}
		}
		System.out.println(newstr);

	}

}
