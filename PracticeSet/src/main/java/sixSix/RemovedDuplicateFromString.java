package sixSix;

public class RemovedDuplicateFromString {

	public static void main(String[] args) {
		String str="vikasyadav";
		String newstr="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(newstr.indexOf(ch)==-1) {
				newstr=newstr+ch;
			}
		}
		System.out.println(newstr);
	}

}
