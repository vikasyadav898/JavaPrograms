package Arrays;

public class MissingNumbersInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6};
		int num1=0;
		int sumofAll=0;
		int missingNumber=0;
		for(int i=0;i<arr.length;i++)
		{
			num1+=arr[i];
		}
		for(int i=0;i<=6;i++)
		{
			sumofAll+=i;
		}
		missingNumber=sumofAll-num1;
		System.out.println(missingNumber+":is Missing number in array");

	}

}
