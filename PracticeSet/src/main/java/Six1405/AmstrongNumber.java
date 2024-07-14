package Six1405;

public class AmstrongNumber {

	public static void main(String[] args) {
		int num=153;
		int org_num=num;
		int cnum=0;
		while(num>0) {
			int rem=num%10;
			cnum=cnum+(rem*rem*rem);
			num=num/10;
		}
		if(org_num==cnum) {
			System.out.println("this is armstrong number");
		}
		else
		{
			System.out.println("This is not Armstrong number");
		}

	}

}
