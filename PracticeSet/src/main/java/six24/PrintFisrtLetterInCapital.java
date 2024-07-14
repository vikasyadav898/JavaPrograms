package six24;

public class PrintFisrtLetterInCapital {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String words[]=str.split(" ");
		String rev="";
		for(String word:words)
		{
			String revword="";
			for(int i=0;i<word.length();i++)
			{
				if(i==0)
				{
				revword=revword+word.toUpperCase().charAt(i);
				}else
				{
					revword=revword+word.charAt(i);
				}
			}
			rev=rev+revword+" ";
		}
		System.out.println(rev);

	}

}
