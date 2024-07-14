package string1;

public class ReverceString {

	public static void main(String[] args) {
		String str="Vikas yadav";
		str=str.replace(" ", "");
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);

	}

}
