package sixEleven;

public class ReverceEachWord {

	public static void main(String[] args) {
		String str="vikas praskah yadav";
		String rev="";
		String word[]=str.split(" ");
		for(String w:word) {
			String revword="";
			for(int i=w.length()-1;i>=0;i--) {
				revword=revword+w.charAt(i);
			}
			rev=rev+revword+" ";
		}
		System.out.print(rev);

	}

}
