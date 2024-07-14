package string;

public class ChangSecondPositions {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String words[]=str.split(" ");
		String newstr=words[1];
		String rev="";
		for(int i=newstr.length()-1;i>=0;i--)
		{
			rev+=newstr.charAt(i);
		}
		System.out.println(words[0]+" "+rev+" "+words[2]);

	}

}
