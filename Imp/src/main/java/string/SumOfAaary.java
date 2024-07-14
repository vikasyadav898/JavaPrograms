package string;

import java.util.HashSet;
import java.util.Set;

public class SumOfAaary {

	public static void main(String[] args) {
		int arr[]= {5,1,8,4,9,1,5};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					
				}
				else
				{
					sum=sum+arr[i];
				}
				
				
			}
			
		}
		System.out.println(sum);
	}

}
