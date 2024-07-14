package string;

public class FisrtChatCapital {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String rev="";
		String words[]=str.split(" ");
		for(String word:words)
		{	String revword="";
			for(int i=word.length()-1;i>=0;i--) {
				if(i==0) {
				revword=revword+word.toUpperCase().charAt(i);
				}
				else
				{
					revword=revword+word.charAt(i);
				}
				
			}
			rev=rev+revword+" ";
		}
		System.out.println(rev);

	}

}
