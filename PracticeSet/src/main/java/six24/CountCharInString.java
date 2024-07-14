package six24;

public class CountCharInString {

	public static void main(String[] args) {
		String str="vikasyadav";
		char subchar='a';
		int count=0;
		for(char i=0;i<str.length();i++)
		{
			if(subchar==str.charAt(i))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
