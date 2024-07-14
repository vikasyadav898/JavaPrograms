package string;

public class HowToReverceSpecificElement {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String words[]=str.split(" ");
		String rev=words[1];
		for(String w:words)
		{
			String newstr="";
			for(int i=w.length()-1;i>=0;i--)
			{
				newstr=newstr+w.charAt(i);
			}
			rev=rev+newstr+" ";
		}
		System.out.println(rev);
	}

}
