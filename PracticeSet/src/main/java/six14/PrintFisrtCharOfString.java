package six14;

public class PrintFisrtCharOfString {

	public static void main(String[] args) {
		String str="vikas praksh yadav";
		String rev="";
		String words[]=str.split(" ");
		for(String word:words) {
			for(int i=0;i<word.length();i++) {
				if(i==0) {
					rev+=word.charAt(i);
				}
				
			}
		}
		System.out.println(rev);

	}

}
