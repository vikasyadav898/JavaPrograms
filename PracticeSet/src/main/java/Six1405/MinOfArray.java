package Six1405;

public class MinOfArray {

	public static void main(String[] args) {
		int arr[]= {10,20,63,56,7,85,96};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
				
			}
		}
		System.out.println(min);
		
		

	}

}
