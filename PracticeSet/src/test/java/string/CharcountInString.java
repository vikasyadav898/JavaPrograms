package string;

import org.apache.commons.io.FileSystemUtils;

public class CharcountInString {

	public static void main(String[] args) {
		String str="vikasyadav";
		int num=str.length()-str.replace("a", "").length();
		char ch='a';
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(ch==str.charAt(i)) {
				count++;
			}
		}
		System.out.println(num);

	}

}
