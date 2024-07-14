package eightSeven;

public class FindLongetWordsInString {

	public static void main(String[] args) {
		String str="siddhi vik as yadav";
		String words[]=str.split(" ");
		String lword=words[0];
		for(String word:words)
		{
			if(lword.length()>word.length())
			{
				lword=word;
			}
		}
		System.out.println(lword);

	}

}
