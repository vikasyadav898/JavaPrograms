package six30;

public class RevercSingleEachWords {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String words[]=str.split(" ");
		String rev="";
		//for(String word:words)
		for(int j=0;j<words.length;j++)
		{
			String newstr="";
			if(j==0||j==1) {
			for(int i=words[j].length()-1;i>=0;i--)
			{
				newstr=newstr+words[j].charAt(i);
			}
			}else
			{
				newstr=newstr+words[j];
			}
			rev=rev+newstr+ " ";
		}
		System.out.println(rev);

	}

}
