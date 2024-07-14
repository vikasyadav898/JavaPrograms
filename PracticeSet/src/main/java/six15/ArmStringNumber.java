package six15;

public class ArmStringNumber {

	public static void main(String[] args) {
		int num=154;
		int org_num=num;
		int cnum=0;
		while(num>0) {
			int rem=num%10;
			cnum=cnum+(rem*rem*rem);
			num=num/10;
			}
		if(org_num==cnum)
		{
			System.out.println("This is Armstrong number");
		}
		else
		{
			System.out.println("This is not Armstrong number");
		}

	}

}
