package six14;

public class ConverFirstCharAtUpperCase {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String rev="";
		String words[]=str.split(" ");
		for(String word:words) {
			String revword="";
			for(int i=0;i<word.length();i++) {
				if(i==0) {
					revword+=word.toUpperCase().charAt(i);
				}
				else
				{
					revword+=word.charAt(i);
				}
			}
			rev+=revword+" ";
		}
		System.out.println(rev);

	}

}
