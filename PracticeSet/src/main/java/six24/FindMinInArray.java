package six24;

public class FindMinInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,5,8,3,9,6,7,2};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("Min number in Array:"+min);

	}

}
