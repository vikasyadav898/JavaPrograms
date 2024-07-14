package six30;

public class RevrceSingleWord {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String words[]=str.split(" ");
		String rev="";
		for(int i=0;i<words.length;i++)
		{
			String newstr="";
			if(i==1)
			{
				for(int j=words[i].length()-1;j>=0;j--)
				{
					newstr=newstr+words[i].charAt(j);
				}
			}else
			{
				newstr=newstr+words[i];
			}
			rev=rev+newstr+" ";
		}
		System.out.println(rev);
			

	}

}
