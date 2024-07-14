package six13;

public class RemovedDuplicate {

	public static void main(String[] args) {
		String str="vikasyadav";
		String newString="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
		if(newString.indexOf(ch)==-1) {
			newString=newString+ch;
		}
		
			
		}
		System.out.println(newString);

	}

}
