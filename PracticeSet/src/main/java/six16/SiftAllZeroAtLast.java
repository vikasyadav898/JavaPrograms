package six16;

public class SiftAllZeroAtLast {

	public static void main(String[] args) {
		int arr[]= {2,0,3,6,0,4,0,7,0,0,9};
		int arr1[]=new int[arr.length];
		int count=0;
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
