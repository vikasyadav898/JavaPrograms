package normalProgram;

public class SumOfNumber {

	public static void main(String[] args) {
		int  num=12453;
		int sum=0;
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);

	}

}
