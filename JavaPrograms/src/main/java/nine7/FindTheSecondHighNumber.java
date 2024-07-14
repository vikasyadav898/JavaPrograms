package nine7;

public class FindTheSecondHighNumber {

	public static void main(String[] args) {
		int arr[]= {10,2,3,58,96,8,75,96,0,-9};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		if(arr[0]==arr[1])
		{
			System.out.println(arr[2]);

		}
		else
		{
			System.out.println(arr[1]);

		}
		
	}

}
