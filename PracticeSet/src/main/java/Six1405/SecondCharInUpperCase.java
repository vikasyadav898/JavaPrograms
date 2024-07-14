package Six1405;

public class SecondCharInUpperCase {

	public static void main(String[] args) {
		String str="Vikas Prakash Yadav";
		String arr[]=str.split(" ");
		String rev="";
		for(String s:arr) {
			for(int i=0;i<s.length();i++) {
				if(i==1) {
					rev=rev+s.toUpperCase().charAt(i);
				}
				else
				{
					rev=rev+s.charAt(i);
				}
			}
			rev=rev+" ";
			
		}
		System.out.println(rev);
		
		
	}

}
