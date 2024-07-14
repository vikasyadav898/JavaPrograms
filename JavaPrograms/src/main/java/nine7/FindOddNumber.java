package nine7;

public class FindOddNumber {

	public static void main(String[] args) {
		int arr[]= {2,5,6,5,8,9,7,5,5,8,5,8,5};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
