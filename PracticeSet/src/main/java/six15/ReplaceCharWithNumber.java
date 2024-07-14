package six15;

public class ReplaceCharWithNumber {

	public static void main(String[] args) {
		String str="vikas yadav";
		String str1="";
		int count=1;
		 for(int i=0;i<str.length();i++) {
			 char ch=str.charAt(i);
			 if(ch=='a') {
				 str1+=count;
				 count++;
			 }
			 else
			 {
				 str1=str1+str.charAt(i);
			 }
		 }
		System.out.println(str1);

	}

}
