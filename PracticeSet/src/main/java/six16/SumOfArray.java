package six16;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[]= {2,5,8,9,7,5,8,6,2};
		int sum=0;
		for(int i=0;i<arr.length;i++ )
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
