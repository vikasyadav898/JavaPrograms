package six15;

public class RemovedDuplicate {

	public static void main(String[] args) {
		String str="vikasyadav";
		String newstring="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(newstring.indexOf(ch)==-1) {
				newstring+=ch;
			}
		}
		System.out.println(newstring);

	}

}
