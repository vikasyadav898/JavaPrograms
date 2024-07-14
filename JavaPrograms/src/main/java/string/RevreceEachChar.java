package string;

public class RevreceEachChar {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String words[]=str.split(" ");
		String rev="";
		for(String word:words)
		{
			String newstr="";
			for(int i=word.length()-1;i>=0;i--)
			{
				newstr=newstr+word.charAt(i);
			}
			rev=rev+newstr+" ";
		}
		System.out.println(rev);
	}

}
