package six13;

public class CountSingleCharInString {

	public static void main(String[] args) {
		String str="vikasyadav";
		int count=0;
		char ch='a';
		for(int i=0;i<str.length();i++) {
			if(ch==str.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
