package Six1405;

public class RevrecRachWord {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String rev="";
		String words[]=str.split(" ");
		for(String w:words) {
			for(int i=w.length()-1;i>=0;i--) {
				rev=rev+w.charAt(i);
			}
			rev=rev+" ";
		}
		System.out.println(rev);

	}

}
