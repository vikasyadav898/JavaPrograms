package array;

public class FindMin {

	public static void main(String[] args) {
		int arr[]= {1,2,5,9,6,3,5,-7,6};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			
		}
		System.out.println(min);

	}

}
