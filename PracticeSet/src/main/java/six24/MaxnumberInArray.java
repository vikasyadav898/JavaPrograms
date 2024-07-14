package six24;

public class MaxnumberInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,5,8,3,9,6,7,2};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("max number in array:"+max);

	}

}
