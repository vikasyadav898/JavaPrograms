package six14;

public class PrintFirstChatOfString {

	public static void main(String[] args) {
		String str="vikas yadav prakash";
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++) {
			String s=words[i];
			System.out.println(s.charAt(0));
		}
		

	}

}
