package Arrays;

public class FindEvenOddnumberinArrays {

	public static void main(String[] args) {
		int arr[]= {2,5,3,2,5,2,4,1,2,7,9,8,3};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}
