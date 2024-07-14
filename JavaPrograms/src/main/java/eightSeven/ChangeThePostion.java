package eightSeven;

public class ChangeThePostion {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String words[]=str.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}

	}

}
