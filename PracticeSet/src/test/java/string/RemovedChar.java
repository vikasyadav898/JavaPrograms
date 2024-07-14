package string;

public class RemovedChar {

	public static void main(String[] args) {
		String str="vikasyadav";
		String newstr="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				
			}
			else
			{
				newstr+=str.charAt(i);
			}
		}
		System.out.println(newstr);

	}

}
