package string1;

public class revWordWithoutchangeposition {

	public static void main(String[] args) {
		String str="vikas prakash yadav";// sakiv hsakarp vaday
		String word[]=str.split(" ");
		String rev="";
		for(String w:word)
		{
			String revword="";
			for(int i=w.length()-1;i>=0;i--)
			{
				revword=revword+w.charAt(i);
			}
			rev=rev+revword+" ";
		}
		System.out.println(rev);

	}

}
