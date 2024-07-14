package test;

public class FirstCharOfString {

	public static void main(String[] args) {
		String str="vikas yadav";
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++) {
			String s=words[i].toUpperCase();
			System.out.println(s.charAt(0));
		}

	}

}
