package string;

public class CountOfChar {

	public static void main(String[] args) {
		String str="vikasyadav";
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!='a')
			{
				str1=str1+str.charAt(i);
			}
		}
		System.out.println(str1);

	}

}
