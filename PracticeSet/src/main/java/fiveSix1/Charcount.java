package fiveSix1;

public class Charcount {

	public static void main(String[] args) {
		String str="vikasyadav";
		char ch='a';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
			
		}
		
			System.out.println(ch+":"+count);
				
		

	}

}
