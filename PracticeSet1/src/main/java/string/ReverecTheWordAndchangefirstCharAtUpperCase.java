package string;

public class ReverecTheWordAndchangefirstCharAtUpperCase {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
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
