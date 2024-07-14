package Test;

public class sumOfArray {

	public static void main(String[] args) {
		int[] arr= {5,8,7,9,6,1};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
