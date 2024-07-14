package sixSix;

public class ReverceStringWithoutPositionChange {

	public static void main(String[] args) {
		String str="vikas yadav vikas prakash";
		String word[]=str.split(" ");
		String rev="";
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
