package sixSix;

public class changeStringPosition {

	public static void main(String[] args) {
		String str="vikas yadav";
		String arr[]=str.split(" ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
		

	}

}
