package six30;

public class RevrceEachWords {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		
		String rev="";
		String words[]=str.split(" ");
		for(String word:words)
		{
			String newstr="";
			for(int j=word.length()-1;j>=0;j--)
			{
				if(j==word.length()-1)
				{
					newstr=newstr+word.toUpperCase().charAt(j);
				}
				else
				{
					newstr=newstr+word.charAt(j);
				}
				
			}
			rev=rev+newstr+" ";
		}
		System.out.println(rev);
	}

}
