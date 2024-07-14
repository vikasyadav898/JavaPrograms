package six12;

public class ReverceEachWord {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String rev="";
		String word[]=str.split(" ");
		for(String w:word) {
			String revWord="";
			for(int i=w.length()-1;i>=0;i--) {
				revWord=revWord+w.charAt(i);
			}
			rev=rev+revWord+" ";
		}
		System.out.println(rev);

	}

}
