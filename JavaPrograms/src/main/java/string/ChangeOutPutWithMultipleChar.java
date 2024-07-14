package string;

public class ChangeOutPutWithMultipleChar {

	public static void main(String[] args) {
		String str="vikas";
		String newstr="";
		for(int i=0;i<str.length();i++)
		{
			//char ch=str.charAt(i);
			newstr+=str.charAt(i);
			newstr+=str.charAt(i);
		}
		System.out.println(newstr);

	}

}
