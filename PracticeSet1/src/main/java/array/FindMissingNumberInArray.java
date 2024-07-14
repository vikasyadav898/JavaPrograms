package array;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6};
		int sum1=0;
		int sum2=0;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum1+=arr[i];
		}
		for(int i=0;i<=6;i++)
		{
			sum2+=i;
		}
		sum=sum2-sum1;
		System.out.println("Missing number is:"+sum);
	}

}
