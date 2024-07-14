package sixEleven;

public class PrintFisrtWord {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String words[]=str.split(" ");
		for(String word:words) {
			if(!word.isEmpty()) {
				System.out.println(word.charAt(0));
			}
		}

	}

}
