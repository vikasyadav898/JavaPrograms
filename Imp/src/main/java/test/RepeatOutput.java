package test;

public class RepeatOutput {

	public static void main(String[] args) {
		String str="vikas";//output:vviikkaass
		String newstr="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			newstr=newstr+ch+ch;
		}
		System.out.println(newstr);

	}

}
