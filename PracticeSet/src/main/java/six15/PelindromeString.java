package six15;

public class PelindromeString {

	public static void main(String[] args) {
		 String str="madam";
		 String org_str=str;
		 String rev="";
		 for(int i=str.length()-1;i>=0;i--) {
			 rev=rev+str.charAt(i);
		 }
		 if(org_str.equals(rev)) {
			 System.out.println("This is pelindrome String");
		 }
		 else
		 {
			 System.out.println("This is not pelindrome String");
		 }
	}

}
