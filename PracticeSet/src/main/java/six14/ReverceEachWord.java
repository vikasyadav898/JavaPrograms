package six14;

public class ReverceEachWord {

	public static void main(String[] args) {
		String str="vikas yadav prakash";
		String rev="";
		String words[]=str.split(" ");
		for(String word:words) {
			String revword="";
			for(int i=word.length()-1;i>=0;i--) {
				revword=revword+word.charAt(i);
			}
			rev=rev+revword+" ";
		}
		System.out.println(rev);

	}

}
