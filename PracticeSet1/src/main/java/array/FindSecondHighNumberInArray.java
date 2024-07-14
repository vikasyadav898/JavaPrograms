package array;

public class FindSecondHighNumberInArray {

	public static void main(String[] args) {
		int arr[]= {2,5,6,3,5,8,6,3,5,8,9,6,45,85};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second high number is "+arr[arr.length-2]);
	}

}
