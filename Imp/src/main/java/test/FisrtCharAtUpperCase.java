package test;

public class FisrtCharAtUpperCase {

	public static void main(String[] args) {
		String str="vikas prakash yadav"; 
		String rev="";
		String words[]=str.split(" ");
		for(String word:words) {
			String revword="";
			for(int i=0;i<word.length();i++) {
				if(i==1) {
				revword=revword+word.toUpperCase().charAt(i);
				}
				else
				{
					revword=revword+word.charAt(i);
				}
				
			}
			rev=rev+revword+" ";
		}
		System.out.println(rev);

	}

}
