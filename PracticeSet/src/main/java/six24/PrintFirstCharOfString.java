package six24;

public class PrintFirstCharOfString {

	public static void main(String[] args) {
		String str="vikas praksh yadav";
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String s=words[i];
			System.out.println(s.charAt(0));
			
		}
		

	}

}
