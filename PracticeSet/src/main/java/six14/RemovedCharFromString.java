package six14;

public class RemovedCharFromString {

	public static void main(String[] args) {
		String str="vikkakkas";
		String rev="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='k') {
				
			}
			else {
				rev+=str.charAt(i);
			}
		}
		System.out.println(rev);

	}

}
