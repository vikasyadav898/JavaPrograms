package test1;

public class PrintUpperCaseChar {

	public static void main(String[] args) {
		String str="VIKAS yadav";
		String s="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch));{
				s=s+ch;
			}
			
		}
       System.out.println(s);
		
	}
	

}
