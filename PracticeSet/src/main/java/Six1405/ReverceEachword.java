package Six1405;

public class ReverceEachword {

	public static void main(String[] args) {
		String str="vikas yadav prakash";
		String rev="";
		String word[]=str.split(" ");
		
		for(String w:word) {
			for(int i=w.length()-1;i>=0;i--) {
				rev=rev+w.charAt(i);
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}

}
