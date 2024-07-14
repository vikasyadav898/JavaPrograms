package array;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[]= {1,5,8,9,6,5,2,6,8,1};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println(sum);

	}

}
