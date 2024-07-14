package string;

public class ChangeThepositionAndMakeUpperCase {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String words[]=str.split(" ");
		String rev="";
		for(int i=words.length-1;i>=0;i--)
		{
			String newstr="";
			for(int j=0;j<words[i].length();j++)
			{
				if(j==0)
				{
					newstr=newstr+words[i].toUpperCase().charAt(j);
				}
				else
				{
					newstr=newstr+words[i].charAt(j);
				}
			}
			rev=rev+newstr+" ";
			
		}
		System.out.println(rev);
		

	}

}
