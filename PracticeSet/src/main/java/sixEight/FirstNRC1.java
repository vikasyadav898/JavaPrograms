package sixEight;

public class FirstNRC1 {

	public static void main(String[] args) {
		String str="vikasyadav";
		
		for(int i=0;i<=str.length();i++) {
			boolean status=true;
			for(int j=i+1;j<=str.length()-1;j++) {
				if(str.charAt(i)==str.charAt(j)) {
					status=false;
					
				}
			}
			if(status) {
				System.out.println(str.charAt(i));
				break;
			}
		}

	}

}
