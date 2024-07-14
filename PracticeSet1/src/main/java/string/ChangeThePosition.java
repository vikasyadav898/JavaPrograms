package string;

public class ChangeThePosition {

	public static void main(String[] args) {
		String str="vikas praksh yadav";
		String words[]=str.split(" ");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}

	}

}
