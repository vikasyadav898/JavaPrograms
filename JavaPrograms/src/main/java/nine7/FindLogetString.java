package nine7;

public class FindLogetString {

	public static void main(String[] args) {
		String str="vikas praksh yad av";
		String words[]=str.split(" ");
		String newstr=words[0];
		for(String word:words)
		{
			if(newstr.length()<word.length())
			{
				newstr=word;
			}
		}
		System.out.println(newstr);

	}

}
