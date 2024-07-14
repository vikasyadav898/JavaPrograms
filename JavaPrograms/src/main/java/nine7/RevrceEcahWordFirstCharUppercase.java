package nine7;

public class RevrceEcahWordFirstCharUppercase {

	public static void main(String[] args) {
		String str="vikas praksh yadav";
		String words[]=str.split(" ");
		String rev="";
		for(String word:words)
		{
			String newstr="";
			for(int i=word.length()-1;i>=0;i--)
			{
				if(i==word.length()-1)
				{
					newstr+=word.toUpperCase().charAt(i);
				}
				else
				{
					newstr+=word.charAt(i);
				}
				
			}
			rev+=newstr+" ";
		}
		System.out.println(rev);

	}

}
