package test;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		String str="INNTERRVVIEW";
		char newstr = 0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)!=str.charAt(j))
				{
					newstr=str.charAt(i);
				}
			}
		}
		System.out.println(newstr);

	}

}
