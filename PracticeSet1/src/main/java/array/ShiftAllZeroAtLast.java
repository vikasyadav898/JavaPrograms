package array;

public class ShiftAllZeroAtLast {

	public static void main(String[] args) {
		int arr[]= {1,0,2,0,2,0,2,0,0,0,5,8,9,6,0,2};
		int count=0;
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr1[count++]=arr[i];
			}
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}

	}

}
