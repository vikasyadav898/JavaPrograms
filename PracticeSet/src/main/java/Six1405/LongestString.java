package Six1405;

public class LongestString {

	public static void main(String[] args) {
		String str="vikasssssss pra ashb";
		String lstr="";
		String words[]=str.split(" ");
		for(String w:words) {
			if(lstr.length()<w.length()) {
				lstr=w;
			}
		}
		System.out.println(lstr);

	}

}
