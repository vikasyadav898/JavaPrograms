package Arrays;

public class SumOfArrays {

	public static void main(String[] args) {
		int arr[]= {10,25,2,2,2,2,3,3,3,4,4};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
