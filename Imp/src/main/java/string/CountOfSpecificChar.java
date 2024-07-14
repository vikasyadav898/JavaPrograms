package string;

public class CountOfSpecificChar {

	public static void main(String[] args) {
		String str="vikasyadav";
		int withchar=str.length();
		String str1=str.replace("a", "");
		int withaoutChar=str1.length();
		System.out.println("number of char is :"+(withchar-withaoutChar));
		
		

	}

}
