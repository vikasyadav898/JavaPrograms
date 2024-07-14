package test1;

public class PrintFisrtChar1 {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String[] words=str.split(" ");
		for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word.charAt(0 ) + " ");
          

	}

}
		//System.out.println();
	}
}
