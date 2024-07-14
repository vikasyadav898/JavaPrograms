package string;

public class RemovedAnyChar {

	public static void main(String[] args) {
		String str="vikasyadav";
		String newstr="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!='a')
			{
				newstr+=str.charAt(i);
			}
		}
		System.out.println(newstr);

	}

}
