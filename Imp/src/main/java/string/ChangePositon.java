package string;

public class ChangePositon {

	public static void main(String[] args) {
		String str="vikas yadav";
		String word[]=str.split(" ");
		for(int i=word.length-1;i>=0;i--) {
			System.out.println(word[i]);
		}

	}

}
