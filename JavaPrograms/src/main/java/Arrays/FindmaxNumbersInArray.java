package Arrays;

public class FindmaxNumbersInArray {

	public static void main(String[] args) {
		int arr[]= {2,5,3,2,5,2,4,1,2,7,9,8,3};
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
