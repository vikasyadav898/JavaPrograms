package six18;

public class RemovedDuplicteChar {

	public static void main(String[] args) {
		String str="characters";
		String newstr="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(newstr.indexOf(ch)==-1)
			{
				newstr=newstr+ch;
			}
		}
		System.out.println(newstr);

	}

}
