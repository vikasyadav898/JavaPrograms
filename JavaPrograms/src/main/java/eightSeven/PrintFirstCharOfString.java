package eightSeven;

public class PrintFirstCharOfString {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String s=words[i];
			System.out.print(s.toUpperCase().charAt(0)+" ");
		}

	}

}
