package nine7;

public class Program {

	public static void main(String[] args) {
		String str="vikas21sb128";
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(ch[i]))
			{
				count+=Integer.parseInt(String.valueOf(ch[i]));
			}
		}
		System.out.println(count);
	}

}
