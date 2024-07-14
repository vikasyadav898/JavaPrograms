package string;

public class ShiftRachWord {

	public static void main(String[] args) {
		String str="vikas praksh yadav";
		String word[]=str.split(" ");
		for(int i=word.length-1;i>=0;i--) {
			System.out.println(word[i]);
		}

	}

}
