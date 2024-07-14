package fiveSix;

public class occrenceWithforLoop {

	public static void main(String[] args) {
		String str="vikasyadav";
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(i<str.length()) {
				for(int j=i+1;j<str.length();j++) {
					if(str.charAt(i)==str.charAt(j)) {
						count++;
					}
				}
				System.out.print(str.charAt(i)+"="+count);
				i=i+count;
				count=1;
			}
		}

	}

}
