package nine7;

public class RemovedSpesifiCharFromString {

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
