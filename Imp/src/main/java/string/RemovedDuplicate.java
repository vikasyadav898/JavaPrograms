package string;

public class RemovedDuplicate {

	public static void main(String[] args) {
		String str="vikasyadav";
		String newStr="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(newStr.indexOf(ch)==-1) {
				newStr=newStr+ch;
			}
			
		}
		System.out.println(newStr);

	}

}
