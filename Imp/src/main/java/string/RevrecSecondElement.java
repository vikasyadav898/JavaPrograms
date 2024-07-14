package string;

public class RevrecSecondElement {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String words[]=str.split(" ");
		String word=words[1];	
		String rev="";
		for(int i=word.length()-1;i>=0;i--)
		{
			rev=rev+word.charAt(i);
		}
		System.out.println(words[0]+" "+rev+" "+words[2]);

	}

}
