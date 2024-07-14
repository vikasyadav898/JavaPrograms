package six30;

public class ChangePosition {

	public static void main(String[] args) {
		String str="vikas prakash yadav";
		String words[]=str.split(" ");
		String str1="";
		for(int i=words.length-1;i>=0;i--)
		{
			if(i==1)
			{
				for(int j=words.length-1;j>=0;j--)
				{
					System.out.println(words[i]);
				}
			}
		}
		System.out.println(str1);

	}

}
