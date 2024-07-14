package fiveSix;

public class fisrtNRC {

	public static void main(String[] args) {
		String str="vikasyadav";
		//int count=0;
		for(int i=0;i<str.length();i++) {
			boolean status=true;
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)){
					System.out.println(str.charAt(i));
					break;
					
					
				}
			}
			if(status) {
				System.out.println(str.charAt(i));
				break;
			}
		}

	}

}
