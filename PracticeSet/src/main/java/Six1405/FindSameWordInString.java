package Six1405;

public class FindSameWordInString {

	public static void main(String[] args) {
		String str="vikas praksh yadav vikas i i";
		String words[]=str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			for(int j=i+1;j<words.length;j++) {
				if(words[i]==words[j])
				{
					System.out.println(words[i]);
				}
			}
		}
	}

}
