package sixEight;

public class ChangePositionString {

	public static void main(String[] args) {
		String str="vikas yadav";// yadav vikas
		String arr[]=str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
