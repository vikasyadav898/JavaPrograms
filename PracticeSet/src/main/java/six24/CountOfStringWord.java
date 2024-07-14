package six24;

public class CountOfStringWord {

	public static void main(String[] args) {
		String str="vikas yadav vikas yadav vikas";
		String words[]=str.split(" ");
		String substr="vikas";
		int count=0;
		for(int i=0;i<words.length;i++)
		{
			if(substr.equals(words[i]))
			{
				count++;
			}
			
		}
		System.out.println(count);

	}

}
