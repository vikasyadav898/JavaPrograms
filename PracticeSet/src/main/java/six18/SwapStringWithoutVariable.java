package six18;

public class SwapStringWithoutVariable {

	public static void main(String[] args) {
		String str1="vikas";
		String str2="yadav";
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println(str1);

	}

}
