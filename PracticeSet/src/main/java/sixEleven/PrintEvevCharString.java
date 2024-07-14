package sixEleven;

public class PrintEvevCharString {

	public static void main(String[] args) {
		String str="vikas vika prita yadav";
		for(String word:str.split(" "))
		if(word.length()%2==0) {
			System.out.println(word);
		}

	}

}
