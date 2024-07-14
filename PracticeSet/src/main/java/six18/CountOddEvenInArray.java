package six18;

public class CountOddEvenInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int count=0;
		int count1=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
			else
			{
				count1++;
			}
			
			
		}
		System.out.println("number of even numbers:"+count);
		System.out.println("numbers of odd numbers:"+count1);
		

	}

}
