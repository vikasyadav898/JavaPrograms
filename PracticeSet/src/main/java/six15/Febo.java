package six15;

public class Febo {

	public static void main(String[] args) {
		int a=12345;
		int sum=0;
		while(a>0) {
			sum=sum+a%10;
			a=a/10;
		}
		System.out.println(sum);
	}
}
