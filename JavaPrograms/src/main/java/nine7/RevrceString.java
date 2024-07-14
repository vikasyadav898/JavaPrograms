package nine7;

public class RevrceString {

	public static void main(String[] args) {
		String str="vikasyadav";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
			
		}
		System.out.println(rev);

	}

}
