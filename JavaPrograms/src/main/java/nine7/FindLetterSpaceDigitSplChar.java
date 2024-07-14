package nine7;

public class FindLetterSpaceDigitSplChar {

	public static void main(String[] args) {
		String str="bcb73^^#*ch989";
		int chr=0;
		int num=0;
		int space=0;
		int splchr=0;
		char ch[]= str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(ch[i]))
			{
				num++;
			}
			else if(Character.isSpace(ch[i]))
			{
				space++;
			}
			else if(Character.isLetter(ch[i]))
			{
				chr++;
			}
			else
			{
				splchr++;
			}
		}
		System.out.println(num);

	}

}
