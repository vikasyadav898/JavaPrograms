package array;

public class MaxNumber {

	public static void main(String[] args) {
		int arr[]= {1,5,8,9,6,58,4,2,4,5,8,6,31};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
