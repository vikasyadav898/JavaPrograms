package fiveSix1;

public class ReverceEachWord {

	public static void main(String[] args) {
		String str="Vikas prakash yadav";
		String word[]=str.split(" ");
		String rev="";
		for(String w:word)
		{
			String revword="";
			for(int i=w.length()-1;i>=0;i--) {
				revword=revword+w.charAt(i);
			}
			rev=rev+revword+" ";
		}
		System.out.println(rev);

	}

}
