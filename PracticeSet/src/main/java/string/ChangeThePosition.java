package string;

public class ChangeThePosition {

	public static void main(String[] args) {
		String str="vikas yadav";
		String words[]=str.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			System.out.println(words[i]);
		}

	}

}
