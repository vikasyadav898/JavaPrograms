package test;

public class SumOfDigit {

	public static void main(String[] args) {
		String str="sghdsgah7217512";
		char ch[]=str.toCharArray();
		int sum=0;
		for(char c:ch)
		{
			if(Character.isDigit(c)) {
				sum+=Integer.parseInt(String.valueOf(c));
			}
		}
		System.out.println(sum);

	}

}
