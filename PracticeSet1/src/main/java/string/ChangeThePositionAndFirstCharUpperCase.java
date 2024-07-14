package string;

public class ChangeThePositionAndFirstCharUpperCase {

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
					newstr+=words[i].toUpperCase().charAt(j);
				}
				else
					
				{
					newstr+=words[i].charAt(j);
				}
			}
			rev+=newstr+" ";	}
		System.out.println(rev);

	}

}
