package string;

public class CountAnyChar {

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
		if(count!=0)
		{
			System.out.println("count of char:"+count);
		}

	}

}
