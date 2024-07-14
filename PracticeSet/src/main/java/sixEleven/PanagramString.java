package sixEleven;

public class PanagramString {

	public static void main(String[] args) {
		String str="asdf ghj l qwerty uiop zxc vbn m";
		boolean status=true;
		if(str.length()<26) {
			status=false;
			
		}else
		{
			for(char ch='a';ch<='z';ch++) {
				if(str.indexOf(ch)<0) {
					
					status=false;
				}
			}
		}
		if(status) {
			System.out.println(true);
		}

	}

}
