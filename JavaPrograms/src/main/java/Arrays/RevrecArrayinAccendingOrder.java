package Arrays;

public class RevrecArrayinAccendingOrder {

	public static void main(String[] args) {
		int arr[]= {2,5,3,2,5,2,4,1,2,7,9,8,3};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
