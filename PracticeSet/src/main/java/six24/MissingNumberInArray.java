package six24;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6};
		int sum=0;
		int totalOfSum=0;
		int sumwithoutNumber=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		for(int i=0;i<=6;i++)
		{
			sumwithoutNumber+=i;
		}
		totalOfSum=sumwithoutNumber-sum;
		System.out.print("Missing Number is:"+totalOfSum);

	}

}
