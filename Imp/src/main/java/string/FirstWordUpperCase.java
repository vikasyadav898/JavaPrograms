package string;

public class FirstWordUpperCase {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String rev="";
		String words[]=str.split(" ");
		for(String word:words) {
			String revword="";
			for(int i=0;i<word.length();i++) {
					if(i==1) {
					rev=rev+word.toUpperCase().charAt(i);
					}
					else {
						rev=rev+word.charAt(i);
					}
				
			}
			rev=rev+" ";
		}
		System.out.println(rev);

	}

}
