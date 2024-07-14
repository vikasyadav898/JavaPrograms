package nine7;

public class FindEvenOddNumbersInArray {

	public static void main(String[] args) {
		int arr[]= {2,6,4,5,7,8,9,8,4};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		

}
}
