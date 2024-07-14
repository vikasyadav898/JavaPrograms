package six14;

public class CalulateSumOfdigit {

	public static void main(String[] args) {
		String str="w33838ewed90";
		char ch[]=str.toCharArray();
		int sum=0;
		for(char c:ch) {
			if(Character.isDigit(c)) {
				sum+=Integer.parseInt(String.valueOf(c));
				
			}
		}
		System.out.println(sum);

	}

}
