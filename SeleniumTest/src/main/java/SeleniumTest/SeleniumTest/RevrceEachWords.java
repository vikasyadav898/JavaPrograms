package SeleniumTest.SeleniumTest;

public class RevrceEachWords {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String words[]=str.split(" ");
		String rev="";
		for(String word:words)
		{
			String newrev="";
			for(int i=word.length()-1;i>=0;i--)
			{
				newrev+=word.charAt(i);
			}
			rev=rev+newrev+" ";
		}
		System.out.println(rev);
	}

}
