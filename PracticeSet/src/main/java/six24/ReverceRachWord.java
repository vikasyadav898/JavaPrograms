package six24;

public class ReverceRachWord {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String words[]=str.split(" ");
		String rev="";
		for(String word:words)
		{
			String revword="";
			for(int i=word.length()-1;i>=0;i--)
			{
				revword=revword+word.charAt(i);
			}
			rev=rev+revword+" ";
		}
		System.out.println(rev);

	}

}
