package string1;

public class ShiftWord {

	public static void main(String[] args) {
		String str="vikas yadav";
		String splArray[]=str.split(" ");
		for(int i=splArray.length-1;i>=0;i--) {
			System.out.print(splArray[i]+" ");
		}

	}

}
