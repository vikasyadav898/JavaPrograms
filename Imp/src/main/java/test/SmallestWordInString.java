package test;

public class SmallestWordInString {

	public static void main(String[] args) {
		String str="vikas prakash yad";
		
		String words[]=str.split(" ");
		String lword=words[0];
		for(String word:words) {
			if(lword.length()>word.length())
			{
				lword=word;
			}
		}
		System.out.println(lword);
	}

}
