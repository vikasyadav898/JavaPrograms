package eightSeven;

public class CountSpecificChar {

	public static void main(String[] args) {
		String str="vikasyadav";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a')
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
