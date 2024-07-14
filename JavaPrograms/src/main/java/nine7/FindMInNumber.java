package nine7;

public class FindMInNumber {

	public static void main(String[] args) {
		int arr[]= {10,2,3,58,96,8,75,96,0,-9};
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
