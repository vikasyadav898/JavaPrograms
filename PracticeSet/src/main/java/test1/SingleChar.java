package test1;

public class SingleChar {

	public static void main(String[] args) {
		String str="vikasyadav";
		char targetChar='a';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==targetChar)
			{
				count++;
			}
		}
		System.out.println("occurence of a is= "+count);

	}

}
