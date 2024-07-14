package string;

public class ReverceString {

	public static void main(String[] args) {
		String str="vikasYadav";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reverce String is: "+rev);

	}

}
