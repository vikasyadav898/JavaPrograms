package test;

public class SecondHighNumber {

	public static void main(String[] args) {
		int arr[]= { 100,14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
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
		System.out.println("second largets number in array is:"+arr[1]);
		

	}

}
