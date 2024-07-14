package array;

public class EvenNumberInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,5,9,6,3,5,7,6};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}
