package nine7;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[]= {2,3,4,5,6,3,5,2,4,2,2,4,2,5,2,};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
