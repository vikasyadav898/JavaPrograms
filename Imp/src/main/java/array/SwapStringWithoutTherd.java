package array;

public class SwapStringWithoutTherd {

	public static void main(String[] args) {
		String str1="Vikas";
		String str2="Yadav";
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		
		str1=str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str2);

	}

}
