package sixSix;

public class RemovedDuplicate {

	public static void main(String[] args) {
		String str="aabbccssdd";
		String newString="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(newString.indexOf(ch)==-1) {
				newString+=ch;
				
			}
			
			
		}
		System.out.println(newString);
		

	}

}
