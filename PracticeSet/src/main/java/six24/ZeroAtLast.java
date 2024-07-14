package six24;

public class ZeroAtLast {

	public static void main(String[] args) {
		int arr[]= {1,0,2,0,8,0,3,0,7,0,8};
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
