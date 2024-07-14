package six16;

public class FindMaxNumberInArray {

	public static void main(String[] args) {
		int arr[]= {5,1,8,4,9,1,5};
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
