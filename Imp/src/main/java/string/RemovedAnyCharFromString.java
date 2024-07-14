package string;

public class RemovedAnyCharFromString {
	public static void main(String[] args) {
		String str="communication";
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='m') {
				
			}
			else
			{
				str1=str1+str.charAt(i);
			}
		}
		System.out.println(str1);
	}

}
